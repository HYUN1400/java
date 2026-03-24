package day07;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * 숫자를 입력 받아 입력 받은 숫자의 합게와 평균을 출력
		 * 12345 = 1+2+3+4+5 합계 / 평균
		 * 123456789 = 1+2+3+4+5+6+7+8+9 합계 / 평균
		 * 반복 (0 또는 음수를 입력하면 종료)
		 */
		
		Scanner scan = new Scanner(System.in);
		

		do {			
			System.out.println("숫자를 입력해주세요. (ex) '123' 으로 입력하시면 1+2+3 으로 계산됩니다. >");
			System.out.println("0 또는 음수 입력 시 계산 종료됩니다. 👉 >");
			
			String num = scan.next();
			
			if(Integer.parseInt(num) <= 0) {
				System.out.println("계산을 종료합니다.");
				break;
			}
			
			String[] nums = num.split("");
			
			int[] numbers = new int[nums.length];
			
			int sum = 0;
			int avg = 0;
			
			for(int i = 0; i < nums.length; i++) {
				numbers[i] = Integer.parseInt(nums[i]);
				sum += numbers[i];
				avg = sum / numbers.length;
			}
			
			System.out.println("합계 👉 "+sum);
			System.out.println("평균 👉 "+avg);
					
		}while(true);
		
		
		
		scan.close();
		
		
		
		
		
		// END
	}

}
