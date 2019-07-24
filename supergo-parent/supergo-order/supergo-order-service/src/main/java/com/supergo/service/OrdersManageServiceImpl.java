package com.supergo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbOrderDeliveryMapper;
import com.supergo.mapper.TbOrderItemMapper;
import com.supergo.mapper.TbSubOrderMapper;
import com.supergo.mapper.ext.TbOrdersManageMapperExt;
import com.supergo.pojo.TbOrder;
import com.supergo.pojo.TbOrderDelivery;
import com.supergo.pojo.TbOrderItem;
import com.supergo.pojo.TbSubOrder;
import com.supergo.pojo.ext.TbOrderManage;
import com.supergo.utils.PageVO;

@Service
public class OrdersManageServiceImpl implements OrdersManageService {
	
	@Autowired
	private TbOrdersManageMapperExt mapper;
	@Autowired		
	private TbOrderItemMapper orderItemMapper;	
	@Autowired		
	private TbOrderDeliveryMapper orderDeliveryMapper;
	@Autowired		
	private TbSubOrderMapper submapper;		
	/**
	 * 
	 * 订单管理分页查询方法
	 */
	@Override
	public PageVO<TbOrderManage> query(TbOrderManage manage,Integer page, Integer rows) {
		//检测分页数据
		if (page == null || page <= 0) {
			page = 0;
		}
		if (rows == null || rows <= 0 || rows >= 100) {
			rows = 10;
		}
		if (manage == null) {
			return null;
		}
		// 开启分页插件
		PageHelper.startPage(page, rows);
		if (manage.getStartTime() == null) {
		System.out.println("开始时间为空");
		}if (manage.getOrdertime() == null) {
			System.out.println("结束时间为空");
		}
		// 获取查询结果
		List<TbOrderManage> list =  mapper.selectByoManage(manage);
		// 获取分页后的信息
		PageInfo<TbOrderManage> pageInfo = new PageInfo<>(list);
		System.out.println(pageInfo);
		// 将结果赋值给pagevo对象
		PageVO<TbOrderManage> pageVO = new PageVO<>();
		pageVO.setPage(page);
		pageVO.setSize(rows);
		pageVO.setTotal(pageInfo.getTotal());
		pageVO.setRows(list);

		return pageVO;
	}
	
	/**		
	 * 订单详情之订单信息
	 */		
	@Override		
	public TbOrder selectOrderById(String ordersubId) {		
		if (ordersubId == null) {	
			return null;
		}	
		return mapper.selectOrderByKey(ordersubId);
	}		
	/**		
	 * 订单详情之订单明细		
	 */		
	@Override		
	public List<TbOrderItem> selectOrderList(String ordersubId) {		
		if (ordersubId == null) {	
			return null;
		}	
		return orderItemMapper.selectOrderItemById(ordersubId);
	}		
	/**		
	 * 订单详情之收货人		
	 */		
	@Override		
	public TbOrderDelivery selectByDeliveryId(String ordersubId) {		
		if (ordersubId == null) {	
			return null;
		}
		return orderDeliveryMapper.selectOrderDeliveryById(ordersubId);	
	}		
	/**
	 * 订单详情之订单状态
	 */

	@Override
	public TbSubOrder selectSubOrderById(String ordersubId) {
		if (ordersubId == null) {	
			return null;
		}
		return submapper.selectByPrimaryKey(ordersubId);
	}
	/**
	 * 订单管理之退换货界面初始化
	 */
	@Override
	public List<TbOrderManage> InitOrderItem(String ordersubId) {
		if (ordersubId == null) {
			return null;
		}
		return mapper.selectOrderItem(ordersubId);
	}
}
