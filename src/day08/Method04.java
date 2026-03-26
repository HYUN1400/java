package day08;

import java.util.Scanner;

public class Method04 {

	/*
	 * 정수 하나를 매개변수로 입력받아 해당 정수의 구구단을 출력
	 * 매개변수 : int
	 * 리턴타입 : void
	 * 메서드명 : multiTable
	 */
	
	public void multiTable(int num) {		
		for(int i = 1; i <= 9; i++) {	
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	
	public static void main(String[] args) {
		
		Method04 m1 = new Method04();
		
		Scanner scan = new Scanner(System.in);
		
		// 구구단 출력 메서드 연습
		
		System.out.println("정수를 입력해주세요. 👉");
		
		int num = scan.nextInt();
		
		m1.multiTable(num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		// END
	}

}
