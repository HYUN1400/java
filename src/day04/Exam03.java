package day04;

import java.util.Scanner;

public class Exam03 {

	public static void main(String[] args) {
		
		/* 
		 * 1) 사칙연산을 메뉴로 만들기
		 *  - MENU -
		 *  1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료
		 *  (6번을 제외한 메뉴를 선택하면) 두 수를 입력해주세요 > 2 3 
		 *  > 선택한 연산자에 따른 계산
		 *  num2 가 0일 경우 "다시 입력해주세요."
		 *  
		 */
		
		
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		char ch = ' ';
		
		do {
			System.out.println("-MENU-");
			System.out.println("1. + | 2. - | 3. * | 4. / | 5. % | 6. 종료");
			System.out.println("원하는 메뉴를 선택해주세요. 👉");		
			menu = scan.nextInt();
			
			if(menu == 6) {
				System.out.println("계산을 종료합니다.👌");
				break;
			} else if(menu < 1 || menu > 6 ) {
				System.out.println("유효하지 않은 값입니다.");
				continue;
			} else {
				
				while(true) {
					System.out.println("두 숫자를 입력해주세요. (띄어쓰기로 구분)");
					
					num1 = scan.nextInt();
					num2 = scan.nextInt();
					
					if((menu == 4 || menu == 5) && num2 == 0) {
						System.out.println("0으로 나눌 수 없습니다.");
						System.out.println("다시 입력해주세요. 👉");
					} else {
						break;
					}
				}
				
			}
			
			switch(menu) {
			case 1: 
				result = num1 + num2;
				ch = '+';
				break;
			case 2:
				result = num1 - num2;
				ch = '-';
				break;
			case 3:
				result = num1 * num2;
				ch = '*';
				break;
			case 4:
				result = num1 / num2;
				ch = '/';
				break;
			case 5:
				result = num1 % num2;
				ch = '%';
				break;
			}
		
			System.out.println(""+ num1 + " " + ch + " " + num2 + " = " + result);
			
		}while(menu != 6);
		

		
		scan.close();
		
		
		
		/*END*/
	}

}
