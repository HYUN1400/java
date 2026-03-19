package day04;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {
		// 약수 : 나누어서 떨어지는 수의 집합
		/*
		 * 6의 약수: 1 ~ 6까지 나누어서 떨어지는 수 > 1, 2, 3, 6
		 * 6 % 1 == 0 ? . . .
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요. 👍");
		int num = scan.nextInt();
		int i;
		
		for(i=1; i<=num; i++) {
			if(num % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		scan.close();
		
	}

}
