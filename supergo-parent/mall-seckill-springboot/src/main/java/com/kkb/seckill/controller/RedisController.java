package com.kkb.seckill.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kkb.seckill.redis.RedisUtil;

/**
 * 
 * 此类描述的是： redis 测试类
 */
@RestController
public class RedisController {
	@Autowired
	RedisUtil redis;
	@RequestMapping(value="/add"
	,method=RequestMethod.GET)
	public void add(String value) {
		// 指定消息发送的目的地及内容
		
		redis.set("asdfasdf", value);
		String a = redis.get("asdfasdf");
		System.out.println(a);
	}
}
