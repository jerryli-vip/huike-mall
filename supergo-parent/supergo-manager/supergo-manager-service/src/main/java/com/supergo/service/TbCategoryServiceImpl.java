package com.supergo.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbCategoryMapper;
import com.supergo.pojo.TbCategory;
import com.supergo.pojo.TbCategoryExample;
import com.supergo.pojo.TbCategoryExample.Criteria;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;


/**
 * 分类业务层实现类
 * 
 * */
@Service
public class TbCategoryServiceImpl implements TbCategoryService {
	// 自动装配categoryMapper
	@Autowired
	TbCategoryMapper categoryMapper;

	/**
	 * 获取页面当前页数值或者点级的分类等级，查询出分类的列表
	 */
	@Override
	public PageVO<TbCategory> getCategory(TbCategory tbCategory , Integer page , Integer rows) {
		// TODO Auto-generated method stub
		
		if(page == 0){
			page = 1;
		}
		if(rows == 0){
			rows = 10;
		}
		
		if(tbCategory==null || tbCategory.getParentId() == null  ){
			
			tbCategory= new TbCategory();
			tbCategory.setParentId(0);
		}
				
		
		//编辑查询条件
		TbCategoryExample example = new TbCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(tbCategory.getParentId());
		criteria.andIsDeleteEqualTo("N");
		//开启分页插件
		PageHelper.startPage(page,rows);
		
		//返回分类集合
		List<TbCategory> categorys = categoryMapper.selectByExample(example);
		//获取集合信息
		PageInfo<TbCategory> pageInfo = new PageInfo<>(categorys);
		//创建VO类
		PageVO<TbCategory> pv = new PageVO<>();
		//设置属性
		pv.setPage(page);
		pv.setRows(categorys);
		pv.setSize(rows);
		pv.setTotal(pageInfo.getTotal());
		
		return pv;
	}

	/**
	 * 获取页面的分类信息，在数据库进行添加
	 */
	@Override
	public Integer insertCategory(TbCategory tbCategory) {
		// TODO Auto-generated method stub

		if (tbCategory == null) {

			return 0;
		}

		// 设置TbCategory属性，创建人、创建时间、修改人、修改时间
		tbCategory.setCreateId(2);
		Date createTime = new Date(System.currentTimeMillis());
		tbCategory.setCreateTime(createTime);
		tbCategory.setUpdateId(2);
		Date updateTime = new Date(System.currentTimeMillis());
		tbCategory.setUpdateTime(updateTime);
		tbCategory.setIsDelete("N");
		tbCategory.setStatus("Y");
		

		// 执行插入命令
		return categoryMapper.insert(tbCategory);

	}

	/**
	 * 修改分类
	 */

	@Override
	public Integer updateCategory(TbCategory tbCategory) {
		// TODO Auto-generated method stub
		if (tbCategory == null) {

			return 0;
		}

		// 设置tbCategory属性，修改人，修改时间
		tbCategory.setUpdateId(2);
		Date updateTime = new Date(System.currentTimeMillis());
		tbCategory.setUpdateTime(updateTime);
		// 编写条件
		TbCategoryExample example = new TbCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(tbCategory.getCategoryId());

		// 执行修改命令
		return categoryMapper.updateByExampleSelective(tbCategory, example);
	}

	/**
	 * 删除分类
	 */
	@Override
	public Integer deleteCategory(String[] Id) {
		// TODO Auto-generated method stub
		// 判断Id是否为空
		if (Id == null || Id.length <= 0) {

			return 0;

		}
		// 将Id转换成list<>
		List<Integer> ids = new ArrayList<>();
		for (int i = 0; i < Id.length; i++) {

			ids.add(Integer.parseInt(Id[i]));

		}

		// 编辑查询条件
		TbCategoryExample example = new TbCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdIn(ids);

		TbCategory ca = new TbCategory();
		ca.setIsDelete("Y");
		// 设置tbCategory属性，修改人，修改时间
		ca.setUpdateId(2);
		Date updateTime = new Date(System.currentTimeMillis());
		ca.setUpdateTime(updateTime);
		// 执行修改命令
		return categoryMapper.updateByExampleSelective(ca, example);

	}
	
	
	
	/**
	 * 根据parentId获取分类
	 * 
	 * */

	@Override
	public PageVO<TbCategory> queryCategoryByParentId(Integer categoryId) {
		// TODO Auto-generated method stub
		
		TbCategoryExample example = new TbCategoryExample();
		Criteria criteria = example.createCriteria();
		if (categoryId != null && categoryId >= 0) {

			criteria.andParentIdEqualTo(categoryId);
		}
		List<TbCategory> selectByExample = categoryMapper.selectByExample(example);

		PageVO<TbCategory> pageVO = new PageVO<>();
		if (selectByExample != null) {

			pageVO.setRows(selectByExample);
		}
		return pageVO;
	}
	
	
	/**
	 *分类 三级回显
	 * 
	 * */
	
	
	@Override
	public ResultVO queryCategoryByID(Integer categoryId) {
		// TODO Auto-generated method stub
		if(categoryId==null||categoryId<1){
			return ResultVO.build(500, "该id不能为空或者小于1");
		}
		//查询该条记录
		TbCategoryExample example = new TbCategoryExample();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(categoryId);
		List<TbCategory> selectByExample = categoryMapper.selectByExample(example);
		//判断集合是否等于一
		if(selectByExample.size()!=1){
			return ResultVO.build(500, "该分类不存在");
		}
		//取出该分类的等级查询该级分类的集合
		Integer i = selectByExample.get(0).getLevel();
		TbCategoryExample newExample = new TbCategoryExample();
		Criteria newCriteria = newExample.createCriteria();
		newCriteria.andLevelEqualTo(i);
		List<TbCategory> tbCategoryList = categoryMapper.selectByExample(newExample);
		//将分类集合返回页面
		return ResultVO.build(200, "查询成功", tbCategoryList);
		
	}

}
