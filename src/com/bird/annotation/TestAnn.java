package com.bird.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.abc.service.AdviceManager;

public class TestAnn {
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		AnnotationManage manager = context.getBean(AnnotationManage.class);
		manager.initMessage("传入参数设置");
	}
}
