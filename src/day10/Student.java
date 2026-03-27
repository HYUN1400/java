package day10;

import java.util.Scanner;

public class Student {
	// 멤버변수
	private String name; // 학생 이름
	private String phone; // 학생 전화번호
	private String address; // 학생 주소
	private String birth; // 학생 생년월일
	private String academyName; // 학원명
	private String academyAdd; // 지점
	private String[] subjects; // 수강과목
	private String[] since; // 기간
	private int index = 0;
	
	// 생성자
	public Student() {
	    academyName = "KOREAIT";
	    subjects = new String[5];
	    since = new String[5];
	}
	
	public Student(
			String name, 
			String phone, 
			String address, 
			String birth,
			String academyAdd
			) {
		setName(name);
		setPhone(phone);
		setAddress(address);
		setBirth(birth);
		academyName = "Stark Industries";
		setAcademyAdd(academyAdd);
		subjects = new String[5];
		since = new String[5];
	}

	
	
	// 메서드
	
	/* 프린트 */
	public String toString(){
	    return  name + "\t" 
	            + phone + "\t" 
	            + address + "\t"
	            + birth + "\n"
	            + academyName + "\t"
	            + academyAdd;
	}
	
	/* 수강과목을 추가하는 메서드 */
	/* 1번 호출 될 때마다 1개의 수강과목 / 기간이 추가 */
	
	public void register(Scanner scan) {
	    subjects[index] = scan.nextLine();
	    since[index] = scan.nextLine();

	    index++;

	    if(index == subjects.length) {
	        String[] newSub = new String[subjects.length + 2];
	        String[] newSince = new String[since.length + 2];

	        System.arraycopy(subjects, 0, newSub, 0, subjects.length);
	        System.arraycopy(since, 0, newSince, 0, since.length);

	        subjects = newSub;
	        since = newSince;
	    }
	}
	
	
	
	// getter | setter
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getAcademyName() {
		return academyName;
	}

	public void setAcademyName(String academyName) {
		this.academyName = academyName;
	}

	public String getAcademyAdd() {
		return academyAdd;
	}

	public void setAcademyAdd(String academyAdd) {
		this.academyAdd = academyAdd;
	}

	public String[] getSubjects() {
		return subjects;
	}

	public void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}

	public String[] getSince() {
		return since;
	}

	public void setSince(String[] since) {
		this.since = since;
	}
	
}
