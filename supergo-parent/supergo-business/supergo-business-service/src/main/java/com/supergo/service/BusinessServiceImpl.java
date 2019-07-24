package com.supergo.service;

import java.util.Date;
import java.util.List;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.druid.util.StringUtils;
import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.mapper.TbBusinessMapper;
import com.supergo.mapper.TbShopUserMapper;
import com.supergo.mapper.ext.TbBusinessMapperExt;
import com.supergo.mapper.ext.TbShopMapperExt;
import com.supergo.mapper.ext.TbShopUserMapperExt;
import com.supergo.pojo.TbBusiness;
import com.supergo.pojo.TbShop;
import com.supergo.pojo.TbShopUser;
import com.supergo.pojo.TbShopUserExample;
import com.supergo.pojo.TbShopUserExample.Criteria;

/**
 * 店铺用户 登陆注册 修改信息
 */
@Service
public class BusinessServiceImpl implements BusinessService {
	@Autowired
	private TbShopUserMapper tsumapper;
	@Autowired
	private TbShopUserMapperExt shopusermapper;
	
	@Autowired
	private TbShopMapperExt tsmapper;
	@Autowired
	private TbBusinessMapperExt tbmapper;
	@Autowired
	private TbShopUserMapper mapper;
	@Autowired
	private TbBusinessMapper tbbmapper;
	@Autowired
	private TbBusinessMapperExt mapperExt;

	@Override
	public String insert(TbBusiness tbBusiness, TbShop tbShop, TbShopUser tbShopUser) {
		if (tbBusiness == null || tbShop == null || tbShopUser == null) {
			return "请填写完整的信息";
		}
		if (StringUtils.isEmpty(tbShopUser.getShopUserName())) {
			return "登陆名为必填项";
		}
		TbShopUserExample example = new TbShopUserExample();
		Criteria criteria = example.createCriteria();
		criteria.andShopUserNameEqualTo(tbShopUser.getShopUserName());
		int count = tsumapper.countByExample(example);
		if (count > 0) {
			return "该用户名已存在";
		}
		if (StringUtils.isEmpty(tbShopUser.getShopUserName())) {
			return "登陆密码为必填项";
		}
		if (StringUtils.isEmpty(tbShopUser.getShopUserPassword())) {
			return "登陆密码为必填项";
		} else {
			tbShopUser.setShopUserPassword(DigestUtils.md5Hex(tbShopUser.getShopUserPassword()));
			tbShopUser.setCreateId(1);
			tbShopUser.setCreateTime(new Date());
			tbShopUser.setUpdateId(1);
			tbShopUser.setUpdateTime(new Date());
			tbShopUser.setBak1("N");//不能登录
			tbShopUser.setIsDelete("N");
		}
		if (StringUtils.isEmpty(tbShop.getShopName())) {
			return "店铺名称为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getCompName())) {
			return "公司名称为必填项";
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
		if (!tbBusiness.getConQq().matches("[1-9]\\d{4,10}")) {
			return "请输入正确的qq号";
		}
		if (StringUtils.isEmpty(tbBusiness.getConMobile())) {
			return "联系人手机为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getConEmail())) {
			return "联系人EMAIL为必填项";
		}
		/*
		 * if (!tbBusiness.getConEmail().matches(
		 * "^[A-Za-zd]+([-_.][A-Za-zd]+)*@([A-Za-zd]+[-.])+[A-Za-zd]{2,5}$ ")) {
		 * return "邮箱格式不正确"; }
		 */
		if (StringUtils.isEmpty(tbBusiness.getLicenseNum())) {
			return "营业执照号为必填项";
		}
		/*
		 * if (!tbBusiness.getLicenseNum().matches(
		 * "/^(?:(?![IOZSV])[\\dA-Z]){2}\\d{6}(?:(?![IOZSV])[\\dA-Z]){10}$/")) {
		 * return "营业执照为无效的输入"; }
		 */
		if (StringUtils.isEmpty(tbBusiness.getTaxregistNum())) {
			return "税务登记证号为必填项";
		}
		if (!tbBusiness.getTaxregistNum().matches("\\d{15}")) {
			return "请输入有效的税务登记号码";
		}
		if (StringUtils.isEmpty(tbBusiness.getOrganNum())) {
			return "组织机构代码证为必填项";
		}
		/*
		 * if
		 * (!tbBusiness.getOrganNum().matches("/[^a-zA-Z0-9]{8}-[a-zA-Z0-9]$/"))
		 * { return "请输入有效的组织机构代码"; }
		 */
		if (StringUtils.isEmpty(tbBusiness.getLegal())) {
			return "法定代表人为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getLegalIndentity())) {
			return "法定代表人身份证号为必填项";
		}
		/*
		 * if (!tbBusiness.getLegalIndentity().matches(
		 * "/^(\\d{15}$|^\\d{18}$|^\\d{17}(\\d|X|x))$/")) { return
		 * "请输入有效的身份证号码"; }
		 */
		if (StringUtils.isEmpty(tbBusiness.getOpenbank())) {
			return "开户行名称为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getObBranch())) {
			return "开户行支行为必填项";
		}
		if (StringUtils.isEmpty(tbBusiness.getBankNum())) {
			return "银行账号为必填项";
		}
		/*
		 * if (!tbBusiness.getBankNum().matches(
		 * "/^([1-9]{1})(\\d{14}|\\d{18})$/ ")) { return "请输入正确的银行卡号"; }
		 */
		if (!tbBusiness.getCompPhone().matches("(\\d{3})-(\\d{8})|(\\d{4})-(\\d{7})")) {
			return "请输入正确的公司电话";
		}
		tbBusiness.setCreateid(1);
		tbBusiness.setCreatetime(new Date());
		tbBusiness.setUpdateTime(new Date());
		tbBusiness.setUpdateUser(1);
		tbBusiness.setBusinessStatus(0);//未审核
		tbBusiness.setIsDelete("N");
		tbBusiness.setDefaultShopName(tbShop.getShopName());
		int businessId = tbmapper.insert(tbBusiness);

		if (businessId > 0) {
			tbShop.setBusinessId(tbBusiness.getBusinessId());
			tbShop.setCreateid(1);
			tbShop.setCreatetime(new Date());
			tbShop.setUpdateTime(new Date());
			System.out.println(tbBusiness.getBusinessId());
		}

		int tbShopId = tsmapper.insert(tbShop);

		if (tbShopId > 0) {
			tbShopUser.setShopId(tbShop.getShopId());
			System.out.println(tbShop.getShopId());
		}

		int s3 = shopusermapper.insertUser(tbShopUser);
		if (s3 > 0) {
			return "注册成功";
		}

		return "注册失败";
	}

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
	public String updateByPassword(TbShopUser newUser) {

		if (newUser == null) {

			return null;
		}
        Integer line =mapper.updateByPrimaryKey(newUser);  
		if(line >0){
		return "修改成功";}
		
		return "修改失败";
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
		if (!tbBusiness.getCompPhone().matches("(\\d{3})-(\\d{8})|(\\d{4})-(\\d{7})")) {
			return "请输入正确的公司电话";
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
		if (!tbBusiness.getConQq().matches("[1-9]\\d{4,10}")) {
			return "请输入正确的qq号";
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
		if (!tbBusiness.getTaxregistNum().matches("\\d{15}")) {
			return "请输入有效的税务登记号码";
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

		Integer line = tbbmapper.updateByPrimaryKey(tbBusiness);
		if (line>0) {
			return "修改成功";
		}
		return "修改失败";
	}

}
