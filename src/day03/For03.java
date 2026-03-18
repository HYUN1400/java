package day03;

import java.util.Scanner;

public class For03 {

	public static void main(String[] args) {
		// 1~10까지의 수 중 랜덤 수를 5개 출력
		// 중복 가능
		// for = 반복문
		
		int i;
		int sum = 0;
		
//		for(i=0; i<5; i++) {
//			int random = (int)(Math.random()*10)+1;
//			System.out.print(random + " ");
//		}
		
		// 구구단 출력 2단
		// 2 * 1 = 2 / 2 * 2 = 4
		
		// 1~9 랜덤으로 구구단 출력
//		int dan = (int)(Math.random()*9)+1;
//		
//		for(i=1; i<=9; i++) {
//			sum = dan * i;
//			System.out.println(dan + " * " + i + " = " + sum);
//		}
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		int dan = scan.nextInt();
		
		for(i=1; i<=9; i++) {
			sum = dan * i;
			System.out.println(dan + " * " + i + " = " + sum);
		}
		
		scan.close();
		
	}

}
