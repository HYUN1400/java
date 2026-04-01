package studentManager02;

import java.util.Arrays;

public class Student02 {
	// 멤버변수에 배열이 존재하면 그 배열의 index 역할을 하는 변수가 필요
	private String studentNumber;
	private String studentName;
	private int studentAge;
	private String studentPhone;
	private String studentAddress;
	// 학생 1명 당 본인이 수강신청한 과목의 목록
	private Subject02[] subjectList = new Subject02[5];
	private int cnt; // index
	
	
	// constructor
	public Student02() { }

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
		
		for(int i = 0; i < cnt; i++) {
			if(subjectList[i].getSubjectCode().equals(sub.getSubjectCode())) {
				System.out.println("이미 동일한 강의를 수강 중입니다.");
				return;
			}
		}
		
		if(subjectList.length == cnt) {
			Subject02 newSub[] = new Subject02[subjectList.length + 3];
			System.arraycopy(subjectList, 0, newSub, 0, subjectList.length);
			subjectList = newSub;
		}
		
		subjectList[cnt] = sub;
		cnt++;
		System.out.println("수강신청이 완료되었습니다.");
		
	}
	
	// 수강철회 메서드
	public void deleteSubject(Subject02 sub) {
		// subjectList에서 sub가 몇번지에 있는지 찾기
		int index = -1; // 없는 index
		
		if(!isSubject(sub)) {
			return;
		}
		
		for(int i = 0; i < cnt; i++) {
			if(subjectList[i].getSubjectCode().equals(sub.getSubjectCode())) {
				index = i;
				break;
			}
		}
		
		if(index == -1) {
			System.out.println("선택된 강의가 없습니다.");
			return;
		}
		
		for(int i = index; i < cnt-1; i++) {
			subjectList[i] = subjectList[i+1];		
		}
		subjectList[cnt - 1] = null;
		cnt--;
		System.out.println("수강 철회가 완료되었습니다.");
		
	}
	
	
	// 개인정보를 출력하는 메서드
	public void printInfo() {
		System.out.println(studentName+"("+studentNumber+") / " + studentAge);
		System.out.println(studentPhone + " / " + studentAddress);
	}
	
	// 수강정보 확인 후 있으면 출력하는 메서드
	public void printSubjectList() {
		if(cnt == 0) {
			System.out.println("수강 중인 강의가 없습니다.");
			return;
		}
		for(int i = 0; i < cnt; i++) {
			System.out.print((i+1) + ". ");
			subjectList[i].printSubject();
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

	public Subject02[] getSubjectList() {
		return subjectList;
	}

	public void setSubjectList(Subject02[] subjectList) {
		this.subjectList = subjectList;
	}

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}
	

	@Override
	public String toString() {
		return "Student02 [studentNumber=" + studentNumber + ", studentName=" + studentName + ", studentAge="
				+ studentAge + ", studentPhone=" + studentPhone + ", studentAddress=" + studentAddress
				+ ", subjectList=" + Arrays.toString(subjectList) + "]";
	};
	
	
}
