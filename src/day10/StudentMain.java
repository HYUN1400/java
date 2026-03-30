package day10;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// 학생정보를 관리하기 위한 클래스 생성
		// 학생의 기본정보 : 이름, 전화번호, 주소, 생년월일
		// 학원정보 : 학원명 = "KOREAIT", 지점
		// 수강정보 : 수강과목, 기간
		// 		=> 수강과목은 여러과목을 들을 수 있음.[5] / 기간[5]
		
		/* ex) 홍길동, 010-1111-1111, 서울, 010101
		 * 		KOREAIT , 강남
		 * 		java, 		2026-01-01~2026-02-28
		 * 		웹개발 국비,	2026-03-16~2026-09-03
		 * 		DB,			2026-05-01~2026-05-31
		 * */
		Scanner scan = new Scanner(System.in);
		Student[] std = new Student[5];
		
		String[] gigum = {"강남","종로","인천","노원"};
		String[] subjectName = {"java","DB","웹개발국비","javaScript"};
		String[] subjectDate = {"2026-01-01~2026-02-28","2026-05-01~2026-05-31",
				"2026-03-16~2026-09-03","2026-06-01~2026-06-30"};
		
		System.out.println("학생명>");
		String name = scan.next();
		System.out.println("전화번호>");
		String phone = scan.next();
		
		Student s = new Student(name, phone);
		
		System.out.println("--지점선택--");
		int gIndex = 0;
		for(String g : gigum) {
			gIndex++;
			System.out.print(gIndex+"."+g+"  ");
		}
		System.out.println();
		System.out.println("지점>");
		int gigumIndex = scan.nextInt();
		s.setBranch(gigum[gigumIndex-1]);
		
		System.out.println();
		System.out.println("--과목선택--");
		for(int i=0; i<subjectName.length; i++) {
			System.out.println((i+1)+". "+subjectName[i]+"["+subjectDate[i]+"]");
		}
		System.out.println("과목>");
		int subjectIndex = scan.nextInt();
		
		s.insertCourse(subjectName[subjectIndex-1], subjectDate[subjectIndex-1]);
		
		
		s.printInfo();
		s.printCompany();
		s.printCourse();
		
		std[0] = s;
		
		std[1] = new Student("kim", "010-1111-2222", "서울시", "010203", "종로");
		std[1].insertCourse(subjectName[0], subjectDate[0]);
		std[1].insertCourse(subjectName[1], subjectDate[1]);
		std[1].insertCourse(subjectName[2], subjectDate[2]);
		
		
		std[2] = new Student("lee", "010-1111-7777", "서울시", "010203", "강남");
		std[2].insertCourse(subjectName[0], subjectDate[0]);
		std[2].insertCourse(subjectName[1], subjectDate[1]);
		std[2].insertCourse(subjectName[2], subjectDate[2]);
		
		std[3] = new Student("choi", "010-1111-5555", "수원시", "010203", "종로");
		std[3].insertCourse(subjectName[0], subjectDate[0]);
		std[3].insertCourse(subjectName[2], subjectDate[2]);
		std[3].insertCourse(subjectName[3], subjectDate[3]);
		
		std[4] = new Student("park", "010-1111-3333", "서울시", "010203", "강남");
		std[3].insertCourse(subjectName[0], subjectDate[0]);
		std[3].insertCourse(subjectName[2], subjectDate[2]);
		std[3].insertCourse(subjectName[2], subjectDate[2]);

		for(int i=0; i<std.length; i++) {
			std[i].printInfo();
			std[i].printCompany();
			std[i].printCourse();
			System.out.println("------------------");
		}
		
		System.out.println("");
		System.out.println("강남지점 명단 >>>>>>>>>>>");
		
		// 검색
		String searchBranch = "강남";
		// 강남지점 학생 명단 출력
		for(int i = 0; i < std.length; i++) {
			if(std[i].getBranch().equals(searchBranch)) {
				std[i].printInfo();
				std[i].printCompany();
			}
		}
		
		
		System.out.println("");
		System.out.println("웹개발국비 명단 >>>>>>>>>>>");
		
		String searchCourse = "웹개발국비";
		//웹개발국비 과정을 듣는 학생 명단 출력
		int cnt = 0;
		while(cnt < std.length) {
			// 각자 수강하는 과목 개수만큼
			for(int i = 0; i < std[cnt].getCnt(); i++) {
				if(std[cnt].getCourse()[i].equals(searchCourse)) {
					std[cnt].printInfo();
					std[cnt].printCompany();
					std[cnt].printCourse();
				}
			}
			cnt++;
		}
		
		// 학생 이름을 입력 받아 그 학생의 정보 출력
		System.out.println("학생의 이름을 입력해주세요. >");
		
		String searchName = scan.next();
		
		while(true) {
			
			int count = 0;
			
			for(int i = 0; i < std.length; i++) {
				if(std[i].getName().equals(searchName)) {
					std[i].printInfo();
					std[i].printCompany();
					std[i].printCourse();
					count++;
				} 
			}
			if(count == 0) {
				System.out.println("일치하는 학생이 없습니다.");
			}
			break;
		}
		
	
		scan.close();
			
		
	}
		

}