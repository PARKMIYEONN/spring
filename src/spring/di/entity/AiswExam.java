package spring.di.entity;

public class AiswExam implements Exam{

	private int kor;
	private int eng;
	private int math;
	
	
	
	public AiswExam() {
		super();
	}

	public AiswExam(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	@Override
	public int total() {
		int totalScore = kor + eng + math; 
		return totalScore;
	}

	@Override
	public double avg() {
		int avgScore = (kor + eng + math)/3;
		return avgScore;
	}

	
}
