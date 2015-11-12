package com.bird.annotation;

import org.springframework.stereotype.Component;

@Component
public class AnnotationManage {
	@PersonAnnoCut(pointCut = "yes")
	public String initMessage(String test){
		System.out.println("123");
		return "";
	}
}
