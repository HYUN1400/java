package studentManager;

import java.util.Arrays;
import java.util.Scanner;

public class Controller implements StudentProgram {
	
	private int number = 0;
	private Student[] students = new Student[5];

	
	// 수강 신청을 위한 과목 목록 배열
	private int subNum = 0;
	private Subject[] subjects = new Subject[5];
	
	public void addStudent() {
		students[0] = new Student("26262622", "테스트1", "20", "010-1234-1234", "서울시 강남구");
		students[1] = new Student("25252500", "테스트2", "22", "010-2345-2345", "성남시 분당구");
		
		number = 2;
	}
	
	public void addSubject() {
		subjects[0] = new Subject("TEST01", "JAVA기초", "7", "교수01", "4층 C");
		subjects[1] = new Subject("TEST02", "프론트엔드", "10", "교수02", "4층 H");
		subjects[2] = new Subject("TEST03", "리액트", "4", "교수03", "3층 A");
		subjects[3] = new Subject("TEST04", "Spring boot", "7", "교수04", "3층 B");
		subjects[4] = new Subject("TEST05", "웹소켓", "5", "교수05", "4층 F");
		subNum = 5;
	}

	@Override
	public void insertStudent(Scanner scan) {
		
		System.out.println("학번을 입력하세요 > ");
		String stdnumber = scan.next();
		System.out.println("이름을 입력하세요 > ");
		String name = scan.next();
		System.out.println("나이를 입력하세요 > ");
		String age = scan.next();
		System.out.println("전화번호를 입력하세요 > ");
		String phone = scan.next();
		
		scan.nextLine();
		
		System.out.println("주소를 입력하세요 > ");
		String address =  scan.nextLine();
		

		students[number] = new Student(stdnumber, name, age, phone, address);
		number++;
		
	}

	@Override
	public void printStudentList() {

	    for(int i = 0; i < number; i++) {
	        System.out.print(i+1 + ". ");
	        System.out.println(students[i]);

	        boolean hasSubject = false;

	        for(int j = 0; j < subjects.length; j++) {
	            if(students[i].getSubject()[j] != null) {
	                System.out.println("■ " + (j+1) + " [ 수강과목: " + students[i].getSubject()[j] + "]");
	                hasSubject = true;
	            }
	        }

	        if(!hasSubject) {
	            System.out.println("수강 중인 강의가 없습니다.");
	        }

	        System.out.println();
	    }
	} 	 
		 

	@Override
	public void searchStudent(Scanner scan) {
		System.out.println("■■■■ ○ 조회하실 학생의 이름을 입력하세요 >>> ");
		String name = scan.next();
		
		int count = 0;
		for(int i = 0; i < number; i++) {
			if(students[i].getName().contains(name)) {
				System.out.println(students[i]);
				count ++;
			}
		}
		
		if(count == 0) {
			System.out.println("일치하는 학생이 없습니다.");
		}
		
	}

	@Override
	public void insertSubject(Scanner scan) {
		
		int count = 0;
		
		System.out.println("강의를 수강할 학생을 선택해주세요 >>> ");
		System.out.println("○ ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ ○");
		printStudentList();
		
		int selectSTD = scan.nextInt();
		
		System.out.println("■■■■ ○ 수강할 강의를 선택해주세요 >>> ");
		
		for(int i = 0; i < subNum; i++) {
			System.out.print(i+1 + ". ");
		    System.out.println(subjects[i]);
		    System.out.println("\n");
		}
		
		int selectSUB = scan.nextInt();

		
		
		students[selectSTD-1].addSubject(subjects[selectSUB-1]);
		
	}

	@Override
	public void DeleteSubject(Scanner scan) {
		System.out.println("■■■■ ○ 학생을 선택해주세요 >>> ");
		System.out.println("○ ■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ ○");
		printStudentList();
		
		int selectSTD = scan.nextInt();
		
		System.out.println("■■■■ ○ 수강을 취소할 강의를 선택해주세요 >>> ");
		
		boolean hasSubject = false;
		
		for(int i = 0; i < subjects.length; i++) {
			if(students[selectSTD - 1].getSubject()[i] != null) {
				 System.out.println("■ " + (i+1) +" [ 수강과목: " + students[selectSTD - 1].getSubject()[i] + "]");
				 hasSubject = true;
			}
		}
		
		if(!hasSubject) {
            System.out.println("수강 중인 강의가 없습니다.");
        }
		
		int selectSUB = scan.nextInt();
		
		students[selectSTD - 1].removeSubject(selectSUB - 1);
		
		System.out.println("■■■■ ○ 수강 철회가 완료되었습니다. ○ ■■■■");
		
	}
}
