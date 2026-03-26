package day08;

import java.util.Arrays;

public class MethodEx02 {
	
	/*
	 * 배열 출력 메서드
	 * 매개변수: 배열
	 * 리턴타입: void
	 */
	
	public void array(int num[]) {
		for(int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}
		System.out.println();
	}
	
	/*
	 * 오름차순 정렬 메서드
	 * 매개변수: 배열
	 * 리턴타입: void
	 */
	
	public void asc(int num[]) {

		for(int i = 0; i < num.length; i++) {
			for(int k = i+1; k < num.length; k++) {
				if(num[i] > num[k]) {
					int tmp = num[i];
					num[i] = num[k];
					num[k] = tmp;
				}
			}
		}
	}
	
	
	/*
	 * 합계, 평균, 최대, 최소값 출력 메서드
	 * 매개변수: 배열
	 * 리턴타입: void
	 */
	
	public void print(int num[]) {
		int sum = 0;
		for(int i = 0; i < num.length; i++) {
			sum += num[i];
		}
		double avg = sum/(double)num.length;
		
		System.out.println("합계 👉 " + sum);
		System.out.println("평균 👉 " + avg);
		
		
		int max = num[0];
		int min = num[0];
		
		for(int i = 0; i < num.length; i++) {
			max = Math.max(max, num[i]);
			min = Math.min(min, num[i]);
		}
		
		System.out.println("최대값 👉 " + max);
		System.out.println("최소값 👉 " + min);
	}

	public static void main(String[] args) {
		
		MethodEx02 me02 = new MethodEx02();
		
		int[] arr = {88, 76, 68, 90, 95, 43, 55, 71, 92, 50};
		
		// 메서드 생성
		// 1. 배열을 매개변수로 받아 출력하는 메서드
		// 2. 배열을 매개변수로 받아 오름차순으로 정렬
		// 3. 배열을 매개변수로 받아 합계, 평균, 최대, 최소값을 출력하는 메서드
		
		
		me02.array(arr);
		me02.asc(arr); // 정렬 완료
		
		System.out.println(Arrays.toString(arr)); // 정렬 후 재출력
		
		me02.print(arr);
		
		
		
		
		
		
		
		
		
		
		// END
	}

}
