package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.DisplayExam;

public class Program {

	public static void main(String[] args) {
		
		//spring container
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		DisplayExam displayExam = context.getBean(DisplayExam.class);
		//DisplayExam displayExam = (DisplayExam??)context.getBean("displayExam");
		
		//Exam exam = new AiswExam(10, 10, 10);
		//DisplayExam displayExam = new InlineDisplayExam();
		//DisplayExam displayExam = new GridDisplayExam();
		//displayExam.setExam(exam);
		displayExam.display();
				
	}

}
