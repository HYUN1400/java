package day15;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetEx01 {

	public static void main(String[] args) {
		// set으로 로또 만들기
		
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> set1 = new HashSet<Integer>();

		while(set.size() != 7) {
			int random = (int)(Math.random()*45)+1;
			set.add(random);
		}
		
		while(set1.size() != 6) {
			int random = (int)(Math.random()*45)+1;
			set1.add(random);
		}
		
		List<Integer> lotto = new ArrayList<>(set);
		List<Integer> user = new ArrayList<>(set1);
		System.out.println(lotto);
		System.out.println(user);
		
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ treeSet");
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		while(treeSet.size() < 6) {
			int random = (int)(Math.random()*45)+1;
			treeSet.add(random);
		}
		
		System.out.println(treeSet);
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ first / last");
		// first() : 가장 앞에 있는 값 / last() : 가장 뒤에 있는 값 
		System.out.println(treeSet.first());
		System.out.println(treeSet.last());
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ headSet / tailSet");
		// headSet(값) / tailset(값) : 값 기준으로 앞쪽 / 뒷쪽 값을 출력
		System.out.println(treeSet.headSet(20));
		System.out.println(treeSet.tailSet(20));
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ subSet");
		// subSet(start, end) : 범위의 값을 출력 (끝값 미포함)
		System.out.println(treeSet.subSet(10, 20));
		
		
		
		
		// MAIN END
		
	}

}
