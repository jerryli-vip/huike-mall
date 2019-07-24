package com.supergo.service;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbAdCategoryMapper;
import com.supergo.mapper.TbAdMapper;
import com.supergo.pojo.TbAd;
import com.supergo.pojo.TbAdCategory;
import com.supergo.pojo.TbAdCategoryExample;
import com.supergo.pojo.TbAdExample;
import com.supergo.pojo.TbAdExample.Criteria;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

import freemarker.template.Configuration;
import freemarker.template.Template;

/**
 * 广告管理业务层
 */
@Service
public class TbADServiceImpl implements TbADService {

	@Autowired
	private TbAdMapper tbAdMapper;

	@Autowired
	private FreeMarkerConfigurer configurer;
	@Autowired
	private TbAdCategoryMapper adCategoryMapper;
	/**
	 * 获取广告
	 */

	@Override
	public PageVO<TbAd> getADs(Integer page, Integer rows) {
		if (page == 0) {
			page = 1;
		}
		if (rows == 0) {
			rows = 10;
		}

		// 编辑查询条件
		TbAdExample example = new TbAdExample();
		// Criteria criteria = example.createCriteria();
		// criteria.andIsDeleteEqualTo("N");

		// 开启分页插件
		PageHelper.startPage(page, rows);
		// 获取集合
		List<TbAd> ads = tbAdMapper.selectByExample(example);
		// 获取集合信息
		PageInfo<TbAd> pageInfo = new PageInfo<>(ads);
		// 创建PageVO类
		PageVO<TbAd> pv = new PageVO<>();

		// 设置属性
		pv.setPage(page);
		pv.setRows(ads);
		pv.setSize(rows);
		pv.setTotal(pageInfo.getTotal());
		return pv;
	}

	/**
	 * 根据id集合删除广告
	 */
	@Override
	public Integer deleteADs(Integer[] adIds) {
		if (adIds == null || adIds.length < 1) {
			return 0;
		}

		// 将数组转换成集合

		List<Integer> ids = Arrays.asList(adIds);

		// 设置条件
		TbAdExample example = new TbAdExample();
		Criteria criteria = example.createCriteria();
		criteria.andAdIdIn(ids);
		// 设置参数
		TbAd ad = new TbAd();
		ad.setIsDelete("Y");
		// 执行sql修改语句
		return tbAdMapper.updateByExampleSelective(ad, example);

	}

	/**
	 * 根据id集合开启广告
	 */
	@Override
	public Integer openADs(Integer[] adIds) {
		if (adIds == null || adIds.length < 1) {
			return 0;
		}

		// 将数组转换成集合

		List<Integer> ids = Arrays.asList(adIds);

		// 设置条件
		TbAdExample example = new TbAdExample();
		Criteria criteria = example.createCriteria();
		criteria.andAdIdIn(ids);
		// 设置参数
		TbAd ad = new TbAd();
		ad.setStatus("Y");
		// 执行sql修改语句
		return tbAdMapper.updateByExampleSelective(ad, example);
	}

	/**
	 * 屏蔽广告
	 */

	@Override
	public Integer offADs(Integer[] adIds) {
		if (adIds == null || adIds.length < 1) {
			return 0;
		}

		// 将数组转换成集合

		List<Integer> ids = Arrays.asList(adIds);

		// 设置条件
		TbAdExample example = new TbAdExample();
		Criteria criteria = example.createCriteria();
		criteria.andAdIdIn(ids);
		// 设置参数
		TbAd ad = new TbAd();
		ad.setStatus("N");
		// 执行sql修改语句
		return tbAdMapper.updateByExampleSelective(ad, example);
	}
	
	/**
	 * 添加广告
	 */
	@Override
	public ResultVO insert(TbAd tbAd) {
		if (tbAd == null) {
			return ResultVO.build(-1, "没有数据传入");
		}
		if (StringUtils.isBlank(tbAd.getTitle())) {
			return ResultVO.build(-1, "添加失败，标题不能为空");
		}
		if (tbAd.getOntime() == null) {
			return ResultVO.build(-1, "添加失败，开始时间不能为空");
		}
		if (tbAd.getOfftime() == null) {
			return ResultVO.build(-1, "添加失败，结束时间不能为空");
		}
		if (StringUtils.isBlank(tbAd.getUrl())) {
			return ResultVO.build(-1, "添加失败，网址不能为空");
		}
		if (tbAd.getCategoryId() == null) {
			return ResultVO.build(-1, "添加失败，分类不能为空");
		}
		if (StringUtils.isBlank(tbAd.getPic())) {
			return ResultVO.build(-1, "添加失败，图片不能为空");
		}
		// 默认初始化
		tbAd.setCreateTime(new Date());
		tbAd.setUpdateTime(new Date());
		if (StringUtils.isBlank(tbAd.getStatus())) {
			tbAd.setStatus("0");
		}
		if (StringUtils.isBlank(tbAd.getSort())) {
			tbAd.setSort("0");
		}
		int line = tbAdMapper.insertSelective(tbAd);
		if (line > 0) {
			return ResultVO.build(200, "插入成功");
		}
		return ResultVO.build(-1, "插入失败");
	}

	/**
	 * 修改广告
	 * 
	 * */
	@Override
	public ResultVO upadteAD(TbAd ad) {
		//判断ad是否为空
		
		if (ad == null) {
			return ResultVO.build(-1, "没有数据传入");
		}
		if(ad.getAdId()==null||ad.getAdId()==0){
			return ResultVO.build(-1,"未查找到该纪录");
		}
		if (StringUtils.isBlank(ad.getTitle())) {
			return ResultVO.build(-1, "添加失败，标题不能为空");
		}
		if (ad.getOntime() == null) {
			return ResultVO.build(-1, "添加失败，开始时间不能为空");
		}
		if (ad.getOfftime() == null) {
			return ResultVO.build(-1, "添加失败，结束时间不能为空");
		}
		if (StringUtils.isBlank(ad.getUrl())) {
			return ResultVO.build(-1, "添加失败，网址不能为空");
		}
		if (ad.getCategoryId() == null) {
			return ResultVO.build(-1, "添加失败，分类不能为空");
		}
		if (StringUtils.isBlank(ad.getPic())) {
			return ResultVO.build(-1, "添加失败，图片不能为空");
		}
		//设置条件
		TbAdExample example = new TbAdExample();
		Criteria criteria = example.createCriteria();
		criteria.andAdIdEqualTo(ad.getAdId());
		//设置修改时间
		ad.setUpdateTime(new Date());
		Integer total = tbAdMapper.updateByExample(ad, example);
		if(total==1){
			return ResultVO.build(200, "修改成功");
		}else{
			return ResultVO.build(500, "修改失败");
		}
		
	}

	/**
	 * 广告页面生成器
	 * @author dangchuansen
	 *
	 */
	@Override
	public void ADPageCreator() {

		Writer out = null;
		try {
			//1:获取模板上下文
			Configuration configuration = configurer.getConfiguration();
			//2:获取指定的模板
			Template template = configuration.getTemplate("index.ftl");
			//3:创建数据
			Map<String,Object> data = new HashMap<>();
			
			// 3.1 获取分类id
			TbAdCategoryExample adCategoryExample = new TbAdCategoryExample();
			com.supergo.pojo.TbAdCategoryExample.Criteria createCriteria = adCategoryExample.createCriteria();
			createCriteria.andStatusEqualTo("1");
			List<TbAdCategory> adCategoryList = adCategoryMapper.selectByExample(adCategoryExample);
			for (TbAdCategory tbAdCategory : adCategoryList) {
				// 3.2 根据分类id获取广告信息
				Integer adCategoryId = tbAdCategory.getAdCategoryId();
				
				TbAdExample adExample = new TbAdExample();
				com.supergo.pojo.TbAdExample.Criteria createCriteria2 = adExample.createCriteria();
				createCriteria2.andCategoryIdEqualTo(adCategoryId);
				List<TbAd> adList = tbAdMapper.selectByExample(adExample);
				
				// 3.3 广告分类的code作为key 广告信息作为value
				data.put(tbAdCategory.getCode(), adList);
			}
			
			//4:指定目标文件（暂用此目录，部署linux后修改为通过配置文件读取目录）
			String targetFile = "/opt/supergo/www/index.html";
			out = new FileWriter(new File(targetFile));
			//5:生成文件
			template.process(data, out );
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			//6:释放资源
			try {
				if (out != null) {
					out.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}	
		}
		
	
	}

}
