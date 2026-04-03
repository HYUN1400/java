package day15;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class List03 {

	public static void main(String[] args) {
		// 리스트를 생성하여 과일 5가지를 저장하고 => 출력
		List<String> fruit = new ArrayList<>();
		
		fruit.add("사과");
		fruit.add("바나나");
		fruit.add("딸기");
		fruit.add("복숭아");
		fruit.add("샤인머스켓");
		
		// 일반 for문으로 출력
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ for");
		for(int i = 0; i < fruit.size(); i++) {
			System.out.println(fruit.get(i));
		}
		
		// 향상된 for문으로 출력
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ 향상 for");
		for(String tmp: fruit) {
			System.out.println(tmp);
		}
		
		// Iterator 출력
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ Iterator");
		Iterator<String> it = fruit.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		
		
		// 내 리스트에 사과가 있으면 사과판매 / 없으면 재고없음 출력
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■");
		if(fruit.contains("사과")) {
			System.out.println("사과 판매 🍎");
		} else {
			System.out.println("재고 없음 🥲");
		}
		
		
		
		
		
		
		
		// MAIN END
	}

}
