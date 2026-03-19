package day04;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/* 과제
		 * 
		 * 정수 2개와 연산자 1개를 입력받아 두 정수의 연산의 결과를 출력
		 * ex) 2 3 + => 2 + 3 = 5
		 * ex) 2 3 - => 2 - 3 = -1
		 * ex) 2 3 ! => 잘못된 연산자
		 * 연산자는 + - * / % 만 가능
		 * String 문자열 == "+" => 불가능
		 * equals()
		 * 
		 * char == '+'  => 가능
		 * scan.next() : 한단어 => String
		 * charAt(index) : 한글자 추출 => char
		 * String => equals()
		 * 
		 * */
		
		/* / 연산은 0으로 나눌 때 exception 발생
		 * - / % 피연산자가 0이면 "0으로 나눌 수 없습니다." 출력
		 *  
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("첫번 째 정수를 입력해주세요. >");
		int num1 = scan.nextInt();
		System.out.println("두번 째 정수를 입력해주세요. >");
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력해주세요. (+ - / * %) >");
		char op = scan.next().charAt(0);
		
		int result = 0;
		
		
		if(op == '+') {
			result = num1 + num2;
		}else if(op == '-') {
			result = num1 - num2;
		}else if(op == '*') {
			result = num1 * num2;
		}else if(op == '/') {
			if(num2 != 0) {
				result = num1 / num2;
			} else {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
		}else if(op == '%') {
			if(num2 != 0) {
				result = num1 % num2;
			} else {
				System.out.println("0으로 나눌 수 없습니다.");
				return;
			}
		}else {
			System.out.println("잘못된 연산자입니다.");
			return;
		}
		
		System.out.println(""+num1+" "+op+" "+num2+" = " + result );
		
		
		
		scan.close();
		
		
	}

}
