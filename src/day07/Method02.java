package day07;

public class Method02 {
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}

	/*
	 * 두 정수가 주어지면 두 수의 합을 출력하는 메서드
	 * 매개변수: 두 정수 => int num1, int num2
	 * 리턴타입: void
	 * 메서드명: sum2
	 * 
	 */
	
	public void sum2(int num1, int num2) {
		// 메서드 내에서 다른 메서드 호출
		System.out.println(sum(num1, num2));
	}
	
	/*
	 * 매개변수가 없는 케이스
	 */
	
	public int sum3() {
		int num1 = 40;
		int num2 = 50;
		return num1 + num2;
	}
	
	
	public static void main(String[] args) {
		Method02 me01 = new Method02(); // 객체변수(참조변수)
		
		int num1 = 10; // 지역변수(일반변수)
		int num2 = 20;
		
		System.out.println(me01.sum(num1, num2));
		me01.sum2(num1, num2); // 내부 메서드에서 출력 완료
		
		System.out.println(me01.sum3());
		
	}

}
