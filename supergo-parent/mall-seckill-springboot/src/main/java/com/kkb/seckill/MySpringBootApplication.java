package com.kkb.seckill;

import javax.jms.Queue;

import org.apache.activemq.command.ActiveMQQueue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MySpringBootApplication {

	private final static Logger logger = LoggerFactory.getLogger(MySpringBootApplication.class);

	@Bean
	public Queue queue() {
		return new ActiveMQQueue("kkb.active.queue");
	}

	public static void main(String[] args) {

		logger.info(">>>>>>>>>>>>>>>>>>>start");
		SpringApplication.run(MySpringBootApplication.class, args);
		logger.info(">>>>>>>>>>>>>>>>>>>started");

	}

}