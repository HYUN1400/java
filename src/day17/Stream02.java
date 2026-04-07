package day17;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Stream02 {

	public static void main(String[] args) {
	 	/* 중간연산 / 최종연산
	 	
	 	- 최종연산 (마지막에 하나만)
	 	forEach() : 리스트를 순회하여 요소값을 얻어내는 역할
	 	findFirst() : 조건에 일치하는 요소 중 가장 앞에 있는 요소를 반환
	 	findAny() : 조건에 일치하는 요소 중 가장 먼저 탐색되는 요소를 리턴
	 	anyMatch() : 조건에 일치하는 요소가 하나라도 있다면 true 리턴
	 	allMatch() : 모든 요소가 조건에 맞다면 true 리턴
	 	nonMatch() : 조건에 맞는 요소가 없다면 true 리턴
	 	count(), min(), max() : 개수, 최소값, 최대값
	 	sum(), average() : 합계, 평균
	 	collect() : 스트림 내의 요소를 수집 후 사용자가 원하는 형태로 반환
	 	toArray() : 배열로 리턴
	 	toList() : 리스트로 리턴
	 	...
	 	
	 	- 중간연산 (중간에 이어서 사용, 중복 사용도 OK)
	 	filter() : 조건에 맞는 결과값을 필터링
	 	distinct() : 중복된 값 제거
	 	map() : 요소의 값을 원하는 값으로 형변환
	 	sorted() : 정렬
	 	peek() : 작업 수행 후 stream 리턴
	 	skip() : stream의 일부를 건너뜀
	 	limit() : stream의 일부를 잘라냄
	 	
	 	
	 	 */
		
	
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < 10; i++) {
			list.add((int)(Math.random()*20)+1);
		}
		System.out.println(list);
		
		
		// list를 스트림으로 구성
		list.stream().forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// 중복제거
		list.stream().distinct().forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// 중복제거 + 정렬
		list.stream().distinct().sorted().forEach(System.out :: println);
		
		// :: 메서드 호출 방식 / 메서드 참조 방식
		// 클래스명 :: 메서드명
		// 객체명 :: 메서드명
		// n -> n.toUpperCase() => String::toUpperCase
		
		System.out.println("•─────────⋅☾ MAPTOINT ☽⋅─────────•");
		// 중복제거하여 합계를 출력
		int sum = list.stream().mapToInt(i -> i.intValue()).distinct().sum();
		System.out.println(sum);
		
		int sum2 = list.stream().distinct().mapToInt(Integer::intValue).sum();
		System.out.println(sum2);
		
		// 스트림 객체 생성
		Stream<Integer> stream01 = Stream.of(10, 20, 30, 40, 50);
		int total = stream01.mapToInt(n -> n.intValue()).sum();
		System.out.println(total);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// MAIN END
		
	}

}
