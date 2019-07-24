package com.supergo.service;

import com.supergo.pojo.TbAd;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

public interface TbADService {
	/**
	 * 获取当前页跟记录数返回数据
	 * */
	PageVO<TbAd> getADs(Integer page, Integer rows);
	/**
	 * 删除广告
	 * */
	Integer deleteADs(Integer[] adIds);
	/**
	 * 开启广告
	 * */
	Integer openADs(Integer[] adIds);
	/**
	 * 屏蔽广告
	 * */
	Integer offADs(Integer[] adIds);
	/**
	 * 添加广告
	 * @param tbAd
	 * @return
	 */
	ResultVO insert(TbAd tbAd);
	
	
	/**
	 * 修改广告
	 * */
	ResultVO upadteAD(TbAd ad);

	/**
	 * 广告页面生成器
	 */
	public void ADPageCreator();
}
