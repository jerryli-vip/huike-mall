package com.supergo.service.activemq;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrTemplate;

import com.supergo.mapper.ext.TbItemMapperExt;
import com.supergo.pojo.ext.TbItem;
import com.supergo.utils.JsonUtils;

public class ConsumerMessageListener implements MessageListener {

	@Autowired
	private TbItemMapperExt itemMapper;
	@Autowired
	private SolrTemplate solrTemplate;

	/**
	 * 接受消息
	 */
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
					// 添加索引库数据
					importData(split[0]);
				} else if (split[1].equals("del")) {
					// 删除索引库数据
					removeData(split[0]);
				}
			}
		} catch (JMSException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 添加索引库数据---根据所有商品id
	 * 
	 * @param ids
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void importData(String ids) {

		String[] split = ids.split(",");
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < split.length; i++) {
			int id = Integer.parseInt(split[i]);
			list.add(id);
		}

		//
		List<TbItem> itemlist = itemMapper.selectByList(list);
		for (TbItem item : itemlist) {
			Map specMap = JsonUtils.jsonToPojo(item.getSpec(), Map.class);
			item.setSpecMap(specMap);
		}
		System.out.println("开始导入数据....");
		solrTemplate.saveBeans(itemlist);
		solrTemplate.commit();
		System.out.println("导入数据完成....");

	}

	/**
	 * 删除索引库数据---根据单个商品id
	 * 
	 * @param ids
	 */
	private void removeData(String ids) {

		String[] split = ids.split(",");

		for (int i = 0; i < split.length; i++) {
			System.out.println("开始删除数据....");
			solrTemplate.deleteById(split[i]);
			solrTemplate.commit();
			System.out.println("删除数据结束....");
		}
	}
}