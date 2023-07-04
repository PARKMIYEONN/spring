package spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;


public class Program {

	public static void main(String[] args) {
		
		//spring container
				ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/setting.xml");
				Exam exam = context.getBean("exam", Exam.class);
				
				System.out.println("total : " + exam.total());
				System.out.println("avg : " + exam.avg());
								
	}

}
