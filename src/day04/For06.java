package day04;

public class For06 {

	public static void main(String[] args) {
		// 배수 : 1부터 값을 곱해서 나오는 값
		/*
		 * 10의 배수: 10 20 30 40 50 . . . 
		 * 15의 배수: 15 30 45 60 75 . . . 
		 * 공배수: 두 배수의 공통된 값: 30 60 90 . . .
		 * 최소 공배수 => 30 
		 * 
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		int max = Math.max(num1, num2);
		
//		for(;;) {
//			if(max % num1 == 0 && max % num2 == 0) {
//				System.out.println(max);
//				break;
//			}
//			
//			max++;
//		}
//		
		for(int i = num1; ; i=i+num1) {
			if(i % num1 == 0 && i % num2 == 0) {
				System.out.println(i);
				break;
			}
		}
		
		
		
		// END FRAGMENT
	}

}
