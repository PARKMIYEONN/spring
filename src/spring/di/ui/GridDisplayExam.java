package spring.di.ui;

import spring.di.entity.Exam;

public class GridDisplayExam implements DisplayExam{

	private Exam exam;
	
	public GridDisplayExam() {
		super();
	}

	@Override
	public void display() {
		System.out.println("-------------------------------------------------");
		System.out.println("total " +"| "+ exam.total());
		System.out.println("avg   " +"| "+ exam.avg());	
		System.out.println("-------------------------------------------------");
	}

	@Override
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	
}
