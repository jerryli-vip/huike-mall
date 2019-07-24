package com.supergo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.common.utils.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbBusinessMapper;
import com.supergo.mapper.TbShopUserMapper;
import com.supergo.mapper.ext.TbBusinessMapperExt;
import com.supergo.mapper.ext.TbShopUserMapperExt;
import com.supergo.pojo.TbAuthority;
import com.supergo.pojo.TbBusiness;
import com.supergo.pojo.TbRole;
import com.supergo.pojo.TbShopUser;
import com.supergo.pojo.TbShopUserExample;
import com.supergo.pojo.TbShopUserRole;
import com.supergo.pojo.TbShopUserExample.Criteria;
import com.supergo.service.TbShopUserService;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 店铺用户的登陆增删查改
 * 
 * @author leosam
 *
 */
@Service
public class TbShopUserServiceImpl implements TbShopUserService {

	@Autowired
	private TbShopUserMapper mapper;
	@Autowired
	private TbBusinessMapper tbbmapper;
	@Autowired
	private TbBusinessMapperExt mapperExt;
	@Autowired
	private TbShopUserMapperExt sumapper;

	@Override
	public TbShopUser selectByShopUserName(String shopUserName) {
		TbShopUserExample example = new TbShopUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andShopUserNameEqualTo(shopUserName);
		List<TbShopUser> list = mapper.selectByExample(example);
		if (list != null && list.size() == 1) {
			return list.get(0);
		}
		return null;
	}

	/**
	 * 修改密码
	 */
	@Override
	public Integer updateByPassword(TbShopUser newUser) {

		if (newUser == null) {

			return null;
		}

		return mapper.updateByPrimaryKey(newUser);
	}

	@Override
	public Integer selectBusinessId(Integer userId) {

		if (userId == null || userId == 0) {
			return null;
		}

		return mapperExt.selectBusinessId(userId);
	}

	/**
	 * 回显查询
	 */
	@Override
	public TbBusiness selectById(Integer bussinessId) {

		if (bussinessId == null || bussinessId == 0) {
			return null;
		}

		return tbbmapper.selectByPrimaryKey(bussinessId);

	}

	/**
	 * 修改资料
	 */
	@Override
	public String updateData(TbBusiness tbBusiness) {

		if (tbBusiness == null) {

			return "资料缺失";
		}

		if (StringUtils.isEmpty(tbBusiness.getCompName())) {
			return "公司名称为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getCompMobile())) {
			return "公司电话为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getCompPhone())) {
			return "公司电话为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getCompAddress())) {
			return "公司详细地址为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getConName())) {
			return "联系人姓名为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getConQq())) {
			return "联系人QQ为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getConMobile())) {
			return "联系人手机为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getConEmail())) {
			return "联系人EMAIL为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getLicenseNum())) {
			return "营业执照号为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getTaxregistNum())) {
			return "税务登记证号为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getOrganNum())) {
			return "组织机构代码证为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getLegal())) {
			return "法定代表人为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getLegalIndentity())) {
			return "法定代表人身份证号为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getLegalIndentity())) {
			return "法定代表人身份证号为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getOpenbank())) {
			return "开户行名称为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getObBranch())) {
			return "开户行支行为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getBankNum())) {
			return "银行账号为必填";
		}

		tbbmapper.updateByPrimaryKey(tbBusiness);

		return "修改成功";
	}
	
	/**
	 * 新增用户
	 */
	@Override
	public ResultVO insertUser(TbShopUser user) {
		// 检验用户是否输入账号或者密码
		if (StringUtils.isEmpty(user.getShopUserName()) || StringUtils.isEmpty(user.getShopUserPassword()))
			return ResultVO.build(500, "用户名或者密码为空");
		// 校验密码和确认密码是否相同
		if (!user.getCfmPassword().equals(user.getShopUserPassword()))
			return ResultVO.build(500, "两次密码输入不一致");
		Long result = sumapper.selectByUsername(user.getShopUserName());
		if (result > 0)
			return ResultVO.build(500, "该用户名已存在,请重新输入");
		Date date = new Date();
		user.setCreateTime(date);
		user.setUpdateTime(date);
		user.setIsDelete("N");
		user.setBak1("Y");
		user.setShopUserPassword(DigestUtils.md5Hex(user.getShopUserPassword()));
		Integer i = sumapper.insertUser(user);
		if (i == 0) {
			return ResultVO.build(500, "添加失败");
		} else {
			return ResultVO.build(200, "添加成功");
		}
	}

	/**
	 * 查询用户
	 */
	@Override
	public PageVO<TbShopUser> queryUser(Integer page, Integer rows, TbShopUser shopUser) {
		// myBatis的第三方分页插件-----PageHelper
		// PageHelper分页插件初始化分页信息,切面式添加sql语句,语句一：查询总记录数，语句二：追加limit()条件
		PageHelper.startPage(page, rows);

		// 不分页的分页实现
		List<TbShopUser> queryUser = sumapper.queryAllUser(shopUser);

		// 获取分页信息
		PageInfo<TbShopUser> pageInfo = new PageInfo<>(queryUser);
		// 获取分页总记录数
		System.out.println(pageInfo.getTotal());
		// 获取分页总页数
		System.out.println(pageInfo.getPages());

		PageVO<TbShopUser> pageVo = new PageVO<>();
		pageVo.setPage(page);
		pageVo.setSize(rows);
		pageVo.setTotal(pageInfo.getTotal());
		pageVo.setRows(queryUser);
		return pageVo;
	}

	@Override
	public ResultVO delete(Integer[] ids) {
		if (ids == null)
			return ResultVO.build(500, "没有删除的数据选项");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer id : ids) {
			list.add(id);
		}
		Integer i = sumapper.batchdelete(list);
		if (i == 0) {
			return ResultVO.build(500, "删除失败");
		} else {
			return ResultVO.build(200, "删除成功");
		}
	}

	@Override
	public ResultVO resetPassword(Integer[] ids) {
		if (ids == null)
			return ResultVO.build(500, "没有重置的数据选项");
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (Integer id : ids) {
			list.add(id);
		}
		Integer i = sumapper.resetPassword(list);
		if (i == 0) {
			return ResultVO.build(500, "重置密码失败");
		} else {
			return ResultVO.build(200, "重置密码成功");
		}
	}

	// 修改
	@Override
	public ResultVO updateById(TbShopUser shopUser) {
		// 检验用户是否输入账号或者密码
		if (StringUtils.isEmpty(shopUser.getShopUserName()))
			return ResultVO.build(500, "用户名为空");
		Date date = new Date();
		shopUser.setUpdateTime(date);
		Integer i = sumapper.updateUser(shopUser);
		if (i == 0) {
			return ResultVO.build(500, "修改失败");
		} else {
			return ResultVO.build(200, "修改成功");
		}
	}

	@Override
	public List<TbRole> queryRole(Integer type) {
		return sumapper.queryRole(type);
	}

	@Override
	public ResultVO accredit(Integer[] roleIds, Integer userId) {
		try {
			sumapper.deleteAllRoleByUserId(userId);
			TbShopUserRole tsr = new TbShopUserRole();
			for (Integer role : roleIds) {
				tsr.setShopUserId(userId);
				tsr.setRoleId(role);
				sumapper.accreditUser(tsr);
			}
			return ResultVO.build(200, "授权成功");
		} catch (Exception e) {
			return ResultVO.build(200, "授权失败");
		}
	}

	@Override
	public List<TbRole> showRole(Integer userId) {
		return sumapper.showRole(userId);
	}

	@Override
	public List<TbAuthority> queryAuthorityCode(String shopUserName) {
		return sumapper.queryAuthorityCode(shopUserName);
	}


}
