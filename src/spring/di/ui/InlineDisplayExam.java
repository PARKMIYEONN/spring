package spring.di.ui;

import spring.di.entity.AiswExam;
import spring.di.entity.Exam;

public class InlineDisplayExam implements DisplayExam{
	private Exam exam;
	
	
	
	public InlineDisplayExam() {
		super();
	}

	@Override
	public void display() {
		System.out.println("total : " + exam.total() + " " + "avg : " + exam.avg());
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	
}
