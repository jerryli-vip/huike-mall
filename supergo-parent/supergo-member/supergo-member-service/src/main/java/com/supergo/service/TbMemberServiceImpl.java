package com.supergo.service;

import java.util.Date;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.mapper.TbMemberMapper;
import com.supergo.mapper.ext.TbMemberMapperExt;
import com.supergo.pojo.TbMember;
import com.supergo.pojo.TbMemberExample;
import com.supergo.pojo.TbMemberExample.Criteria;
import com.supergo.utils.ResultVO;

/**
 * 设置之个人信息与安全管理
 * 
 * @author 范江浩
 *
 */
@Service
public class TbMemberServiceImpl implements TbMemberService {

	@Autowired
	private TbMemberMapper memberMapper;
	
	@Autowired
	private TbMemberMapperExt memberMapperExt;
	/**
	 * 个人设置之个人回显信息
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	public ResultVO queryInfo(TbMember member) {
		// TODO Auto-generated method stub
		if(member == null){
			return ResultVO.build(500, "用户没有获取到值");
		}
		TbMember tbMember = memberMapperExt.queryByPK(member);
		if(tbMember == null){
			return ResultVO.build(500, "结果为空");
		}
		return ResultVO.build(200, "成功", tbMember);
	}

	/**
	 * 个人设置之个人信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	public ResultVO editInfo(TbMember member) {

		if (member == null || "".equals(member)) {
			return ResultVO.build(500, "操作失败");
		}
		TbMemberExample example = new TbMemberExample();
		Criteria createCriteria = example.createCriteria();
		if (member.getMemberName() != null && !"".equals(member.getMemberName())) {
			createCriteria.andMemberNameEqualTo(member.getMemberName());
		}
		// member.setBirthday((Date) member.getBirthday());
		member.setIsDelete("N");
		member.setUpdateTime(new Date());
		Integer i = memberMapper.updateByExampleSelective(member, example);
		if (i == 0) {
			return ResultVO.build(500, "操作失败");
		}
		return ResultVO.build(200, "操作成功");
	}

	/**
	 * 个人设置之修改密码信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	public ResultVO editPassword(TbMember member) {
		// TODO Auto-generated method stub
		if (member == null || "".equals(member)) {
			return ResultVO.build(500, "操作失败");
		}
		TbMemberExample example = new TbMemberExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andMemberNameEqualTo(member.getMemberName());
		member.setPassword(DigestUtils.md5Hex(member.getPassword()));
		Integer i = memberMapper.updateByExampleSelective(member, example);

		if (i == 0) {
			return ResultVO.build(500, "操作失败");
		}
		return ResultVO.build(200, "操作成功");
	}

	

}
