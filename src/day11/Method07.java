package day11;

public class Method07 {
	
	// 두 정수를 입력받아 합을 리턴하는 메서드
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	
	// 세 정수를 입력받아 합을 리턴하는 메서드
	public int sum(int num1, int num2, int num3) {
		return num1 + num2 + num3;
	}
	
	// 두 실수를 입력받아 합을 리턴하는 메서드
	public double sum(double num1, double num2) {
		return num1 + num2;
	}
	
	// 세 실수를 입력받아 합을 리턴하는 메서드
	public double sum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}

	public static void main(String[] args) {
		/*
		 * 메서드 오버로딩
		 * - 동일한 이름의 메서드를 여러 개 만드는 케이스에서 사용
		 * 1) 매개변수의 개수가 다르면 가능
		 * 2) 매개변수의 타입이 다르면 가능
		 * => 리턴 타입과 매개변수의 이름은 상관X
		 * 
		 */
		
		Method07 m7 = new Method07();
		
		System.out.println(m7.sum(100, 200));
		System.out.println(m7.sum(10, 20, 30));
		System.out.println(m7.sum(3.2, 7.6));
		System.out.println(m7.sum(3.2, 7.6, 10.3));
	}

}
