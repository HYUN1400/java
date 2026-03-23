package day06;

import java.util.Arrays;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 정수배열[10] 생성 후
		// 1~10 저장 후 출력
		
		int arr[] = new int[5];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
		}
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < arr.length; i++) {
			
			// index 랜덤으로 생성
			
			int index = (int)(Math.random()*arr.length);
			
			// 교환
			
			int tmp = arr[i];		
			arr[i] = arr[index];		
			arr[index] = tmp;
			
		}
		
		System.out.println(Arrays.toString(arr));
		
		// 원래대로 정렬 (선택 정렬)
		// 작은수부터 정렬 => 오름차순
		// 큰수부터 정렬 => 내림차순
	
		// if(앞 > 뒤) {교환;}
		
//		for(int i = 0; i < arr.length - 1; i++) {
//			for(int j = i+1; j < arr.length; j++) {
//				if(arr[i] > arr[j]) { // 오름차순
//					int tmp = arr[i];
//					arr[i] = arr[j];
//					arr[j] = tmp;
//				}
//			}
//		}
//		
//		System.out.println(Arrays.toString(arr));
		
		// Arrays.sort : 오름차순
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		
		// END
	}

}
