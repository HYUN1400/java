package studentManager03;

import java.util.Scanner;

public interface StudentProgram02 {
		// 1) 학생 등록
		// 2) 학생 리스트 출력
		// 3) 학생 검색
		// 4) 수강신청
		// 5) 수강철회
		
		void insertStudent(Scanner scan);
		void printStudentList();
		void searchStudent(Scanner scan);
		void insertSubject(Scanner scan);
		void deleteSubject(Scanner scan);
}
