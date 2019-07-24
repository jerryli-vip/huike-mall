package com.supergo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbRefundMapper;
import com.supergo.mapper.ext.TbRefundExtMapper;
import com.supergo.pojo.TbRefund;
import com.supergo.pojo.TbRefundExample;
import com.supergo.pojo.TbRefundExample.Criteria;
import com.supergo.pojo.ext.TbRefundExt;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

@Service
public class TbRefundServiceImpl implements TbRefundService {

	@Autowired
	private TbRefundExtMapper extmapper;
	@Autowired
	private TbRefundMapper mapper;

	/**
	 * 按条件分页查询
	 */
	@Override
	public PageVO<TbRefundExt> queryTbRefund(TbRefundExt refund, Integer page, Integer rows) {

		// 分页默认值检验
		if (page == null || page <= 0) {
			page = 0;
		}
		if (rows == null || rows <= 0 || rows >= 150) {
			rows = 10;
		}

		PageHelper.startPage(page, rows);

		// 将结果赋值给pagevo对象
		List<TbRefundExt> list = extmapper.selectByExt(refund);
		System.out.println(list);
		// 将结果赋值给pagevo对象
		PageInfo<TbRefundExt> pageInfo = new PageInfo<>(list);
		PageVO<TbRefundExt> pageVO = new PageVO<>();
		pageVO.setPage(page);
		pageVO.setSize(rows);
		pageVO.setTotal(pageInfo.getTotal());
		pageVO.setRows(list);

		return pageVO;

	}

	/**
	 * 退款处理中
	 */
	@Override
	public ResultVO refundBack(String[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要修改的订单");
		}
		System.out.println(ids);

		TbRefund record = new TbRefund();
		record.setReturnGoodsStatus("0");
		TbRefundExample example = new TbRefundExample();

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
	 * 退款成功
	 */
	@Override
	public ResultVO refundSuccess(String[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要修改的订单");
		}
		System.out.println(ids);

		TbRefund record = new TbRefund();
		record.setReturnGoodsStatus("1");
		TbRefundExample example = new TbRefundExample();

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
	 * 退款失败
	 */
	@Override
	public ResultVO refundFail(String[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要修改的订单");
		}
		System.out.println(ids);

		TbRefund record = new TbRefund();
		record.setReturnGoodsStatus("2");
		TbRefundExample example = new TbRefundExample();

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
	 * 退款取消
	 */
	@Override
	public ResultVO refundCancel(String[] ids) {
		if (ids == null || ids.length <= 0) {
			return ResultVO.build(-1, "没有选中要修改的订单");
		}
		System.out.println(ids);

		TbRefund record = new TbRefund();
		record.setReturnGoodsStatus("3");
		TbRefundExample example = new TbRefundExample();

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

}
