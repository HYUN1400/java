package day04;

import java.util.Scanner;

public class Exam02 {

	public static void main(String[] args) {
		/* 생년을 숫자로 입력받아 어린이(13), 청소년(19), 어른
		 * 입장료 >
		 * 어린이 5000원, 청소년 7000원, 어른 10000원
		 * 
		 * ex) 2017 입력 => 10세 어린이입니다. 입장료는 5000원입니다.
		 * 
		 * 생년의 기준은 1900 ~ 2026
		 * 기준을 넘어간 데이터는 다시 입력 요청
		 * 생년이 유효하지 않습니다. 다시 입력해주세요 (1900~2026) >
		 * 
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		
		int today = 2026;
		
		while(true) {
			
			System.out.println("태어난 연도를 입력해주세요. > ");
			int birth = scan.nextInt();
			
			if((birth < 1900) || (birth > today)) {
				System.out.println("생년이 유효하지 않습니다. 다시 입력해주세요. (1900 ~ 2026) > ");
			} else {				
				int age = today - birth;
				
				if(age <= 13) {
					System.out.println(age + "세 어린이입니다. 입장료는 5000원입니다.");
				} else if(age <= 19) {
					System.out.println(age + "세 청소년입니다. 입장료는 7000원입니다.");
				} else {
					System.out.println(age + "세 성인입니다. 입장료는 10000원입니다.");
				}
				
			break;
				
			}
		}
				
		
		
		scan.close();
		
	}

}
