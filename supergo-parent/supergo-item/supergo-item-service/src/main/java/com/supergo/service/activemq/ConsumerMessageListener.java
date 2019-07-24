package com.supergo.service.activemq;

import java.io.File;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import com.supergo.mapper.ext.ItemExtMapper;
import com.supergo.pojo.ext.ItemListExt;
import com.supergo.utils.JsonUtils;
import freemarker.template.Configuration;
import freemarker.template.Template;

public class ConsumerMessageListener implements MessageListener {

	@Autowired
	private ItemExtMapper extmapper;

	@Autowired
	private FreeMarkerConfigurer configurer;

	@Override
	public void onMessage(Message message) {
		try {
			if (message instanceof TextMessage) {
				TextMessage msg = (TextMessage) message;
				// 获取文本消息
				String text = msg.getText();
				System.out.println("接受到的消息：" + text);

				// 根据不同业务逻辑进行相应处理
				String[] split = text.split(",&");
				if (split[1].equals("add")) {
					// 生成详情页的HTML
					generateHtml(split[0]);
				} else if (split[1].equals("del")) {
					// 删除详情页
					delHtml(split[0]);
				}
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 根据商品id删除静态界面
	 * 
	 * @param string
	 */
	private void delHtml(String ids) {
		String[] split = ids.split(",");
		// 循环所有商品ID
		for (int i = 0; i < split.length; i++) {
			int goodsId = Integer.parseInt(split[i]);
			System.out.println("商品Id：" + goodsId);
			// 根据ID删除指定静态页面
			String pathName = "/opt/supergo/item/" + goodsId + ".html";
			File file = new File(pathName);
			file.delete();
		}

	}

	/**
	 * 根据商品id添加静态界面
	 * 
	 * @param string
	 */
	private void generateHtml(String ids) {
		String[] idArray = ids.split(",");
		// 遍历商品ID
		for (int i = 0; i < idArray.length; i++) {
			try {
				int goodsId = Integer.parseInt(idArray[i]);
				System.out.println("商品Id：" + goodsId);

				// 1:获取模板上下文
				Configuration configuration = configurer.getConfiguration();
				// 2:获取指定的模板
				Template template = configuration.getTemplate("item.ftl");
				// 3:创建数据
				// 3.1 封装详情页数据结果
				ItemListExt goods = extmapper.queryItemListById(goodsId);
				List<String> imgList = extmapper.queryItemImg(goodsId);
				goods.setImgPath(imgList);
				System.out.println("商品详情：" + goods);
				// 3.2封装关联商品规格信息
				List<ItemListExt> specLists = extmapper.querySpecListById(goodsId);
				System.out.println("关联商品规格信息：" + specLists);
				Map<Integer, String> itemSpec = new HashMap<>();
				for (ItemListExt itemListExt : specLists) {
					itemSpec.put(itemListExt.getGoodsId(), itemListExt.getSpecInfo());
				}
				// 最终需要的商品id和规格集合
				List<Map<String, Object>> itemSpecList = new ArrayList<>();
				for (Integer key : itemSpec.keySet()) {
					// 转换格式的中间map
					Map<String, Object> specMap = new HashMap<>();
					specMap.put("goodsId", key);
					specMap.put("specInfo", itemSpec.get(key));
					// 将组合数据后的map存入list集合
					itemSpecList.add(specMap);
				}

				// 3.3封装此商品的需要展示所有规格信息
				/*
				 * 中间转换数据格式： {"网络":["移动2G","移动3G","联通3G","联通2G"],"机身内存":["64G","32G","16G"]}
				 */
				Map<String, Set<String>> specMap_temp = new HashMap<>();
				for (ItemListExt itemListExt : specLists) {
					/*
					 * 单个商品的规格信息： {"机身内存":"16G","网络":"联通3G"}
					 */
					String info = itemListExt.getSpecInfo();
					@SuppressWarnings("unchecked")
					Map<String, String> sepcMap = JsonUtils.jsonToPojo(info, Map.class);
					// 循环遍历map取出所有的K和V进行组合
					for (String key : sepcMap.keySet()) {
						// 判断key是否相等
						if (specMap_temp.containsKey(key)) {

							Set<String> set = specMap_temp.get(key);
							// 判断值是否相等
							if (!set.contains(sepcMap.get(key))) {
								set.add(sepcMap.get(key));
								// 值进行拼接
								specMap_temp.put(key, set);
							}
						} else {
							// 不相等时同时将K和V存进Map
							Set<String> valueList = new HashSet<>();
							valueList.add(sepcMap.get(key));
							specMap_temp.put(key, valueList);
						}
					}

				}
				System.out.println("specMap_temp=" + JsonUtils.objectToJson(specMap_temp));

				/*
				 * 最终展示的规格集合 [
				 * {"attributeName":"网络","attributeValue":["移动2G","移动3G","联通3G","联通2G"]},
				 * {"attributeName":"机身内存","attributeValue":["64G","32G","16G"]} ]
				 */
				List<Map<String, Object>> specList = new ArrayList<>();
				for (String key : specMap_temp.keySet()) {
					// 转换格式的中间map
					Map<String, Object> specMap = new HashMap<>();
					specMap.put("attributeName", key);
					specMap.put("attributeValue", specMap_temp.get(key));
					// 将组合后map存入list集合
					specList.add(specMap);
				}
				System.out.println("specMap=" + JsonUtils.objectToJson(specList));

				// 创建数据模型
				Map<Object, Object> data = new HashMap<>();
				data.put("goods", goods);
				data.put("specLists", JsonUtils.objectToJson(itemSpecList));
				data.put("specList", specList);

				// 4:指定目标 （暂用此目录，部署linux后修改为通过配置文件读取目录）
				String targetFile = "/opt/supergo/item/" + goodsId + ".html";
				Writer out = new FileWriter(new File(targetFile));
				// 5:生成文件
				template.process(data, out);
				out.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}

}
