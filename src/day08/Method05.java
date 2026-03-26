package day08;

public class Method05 {
	
	/*
	 * 최소공배수
	 * 매개변수: int num1, int num2
	 * 리턴타입: void
	 */

	public int LCM(int num1, int num2) {
		
		for(int i = num1; ; i=i+num1) {
			if(i % num1 == 0 && i % num2 == 0) {
				return i;
			}
		}
	}
	
	/*
	 * 최대공약수
	 * 매개변수: int num1, int num2
	 * 리턴타입: int
	 */
	
	public int GCD(int num1, int num2) {
		
		int k = 0;
		
		for(int i=1; i<=num2; i++) {	
			if(num1 % i == 0 && num2 % i == 0) {
				k = i;
			}
		}
		
		return k;
	}

	public static void main(String[] args) {
		
		Method05 m1 = new Method05();
		
		// 최대공약수와 최소공배수 출력 메서드
		int num1 = 92;
		int num2 = 8;
		
		System.out.println(num1 +", "+ num2 + " 의 최소공배수 👉 " + m1.LCM(num1, num2));
		System.out.println(num1 +", "+ num2 + " 의 최대공약수 👉 " + m1.GCD(num1, num2));
		
	}

}
