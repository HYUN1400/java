package day10;

import java.text.DecimalFormat;

public class Report {
	// 멤버변수: 이름 국어 영어 수학 합계 평균 등수
	DecimalFormat format = new DecimalFormat("##.00");
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private double avg;
	private int rank;

	// 생성자(이름, 국어, 영어, 수학)
	// 합계, 평균 계산
	// 평균 출력 DecimalFormat("##.00")
	
	public Report(String name, int kor, int eng, int math) {
			setName(name);
			setKor(kor);
			setEng(eng);
			setMath(math);
			
			setSum(kor + eng + math);
			avg = sum / 3.0;
	}
	
	// 출력
	
		@Override
		public String toString() {
			DecimalFormat df = new DecimalFormat("##.00");
			return name + "\t" + kor + "\t" + eng + "\t" + math + "\t" + 
					sum + "\t" + df.format(avg) + "\t" + rank;
		}
		
	
	// getter | setter
	
	public String getName() {
		return name;
	}	
	public void setName(String name) {
		this.name = name;
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

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}
	
	
}
