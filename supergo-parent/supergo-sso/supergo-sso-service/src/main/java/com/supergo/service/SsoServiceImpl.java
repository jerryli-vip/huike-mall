package com.supergo.service;

import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.mapper.TbMemberMapper;
import com.supergo.pojo.TbMember;
import com.supergo.pojo.TbMemberExample;
import com.supergo.pojo.TbMemberExample.Criteria;
import com.supergo.service.util.RedisUtil;
import com.supergo.utils.JsonUtils;
import com.supergo.utils.ResultVO;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

@Service
public class SsoServiceImpl implements SsoService {

	@Autowired
	private TbMemberMapper memberMapper;
//	@Autowired
//	private JedisPool pool;

	/**
	 * 注册
	 */
	@Override
	public void register(TbMember member) {
		if (member == null) {
			return;
		}
		memberMapper.insertSelective(member);

	}

	/**
	 * 登录
	 */
	@Override
	public TbMember checkLogin(TbMember member) {
		// 1.查询账号是否正确
		TbMemberExample memberExample = new TbMemberExample();
		Criteria criteria = memberExample.createCriteria();
		criteria.andMemberNameEqualTo(member.getMemberName());
		// 查询用户信息
		List<TbMember> list = memberMapper.selectByExample(memberExample);
		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * 存入登录信息到redis
	 * 
	 * @Override
	 */
	public void saveRedis(String tokenId, TbMember members) {
		RedisUtil.addSet("userInfo:" + tokenId, JsonUtils.objectToJson(members));
		RedisUtil.setExp("userInfo:" + tokenId, 30000);
	}

	/**
	 * 获取存入redis的用户信息
	 */
	@Override
	public ResultVO getRedis(String tokenId) {
		// 1、根据token查询redis。
		String json = RedisUtil.getString("userInfo:" + tokenId);

		if (StringUtils.isBlank(json)) {
			// 2、如果查询不到数据。返回用户已经过期。
			return ResultVO.build(-1, "用户登录已经过期，请重新登录。");
		}
		// 3、如果查询到数据，说明用户已经登录。
		// 4、需要重置key的过期时间。
		RedisUtil.setExp("userInfo:" + tokenId, 30000);
		// 5、把JSON数据转换成TbMember对象，然后使用e3Result包装并返回。
		TbMember member = JsonUtils.jsonToPojo(json, TbMember.class);
		if (member == null) {
			return ResultVO.build(-1, "Redis没存进去");
		}
		// 7、将对象封装进ResultVO
		return ResultVO.ok(member);
	}

	/**
	 * 删除redis中用户信息
	 * 
	 * @param tokenIdVal
	 * @return
	 * @return
	 */
	@Override
	public  void delRedis(String tokenIdVal) {
		if (tokenIdVal != null) {
			RedisUtil.del("userInfo:" + tokenIdVal);
		}
	}
}