package day17;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream03 {

	public static void main(String[] args) {
		
		int arr[] = {1,5,4,7,8,5,6,3,2,5,6,9,8,5,2,1,6};
		
		// 스트림으로 구성하여 중복제거, 정렬, 짝수만 출력
		Arrays.stream(arr).distinct().sorted().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
		System.out.println();
		
		// 스트림으로 구성하여 중복제거, 정렬, 홀수만 배열로 리턴
		int arr2[] = Arrays.stream(arr).distinct().sorted().filter(n -> n % 2 == 1).toArray();
		System.out.println(Arrays.toString(arr2));
		
	}

}
