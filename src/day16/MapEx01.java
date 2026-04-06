package day16;

import java.util.Scanner;

public class MapEx01 {

	public static void main(String[] args) {
		// map을 활용한 단어장 프로그램 작성
		/* 1) 단어 등록 | 2) 단어 검색 | 3) 단어 수정 | 4) 전체 단어 출력 | 5) 단어 삭제 | 6) 종료
			map => 단어 : 뜻
			
			main => menu
			WordController  구현
		*/
		Scanner scan = new Scanner(System.in);
		WordController wc = new WordController();
		int select = 1;
		
		wc.testWord();
		
		do{
			
			System.out.println("■■■■■■■■■ 단어장 ■■■■■■■■■");
			System.out.println("1) 단어 등록 | 2) 단어 검색 | 3) 단어 수정");
			System.out.println("4) 전체 단어 | 5) 단어 삭제 | 6) 종료");
			
			select = scan.nextInt();
			
			switch(select) {
			case 1: wc.insertWord(); break;
			case 2: wc.searchWord(); break;
			case 3: wc.modifyWord(); break;
			case 4: wc.allWords(); break;
			case 5: wc.removeWord(); break;
			case 6: System.out.println("단어장을 종료합니다."); break;
			default: System.out.println("잘못된 메뉴입니다."); break;
			}
			
		}while(select != 6);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		scan.close();
		
		// MAIN END
	}

}
