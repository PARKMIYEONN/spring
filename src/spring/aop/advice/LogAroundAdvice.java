package spring.aop.advice;


import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;


public class LogAroundAdvice implements MethodInterceptor{
	
	

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		//부가 업무 (시간 측정)
		long start = System.currentTimeMillis();
		
		//주 업무 부르기
		Object result = invocation.proceed();
				
		//부가 업무(시간 측정)
		long end = System.currentTimeMillis();
				
		String message = (end - start) + "ms 걸렸음";
		System.out.println(message);
		return result;
	}
	
}
