package day15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Set01 {

	public static void main(String[] args) {
		// Set : index가 없음 (순서 보장X, 중복 불가능)
		// 정렬 불가
		// HashSet / TreeSet 
		
		Set<String> set = new HashSet<String>();
		
		// add() : set에 추가
		
		set.add("사과");
		set.add("배");
		set.add("복숭아");
		set.add("귤");
		
		
		System.out.println(set);
		
		set.add("배"); // 중복값은 덮어씌움	
		System.out.println(set);
		
		// get(i) / set(i, value) : index가 없어서 메서드 존재X		
		// contains() clear() equals() isEmpty() . . .
		
		// set 출력 => 향상된 for문 / Iterator 출력
		for(String tmp: set) {
			System.out.println(tmp);
		}
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String tmp = it.next();
			System.out.println(tmp);
		}
		
		
		// set은 중복 제거를 위해 사용 => list로 변환하여 사용 
		List<String> list = new ArrayList<String>(set);		
		System.out.println(list);	
		list.add("배");	
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		// MAIN END
	}

}
