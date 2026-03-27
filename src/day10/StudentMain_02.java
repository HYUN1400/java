package day10;

import java.util.Scanner;

public class StudentMain_02 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		Student[] std = new Student[5];
		
		String[] where = {"강남", "종로", "인천", "노원"};
		String[] subjects = {"JAVA", "DB", "WEB개발", "JAVASCRIPT"};
		String[] subjectDate = {"2026-01-01 ~ 2026-02-28", "2026-05-01 ~ 2026-05-31", "2026-03-16 ~ 2026-09-03", "2026-11-01 ~ 2026-12-25"};
		
		System.out.println("학생 이름을 입력하세요. >");
		String name = scan.next();
		System.out.println("전화번호를 입력하세요. >");
		String phone = scan.next();
		
		Student_02 s1 = new Student_02(name, phone);
		
		System.out.println("지점을 선택하세요. >");
		int wIndex = 0;
		for(String w : where) {
			wIndex++;
			System.out.print(wIndex + "." + w + " ");
		}
		System.out.println();
		int whereIndex = scan.nextInt();
		s1.setBranch(where[whereIndex - 1]);
		
		System.out.println();
		System.out.println("--* 과목 선택 *--");
		for(int i = 0; i < subjects.length; i++) {
			System.out.println((i+1) + ". " + "[" + subjectDate[i] + "]");
		}
		int subjectIndex = scan.nextInt();
		
		s1.insertCourse(subjects[subjectIndex-1], subjectDate[subjectIndex-1]);
		
		
		s1.printInfo();
		s1.printCompany();
		s1.printCourse();
		
		
		scan.close();
	}

}
