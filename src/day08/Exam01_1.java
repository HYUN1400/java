package day08;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01_1 {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력 받아 입력 받은 숫자의 합게와 평균을 출력
		 * 12345 = 1+2+3+4+5 합계 / 평균
		 * 123456789 = 1+2+3+4+5+6+7+8+9 합계 / 평균
		 * 반복 (0 또는 음수를 입력하면 종료)
		 */
		
		Scanner scan = new Scanner(System.in);

		
		/* MINE */
		
//		int[] number = new int[0];
//		int sum = 0;
//		double avg = 0;
//		
//		while(true) {
//			System.out.println("숫자를 입력해주세요. >");
//			System.out.println("0 또는 음수 입력 시 계산 종료됩니다. 👉 >");
//
//			int num = scan.nextInt();
//			
//			if(num <= 0) {
//				System.out.println("계산을 종료합니다.");
//				break;
//			}
//
//			int[] numbers = new int[number.length + 1];
//			System.arraycopy(number, 0, numbers, 0, number.length);
//			numbers[numbers.length - 1] = num;
//			
//			number = numbers;
//
//			System.out.println(Arrays.toString(numbers));
//			
//			sum = 0;
//			
//			for(int i = 0; i < number.length; i ++) {
//				sum += number[i];
//				avg = sum / (double)number.length;
//			}
//		}
//		
//		System.out.println(sum);
//		System.out.println(avg);
		
		
		
		
		/* EXAM */
		
		int num = 0, sum = 0, count = 0;
		int[] numbers = new int[5];
		
		while(true) {
			System.out.println("숫자를 입력해주세요. >");
			System.out.println("0 또는 음수 입력 시 계산 종료됩니다. 👉 >");
			
			num = scan.nextInt();
			
			if(num <= 0) {
				System.out.println("계산을 종료합니다.");
				break;
			}
			
			// 배열에 값 넣기 (배열에 공간이 남아있는지 확인)
			if(numbers.length == count) {
				// 새 배열 생성 => arraycopy
				int[] newArray = new int[numbers.length+3];
				System.arraycopy(numbers, 0, newArray, 0, numbers.length);
				numbers = newArray;
			}
			
			numbers[count] = num;
			sum += num;
			
			count++;
			
		}

		System.out.println(Arrays.toString(numbers));
		
		if(count == 0) {
			System.out.println("입력한 숫자가 없습니다.");
		} else {
			for(int i = 0; i < count - 1; i++) {
				System.out.print(numbers[i]+" + ");
			}
			System.out.println(numbers[count - 1]);
			System.out.println("합계 👉 " + sum + " " + " / 평균 👉 " + sum/(double)count);
		}
		
		
		
		
		
		
		scan.close();
	}

}
