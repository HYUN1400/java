package day03;

public class For02 {

	public static void main(String[] args) {
		int i;
		int sum = 0; // 지역변수는 반드시 초기화를 해주어야 사용 가능.
		
		for(i=0; i<=100; i++) {
			sum += i;
		}
		
		System.out.println(sum);
	}

}
