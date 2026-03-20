package day05;

import java.util.Arrays;
import java.util.Scanner;

public class Array02 {

	public static void main(String[] args) {
		// 5명의 점수를 입력받기 => 배열로 생성
		/*
		 * 1) 배열 생성
		 * 2) 점수를 입력 받는다 (0~100)
		 * 3) 점수를 출력 
		 * 4) 점수의 합계와 평균을 출력
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int arr[] = new int[5];

		System.out.println("점수를 입력하세요. >");
		
		for(int i = 0; i < arr.length; i++) {
			
			int score = scan.nextInt();
			
//			while(score < 0 || score > 100) {
//				System.out.println("점수 기입 오류! 다시 입력해주세요 👉");
//				score = scan.nextInt();
//			}
			
			if(score < 0 || score > 100) {
				System.out.println("점수 기입 오류! 다시 입력해주세요 👉");
				i--;
				continue;
			}
			
			arr[i] = score;


			System.out.println(arr[i]);
		}
		
		System.out.println(Arrays.toString(arr));
		
		int sum = 0;
		double avg = 0;
		
		for(int tmp : arr) {
			sum += tmp;
			avg = (double)sum / arr.length;
		}
		
		System.out.println("👌 점수 합계: " + sum);
		System.out.println("👌 점수 평균: " + avg);
		
		scan.close();
	}

}
