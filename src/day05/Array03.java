package day05;

import java.util.Arrays;

public class Array03 {

	public static void main(String[] args) {		
		// 합계와 평균
		// 최대값, 최소값 출력
		int arr[] = {52, 78, 13, 66, 94, 36, 15, 25, 31, 47, 77, 1};
		
		int sum = 0;
		double avg = 0;
		
		for(int tmp: arr) {
			sum += tmp;
			avg = (double)sum / arr.length;
		}
		
		System.out.println("점수 합계 👉 "+sum);
		System.out.println("점수 평균 👉 "+ String.format("%,.1f", avg));
		
		// 52 78
		
		int max = arr[0]; 
		int min = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		

		System.out.println(">>>>>> arr[0] >>>>>>");
		System.out.println(max);
		System.out.println(min);

		
		
		// Math.max() / Math.min()

		
		for(int i = 1; i < arr.length; i++) {
			max = Math.max(arr[i], max);
			min = Math.min(arr[i], min);
		}
		
		System.out.println(">>>>>> Math. >>>>>>");
		System.out.println(max);
		System.out.println(min);
		
		
		
		
		// END FRAGMENT
	}

}
