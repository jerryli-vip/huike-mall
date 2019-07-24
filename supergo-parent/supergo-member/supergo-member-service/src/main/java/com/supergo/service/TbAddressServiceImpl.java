package com.supergo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.supergo.mapper.TbAddressMapper;
import com.supergo.pojo.TbAddress;
import com.supergo.pojo.TbAddressExample;
import com.supergo.pojo.TbAddressExample.Criteria;
import com.supergo.pojo.TbMember;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 设置之地址管理
 * 
 * @author 范江浩
 *
 */
@Service
public class TbAddressServiceImpl implements TbAddressService {

	@Autowired
	private TbAddressMapper addressMapper;
	

	/**
	 * 个人设置之地址分页查询信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	public ResultVO queryAddress(TbMember aMember) {
		// TODO Auto-generated method stub
		if (aMember == null) {
			aMember = new TbMember();
		}
		// TbMemberExample exampleMember = new TbMemberExample();
		// com.supergo.pojo.TbMemberExample.Criteria createCriteriaMenber =
		// exampleMember.createCriteria();
		// if(attribute != null && !"".equals(attribute)){
		// createCriteriaMenber.andMemberNameEqualTo(attribute);
		// }
		// List<TbMember> listMember =
		// memberMapper.selectByExample(exampleMember);
		TbAddressExample example = new TbAddressExample();
		Criteria createCriteria = example.createCriteria();
		if (aMember.getMemberId() != null && aMember.getMemberId() != 0) {
			createCriteria.andMemberIdEqualTo(aMember.getMemberId());
		}
		createCriteria.andIsDeleteEqualTo("N");
		List<TbAddress> list = addressMapper.selectByExample(example);
		if(list == null || list.size() <= 0){
			return ResultVO.build(500, "结果为空");
		}
		return ResultVO.build(200, "成功", list);
	}

	/**
	 * 个人设置之添加地址信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	public ResultVO insertAddress(TbAddress address, TbMember aMember) {
		// TODO Auto-generated method stub
		if (address == null || "".equals(address)) {
			return ResultVO.build(500, "操作失败");
		}
		if (aMember == null) {
			aMember = new TbMember();
		}

		// TbMemberExample exampleMember = new TbMemberExample();
		// com.supergo.pojo.TbMemberExample.Criteria createCriteriaMenber =
		// exampleMember.createCriteria();
		// if(attribute != null && !"".equals(attribute)){
		// createCriteriaMenber.andMemberNameEqualTo(attribute);
		// }
		// List<TbMember> listMember =
		// memberMapper.selectByExample(exampleMember);
		address.setIsDelete("N");
		address.setCreateTime(new Date());
		address.setMemberId(aMember.getMemberId());
		address.setIsDefault("0");
		Integer i = addressMapper.insertSelective(address);
		if (i == 0) {
			return ResultVO.build(500, "操作失败");
		}
		return ResultVO.build(200, "操作成功");
	}

	/**
	 * 个人设置之删除地址信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	public ResultVO deleteAddress(TbAddress address) {
		// TODO Auto-generated method stub
		if (address == null || "".equals(address)) {
			return ResultVO.build(500, "操作失败");
		}
		if (address.getAddressId() == null || "".equals(address.getAddressId())) {
			return ResultVO.build(500, "操作失败");
		}

		TbAddressExample example = new TbAddressExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andAddressIdEqualTo(address.getAddressId());

		address.setIsDelete("Y");
		Integer i = addressMapper.updateByExample(address, example);
		if (i == 0) {
			return ResultVO.build(500, "操作失败");
		}
		return ResultVO.build(200, "操作成功");
	}

	/**
	 * 个人设置之修改地址信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	public ResultVO editAddress(TbAddress address) {
		// TODO Auto-generated method stub
		if (address == null || "".equals(address)) {
			return ResultVO.build(500, "操作失败");
		}
		if (address.getAddressId() == null || "".equals(address.getAddressId())) {
			return ResultVO.build(500, "操作失败");
		}

		TbAddressExample example = new TbAddressExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andAddressIdEqualTo(address.getAddressId());
		Integer i = addressMapper.updateByExampleSelective(address, example);

		if (i == 0) {
			return ResultVO.build(500, "操作失败");
		}
		return ResultVO.build(200, "操作成功");
	}

	/**
	 * 根据会员id查询所属收货地址
	 * 
	 * @author 陈阳
	 */
	@Override
	public PageVO<TbAddress> queryAllAddress(Integer id) {
		// TODO Auto-generated method stub
		// 判断传入参数是否为空
		if (id < 1 || id == null) {
			// 如果会员id 为空或者会员id小于1 返回null值
			return null;
		}
		// 设置查询条件
		TbAddressExample example = new TbAddressExample();
		Criteria criteria = example.createCriteria();
		// 设置查询条件为会员的id值
		criteria.andMemberIdEqualTo(id);
		// 查询is_delete字段为N的数据
		criteria.andIsDeleteEqualTo("N");
		// 执行查询语句获取集合
		List<TbAddress> list = addressMapper.selectByExample(example);
		// 创建PageVO对象
		PageVO<TbAddress> pageVO = new PageVO<>();
		// 设置属性
		pageVO.setRows(list);
		return pageVO;

	}

	/**
	 * 个人设置之添加默认地址信息
	 * 
	 * @author 范江浩
	 * @param member
	 * @return
	 */
	@Override
	public ResultVO editDefault(TbAddress address) {
		// TODO Auto-generated method stub
		if (address == null || address.getAddressId() == null ) {
			return ResultVO.build(500, "地址为空");
		}
		
		TbAddressExample example = new TbAddressExample();
		TbAddress tbAddress = new TbAddress();
		tbAddress.setIsDefault("0");
	
		addressMapper.updateByExampleSelective(tbAddress, example);
		
		
		
		TbAddressExample exampleDefault = new TbAddressExample();
		Criteria createCriteria = exampleDefault.createCriteria();
		if (address.getAddressId() != null && !"".equals(address.getAddressId())) {
			createCriteria.andAddressIdEqualTo(address.getAddressId());
		}
		address.setIsDefault("1");
		Integer i = addressMapper.updateByExampleSelective(address, exampleDefault);
		if (i == 0) {
			return ResultVO.build(500, "操作失败");
		}
		return ResultVO.build(200, "操作成功");
	}

}
