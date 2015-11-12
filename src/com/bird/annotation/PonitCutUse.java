package com.bird.annotation;
public class PonitCutUse {
	@PersonAnnoCut(pointCut = "yes")
	public void testBefore() {
		System.out.println("我是测试Befor方法");
	}
	@PersonAnnoCut(pointCut = "yes")
	public void pointCutMehotd() {
		System.out.println("hahah");
	}
}