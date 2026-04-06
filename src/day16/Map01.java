package day16;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Map01 {

	public static void main(String[] args) {
		// Map : 값을 쌍으로 저장 (key - value)
		// - key : 중복 불가능 / value : 중복 가능
		// - hashMap을 주로 사용
		
		Map<String, Integer> map = new HashMap<>();
		
		// put() : 추가
		map.put("apple", 1000);
		map.put("orange", 500);
		map.put("banana", 3000);
		map.put("peach", 2000);	
		System.out.println(map);
		
		map.put("apple", 4000);
		map.put("kiwi", 2000);
		map.put("tomato", 3500);
		System.out.println(map);
		
		// get(key) : value 리턴
		
		System.out.println(map.get("apple"));
		
		// keySet() : key만 출력 -> set
		System.out.println(map.keySet());
				
		// values()
		System.out.println(map.values());
		
		// entrySet() : key=value 한묶음을 set으로 리턴
		System.out.println(map.entrySet());
		
		// containsKey(key) : 해당 키가 존재하는지 확인
		System.out.println(map.containsKey("orange"));
		System.out.println(map.containsKey("cherry"));
		
		// 합계 출력
		System.out.println(("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ SUM"));
		int sum = 0;
		for(String key : map.keySet()) {
			sum += map.get(key);
			System.out.println( key + ":" + map.get(key));
		}
		
		System.out.println(sum);
		
		System.out.println();
		
		// iterator
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			System.out.println(key + ":" + map.get(key));
		}
		
		System.out.println();
		
		// remove(object) 
		map.remove("apple");
		System.out.println(map);
		
		// map.size() : map의 길이
		System.out.println(map.size());
		
		// clear()
		map.clear();
		System.out.println(map);
		
		
		
		
		
		
		// MAIN END
	}

}
