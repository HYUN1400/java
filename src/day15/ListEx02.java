package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx02 {

	public static void main(String[] args) {
		// 숫자를 입력받아 리스트로 생성
		// 출력 => 전체 합계 출력
		// 45, 78, 59, 68 . . . . . enter 치면 합계
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하세요 > (, 로 구분)");
		
		String str = scan.next();
		
		String[] num = str.split(",");
		int sum = 0;
		List<Integer> list = new ArrayList<>();
		
		for(String n : num) {
			int number = Integer.parseInt(n);
			list.add(number);
			sum += number;
		}
		
		System.out.println(list);
		System.out.println(sum);
		
		
		// MAIN END
	}

}
