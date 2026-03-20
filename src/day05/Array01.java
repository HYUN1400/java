package day05;

import java.util.Arrays;

public class Array01 {

	public static void main(String[] args) {
		// int a; 초기화를 안 한 상태 => 기본형 변수는 직접 반드시 초기화를 해야 사용 가능.
		// 참조형 변수는 초기화를 안 해도 알아서 세팅 된다.
		
		/*
		 * 배열: 같은 타입, 같은 의미를 가지는 변수들의 집합 (참조 변수)
		 * - 기본 타입 8개(기본형 변수) 를 제외하면 모두 참조 변수
		 * - new 키워드로 생성
		 * 
		 * - 배열 선언 방법
		 * 타입[] 배열명; => 기본 값: null
		 * 타입 배열명[];
		 * 
		 * 타입[] 배열명 = new 타입[길이];
		 * 생성된 배열 안의 변수값은 자동으로 초기화가 이루어 진다.
		 * 숫자 타입 = 0 / 문자 타입 = null
		 * 
		 * int[] arr = new int[5]; => 기본 방법
		 * int[] arr = new int[]{1,2,3,4,5};
		 * int[] arr = {1,2,3,4,5};
		 * 
		 * - 배열의 길이는 0 이상이어야 한다. (-는 허용안됨 exception)
		 * - 배열의 index는 0부터 시작
		 * - 배열[5] => 0 1 2 3 4
		 * - 배열의 총 길이는 => length => 마지막 번지 [length -1]
		 * 
		 * 
		 */
		
		int[] arr; // null
		arr = new int[5]; // 선언한 변수에 객체 연결
		
		int arr1[] = new int[5]; // 5개의 배열의 값은 0으로 초기화	
		int arr2[] = new int[] {1, 2, 3, 4, 5}; // 초기값 지정
		int arr3[] = {10, 20, 30, 40, 50}; 
		
		
		System.out.println(arr2[3]);
		
		System.out.println("-*-");
		for(int i = 0; i <= (arr3.length)-1; i++) {
			System.out.println(arr3[i]);
		}
		
		System.out.println("-*-");
		for(int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		
		// arr에 값을 추가		
		arr[0] = 78;
		arr[1] = 89;
		arr[2] = 85;
		arr[3] = 96;
		arr[4] = 63;
		
		System.out.println("-*-");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		
		System.out.println("-*-");
		
		int arr4[] = new int[10];
		
		for(int i = 0; i < arr4.length; i++) {
			arr4[i] = i+1;
			
			System.out.println(arr4[i]);
		}
	
		
		// arr5를 5개 생성하여 랜덤 값으로 채우고 => 출력 
		
		System.out.println("-*-");
		
		int arr5[] = new int[5];
		
		for(int i = 0; i < arr5.length; i++) {
			int k = (int)(Math.random()*10)+1;
			arr5[i] = k;
			
			System.out.println(arr5[i]);
		}
		
		// 배열이나 리스트의 내부값을 전체 탐색
		// index(번지)로 접근이 불가능한 경우 사용
		// 배열의 내부값을 변경하는 건 불가능 (탐색만)
		// 향상된 for 문
		
		System.out.println("-*-");

		for(int tmp : arr5) {
			System.out.println(tmp);
		}
		
		
		// Arrays 클래스 toString
		
		System.out.println("-*-");
		System.out.println(Arrays.toString(arr5));
		
		
		
		// END FRAGMENT
		
	}

}
