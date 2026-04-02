package day14;

import java.util.Scanner;

public class Exception02 {

	public static void main(String[] args) {
		// 자주 발생하는 런타임 예외 코드들
		/* - ArithmeticException: 0으로 나누었을 때 발생
		 * - ArrayIndexOutOfBoundsException: 배열의 범위가 넘어갔을 때 발생
		 * - NullPointerException: 객체의 값이 null일 때 발생
		 * - ClassCaseException: 다운캐스팅이 잘못 되었을 경우 발생
		 * - InputMismatchException: 입력값의 타입이 맞지 않을 경우 발생
		 */
		
		int[] arr = new int[5];
//		arr[5] = 1;
		
		int[] arr2 = null;
//		System.out.println(arr2[0]);
		
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		scan.close();
		
		
		
		
		
		
		
		
		
		
		
		// END
	}

}
