package spring.di.entity;

public class HiExam implements Exam{

	private int kor;
	private int eng;
	private int math;
	private int com;
	
	
	
	public HiExam() {
		super();
	}

	public HiExam(int kor, int eng, int math, int com) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.com = com;
	}

	public int getKor() {
		return kor;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
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
		int totalScore = kor + eng + math + com; 
		return totalScore;
	}

	@Override
	public double avg() {
		int avgScore = (kor + eng + math + com)/4;
		return avgScore;
	}

	
}
