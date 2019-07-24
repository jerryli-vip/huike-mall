package com.supergo.utils;

import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * 处理json数据格式的工具类
 * 
 * @Date 2013-3-31
 * @version 1.0
 */
public class JsonUtils {

	// 定义jackson对象
	private static final ObjectMapper MAPPER = new ObjectMapper();

	/**
	 * 将对象转换成json字符串。
	 * <p>
	 * Title: pojoToJson
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param data
	 * @return
	 */
	public static String objectToJson(Object data) {
		try {
			String string = MAPPER.writeValueAsString(data);
			return string;
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将json结果集转化为对象
	 * 
	 * @param jsonData
	 *            json数据
	 * @param clazz
	 *            对象中的object类型
	 * @return
	 */
	public static <T> T jsonToPojo(String jsonData, Class<T> beanType) {
		try {
			T t = MAPPER.readValue(jsonData, beanType);
			return t;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 将json数据转换成pojo对象list
	 * <p>
	 * Title: jsonToList
	 * </p>
	 * <p>
	 * Description:
	 * </p>
	 * 
	 * @param jsonData
	 * @param beanType
	 * @return
	 */
	public static <T> List<T> jsonToList(String jsonData, Class<T> beanType) {
		JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
		try {
			List<T> list = MAPPER.readValue(jsonData, javaType);
			return list;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	/**
	 * 将数组转换成String类型的JSON数据格式
	 * 
	 * @param objects
	 * @return
	 */
	// public static String array2json(Object[] objects) {
	//
	// JSONArray jsonArray = JSONArray.fromObject(objects);
	// return jsonArray.toString();
	//
	// }

	/**
	 * 将list集合转换成String类型的JSON数据格式
	 * 
	 * @param list
	 * @return
	 */
	// public static String list2json(List<Object> list) {
	//
	// JSONArray jsonArray = JSONArray.fromObject(list);
	// return jsonArray.toString();
	//
	// }

	/**
	 * 将map集合转换成String类型的JSON数据格式
	 * 
	 * @param map
	 * @return
	 */
	// public static String map2json(Map<String, Object> map) {
	//
	// JSONObject jsonObject = JSONObject.fromObject(map);
	// return jsonObject.toString();
	//
	// }

	/**
	 * 将Object对象转换成String类型的JSON数据格式
	 * 
	 * @param object
	 * @return
	 */
	// public static String object2json(Object object) {
	//
	// JSONObject jsonObject = JSONObject.fromObject(object);
	// return jsonObject.toString();
	//
	// }

	/**
	 * 将XML数据格式转换成String类型的JSON数据格式
	 * 
	 * @param xml
	 * @return
	 */
	// public static String xml2json(String xml) {
	//
	// JSONArray jsonArray = (JSONArray) new XMLSerializer().read(xml);
	// return jsonArray.toString();
	//
	// }

	/**
	 * 除去不想生成的字段（特别适合去掉级联的对象）
	 *
	 * @param excludes
	 * @return
	 */
	// public static JsonConfig configJson(String[] excludes) {
	// JsonConfig jsonConfig = new JsonConfig();
	// jsonConfig.setExcludes(excludes);
	// jsonConfig.setIgnoreDefaultExcludes(true);
	// jsonConfig.setCycleDetectionStrategy(CycleDetectionStrategy.LENIENT);
	// return jsonConfig;
	// }

}
