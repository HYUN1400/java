package day06;

import java.util.Arrays;

public class Array06 {

	public static void main(String[] args) {
		// String 배열
		
		String[] strArr = new String[5];
		
		strArr[0] = "Tony Stark";
		strArr[1] = "Peter Parker";
		strArr[2] = "Wade Wilson";
		strArr[3] = "Matt Murdock";
		strArr[4] = "Miles Morales";
		
		System.out.println(Arrays.toString(strArr));
		
		for(String s: strArr) {
			System.out.println(s);
		}
		
		// 배열은 크기가 고정
		
		String[] arr = new String[5];
		
		arr[0] = "Steve Rogers";
		
		System.out.println(Arrays.toString(arr));
		
		for(String s: arr) {
			System.out.println(s);
		}
		
		
		// 배열의 데이터를 줄이거나 늘리고 싶은 경우
//		String arr2[] = new String[6];
//		arr = arr2;
		
		// strArr 내에 있는 데이터를 arr2 로 이동
		
//		System.out.println(Arrays.toString(arr2));
//		
//		for(int i = 0; i < strArr.length; i++) {
//			arr2[i] = strArr[i];
//		}
//		
//		
//		strArr = arr2;
//		
//		System.out.println(Arrays.toString(strArr));
		
		// 배열 복사
		// System.arraycopy(구배열, 시작 index, 신배열, 시작 index, 개수)
		
		String[] arr3 = new String[6];
		
		System.arraycopy(strArr, 0, arr3, 0, strArr.length);
		
		System.out.println(Arrays.toString(arr3));
		
		strArr = arr3; // 새 배열로 배열 주소 연결
		
		strArr[5] = "Steve Rogers";
		
		System.out.println(Arrays.toString(strArr));
		
		
		
	}

}
