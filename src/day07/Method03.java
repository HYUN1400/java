package day07;

public class Method03 {
	/*
	 * 메서드 정의 => 기능을 정의하는 역할(함수)
	 * 접근제어자 리턴타입 메서드명(매개변수){기능; return;}
	 * - public: 누구나 접근 가능
	 * - 리턴타입: 기능을 구현 후 결과로 반환할 값의 타입
	 * - 매개변수: 기능을 구현하기 위해 외부에서 받아와야 하는 값
	 * - 메서드명: 의미있게 소문자로 작성 (카멜케이스)
	 */
	
	public int sum(int a, int b) {
		return a + b;
	}
	
	public int sub(int a, int b) {
		return a - b;
	}
	
	public int multiply(int a, int b) {
		return a * b;
	}
	
	// num == 0 일 때 계산 불가능
	
	public double divide(int a, int b) {
		if(b == 0) {
			return -99999999;
		}
		return a / (double)b;
	}
	
	public int mod(int a, int b) {
		if(b == 0) {
			return -99999999;
		}
		return a % b;
	}
	
	
	public static void main(String[] args) {
		
		//메서드 실행
		// 1. 클래스로 객체 정의
		// 2. 객체명으로 메서드 호출
		Method03 me01 = new Method03();
		
		int num1 = 90;
		int num2 = 20;
		
		System.out.println(me01.sum(num1, num2));
		System.out.println(me01.sub(num1, num2));
		System.out.println(me01.multiply(num1, num2));
		
		double div = me01.divide(num1, num2);
		int mod = me01.mod(num1, num2);
		
		if(div == -9999999999.0 || mod == -99999999) {
			System.out.println("0으로 나눌 수 없습니다.");
		}else {
			System.out.println(div);
			System.out.println(mod);
			}

		
		// 두 수의 + = * / % 의 결과를 메서드로 호출하여 출력
	}

}
