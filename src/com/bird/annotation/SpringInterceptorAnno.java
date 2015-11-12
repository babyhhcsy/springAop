package com.bird.annotation;
import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
@Component
@Aspect
public class SpringInterceptorAnno {
	@Pointcut("@annotation(com.bird.annotation.PersonAnnoCut)")
	public void pointCutMehotd() {};
	@Before(value = "pointCutMehotd()")
	public void doBefore(JoinPoint joinPoint) {
		try {
			// 创建日志记录内容
			WxLog wxLog = new WxLog();

			// 获取请求的ip地址
			String ip = "123";

			// 记录用户请求的参数值
			String params_in = "";
			if (joinPoint.getArgs() != null && joinPoint.getArgs().length > 0) {
				for (int i = 0; i < joinPoint.getArgs().length; i++) {
					params_in += joinPoint.getArgs()[i] + ";";
				}
			}
			String className;
			String methodName;
			
			try {
				className = joinPoint.getTarget().getClass().getName();
				methodName = joinPoint.getSignature().getName();
				// 获得方法描述
				String description = AnnotationUtil.getServiceMthodDescription(joinPoint);
				// 对用户请求的数据进行赋值
				wxLog.setId("123");
				wxLog.setCreateDate(new Date());
				wxLog.setParamin(params_in);
				wxLog.setClassName(className);
				wxLog.setMethodName(methodName);
				wxLog.setDescription(description);
				wxLog.setIp(ip);
				
				System.out.println(wxLog.toString());
			} catch (Exception e1) {
				e1.printStackTrace();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("在之前执行了");
	}
	@After(value = "pointCutMehotd()")
	public void doAfter() {
		System.out.println("在之后执行了");
	}
}