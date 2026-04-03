package day15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListEx01 {

	public static void main(String[] args) {
		// 배열의 값을 리스트로 생성
		String[] arr1 = {"r", "o", "c", "k" ,"y"};
		String[] arr2 = {"g", "r", "a", "c" ,"e"};
		
		// 배열을 list로 가져오기
		
		// 배열이ㅡ 값을 연결하여 리스트로 가져오기
//		List<String> list = new ArrayList<>();
//		list = Arrays.asList(arr1); // 얕은 복사
//		System.out.println(list);
		
		// 깊은 복사 : 복사하여 가져오기
		List<String> list1 = new ArrayList<>(Arrays.asList(arr1));
		List<String> list2 = new ArrayList<>(Arrays.asList(arr2));
		
		// addAll(list) : 모든 요소 추가
		list1.addAll(list2);
		System.out.println(list1);
		
		
		
//		// 2개의 배열을 하나의 리스트로 생성
//		
//		List<String> list = new ArrayList<>();
//		
//		for(int i = 0; i < arr1.length; i++) {
//			list.add(arr1[i]);
//			list.add(arr2[i]);
//		}
//		
//		System.out.println(list);
//		
//		
//		// 정렬 => 출력 sort
//		Collections.sort(list);
//		System.out.println(list);
		
		
//		String[] newarr = new String[arr1.length + arr2.length];
//		System.arraycopy(arr1, 0, newarr, 0, arr1.length);
//		arr1 = newarr;
//		
//		System.arraycopy(arr2, 0, arr1, 5, arr2.length);
//		arr2 = arr1;
//		
//		for(int i = 0; i < arr2.length; i++) {
//			list.add(arr2[i]);
//		}
//		
//		System.out.println(list);
//		
//
//		Collections.sort(list);
//		System.out.println(list);
		
	}

}
