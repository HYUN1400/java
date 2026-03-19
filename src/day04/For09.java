package day04;

public class For09 {

	public static void main(String[] args) {
		// 이중 for 문
		/*
		 *  ***** > 한줄에 5개 / 5줄
		 *  *****
		 *  *****
		 *  *****
		 *  *****
		 *  
		 */
		
		System.out.println("ⓐ 5 / 5");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println(); // 줄바꿈
		}
		
		
		/*
		 * *
		 * **
		 * ***
		 * ****
		 * *****
		 * 
		 * 점점 늘어나는 별!!
		 * 
		 */
		
		System.out.println("ⓐ 12345");
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		/*
		 * *****
		 * ****
		 * ***
		 * **
		 * *
		 * 
		 */
		
		System.out.println("ⓐ 54321");
		
		for(int i = 5; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
			
		
		
		
		// END FRAGMETN
	}

}
