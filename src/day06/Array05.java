package day06;

import java.util.Arrays;

public class Array05 {

	public static void main(String[] args) {
		/*
		 * 10개의 숫자를 가지는 배열 생성
		 * 1~50까지 랜덤수를 배열에 저장 => 출력
		 * 최대 / 최소 / 합계 / 평균 출력
		 * 
		 */
		
		int num[] = new int[10];
		int i = 0;
		
		
		for(i = 0; i < num.length; i++) {
			num[i] = (int)(Math.random()*50 + 1);					
		}
		
		int max = num[0];
		int min = num[0];
		
		for(i = 0; i< num.length; i++) {
			max = Math.max(max, num[i]);
			min = Math.min(min, num[i]);
		}
		
		
		int sum = 0;
		double avg = 0;
		
		for(int tmp: num) {
			sum += tmp;
			avg = (double)sum / num.length;
		}
		
		
		System.out.println(Arrays.toString(num));
		System.out.println("최대값: " + max + ", 최소값: " + min + ", 합계:" + sum + ", 평균: " + avg);
		
		
		
	}

}
