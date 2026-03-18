package day03;

public class For01 {

	public static void main(String[] args) {
		
		/* 반복문: 규칙적인 작업을 반복적으로 할 때 사용하는 문법 
		 * for, while, do~while
		 * - for, while 은 동작 방식이 같음.
		 *  => 조건에 따라 조건이 맞지 않으면 한번도 실행이 안 될 수 있음.
		 *  
		 *  do~while: 먼저 실행하고, 조건을 나중에 비교함. 무조건 1번은 실행됨.
		 *  
		 *  for(초기화; 조건식; 증감식){
		 *  	실행문;
		 *  }
		 *  
		 *  -초기화: 실행무능ㄹ 반복하기 위한 변수를 초기화(처음 1번만 실행) : 생략가능
		 *  -조건식: 반복을 결정하는 기능(true = 반복) : 생략가능
		 *  -증감식: 조건식에서 사용하는 변수를 증가 / 감소시켜 반복 횟수를 결정 : 생략가능
		 *  
		 * */
		
		int i;
		
		for(i=0; i<=5; i++) {
			System.out.println(i);
			System.out.println("HELLO");
		}
		
		System.out.println("------>");
		
		// 1~10까지
		
		for(i=1; i<=10; i++) {
			System.out.print(i+ " ");
		}
		
		System.out.println(); //줄바꿈
	}

}
