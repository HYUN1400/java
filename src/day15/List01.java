package day15;

import java.util.ArrayList;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		// List => ArrayList
		List<Integer> list = new ArrayList<>();
		
		// add(): 요소 추가
		list.add(1); // 0번지에 1이 추가 > auto boxing (int => Integer 자동 박싱)
		list.add(new Integer(2)); // 직접 객체 생성 후 저장 (권장되지 않음)
		list.add(3); 
				
		System.out.println(list); // 자체 toString() 호출
		
		// get(index) : 배열의 index 값을 가져오기	=	int a = arr[0] 
		System.out.println(list.get(0));
		System.out.println(list.get(2));
		
		
		// set(index, 값) : index 번지에 값을 저장하기
		list.set(1, 100);
		System.out.println(list);
		
		// remove(index) : 해당 index 요소 삭제
		list.remove(0);
		System.out.println(list);
		
		// remove(object) : object 값을 삭제
		Integer r = 100;
		list.remove(r);
		System.out.println(list);
		
		// size() : list의 총 개수 => 배열의 길이 length
		System.out.println(list.size());
		
		// 배열의 값을 3개 추가, for문을 이용하여 출력
		list.add(100);
		list.add(200);
		list.add(300);
		
		System.out.println(list);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 리스트를 생성 1 ~ 10까지 반복문을 이용하여 추가하고 => 출력
		List<Integer> list1 = new ArrayList<>();
		
		for(int i = 1; i <= 10; i++) {
			list1.add(i);
		}
		
		System.out.println(list1);
		
		// index 4 값을 11로 변경
		list1.set(4, 11);
		System.out.println(list1);		
		
		// contains(object) : list에 object가 있는지 체크
		System.out.println(list1.contains(1));
		System.out.println(list1.contains(20));
		
		// clear : 리스트 비우기 (요소를 전부 삭제)
		list1.clear();
		
		// isEmpty() : 리스트가 비었는지 확인
		System.out.println(list1.isEmpty());
		System.out.println(list.isEmpty());
		
	
	
	}

}
