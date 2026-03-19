package day04;

public class For08 {

	public static void main(String[] args) {
		// 구구단 2 ~ 9 단
		// 이중 for 문
		
		for(int i = 2; i <= 9; i++) {
			
			System.out.println(i + "단 👉");

			for(int k = 1; k <= 9; k++) {
				int sum = 0;
				sum = i * k;
				System.out.println(""+i+" * "+k+" = "+sum);
			}		
		}
		
		/*
		 * 2 * 1 = 2  3 * 1 = 3  4 * 1 = 4
		 * 2 * 2 = 4  3 * 2 = 6  4 * 2 = 8
		 * ...
		 */
		
		// i = 1 일 때 k = 2 ~ 9
		// i = 2 일 때 k = 2 ~ 9
		
		System.out.println();
		
		int sum = 0;

		for(int i = 1; i <= 9; i++) {        
		    for(int k = 2; k <= 9; k++) {    
		        sum = i * k;
		        System.out.print(k + " * " + i + " = " + sum + "	|	");
		    }
		    System.out.println(); // 줄바꿈
		}
		
		
		
		
		
		
		
		
		// END FRAGMENT
	}

}
