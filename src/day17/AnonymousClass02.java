package day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AnonymousClass02 {

	public static void main(String[] args) {
		// List의 sort		
		/*	리스트 생성
		 	1~100까지 랜덤수 10개 
		 */
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			int random = (int)(Math.random()*100)+1;
			list.add(random);
		}
		
		System.out.println(list);
		
		// Collections.sort(list); // collections 클래스에서 제공하는 메서드
		
		// list.sort(Comparator를 구현한 구현객체) : 정렬이 가능 => 미리 구현해둔 구현체는 불가능
		// Comparator 인터페이스를 구현한 구현체를 넣어야 함. (익명클래스 사용)
		// compare	compareTo: 문자
		// compareTo : 사전상으로 앞에 있으면 - 같으면 0 뒤에 있으면 + 
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// 숫자 - 두 수의 차를 보면 됨
				// 앞의 수가 작으면 앞으로 보냄 : 오름차순 => o1 - o2
				// 앞의 수가 크면 앞으로 보냄 : 내림차순 => o2 - o1
				return o2 - o1;
			}
			
		});
		System.out.println(list);
		
		System.out.println();
		
		List<String> SList = new ArrayList<>();
		SList.add("apple");
		SList.add("kiwi");
		SList.add("orange");
		SList.add("banana");
		SList.add("peach");
		System.out.println(SList);
		
		SList.sort(new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				// compareTo
				// o1.compareTo(o2) => 오름차순
				// o2.compareTo(o1) => 내림차순
				return o1.compareTo(o2);
			}
			
		});
		System.out.println(SList);
		
		
		
		
		
		
		
		
		
		
		
		
		
		// MAIN END
	}

}
