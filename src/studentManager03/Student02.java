package studentManager03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Student02 {
	// 멤버변수에 배열이 존재하면 그 배열의 index 역할을 하는 변수가 필요
	private String studentNumber;
	private String studentName;
	private int studentAge;
	private String studentPhone;
	private String studentAddress;
	// 학생 1명 당 본인이 수강신청한 과목의 목록
//	private Subject02[] subjectList = new Subject02[5];
	private List<Subject02> list = new ArrayList<>();
	
	
	// constructor
	public Student02() { }
	
	public Student02(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Student02(String studentNumber, String studentName, int studentAge, String studentPhone,
			String studentAddress) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentAge = studentAge;
		this.studentPhone = studentPhone;
		this.studentAddress = studentAddress;
	}
	
	public Student02(String studentNumber, String studentName) {
		this.studentNumber = studentNumber;
		this.studentName = studentName;
		this.studentAge = 20;
		this.studentPhone = "010-1111-1111";
		this.studentAddress = "서울시";
	}
	
	
	// method
	
	// 수강신청 메서드
	// 1) 해당 배열에 이미 동일과목이 있는 경우 => 이미 추가한 과목입니다
	// 2) 배열이 다 찼을 경우
	
	public boolean isSubject(Subject02 sub) {
		if(sub == null) {
			return false;
		}
		
		if(sub.getSubjectCode().isBlank()) {
			System.out.println("수강정보가 없습니다.");
			return false;
		}
		
		return true;
	}
	
	
	public void insertSubject(Subject02 sub) {
		
		if(!isSubject(sub)) {
			return;
		}
//		
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getSubjectCode().equals(sub.getSubjectCode())) {
//				System.out.println("이미 동일한 강의를 수강 중입니다.");
//				return;
//			}
//			
//		}
//		
		// list에 해당 sub 객체가 있는지 확인
		if(list.contains(sub)) {
			System.out.println("이미 동일한 강의를 수강 중입니다.");
			return;
		}

		
		list.add(sub);
		System.out.println("수강신청이 완료되었습니다.");
		
	}
	
	// 수강철회 메서드 => list.remove() 
	public void deleteSubject(Subject02 sub) { // 수강 코드만 있는 Subject 객체
		// subjectList에서 sub가 몇번지에 있는지 찾기
		// int index = -1; // 없는 index
		
		if(!isSubject(sub)) {
			return;
		}
		
//		for(int i = 0; i < list.size(); i++) {
//			if(list.get(i).getSubjectCode().equals(sub.getSubjectCode())) {
//				index = i;
//				break;
//			}
//		}
		
		if(list.remove(sub)) { // 삭제가 되면 true / false
			System.out.println("수강 철회가 완료되었습니다.");
			return;
		}
			System.out.println("선택된 강의가 없습니다.");
		
	}
	
	
	// 개인정보를 출력하는 메서드
	public void printInfo() {
		System.out.println(studentName+"("+studentNumber+") / " + studentAge);
		System.out.println(studentPhone + " / " + studentAddress);
	}
	
	// 수강정보 확인 후 있으면 출력하는 메서드
	public void printSubjectList() {
		if(list.size() == 0) {
			System.out.println("수강 중인 강의가 없습니다.");
			return;
		}
		for(int i = 0; i < list.size(); i++) {
			System.out.print((i+1) + ". ");
			list.get(i).printSubject();
		}
	}
	
	
	// getter | setter

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public List<Subject02> getList() {
		return list;
	}

	public void setList(List<Subject02> list) {
		this.list = list;
	}

	@Override
	public String toString() {
		return "Student02 [studentNumber=" + studentNumber + ", studentName=" + studentName + ", studentAge="
				+ studentAge + ", studentPhone=" + studentPhone + ", studentAddress=" + studentAddress
				+ ", subjectList=" + list + "]";
	}
	

	@Override
	public int hashCode() {
		return Objects.hash(studentNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student02 other = (Student02) obj;
		return Objects.equals(studentNumber, other.studentNumber);
	};
	
	
	
	
}
