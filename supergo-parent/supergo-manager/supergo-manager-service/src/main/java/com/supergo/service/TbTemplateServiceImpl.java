package com.supergo.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.supergo.mapper.TbTemplateMapper;
import com.supergo.pojo.TbSpec;
import com.supergo.pojo.TbTemplate;
import com.supergo.pojo.TbTemplateExample;
import com.supergo.pojo.TbTemplateExample.Criteria;
import com.supergo.pojo.ext.TbTemplateExt;
import com.supergo.pojo.ext.TbTemplateVO;
import com.supergo.pojo.ext.TemplateAttribute;
import com.supergo.utils.JsonUtils;
import com.supergo.utils.PageVO;
import com.supergo.utils.ResultVO;

/**
 * 模版业务实现类
 * 
 */

@Service
public class TbTemplateServiceImpl implements TbTemplateService {
	// 自动装填templateMapper
	@Autowired
	private TbTemplateMapper templateMapper;

	// @Autowired
	// private TbBrandMapper brandMapper ;
	// @Autowired
	// private TbSpecMapper specMapper ;
	/**
	 * 查询模版列表
	 */
	@Override
	public PageVO<TbTemplate> getTemplate(TbTemplate tbTemplate, Integer page, Integer rows) {
		// TODO Auto-generated method stub
		if (page == 0) {
			page = 1;
		}
		if (rows == 0) {
			rows = 10;
		}
		// mybatis的第三方分页插件---PageHelper
		PageHelper.startPage(page, rows);
		// 设置查询条件
		TbTemplateExample example = new TbTemplateExample();
		Criteria criteria = example.createCriteria();
		// 如果tbTemplate不为空则赋值templateName为空字符串
		if (tbTemplate != null) {

			if (StringUtils.isNotBlank(tbTemplate.getTemplateName())) {

				// 设置查询条件为templateName模糊查寻，注意：要修改Mapper里的模糊查询sql语句 Name前后拼接%字符串
				criteria.andTemplateNameLike(tbTemplate.getTemplateName());
			}

		}
		// 查询没有被删除的
		criteria.andIsDeleteEqualTo("N");

		// 执行sql命令获取返回的template集合
		List<TbTemplate> templates = templateMapper.selectByExample(example);

		// 获取分页信息
		PageInfo<TbTemplate> pageInfo = new PageInfo<>(templates);
		// 创建vo类
		PageVO<TbTemplate> pv = new PageVO<>();
		// 设置vo属性
		pv.setPage(page);
		pv.setRows(templates);
		pv.setSize(rows);
		pv.setTotal(pageInfo.getTotal());
		return pv;

	}

	/**
	 * 添加模版
	 */
	@Override
	public Integer insertTemplate(TbTemplateExt tbTemExt) {
		// TODO Auto-generated method stub
		// 设置tbTemplate属性，创建人、创建时间、修改人、修改时间、是否删除、是否生效

		if (tbTemExt == null) {
			return 0;
		}
		if (tbTemExt.getCategoryId() == null || tbTemExt.getCategoryId() == 0) {
			return 0;
		}
		if (tbTemExt.getTemplateName() == null || "".equals(tbTemExt.getTemplateName())) {
			return 0;
		}
		if (tbTemExt.getBrands() == null || tbTemExt.getBrands().size() == 0) {
			return 0;
		}
		if (tbTemExt.getSpecs() == null || tbTemExt.getSpecs().size() == 0) {
			return 0;
		}

		// new一个新的TbTemplate对象
		TbTemplate tbTemplate = new TbTemplate();

		// 品牌的字符串
		String brand = "[";
		// 规格字符串
		String spec = "[";
		if (tbTemExt.getBrands().size() > 0) {

			for (int i = 0; i < tbTemExt.getBrands().size(); i++) {
				if (i > 0) {
					brand += ",";
				}
				brand += "{\"brandId\":" + tbTemExt.getBrands().get(i).get("id") + "," + "\"brandName\":\""
						+ tbTemExt.getBrands().get(i).get("text") + "\"}";
			}

		}

		if (tbTemExt.getSpecs().size() > 0) {

			for (int j = 0; j < tbTemExt.getSpecs().size(); j++) {
				if (j > 0) {
					spec += ",";
				}
				spec += "{\"specId\":" + tbTemExt.getSpecs().get(j).get("id") + "," + "\"specName\":\""
						+ tbTemExt.getSpecs().get(j).get("text") + "\"}";
			}
		}

		brand += "]";
		spec += "]";

		if (tbTemExt.getAttribute().size() > 0) {
			String attribute = JsonUtils.objectToJson(tbTemExt.getAttribute());
			tbTemplate.setAttribute(attribute);
		}
		// 设置模版名称
		tbTemplate.setTemplateName(tbTemExt.getTemplateName());
		// 设置模版所属分类
		tbTemplate.setCategoryId(tbTemExt.getCategoryId());
		// 设置模版关联品牌
		tbTemplate.setBrands(brand);
		// 设置模版关联规格
		tbTemplate.setSpecs(spec);

		tbTemplate.setCreateId("2");
		Date createTime = new Date();
		tbTemplate.setCreateTime(createTime);
		tbTemplate.setUpdateId("2");
		Date updateTime = new Date();
		tbTemplate.setUpdateTime(updateTime);
		tbTemplate.setIsDelete("N");
		tbTemplate.setStatus("Y");
		// 执行插入命令
		return templateMapper.insert(tbTemplate);

	}

	/**
	 * 修改模版
	 */
	@Override
	public Integer updateTemplate(TbTemplateExt tbTemExt) {
		// TODO Auto-generated method stub

		if (tbTemExt == null) {
			return 0;
		}
		if (tbTemExt.getCategoryId() == null || tbTemExt.getCategoryId() == 0) {
			return 0;
		}
		if (tbTemExt.getTemplateName() == null || "".equals(tbTemExt.getTemplateName())) {
			return 0;
		}
		if (tbTemExt.getBrands() == null || tbTemExt.getBrands().size() == 0) {
			return 0;
		}
		if (tbTemExt.getSpecs() == null || tbTemExt.getSpecs().size() == 0) {
			return 0;
		}
		// new一个新的TbTemplate对象
		TbTemplate tbTemplate = new TbTemplate();

		// 品牌的字符串
		String brand = "[";
		// 规格字符串
		String spec = "[";
		if (tbTemExt.getBrands().size() > 0) {

			for (int i = 0; i < tbTemExt.getBrands().size(); i++) {
				if (i > 0) {
					brand += ",";
				}
				brand += "{\"brandId\":" + tbTemExt.getBrands().get(i).get("id") + "," + "\"brandName\":\""
						+ tbTemExt.getBrands().get(i).get("text") + "\"}";
			}

		}

		if (tbTemExt.getSpecs().size() > 0) {

			for (int j = 0; j < tbTemExt.getSpecs().size(); j++) {
				if (j > 0) {
					spec += ",";
				}
				spec += "{\"specId\":" + tbTemExt.getSpecs().get(j).get("id") + "," + "\"specName\":\""
						+ tbTemExt.getSpecs().get(j).get("text") + "\"}";
			}
		}

		brand += "]";
		spec += "]";
		if (tbTemExt.getAttribute().size() > 0) {
			String attribute = JsonUtils.objectToJson(tbTemExt.getAttribute());
			tbTemplate.setAttribute(attribute);
		}
		// 设置模版id
		tbTemplate.setTemplateId(tbTemExt.getTemplateId());
		// 设置模版名称
		tbTemplate.setTemplateName(tbTemExt.getTemplateName());
		// 设置模版所属分类
		tbTemplate.setCategoryId(tbTemExt.getCategoryId());
		// 设置模版关联品牌
		tbTemplate.setBrands(brand);
		// 设置模版关联规格
		tbTemplate.setSpecs(spec);

		// 设置tbTemplate属性，修改人、修改时间、
		tbTemplate.setUpdateId("2");
		Date updateTime = new Date();
		tbTemplate.setUpdateTime(updateTime);
		// 编辑筛选条件
		TbTemplateExample example = new TbTemplateExample();
		Criteria criteria = example.createCriteria();
		criteria.andTemplateIdEqualTo(tbTemplate.getTemplateId());
		// 执行修改命令
		return templateMapper.updateByExampleSelective(tbTemplate, example);

	}

	/**
	 * 删除模版
	 */
	@Override
	public Integer deleteTemplate(String[] Id) {
		// TODO Auto-generated method stub

		if (Id == null || Id.length <= 0) {

			return 0;

		}
		// 将Id转换成list<>
		List<Integer> ids = new ArrayList<>();
		for (int i = 0; i < Id.length; i++) {

			ids.add(Integer.parseInt(Id[i]));

		}

		// 编辑筛选条件
		TbTemplateExample example = new TbTemplateExample();
		Criteria criteria = example.createCriteria();
		criteria.andTemplateIdIn(ids);

		// 设置修改的列名跟内容
		TbTemplate te = new TbTemplate();
		te.setIsDelete("Y");
		// 设置tbTemplate属性，修改人，修改时间
		te.setUpdateId("2");
		Date updateTime = new Date();
		te.setUpdateTime(updateTime);

		// 执行修改命令
		return templateMapper.updateByExampleSelective(te, example);

	}

	/**
	 * 根据模版id查询模版
	 */
	@Override
	public ResultVO queryByPK(Integer id) {
		if (id == null || id < 0) {
			return ResultVO.build(-1, "id不存在");
		}

		TbTemplate template = templateMapper.selectByPrimaryKey(id);

		if (template == null) {
			return ResultVO.build(-1, "模板不存在");
		}
		return ResultVO.build(200, "查询成功", template);
	}

	/**
	 * 根据id查询模版用来修改回显
	 */
	@Override
	public ResultVO getTemplateById(Integer templateId) {
		// TODO Auto-generated method stub
		// new一个新对象
		TbTemplateVO templateVO = new TbTemplateVO();
		// 判断传入的值小于1
		if (templateId < 1) {
			// 设置结果类的状态为500
			return ResultVO.build(500, "该模版不存在");
		}
		// 如果不小于1根据主键查询模版数据
		TbTemplate template = templateMapper.selectByPrimaryKey(templateId);
		// 判断字符串是否为空
		if (template.getBrands() != null || !"".equals(template.getBrands())) {
			// 将brands列字符串转换成TbTemplate集合
			List<TbTemplate> brandsList = JsonUtils.jsonToList(template.getBrands(), TbTemplate.class);
			templateVO.setBrands(brandsList);
		}

		// 判断字符串是否为空
		if (template.getSpecs() != null || !"".equals(template.getSpecs())) {
			// 将specs列字符串装换成TbSpec集合
			List<TbSpec> specsList = JsonUtils.jsonToList(template.getSpecs(), TbSpec.class);
			templateVO.setSpecs(specsList);
		}

		// 判断字符串是否为空
		if (template.getAttribute() != null || !"".equals(template.getAttribute())) {
			// 将attribute列字符串转换成json数组
			List<TemplateAttribute> attributeList = JsonUtils.jsonToList(template.getAttribute(),
					TemplateAttribute.class);
			templateVO.setAttribute(attributeList);
		}

		templateVO.setTemplateId(template.getTemplateId());
		templateVO.setCategoryId(template.getCategoryId());
		templateVO.setTemplateName(template.getTemplateName());

		return ResultVO.build(200, "查询成功", templateVO);
	}

	/**
	 * 查询分类id是否存在
	 * 
	 **/

	@Override
	public ResultVO queryTemplate(Integer categoryId) {
		// TODO Auto-generated method stub
		// 判断categoryId是否为空
		if (categoryId == null || categoryId < 1) {
			return ResultVO.build(5000, "该分类不存在");
		}
		// new一个新对象
		// TbTemplate template = new TbTemplate();
		// 设置查询条件
		TbTemplateExample example = new TbTemplateExample();
		Criteria criteria = example.createCriteria();
		criteria.andCategoryIdEqualTo(categoryId);
		List<TbTemplate> i = templateMapper.selectByExample(example);
		if (i.size() == 0) {
			return ResultVO.build(200, "该分类还没有模版");
		} else {
			return ResultVO.build(500, "该分类有多个分类");
		}

	}

}
