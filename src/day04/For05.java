package day04;

public class For05 {

	public static void main(String[] args) {
		// 공약수
		/*
		 * 6의 약수: 1 2 3 6
		 * 12의 약수: 1 2 3 4 6 12
		 * 공약수: 1 2 3 6
		 * 최대 공약수 => 6
		 * 
		 */
		
		int num1 = 6;
		int num2 = 12;
		int i;
		
		System.out.print("공약수 👉 ");
		
		for(i=1; i<=num2; i++) {	
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// 최대공약수 출력
		
		int k = 0;
		
//		System.out.print("최대공약수 👉 ");
//		
//		for(i=1; i<=num2; i++) {	
//			if(num1 % i == 0 && num2 % i == 0) {
//				k = i;
//			}
//		}
//		
//		System.out.println(k);
		
		
		// num1부터 1씩 감소 / 첫조건에 맞으면 출력 => break;
		
		k = 0;
		
		for(i = num2; ; i--) {
			if(num1 % i == 0 && num2 % i == 0) {
				System.out.println(i);
				break;
			}
		}
		
		
		
		
		
		
		// END FRAGMENT
		
	}

}
