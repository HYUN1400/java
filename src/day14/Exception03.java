package day14;

import java.util.Scanner;

public class Exception03 {

	public static void main(String[] args) {
		// Scanner 객체는 메인에서
		// 메서드 호출하여 결과 출력
		
		Exception03 e3 = new Exception03();

		// 메서드에서 넘어온 throw 처리
		try {
			System.out.println(e3.calc2(5, 0, '+'));
			System.out.println(e3.calc2(5, 0, '-'));
			System.out.println(e3.calc2(5, 0, '*'));
			System.out.println(e3.calc2(5, 0, '!'));
			System.out.println(e3.calc2(5, 0, '!'));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	// 예외 떠넘기기 :throws
	// method 자체에서 예외처리를 하지 않고 나를 호출하는 대상에게 예외처리를 넘기는 상태
	// 예외 발생시키기 : throw new
	public double calc2(int num1, int num2, char op) throws RuntimeException {
		double result = 0;
		
		if(op =='/' || op == '%' && num2 == 0 ) {
			throw new RuntimeException("0으로 나눌 수 없습니다.");
		}
		
		switch(op) {
		case '+' : result = num1 + num2; break;
		case '-' : result = num1 - num2; break;
		case '*' : result = num1 * num2; break;
		case '/' : result = num1 / num2; break;
		case '%' : result = num1 % num2; break;
		default: 
			throw new RuntimeException("잘못된 연산자 입니다.");
		}
		
		return result;
	}
	
	
	
	// method 
	// 두 정수와 연산자를 입력 받아(char) 
	// + - * / %  연산의 결과를 리턴
	// / % 연산자일 경우 피연산자 0이면 Exception => 예외처리
	
	public double calc(int num1, int num2, char op) {
		
		switch(op) {
		case '+' : return num1 + num2;
		case '-' : return num1 - num2;
		case '*' : return num1 * num2;
		}
		
		try {
			switch(op) {
			case '/' : return num1 / num2;
			case '%' : return num1 % num2;
			}
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			return -0;
		}
		
		return 0;

	}
	
}
