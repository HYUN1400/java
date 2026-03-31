package studentManager;

import java.util.Arrays;
import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
		Controller sc = new Controller();
		
		sc.addStudent();
		sc.addSubject();
		
		int menu = 0;
		
		do {
			
			System.out.println("■■■■■■■■ ○ 선택하세요 ○ ■■■■■■■■");
			System.out.println("1 학생 등록\t2 학생 리스트\t3 학생 조회");
			System.out.println("4 수강 신청\t5 수강 철회\t6 종료");
			
			menu = scan.nextInt();
			
			switch(menu) {
			case 1: sc.insertStudent(scan); break;
			case 2: sc.printStudentList(); break;
			case 3: sc.searchStudent(scan); break;
			case 4: sc.insertSubject(scan);  break;
			case 5: sc.DeleteSubject(scan); break;
			case 6: System.out.println("프로그램을 종료합니다."); break;
			default: System.out.println("잘못된 메뉴입니다.");
			}
			
		}while(menu != 6);		
		
		
		
		scan.close();
		
		// MAIN END
	}

}
