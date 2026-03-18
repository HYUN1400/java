package day03;

public class While01 {

	public static void main(String[] args) {
		// While 문
		/* for : 일반적으로 반복 횟수가 정해져 있을 때
		 * while : 반복 횟수가 일정하지 않을 때
		 * while(조건식) {
		 * 	실행문;
		 * }
		 * */
		
		for(int i=1; i<=10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		int count = 1;
		
//		while(count <= 10) {
//			System.out.println(count);
//			count++;
//			
//			// 종료 조건
//			if(count == 5) {
//				break; // 반복문 빠져나가기
//			}
//		}
		
		// while로 짝수만 출력
		
//		while(count<=10) {
//			if(count % 2 == 0) {
//				System.out.print(count + " ");
//			}	
//			count++;
//		}
//		
		
		while(true) {
			if(count % 2 == 0) {
				System.out.print(count + " ");
			}	
			if(count > 10) {
				break;
			}
			count++;
		}
		
		
		
		
		
		
		
		
	
		/* End Fragment */
	}

}
