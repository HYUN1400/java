package day15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class List02 {

	public static void main(String[] args) {
		// List를 생성 후 10~20까지 채워서 출력
		
		List<Integer> list = new ArrayList<>();
		
		int i = 10;
		
		while(list.size() < 11) {
			list.add(i);
			i++;
		}
		
		for(int tmp: list) {
			System.out.println(tmp);
		}
		
		
		int sum = 0;
		for(Integer in : list) {
			sum += in;
			System.out.println(in);
		}
		
		System.out.println(sum);
		
		// Iterator(반복자) : index가 없는 구조를 출력하기 위해 사용
		// set, map 처럼 index가 없는 구조에서 사용
		// 순서와 상관없이 값을 가져올 수 있는 구문
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ Iterator");
		
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) { // 요소가 있는지 확인
			int tmp = it.next(); // 요소 가져오기
			System.out.println(tmp);
		}
		
		
		// indexOf(값) : 해당 값이 번지를 리턴 / 없으면 -1
		System.out.println(list.indexOf(30));
		
		
		list.clear();
		list.add(45);
		list.add(78);
		list.add(33);
		list.add(51);
		list.add(84);
		
		// 정렬
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ sort");
		Collections.sort(list); //정렬 (오름차순만 가능)
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// MAIN END
		
	}

}
