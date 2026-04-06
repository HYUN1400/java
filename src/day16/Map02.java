package day16;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Map02 {

	public static void main(String[] args) {
		// 과목, 점수를 입력받아 map 저장
		// 종료 키워드가 나올 때까지 반복 ( 1 => 계속 | 0 => 종료 )
		// 과목: 점수 / 합계 / 평균 출력
		
		Scanner scan = new Scanner(System.in);
		
		Map<String, Integer> map = new HashMap<>();
		
		int select = 1;
		
		while(true) {	
			
			try {				
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ 과목을 입력해주세요 >");
				String key = scan.next();
								
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ 점수를 입력해주세요 >");
				int value = scan.nextInt();
				
				map.put(key, value);
				
				System.out.println("이어서 입력하시려면 1, 종료하시려면 0을 눌러주세요.");
				select = scan.nextInt();
				
			} catch (Exception e) {
				System.out.println("입력값이 잘못되었습니다.");
				scan.nextLine();
			}
			
			
			if(select == 0) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ 입력을 종료합니다.");
				break;
			}
			
		}
		
		int sum = 0;
		
		for(String key : map.keySet()) {
			sum += map.get(key);
			System.out.print(key + " : " + map.get(key) + " | ");
		}
		
		System.out.print("합계 : " + sum + " | 평균 : " + (sum / (double)map.size()));
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		
		// MAIN END
	}

}
