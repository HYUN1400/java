package day07;

import java.util.Scanner;

public class MethodEx01 {

	public static void main(String[] args) {
		/*
		 * 계산기 만들기
		 * --menu--
		 * 1 덧셈 | 2 뺄셈 | 3 곱셈 | 4 나눗셈 | 5 나머지 | 6 종료
		 * 메뉴선택 > 1
		 * 숫자입력(두 정수) > 1 3
		 * >> 결과 : 1 + 3 = 4
		 * 
		 * 덧셈 . . . 메서드는 Method03에서 호출
		 * 
		 */
		
		Method03 me01 = new Method03();
		Scanner scan = new Scanner(System.in);
		
		int select = 0;
		int num1 = 0;
		int num2 = 0;
		
		do {
			System.out.println("-MENU-");
			System.out.println("1 덧셈 | 2 뺄셈 | 3 곱셈 | 4 나눗셈 | 5 나머지 | 6 종료");
			System.out.println("원하는 메뉴를 선택해주세요. 👉");
			
			select = scan.nextInt();
			
			if(select == 6) {
				System.out.println("계산을 종료합니다.");
				break;
			}
			
			System.out.println("두 정수를 입력해주세요. 👉");
			
			num1 = scan.nextInt();
			num2 = scan.nextInt();
			
			switch(select) {
			case 1: System.out.println(me01.sum(num1, num2)); break;
			case 2: System.out.println(me01.sub(num1, num2)); break;
			case 3: System.out.println(me01.multiply(num1, num2)); break;
			case 4: System.out.println(me01.divide(num1, num2)); break;
			case 5: System.out.println(me01.mod(num1, num2)); break;
			}
			
			
		} while(select != 6);
		
			
		
		scan.close();
		
		// END
	}

}
