package day04;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// 반복문
		// do{실행문;}while(조건);
		// 실행문을 먼저 실행하고, 조건을 나중에 확인
		
		/* 
		 * 한글자를 입력 받은 후 출력 
		 * char
		 * 반복적으로 입력
		 * 'y' 면 종료
		 * 
		 * */
		
		Scanner scan = new Scanner(System.in);

		char ch;
		
		do {
			System.out.println("한 글자만 입력 >");
			ch = scan.next().charAt(0); // do 안에서 선언한 변수를 while 은 인지하지 못함. 밖에서 선언해야 한다.
			System.out.println(ch);
		}while(ch != 'y');
		
		System.out.println("종료");
		
		
		scan.close();
		
		
	}

}
