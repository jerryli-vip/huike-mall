package com.supergo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbOrderItemMapper;
import com.supergo.mapper.TbRefundMapper;
import com.supergo.mapper.TbReturnGoodsMapper;
import com.supergo.mapper.TbReturnItemMapper;
import com.supergo.mapper.TbSubOrderMapper;
import com.supergo.mapper.ext.TbReturnGoodExtMapper;
import com.supergo.pojo.TbOrderItem;
import com.supergo.pojo.TbOrderItemExample;
import com.supergo.pojo.TbRefund;
import com.supergo.pojo.TbReturnGoods;
import com.supergo.pojo.TbReturnGoodsExample;
import com.supergo.pojo.TbReturnGoodsExample.Criteria;
import com.supergo.pojo.TbReturnItem;
import com.supergo.pojo.TbSubOrder;
import com.supergo.pojo.ext.TbReturnGoodsExt;
import com.supergo.utils.IDUtils;
import com.supergo.utils.JsonUtils;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@Service
public class ReturnGoodServiceImpl implements ReturnGoodService {

	@Autowired
	private TbReturnGoodExtMapper mapperExt;
	@Autowired
	private TbReturnGoodsMapper mapper;
	@Autowired
	private TbOrderItemMapper itemMapper;
	@Autowired
	private TbSubOrderMapper subMapper;
	@Autowired
	private TbReturnItemMapper returnItemMapper;
	@Autowired
	private TbReturnGoodsMapper returnGoodsMapper;
	@Autowired
	private TbRefundMapper refundMapper;
	/* private TbReturnGoodExtMapper returnGoodsExtMapper; */

	/**
	 * 
	 * 退货单分页查询
	 */

	@Override
	public PageVO<TbReturnGoodsExt> query(TbReturnGoodsExt returngoods, Integer page, Integer rows) {
		// 检测分页数据
		if (page == null || page <= 0) {
			page = 0;
		}
		if (rows == null || rows <= 0 || rows >= 100) {
			rows = 10;
		}
		// 开启分页插件
		PageHelper.startPage(page, rows);

		// 获取查询结果
		List<TbReturnGoodsExt> list = mapperExt.selectByManage(returngoods);
		System.out.println(list.toArray());
		// 获取分页后的信息
		PageInfo<TbReturnGoodsExt> pageInfo = new PageInfo<>(list);
		System.out.println(pageInfo);
		// 将结果赋值给pagevo对象
		PageVO<TbReturnGoodsExt> pageVO = new PageVO<>();
		pageVO.setPage(page);
		pageVO.setSize(rows);
		pageVO.setTotal(pageInfo.getTotal());
		pageVO.setRows(list);

		return pageVO;

	}

	/**
	 * 
	 * 批量修改状态-已确认待收货
	 */

	@Override
	public ResultVO updateReturn(String[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要修改的订单");
		}
		System.out.println(ids);
		TbReturnGoods record = new TbReturnGoods();
		record.setReturnGoodsStatus("2");
		record.setUpdateId(1);
		record.setUpdateTime(new Date());
		TbReturnGoodsExample example = new TbReturnGoodsExample();
		Criteria criteria = example.createCriteria();
		ArrayList<String> list = new ArrayList<>();
		for (String id : ids) {
			list.add(id);
		}
		criteria.andTbOrderIn(list);
		int line = mapper.updateByExampleSelective(record, example);
		if (line > 0) {
			return ResultVO.build(200, "修改成功，共修改" + line + "条订单");
		}
		return ResultVO.build(-1, "修改失败，请检查数据");

	}

	/**
	 * 
	 * 批量修改状态-验货成功
	 */
	@Override
	public ResultVO updateSuccess(String[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要修改的订单");
		}
		System.out.println(ids);
		TbReturnGoods record = new TbReturnGoods();
		record.setReturnGoodsStatus("4");
		record.setUpdateId(1);
		record.setUpdateTime(new Date());
		TbReturnGoodsExample example = new TbReturnGoodsExample();
		Criteria criteria = example.createCriteria();
		ArrayList<String> list = new ArrayList<>();
		for (String id : ids) {
			list.add(id);
		}
		criteria.andTbOrderIn(list);
		int line = mapper.updateByExampleSelective(record, example);
		if (line > 0) {
			return ResultVO.build(200, "修改成功，共修改" + line + "条订单");
		}
		return ResultVO.build(-1, "修改失败，请检查数据");
	}

	/**
	 * 
	 * 批量修改状态-退货成功
	 */
	@Override
	public ResultVO updateCancel(String[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要修改的订单");
		}
		System.out.println(ids);
		TbReturnGoods record = new TbReturnGoods();
		record.setReturnGoodsStatus("7");
		record.setUpdateId(1);
		record.setUpdateTime(new Date());
		TbReturnGoodsExample example = new TbReturnGoodsExample();
		Criteria criteria = example.createCriteria();
		ArrayList<String> list = new ArrayList<>();
		for (String id : ids) {
			list.add(id);
		}
		criteria.andTbOrderIn(list);
		int line = mapper.updateByExampleSelective(record, example);
		if (line > 0) {
			return ResultVO.build(200, "修改成功，共修改" + line + "条订单");
		}
		return ResultVO.build(-1, "修改失败，请检查数据");
	}

	/**
	 * 
	 * 修改退货单状态
	 */
	@Override
	public ResultVO update(TbReturnGoodsExt returngoods) {
		if (returngoods == null || returngoods.getTbOrder() == null) {
			return ResultVO.build(-1, "商品未提交，或者未选择商品");
		}
		if (returngoods.getReturnGoodsStatus().equals("7")) {
			TbRefund refund = new TbRefund();
		Long refundid = IDUtils.genItemId();
		System.out.println(refundid +"1111111");
		refund.setRefundId(String.valueOf(refundid));
		refund.setReturnGoodsId(String.valueOf(returngoods.getReturnGoodsId()));
		refund.setReturnGoodsStatus(returngoods.getReturnGoodsStatus());
		refund.setReturnGoodsTime(returngoods.getReturnGoodsTime());
		refund.setTbOrder(returngoods.getTbOrder());
		refund.setOrdersubId(returngoods.getOrdersubId());
		refund.setCreateId(1);
		refund.setCreateTime(new Date());
		refund.setApplyTime(returngoods.getApplyTime());
		refund.setUpdateId(1);
		refund.setUpdateTime(new Date());
		int s = refundMapper.insert(refund);
		System.out.println(s);
		}
		int line = mapperExt.updateByPrimaryKey(returngoods);
		if (line >= 0) {
			
			return ResultVO.build(200, "修改成功");
		}
		return ResultVO.build(-1, "修改失败，请检查字段");
	}

	/**
	 * 
	 * 退货申请
	 */
	@Override
	public ResultVO updateRetuen(TbReturnGoodsExt returnGoods) {

		if (returnGoods == null) {
			return ResultVO.build(-1, "参数错误");
		}
		// 判断前台获取的值是否为空
		if (returnGoods.getGoodsId() == null) {
			return ResultVO.build(-1, "商品ID为空");
		}
		if (returnGoods.getOrdersubId() == null || "".equals(returnGoods.getOrdersubId())) {
			return ResultVO.build(-1, "子订单ID为空");
		}
		if (returnGoods.getReturnReason() == null || "".equals(returnGoods.getReturnReason())) {
			return ResultVO.build(-1, "请输入退货原因");
		}

		// 获取商品id
		int goodsId = returnGoods.getGoodsId();
		// 获取子订单id
		String ordersubId = returnGoods.getOrdersubId();

		// 1.根据商品id查询退货商品表
		TbReturnItem tbReturnItem = returnItemMapper.selectByGoodsId(goodsId);
		System.out.println("获取退货商品表" + JsonUtils.objectToJson(tbReturnItem));

		// 2.在退货商品表里查询判断商品是否已存在
		// 如果存在 则返回已退货提示
		if (tbReturnItem != null && tbReturnItem.getOrderItemId() != null) {
			return ResultVO.build(-1, "该商品已申请退货，请关注处理流程");
		} else {
			// 3.如果不存在 则申请退货
			// 根据ordersubId获取子订单表
			TbSubOrder tbSubOrder = subMapper.selectByPrimaryKey(ordersubId);
			System.out.println("获取子订单表" + JsonUtils.objectToJson(tbSubOrder));
			
			// 根据goodsId获取订单商品表数据
			TbOrderItemExample example = new TbOrderItemExample();
			com.supergo.pojo.TbOrderItemExample.Criteria criteria = example.createCriteria();
			criteria.andGoodsIdEqualTo(goodsId);
			List<TbOrderItem> tbOrderItemList = itemMapper.selectByExample(example);

			if (tbOrderItemList != null && tbOrderItemList.size() > 0) {
				
				TbOrderItem tbOrderItem = tbOrderItemList.get(0);
				tbOrderItem.setCreateId(returnGoods.getCreateId());
				tbOrderItem.setUpdateId(returnGoods.getUpdateId());
				System.out.println("订单商品表" + JsonUtils.objectToJson(tbOrderItem));
				
				// 将子订单表和订单商品表封装进订单退货表
				TbReturnGoods tbReturnGoods = findByOrderList(tbOrderItem, tbSubOrder);
				
				// 获取退货理由
				tbReturnGoods.setReturnReason(returnGoods.getReturnReason());
				System.out.println("获取退货理由" + JsonUtils.objectToJson(tbReturnGoods));
				
				// 将子订单表和订单商品表封装进订单商品退货表
				tbReturnItem = findByItemList(tbOrderItem, tbSubOrder);

				// 修改订单商品表中的状态
				int n = itemMapper.updateStatusByKey(goodsId);
				System.out.println("修改订单商品表中的状态" + n);
				if (n < 0) {
					return ResultVO.build(500, "修改订单商品表中的状态失败");
				}

				// 将封装的数据插入订单退货表
				int insertReturnGoodsNums = returnGoodsMapper.insert(tbReturnGoods);
				System.out.println("插入订单退货表影响的行数" + insertReturnGoodsNums);
				
				// 将封装的数据插入订单商品退货表
				int insertReturnItemsNums = returnItemMapper.insert(tbReturnItem);
				System.out.println("插入订单商品退货表影响的行数" + insertReturnItemsNums);
				
				if (insertReturnGoodsNums < 0 && insertReturnItemsNums < 0) {
					
					return ResultVO.build(-1, "申请退货失败，请稍后重试");
				}
			}
		}
		return ResultVO.build(200, "申请退货成功，请等待处理");
	
	}

	/**
	 * 
	 * 订单退货表数据的获取
	 */
	private TbReturnGoods findByOrderList(TbOrderItem tbOrderItem, TbSubOrder tbSubOrder) {
		if (tbOrderItem != null && tbSubOrder != null) {
			// 订单退货表
			TbReturnGoods tbReturnGoods = new TbReturnGoods();
			tbReturnGoods.setOrdersubId(tbSubOrder.getOrdersubId());
			tbReturnGoods.setTbOrder(tbSubOrder.getOrderId());
			// 设置退货初始状态为1：审核中
			tbReturnGoods.setAuditStatus("1");
			tbReturnGoods.setApplyTime(new Date());
			// 设置退货初始状态为1：申请中
			tbReturnGoods.setReturnGoodsStatus("1");
			tbReturnGoods.setReturnGoodsTime(tbSubOrder.getUpdateTime());
			tbReturnGoods.setCreateId(tbSubOrder.getCreateId());
			tbReturnGoods.setCreateTime(tbSubOrder.getCreateTime());
			tbReturnGoods.setUpdateId(tbSubOrder.getUpdateId());
			tbReturnGoods.setUpdateTime(tbSubOrder.getUpdateTime());
			return tbReturnGoods;
		}
		return null;
	}

	/**
	 * 
	 * 订单商品退货表数据的获取
	 */
	private TbReturnItem findByItemList(TbOrderItem tbOrderItem, TbSubOrder tbSubOrder) {
		if (tbOrderItem != null && tbSubOrder != null) {

			// 订单商品退货表
			TbReturnItem tbReturnItem = new TbReturnItem();
			tbReturnItem.setOrderItemId(tbOrderItem.getOrderItemId());// 订单商品表
			tbReturnItem.setGoodsId(tbOrderItem.getGoodsId());
			tbReturnItem.setOrdersubId(tbOrderItem.getOrdersubId());
			tbReturnItem.setGoodsName(tbOrderItem.getGoodsName());
			tbReturnItem.setReciveName(tbSubOrder.getShopName());
			tbReturnItem.setShopName(tbSubOrder.getShopName());
			if (tbSubOrder.getShopId() == null || "".equals(tbSubOrder.getShopId())) {
				return null;
			}
			tbReturnItem.setShopId(Integer.valueOf(tbSubOrder.getShopId()));
			tbReturnItem.setSellPrice(tbOrderItem.getSellPrice());
			tbReturnItem.setActualPayment(tbOrderItem.getActualPayment());
			tbReturnItem.setQuantity(tbOrderItem.getQuantity());
			tbReturnItem.setCreateId(tbOrderItem.getCreateId());
			tbOrderItem.setCreateTime(new Date());
			tbReturnItem.setUpdateId(tbOrderItem.getUpdateId());
			tbReturnItem.setUpdateTime(new Date());
			return tbReturnItem;
		}
		return null;
	}

}
