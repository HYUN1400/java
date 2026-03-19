package day04;

public class For07 {

	public static void main(String[] args) {
		// 소수: 1과 자기 자신만을 약수로 가진 수
		// 3 5 7 11 13 17 . . .
		/*
		 * 
		 */
		
		// 1 ~ 100까지 중 소수를 출력
		// 2 ~ 100까지 루프
		// 2 ~ 자기자신수(i) 전까지 루프
		// 나누어 떨어지는 수가 없으면 출력
		
		int count = 0;
		
		for(int i = 2; i <=100 ; i++) { // i의 수가 num이 됨
			for(int k = 2; k <= i; k++) {
				if(i % k == 0) {
					count++;
				}
			}
			if(count == 1) {
				System.out.println(i);
				count = 0;
			} else {
				count = 0;
			}
		}
		
		
		
		// num = 3 / num이 소수인지 아닌지 판별
		
//		int num = 4;
//		
//		for(int i = 2; i < num; i++) {
//		    if(num % i == 0) {
//		    	System.out.println("소수 X");
//		        break;
//		    }
//		}
//
//		if(i == num) {
//		    System.out.println("소수 O");
//		}	
//		
	
		
		// END FRAGMENT
	}

}
