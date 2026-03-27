package day10;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		// 학생 정보를 관리하기 위한 클래스 생성 
		// 학생의 기본정보 : 이름, 전화번호, 주소, 생년월일
		// 학원 정보 : 학원명 = "KOREAIT", 지점 
		
		// 수강 정보 : 수강 과목, 기간
		// 				=> 수강과목은 여러 과목을 들을 수 있음.[5] / 기간[5]
		
		
		/*
		 * ex> 홍길동, 010-1111-1111, 서울, 010101
		 * 		KOREAIT, 강남
		 * 		JAVA, 			2026-01-01 ~ 2026-02-28
		 * 		웹개발 국비, 	2026-03-16 ~ 2026-09-03
		 * 		DB,				2026-05-01 ~ 2026-05-31
		 */
		
		Scanner scan = new Scanner(System.in);
		
		Student[] students = new Student[1];
		
		students[0] = new Student("Peter Parker", "02) 0810-0810", "QUEENS", "010810", "NEWYORK");
		
//		System.out.println("등록할 학생 수를 입력해주세요. 👉");
//		int count = scan.nextInt();
//		
//		Student[] students = new Student[count];
//		
//		for(int i = 0; i < students.length; i++) {
//			System.out.println("이름을 입력해주세요. 👉");
//			String name = scan.next();
//			System.out.println("전화번호를 입력해주세요. 👉");
//			String phone = scan.next();
//			System.out.println("주소를 입력해주세요. 👉");
//			String address = scan.next();
//			System.out.println("생년월일을 입력해주세요. 👉");
//			String birth = scan.next();
//			System.out.println("지점을 입력해주세요. 👉");
//			String academyAdd = scan.next();
//
//			
//			Student student = new Student(name, phone, address, birth, academyAdd);
//			
//			students[i] = student;
//		}
		
		System.out.println("학생 정보 👇");
		for(Student tmp: students) {
			System.out.println(tmp.getName());
		}
		
		System.out.println("수강 과목을 입력해주세요 👉 ");
		students[0].register(scan);
		
		System.out.println("수강 과목을 입력해주세요 👉 ");
		students[0].register(scan);

		System.out.println("이름\t전화번호\t주소\t생년월일");
		for(Student tmp: students) {
			System.out.println(tmp);
		}
		
		System.out.println("수강과목\t기간");

		String[] subjects = students[0].getSubjects();
		String[] since = students[0].getSince();

		for (int i = 0; i < subjects.length; i++) {
		    if (subjects[i] != null) {
		        System.out.println(subjects[i] + "\t" + since[i]);
		    }
		}
		
		
		scan.close();
	}

}
