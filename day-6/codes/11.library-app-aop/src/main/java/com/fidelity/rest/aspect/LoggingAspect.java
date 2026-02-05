package com.fidelity.rest.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Aspect
@Component
@Slf4j
public class LoggingAspect {
	// Pointcut expression to match all methods of all classes in the com.fidelity.rest.services package
	@Before("execution(* com.fidelity.rest.services.*.*(..))")
	public void logBeforeMethodExecution(JoinPoint joinPoint) {
		String methodName = joinPoint.getSignature().getName();
		System.out.println("LOGGING ASPECT: Before executing method: " + methodName);
		log.info("LOGGING ASPECT: Before executing method: {}", methodName);
	}
}
