package day07;

public class Method01 {
	
	// 메서드 선언 가능 위치
	// 두 정수를 주면 (매개변수) 합을 리턴하는 메서드
	// 매개변수: 두 정수
	// 매서드명: sum
	// 리턴타입: 합 => 정수 => int
	
	public static int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	public int sum2(int num1, int num2) {
		return num1 + num2;
	}
	
	// 두 정수를 주면 두 정수의 차를 리턴하는 메서드
	public int sub(int num1, int num2) {
		return num1 - num2;
	}
	
	public boolean result(int num1, int num2) {
		if (num1 < num2) {
			return true;
		} else return false;
	}
	

	public static void main(String[] args) {
		
		int num1 = 100;
		int num2 = 200;

		
		// static 메서드 호출
		
		// 1) 메서드가 static인 경우
		int result = sum(num1, num2);
		System.out.println(result);
		
		// 2) 메서드가 static이 아닌 경우 => 클래스를 객체화 => new 클래스명(); => 객체로 메서드 접근
		Method01 me01 = new Method01();
		int result2 = me01.sum2(num1, num2);
		System.out.println(result2);
		
		int result3 = me01.sub(num1, num2);
		System.out.println(result3);
		
		boolean result4 = me01.result(num1, num2);
		System.out.println(result4);
		
	
		/*
		 * class : 변수(클래스가 가지는 요소), 메서드(기능)
		 * main: 컴파일러가 실행을 위해 가장 먼저 찾는 메서드
		 * 
		 * method 구조
		 * 접근제어자 리턴타입 메서드명(매개변수) {
		 * 	구현;
		 * 	return (리턴타입과 일치하는 변수값); (필요 시)
		 * }
		 * 
		 * - 접근제어자 : 접근할 수 있는 주체의 제한범위
		 * - 리턴타입 : 메서드가 실행된 후 반환하는 값의 타입 (자료형) => 반드시 1개
		 * 	└ void : 리턴할 값이 X
		 * - 메서드명 : 소문자로 시작 (여러 의미를 붙여서 사용할 경우 camelCase 사용)
		 * - 매개변수 : (=parameter) 기능을 하기 위해 외부에서 반드시 받아야 하는 값
		 * - return : 리턴타입과 일치하는 변수값을 주고 메서드 종료
		 * 
		 * 메서드는 중복선언 불가 (같은 이름 사용 X) 
		 * 메서드 안에 또다른 메서드가 있을 수 없음
		 * 메서드 단위는 위치가 상관 없음
		 * 메서드 선언 위치 
		 * - 클래스 안, 다른 메서드 밖
		 * - 메서드는 독립적으로 기능.
		 * - 메서드의 순서는 아무 상관이 없음.
		 * - 메서드는 호출되어야만 실행됨.
		 * 
		 */
				
		// MAIN END
	}

	// CLASS END
}
