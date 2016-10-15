package com.cn.java.test;

import org.apache.log4j.Logger;
import org.springframework.test.context.ContextConfiguration;


@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"}) 

public class TestMybatis {

	private static Logger logger = Logger.getLogger(TestMybatis.class);  
	
	public static void main(String[] args) {
		 
	}
}
