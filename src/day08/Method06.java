package day08;

import java.util.Arrays;
import java.util.Random;

public class Method06 {
	
	Random random = new Random();
	
	// 메서드 배열 활용
	/*
	 * 1. 랜덤(0~100) 정수 5개를 담는 배열을 생성하여 리턴하는 메서드 => int[]
	 * 2. 정수 배열을 매개변수로 받아 평균값을 리턴하는 메서드
	 * 3. 정수 배열을 매개변수로 받아 출력하는 메서드
	 * 
	 */
	
	public int[] random() {
		int[] arr = new int[5];
		
		for(int i = 0; i < 5; i++) {
//			arr[i] = (int)(Math.random()*100+1);
			arr[i] = random.nextInt(100);
		}
		
		return arr;
	}
	
	public double avg(int[] arr) {
		
		int sum = 0;
		double avg = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		avg = sum / (double)arr.length;
		
		return avg;
		
	}
	
	public void array(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
	}
	

	public static void main(String[] args) {
		
		Method06 m6 = new Method06();
		
		int[] arr = m6.random();
		
		m6.array(arr);
		System.out.println("평균 값 👉 " + m6.avg(arr));
		
		
		
		
		
		
		
		// END
	}

}
