package day01;

public class HelloWorld {

	public static void main(String[] args) {
		// 실행 메서드
		
		System.out.println("Hello, World!");
		System.out.println("abcdef");
		
		int a;
		int b;
		
		a = 10;
		b = 5;
		
		System.out.println(a+b);
		
		String c;
		
		c="문자열";
		
		if(a+b==15) {
			System.out.println(c);
		}
		
		int sum = 0;
		for(int i=1; i<=100; i++){
			sum += i;
		}
		System.out.println(sum); 
		
		int d = 100;
		long lo = 12345678945L; // 접미사 l/L
		float f = 1.1f; // 접미사 f/F
		byte by = 30;
		char ch = 'a';
		double dou = 1.123456789;
		
		// 원래 클래스는 정의하는 방법이 다르지만, String 만은 예외로 자료형처럼 정의 가능
		
		int aCount = 100;
		int ACOUNT = 200; // 대문자로 시작하는 변수는 상수일 떄의 규칙 (전부 대문자)
	}
}