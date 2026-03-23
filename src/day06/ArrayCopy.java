package day06;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		/*
		 * ArrayCopy
		 * 배열은 길이가 정해져 있음.
		 * 처음 배열을 선언할 때 정해서 생성
		 * 이후에 배열을 증가, 감소 시킬 수 없음. (필요에 의해서 늘이거나 줄일 수 X)
		 * 
		 * 배열의 길이를 조절해야 할 때 arrayCopy 를 이용
		 * System.arrayCopy(이전배열, 시작 index, 새배열, 시작 index, 개수)
		 * 이전배열 = 새배열;
		 * 
		 */
		
		int[] arr = new int[5];
		
		arr[0] = 78;
		arr[1] = 48;
		arr[2] = 56;
		arr[3] = 39;
		arr[4] = 23;
		
		System.out.println(Arrays.toString(arr));
		
		// 새배열 생성 => 기존 배열에 5개 추가
		// 데이터 복사 후 주소 공유 => 출력
		
		int[] arr2 = new int[arr.length + 5];
		
		System.arraycopy(arr, 0, arr2, 0, arr.length);
		arr = arr2;
		
		System.out.println(Arrays.toString(arr));
	}

}
