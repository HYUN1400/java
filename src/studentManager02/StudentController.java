package studentManager02;

import java.util.Scanner;

public class StudentController implements StudentProgram02 {
	// 학생 배열을 생성 
	private Student02[] student = new Student02[5];
	private int cnt = 0;
	
	// 수강 신청을 위한 과목 목록 배열 : 수강 신청이 가능한 모든 과목 목록
	private Subject02[] subList = new Subject02[5];
	
	// 학생 미리 등록
	public void addStudent() {
		student[0] = new Student02("1", "학생A", 32, "010-1111-1111", "서울시");
		cnt++;
		student[1] = new Student02("2", "학생B", 30, "010-2222-2222", "서울시");
		cnt++;
	}
	
	// 수강과목 미리 등록
	public void addSubject() {
		subList[0] = new Subject02("111", "C언어", "3", "C교수", "C강의장");
		subList[1] = new Subject02("222", "JAVA언어", "2", "D교수", "D강의장");
		subList[2] = new Subject02("333", "javaScript", "2", "E교수", "E강의장");
		subList[3] = new Subject02("444", "python", "3", "F교수", "F강의장");
		subList[4] = new Subject02("555", "React", "3", "G교수", "G강의장");
	}
	
	
	public String studentNumInput(Scanner scan) {
		System.out.println("학번을 입력하세요 >>> ");
		String num = scan.next();
		
		return num;
	}
	
	// 학번을 입력받아 학생 배열에서 해당 학번의 index를 리턴해주는 메서드
	public int searchIndex(String num) {
		
		for(int i = 0; i < cnt; i++) {
			if(student[i].getStudentNumber().equals(num)) {
				return i;
			}
		}
		
		return -1;
		
	}
	
	
	
	// 수강 신청 시 신청 가능한 목록을 출력하는 메서드
	public void printSubList() {
		int i = 1;
		System.out.println("■■■■■■■■■■ 강의 목록 ■■■■■■■■■■");
		for(Subject02 s : subList) {
			System.out.println(i + ". ");
			s.printSubject();
			i++;
		}
	}
	
	@Override
	public void insertStudent(Scanner scan) {
		//searchIndex, studentNumInput 사용
		
		String num = studentNumInput(scan);
		
		if(searchIndex(num) != -1) {
			System.out.println("동일한 학번이 존재합니다.");
			return;
		}
		
		
		System.out.println("■■■■■■■■■■ 이름 >>>");
		String name = scan.next();
		
		System.out.println("■■■■■■■■■■ 나이 >>>");
		int age = scan.nextInt();
		
		System.out.println("■■■■■■■■■■ 전화번호 >>>");
		String phone = scan.next();
		scan.nextLine();
		
		System.out.println("■■■■■■■■■■ 주소 >>>");
		String address = scan.nextLine();
		
		Student02 s = new Student02(num, name, age, phone, address);
		student[cnt] = s;
		cnt++;
	
	}
	

//	@Override
//	public void insertStudent(Scanner scan) {
//		System.out.println("■■■■■■■■■■ 학번 >>>");
//		String num = scan.next();
//		
//		// 학번 중복불가 처리
//		for(int i = 0; i < cnt; i++) {
//			if(student[i].getStudentNumber().equals(num)) {
//				System.out.println("동일한 학번이 존재합니다.");
//				return;
//			}
//		}
//		
//		System.out.println("■■■■■■■■■■ 이름 >>>");
//		String name = scan.next();
//		
//		System.out.println("■■■■■■■■■■ 나이 >>>");
//		int age = scan.nextInt();
//		
//		System.out.println("■■■■■■■■■■ 전화번호 >>>");
//		String phone = scan.next();
//		scan.nextLine();
//		
//		System.out.println("■■■■■■■■■■ 주소 >>>");
//		String address = scan.nextLine();
//		
//		Student02 s = new Student02(num, name, age, phone, address);
//		student[cnt] = s;
//		cnt++;
//	
//	}
	

	@Override
	public void printStudentList() {
		System.out.println("■■■■■■■■■■ 학생 목록 ■■■■■■■■■■");
		for(int i = 0; i < cnt; i++) {
			System.out.print((i+1) + ". ");
			student[i].printInfo();
		}
	}
	
	
	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("■■■■■■■■■■ 검색할 학생의 학번을 입력하세요. >>> ");
		String num = scan.next();
		
		int index = searchIndex(num);
		
		if(index != -1) {
			student[index].printInfo();
			student[index].printSubjectList();
			return;
		}
		
		System.out.println("학생 정보가 없습니다.");
	}
	

//	@Override
//	public void searchStudent(Scanner scan) {
//		System.out.println("■■■■■■■■■■ 검색할 학생의 학번을 입력하세요. >>> ");
//		String num = scan.next();
//		
//		for(int i = 0; i < cnt; i++) {
//			if(student[i].getStudentNumber().equals(num)) {
//				student[i].printInfo();
//				student[i].printSubjectList();
//				return;
//			}
//		}
//		
//		System.out.println("학생 정보가 없습니다.");
//	}

	@Override
	public void insertSubject(Scanner scan) {
		// 수강 신청은 개인별로 한다.
		System.out.println("■■■■■■■■■■ 학번을 입력하세요. >>> ");
		String num = scan.next();
		
		for(int i = 0; i < cnt; i++) {
			if(student[i].getStudentNumber().equals(num)) {				
				System.out.println("■■■■■■■■■■ 수강할 강의를 선택하세요. >>> ");
				printSubList();
				int subNum = scan.nextInt();
				
				if(subNum <= 0 || subNum > subList.length) {
					System.out.println("잘못된 강의입니다.");
					return;
				}
				
				student[i].insertSubject(subList[subNum - 1]);
				return;
			}
		}
		
		System.out.println("학생 정보가 없습니다.");
		
		
	}

	@Override
	public void deleteSubject(Scanner scan) {
		// 수강 철회도 개인별로 한다.
		System.out.println("■■■■■■■■■■ 학번을 입력하세요. >>> ");
		String num = scan.next();
		
		for(int i = 0; i < cnt; i++) {
			if(student[i].getStudentNumber().equals(num)) {				
				System.out.println("■■■■■■■■■■ 수강을 철회하고 싶은 강의를 입력하세요. >>> ");
				student[i].printSubjectList();
				int subNum = scan.nextInt();
				
				// 수강 과목 프린트 시 넘버링이 된 경우
				Subject02 s = student[i].getSubjectList()[subNum -1];
				student[i].deleteSubject(s);
				
				
//				Subject02 s = new Subject02();
//				
//				s.setSubjectCode(subNum);
//				
//				student[i].deleteSubject(s);		
				
			}
		}
		
	}

}
