package day06;

import java.util.Arrays;
import java.util.Collections;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 정수 배열[10] => 1~100까지 랜덤수
		// => 출력
		
//		int arr[] = new int[10];
		Integer arr[] = new Integer[10];
		
		for(int i = 0; i < arr.length; i++) {
			int random = (int)(Math.random()*100+1);
			
			arr[i] = random;
		}
		
		System.out.println("배열값 👉");
		System.out.println(Arrays.toString(arr));
		
//		// 오름차순	
//		for(int i = 0; i < arr.length - 1; i++) {
//			for(int k = i + 1; k < arr.length; k++) {
//				if(arr[i] < arr[k]) {
//					int tmp = arr[i];
//					arr[i] = arr[k];
//					arr[k] = tmp;
//				}
//			}
//		}
//		
//		System.out.println("오름차순 👉");
//		System.out.println(Arrays.toString(arr));
//		
//		// 내림차순
//		for(int i = 0; i < arr.length - 1; i++) {
//			for(int k = i + 1; k < arr.length; k++) {
//				if(arr[i] > arr[k]) {
//					int tmp = arr[i];
//					arr[i] = arr[k];
//					arr[k] = tmp;
//				}
//			}
//		}
//		
//		System.out.println("내림차순 👉");
//		System.out.println(Arrays.toString(arr));
		
		
		// 오름차순 Arrays.sort
		Arrays.sort(arr);
		System.out.println("오름차순 👉");
		System.out.println(Arrays.toString(arr));
		
		// 내림차순 정렬 => Object(모든 객체의 부모)
		// 기본 자료형으로는 불가 => Collections.reverseOrder();
		// object 형태로 boxing 해서 사용 
		
		// wrapper class : 기본 타입의 자료형값을 박싱(포장)해서 객체로 만드는 것
		// int => Integer
		// char => Character
		// byte => Byte . . .
		
		Arrays.sort(arr, Collections.reverseOrder());
		System.out.println("내림차순 👉");
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
		// END
	}

}
