package com.example.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAOP {
	
	@Around("execution(* com.example.demo.aop.Callee.hello(..))")
	public Object runBetweenMethods(ProceedingJoinPoint pj) {
		try {
			Object proceed = pj.proceed();
			if (proceed instanceof String) {
				String str = (String)proceed;
				return str + " intercepted!!!!";
			}
			return proceed;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	@Around("within(com.example.demo.aop.*) && @annotation(MyAnno)")
	public Object runBetweenMethods2(ProceedingJoinPoint pj) {
		try {
			Object proceed = pj.proceed();
			if (proceed instanceof String) {
				String str = (String)proceed;
				return str + " intercepted!!!!";
			}
			return proceed;
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
