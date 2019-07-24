package cn.edu.supergo.utilstest;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.dubbo.common.json.JSONArray;

public class JsonUtilsTest {
	public static void main(String[] args) {
		List<Object> list = new ArrayList<>();
		list.add("123");
		String list2json = list2json(list);
		System.out.println(list2json);
	}

	public static String list2json(List<Object> list) {
		JSONArray jsonArray = new JSONArray();
		jsonArray.add(list);

		return jsonArray.toString();

	}
}
