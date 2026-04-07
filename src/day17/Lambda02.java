package day17;

import java.util.HashMap;
import java.util.Map;

public class Lambda02 {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
		map.put("peter", 95);
		map.put("ned", 92);
		map.put("MJ", 93);
		map.put("flash", 87);
		
		
		map.forEach((a, b) -> {System.out.println(a + ": " + b);});
		
		System.out.println();
		// 함수형 인터페이스 구현
//		Number sum = (a, b) -> {return a + b;};
//		
//		int s = sum.add(30, 40);
//		System.out.println(s);
		
		Number max = (a, b) -> {
			return (a >= b) ? a : b;
		};
		
		int m = max.max(100, 200);
		System.out.println(m);
		
	}

}

// 람다용 함수형 인터페이스 => @FunctionalInterface
// 메서드 한개만 가능
@FunctionalInterface
interface Number{
	// 메서드 추가: 1개만
//	int add(int a, int b);
	int max(int a, int b);
	
}
