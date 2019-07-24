package com.supergo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
import com.supergo.pojo.TbAd;
import com.supergo.service.TbADService;

import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 广告管理控制层
 */
@RestController
@RequestMapping("/AD")
public class TbADController {

	@Reference
	private TbADService adService;

	/**
	 * 获取当前页跟记录数返回数据
	 */
	@RequestMapping("/query/{page}/{rows}")
	public PageVO<TbAd> getADs(@PathVariable Integer page, @PathVariable Integer rows) {

		return adService.getADs(page, rows);

	}

	/**
	 * 删除广告
	 */
	@RequestMapping("/deleteADs")
	public ResultVO deleteADs(@RequestBody(required = false) Integer[] adIds) {

		Integer total = adService.deleteADs(adIds);
		if (total == 0) {
			return ResultVO.build(500, "删除失败");
		} else {
			return ResultVO.build(200, "删除成功");
		}

	}

	/**
	 * 开启广告
	 */
	@RequestMapping("/openADs")
	public ResultVO openADs(@RequestBody(required = false) Integer[] adIds) {

		Integer total = adService.openADs(adIds);
		if (total == 0) {
			return ResultVO.build(500, "开启失败");
		} else {
			return ResultVO.build(200, "开启成功");
		}

	}

	/**
	 * 屏蔽广告
	 */
	@RequestMapping("/offADs")
	public ResultVO offADs(@RequestBody(required = false) Integer[] adIds) {

		Integer total = adService.offADs(adIds);
		if (total == 0) {
			return ResultVO.build(500, "开启失败");
		} else {
			return ResultVO.build(200, "开启成功");
		}

	}

	/**
	 * 新增广告
	 */
	@RequestMapping("/insert")
	public ResultVO insert(@RequestBody(required = false) TbAd tbAd) {
		try {
			return adService.insert(tbAd);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ResultVO.build(-1, "系统出错");

	}

	/**
	 * 广告静态页面生成器
	 */
	@RequestMapping("/ADPageCreator")
	public ResultVO ADPageCreator() {
		
		adService.ADPageCreator();
		return ResultVO.build(200, "静态页面生成完成");
	}
	
	/**
	 * 修改广告
	 * */
	@RequestMapping("/updateAD")
	public ResultVO updateAD(@RequestBody(required=false) TbAd ad)	{
		
		return adService.upadteAD(ad);
	
		
		
	}	
}
