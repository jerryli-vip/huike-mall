package com.supergo.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbBusinessMapper;
import com.supergo.mapper.TbShopMapper;
import com.supergo.mapper.TbShopUserMapper;
import com.supergo.mapper.ext.TbShopManagerMapperExt;
import com.supergo.pojo.TbBusiness;
import com.supergo.pojo.TbBusinessExample;
import com.supergo.pojo.TbBusinessExample.Criteria;
import com.supergo.pojo.TbShop;
import com.supergo.pojo.TbShopExample;
import com.supergo.pojo.TbShopUser;
import com.supergo.pojo.TbShopUserExample;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 商家审核与商家管理
 * 
 * @author 范江浩
 *
 */
@Service
public class TbBusinessServiceImpl implements TbBusinessService {

	@Autowired
	private TbBusinessMapper businessMapper;

	@Autowired
	private TbShopUserMapper shopUserMapper;

	@Autowired
	private TbShopMapper shopMapper;

	@Autowired
	private TbShopManagerMapperExt shopManagerMapperExt;

	/**
	 * 商家审核之分页查询
	 * 
	 * @author 范江浩
	 */
	@Override
	public PageVO<TbBusiness> queryBusiness(TbBusiness business, Integer page, Integer rows) {
		// TODO Auto-generated method stub
		if (page == null || page <= 0) {
			page = 1;
		}
		if (rows == null || rows <= 0 || rows >= 150) {
			rows = 10;
		}
		PageHelper.startPage(page, rows);

		TbBusinessExample example = new TbBusinessExample();
		example.setOrderByClause("update_time DESC");
		Criteria createCriteria = example.createCriteria();
		if (business.getCompName() != null && !"".equals(business.getCompName())) {
			createCriteria.andCompNameLike("%" + business.getCompName() + "%");
		}
		if (business.getDefaultShopName() != null && !"".equals(business.getDefaultShopName())) {
			createCriteria.andDefaultShopNameLike("%" + business.getDefaultShopName() + "%");
		}
		if (business.getBusinessStatus() != null && !"".equals(business.getBusinessStatus())) {
			if (business.getBusinessStatus() == 4) {
				createCriteria.andIsDeleteEqualTo("N");
			}
			if (business.getBusinessStatus() == 0) {
				createCriteria.andBusinessStatusEqualTo(0);
			}
			if (business.getBusinessStatus() == 1) {
				createCriteria.andBusinessStatusEqualTo(1);
			}
			if (business.getBusinessStatus() == 2) {
				createCriteria.andBusinessStatusEqualTo(2);
			}
			if (business.getBusinessStatus() == 3) {
				createCriteria.andBusinessStatusEqualTo(3);
			}
		}

		createCriteria.andIsDeleteEqualTo("N");

		List<TbBusiness> list = businessMapper.selectByExample(example);
		// 获取分页后的信息
		PageInfo<TbBusiness> pageInfo = new PageInfo<>(list);
		PageVO<TbBusiness> pageVO = new PageVO<>();
		pageVO.setPage(page);
		pageVO.setSize(rows);
		pageVO.setTotal(pageInfo.getTotal());
		pageVO.setRows(list);
		return pageVO;
	}

	/**
	 * 商家审核之审核通过功能
	 * 
	 * @author 范江浩
	 */

	@Override
	public ResultVO updateAuditingSuccess(TbBusiness business) {
		// TODO Auto-generated method stub
		if (business.getBusinessId() == null || "".equals(business.getBusinessId())) {
			return ResultVO.build(500, "操作失败");
		}
		TbBusinessExample example = new TbBusinessExample();
		Criteria createCriteria = example.createCriteria();
		if (business.getBusinessId() != null && !"".equals(business.getBusinessId())) {
			createCriteria.andBusinessIdEqualTo(business.getBusinessId());
		}

		business.setBusinessStatus(1);
		Integer i = businessMapper.updateByExample(business, example);

		// TbShopUserExample exampleShopUser = new TbShopUserExample();
		// com.supergo.pojo.TbShopUserExample.Criteria createCriteriaShopUser =
		// exampleShopUser.createCriteria();
		// if (business.getBusinessId() != null &&
		// !"".equals(business.getBusinessId())) {
		// createCriteriaShopUser.andShopIdEqualTo(business.getBusinessId());
		// }
		// TbShopUser shopUser = new TbShopUser();
		// shopUser.setBak1("Y");
		// shopUserMapper.updateByExampleSelective(shopUser, exampleShopUser);
		TbShopExample exampleShop = new TbShopExample();
		com.supergo.pojo.TbShopExample.Criteria createCriteriaShop = exampleShop.createCriteria();
		if (business.getBusinessId() != null && !"".equals(business.getBusinessId())) {
			createCriteriaShop.andBusinessIdEqualTo(business.getBusinessId());
		}
		List<TbShop> listShop = shopMapper.selectByExample(exampleShop);
		List<Integer> listStringShop = new ArrayList<>();
		for (TbShop str : listShop) {
			listStringShop.add(Integer.parseInt(str.getShopId().toString()));
		}
		TbShopUserExample exampleShopUser = new TbShopUserExample();
		com.supergo.pojo.TbShopUserExample.Criteria createCriteriaShopUser = exampleShopUser.createCriteria();
		if (listShop != null && listShop.size() >= 0) {
			createCriteriaShopUser.andShopIdIn(listStringShop);
		}
		TbShopUser shopUser = new TbShopUser();
		shopUser.setBak1("Y");
		shopUserMapper.updateByExampleSelective(shopUser, exampleShopUser);
		if (i <= 0) {
			return ResultVO.build(500, "操作失败");
		}
		try {
			List<TbShopUser> shopUserId = shopManagerMapperExt.selectShopUserIdByBusinessId(business.getBusinessId());
			for (TbShopUser user : shopUserId) {
				shopManagerMapperExt.accreditRole(user.getShopUserId());
			}
		} catch (Exception e) {
			return ResultVO.build(500, "超级管理员授权失败");
		}
		return ResultVO.build(200, "操作成功");
	}

	/**
	 * 商家审核之审核未通过功能
	 * 
	 * @author 范江浩
	 */
	@Override
	public ResultVO updateAuditingFail(TbBusiness business) {
		// TODO Auto-generated method stub
		if (business.getBusinessId() == null || "".equals(business.getBusinessId())) {
			return ResultVO.build(500, "操作失败");
		}
		TbBusinessExample example = new TbBusinessExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andBusinessIdEqualTo(business.getBusinessId());
		business.setBusinessStatus(2);
		Integer i = businessMapper.updateByExample(business, example);
		if (i <= 0) {
			return ResultVO.build(500, "操作失败");
		}
		return ResultVO.build(200, "操作成功");
	}

	/**
	 * 商家管理之关闭商家功能
	 * 
	 * @author 范江浩
	 */

	@Override
	public ResultVO updateCloseBusiness(TbBusiness business) {
		if (business.getBusinessId() == null || "".equals(business.getBusinessId())) {
			return ResultVO.build(500, "操作失败");
		}
		TbBusinessExample example = new TbBusinessExample();
		Criteria createCriteria = example.createCriteria();
		createCriteria.andBusinessIdEqualTo(business.getBusinessId());
		business.setBusinessStatus(3);
		Integer i = businessMapper.updateByExample(business, example);

		// TbShopUserExample exampleShopUser = new TbShopUserExample();
		// com.supergo.pojo.TbShopUserExample.Criteria createCriteriaShopUser =
		// exampleShopUser.createCriteria();
		// if (business.getBusinessId() != null &&
		// !"".equals(business.getBusinessId())) {
		// createCriteriaShopUser.andShopIdEqualTo(business.getBusinessId());
		// }
		// TbShopUser shopUser = new TbShopUser();
		// shopUser.setBak1("N");
		// shopUserMapper.updateByExampleSelective(shopUser, exampleShopUser);
		TbShopExample exampleShop = new TbShopExample();
		com.supergo.pojo.TbShopExample.Criteria createCriteriaShop = exampleShop.createCriteria();
		if (business.getBusinessId() != null && !"".equals(business.getBusinessId())) {
			createCriteriaShop.andBusinessIdEqualTo(business.getBusinessId());
		}
		List<TbShop> listShop = shopMapper.selectByExample(exampleShop);
		List<Integer> listStringShop = new ArrayList<>();
		for (TbShop str : listShop) {
			listStringShop.add(Integer.parseInt(str.getShopId().toString()));
		}
		TbShopUserExample exampleShopUser = new TbShopUserExample();
		com.supergo.pojo.TbShopUserExample.Criteria createCriteriaShopUser = exampleShopUser.createCriteria();
		if (listShop != null && listShop.size() >= 0) {
			createCriteriaShopUser.andShopIdIn(listStringShop);
		}
		TbShopUser shopUser = new TbShopUser();
		shopUser.setBak1("N");
		shopUserMapper.updateByExampleSelective(shopUser, exampleShopUser);
		if (i <= 0) {
			return ResultVO.build(500, "操作失败");
		}
		
		return ResultVO.build(200, "操作成功");

	}

	/**
	 * 商家管理之店铺展示功能
	 * 
	 * @author 范江浩
	 */

	@Override
	public List<TbShop> queryShop(TbBusiness business) {

		List<TbShop> list = shopManagerMapperExt.selectShop(business);
		return list;
	}
}
