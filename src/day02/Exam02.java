package day02;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/* 과제
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
		 * */
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수를 띄어쓰기 하여 입력>");
		int n1 = scan.nextInt();
		
		// System.out.println("두번재 숫자 >");
		int n2 = scan.nextInt();
		
		System.out.println(n1);
		System.out.println(n2);
		
		// char로 받을 때  123
		System.out.println(">>>");
		char op = scan.next().charAt(0);  // char 형태로 입력받기
		
		System.out.println(op);
		String opStr = scan.next(); // String 형태로 입력받기
		
		
		// 1. switch 이용
		switch(op) {
		case '+': System.out.println(""+n1+op+n2+"="+(n1+n2)); break;
		case '-': System.out.println(""+n1+op+n2+"="+(n1-n2)); break;
		case '*': System.out.println(""+n1+op+n2+"="+(n1*n2)); break;
		case '/': System.out.println(""+n1+op+n2+"="+(n1/n2)); break;
		case '%': System.out.println(""+n1+op+n2+"="+(n1%n2)); break;
		default: System.out.println("잘못된 연산자");
		
		}
		
		// 2. switch result 변수 사용
		int result = 0;
		switch(op) {
		case '+': result = n1+n2; break;
		case '-': result = n1-n2; break;
		case '*': result = n1*n2; break;
		case '/': result = n1/n2; break;
		case '%': result = n1%n2; break;
		default: System.out.println("잘못된 연산자");
		
		}
		
		if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
			System.out.println(""+n1+op+n2+"="+result);			
		}
		
		
		// 3. if문 사용 (char)
		int ifResult=0;
		if(op=='+') {
			ifResult = n1+n2;
		}else if(op=='-') {
			ifResult = n1-n2;
		}else if(op=='*') {
			ifResult = n1*n2;
		}else if(op=='/') {
			ifResult = n1/n2;
		}else if(op=='%') {
			ifResult = n1%n2;
		}else {
			System.out.println("잘못된 연산자");
		}
		
		if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
			System.out.println(""+n1+op+n2+"="+ifResult);			
		}
		
		ifResult = 0;  // 앞에서 쓴 변수 초기화
		
		// 4. if문 사용 (String)
		if(opStr.equals("+")) {
			ifResult = n1+n2;
		}else if(opStr.equals("-")) {
			ifResult = n1-n2;
		}else if(opStr.equals("*")) {
			ifResult = n1*n2;
		}else if(opStr.equals("/")) {
			ifResult = n1/n2;
		}else if(opStr.equals("%")) {
			ifResult = n1%n2;
		}else {
			System.out.println("잘못된 연산자입니다.");
		}
		
		if(op=='+' || op=='-' || op=='*' || op=='/' || op=='%') {
			System.out.println(""+n1+op+n2+"="+ifResult);			
		}
		
		
		
//		char op = scan.next().charAt(0); // return char
//		if(op == '+') {
//			// if일 경우 예제
//		}
//		
//		switch(op) {
//		case '+':  break;
//			// switch일 경우 예제
//		}
//		
//		
//		// String으로 받을 때
//		String str = scan.next();
//		if(str.equals("+")) {
//			
//		}
//		
//		switch(str) {
//		case "+":  break;
//		
//		}
		
		scan.close();
		
		

	}

}