package day02;

public class Exam01 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 점수를 변수로 선언 => 값을 저장
		 * 합게와 평균을 출력
		 * 평균의 소수점은 표시
		 * 조건선택연산자를 이용하여 평균이 80점 이상이면 합격, 아니면 불합격 출력
		 * */
		
		int lan = 84;
		int eng = 90;
		int math = 74;
		
		int sum = lan + eng + math; // 합계
		int average = sum / 3; // 평균
		float averagePoint = sum / 3.0f; // 평균 소수점
		
		boolean result = average >= 80;
		
		System.out.println(sum);
		System.out.println(average);
		System.out.println(averagePoint);
		System.out.println(result ? "합격" : "불합격");
	}

}
