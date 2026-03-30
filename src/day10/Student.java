package day10;

import java.util.Arrays;

public class Student {
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
	
	// 수강과목을 추가하는 메서드 
	// => 1번 호출될 때마다 1개의 수강과목 / 기간이 추가
	
	// 학생정보 : 이름, 전화번호, 주소, 생년월일
	private String name;
	private String phone;
	private String address;
	private String birth;
	
	// 학원정보 : 학원명, 지점
	// 한번 지정하면 변하지 않을 정보 = 상수 = final
	// 회사명 / 브랜드 / 로고 => 변하지 않는 값 (상수) => final
	// final => 모두 대문자
	private final String COMPANY = "KOREAIT";
	private String branch;
	
	// 수강정보 과목[5]/기간[5]
	private String[] course = new String[5];
	private String[] period = new String[5];
	
	// 멤버변수에 배열이 존재한다면.. index 변수를 사용하는 것이 편리
	private int cnt;
	
	// 생성자
	public Student() {}

	public Student(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	public Student(String name, String phone, String address, String birth, String branch) {
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.birth = birth;
		this.branch = branch;
	}
	
	// 출력메서드
	public void printInfo() {
		// 학생의 기본정보만 출력
		System.out.println("--학생정보--");
		System.out.println(name+"("+birth+") "+ phone);
	}
	public void printCompany() {
		System.out.println(COMPANY+"("+branch+")");
	}
	public void printCourse() {
		// 수강과목이 없다면...
		if(cnt==0) {
			System.out.println("수강과목이 없습니다.");
			return;
		}
		// cnt 까지만 출력
		for(int i=0; i<cnt; i++) {
			System.out.println(course[i]+ "["+period[i]+"]");
		}
	}
	
	// 수강과목을 추가하는 메서드 
	// => 1번 호출될 때마다 1개의 수강과목 / 기간이 추가
	public void insertCourse(String course, String period) {
		// 배열이 다 차면 배열을 증가
		if(cnt == this.course.length) {
			// 배열복사 arraycopy
			String courseTemp [] = new String[this.course.length+3];
			String periodTemp [] = new String[this.period.length+3];
			
			// arraycopy
			System.arraycopy(this.course, 0, courseTemp, 0, this.course.length);
			System.arraycopy(this.period, 0, periodTemp, 0, this.period.length);
			
			// 기존 배열의 참조변수에 객체를 덮어쓰기
			this.course = courseTemp;
			this.period = periodTemp;
			
		}
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++;
	}
	
	
	

	// getter/setter
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

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String[] getCourse() {
		return course;
	}

	public void setCourse(String[] course) {
		this.course = course;
	}

	public String[] getPeriod() {
		return period;
	}

	public void setPeriod(String[] period) {
		this.period = period;
	}

	public String getCOMPANY() {
		return COMPANY;
	}	
	

	public int getCnt() {
		return cnt;
	}

	public void setCnt(int cnt) {
		this.cnt = cnt;
	}

	// 데이터 확인용
	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", address=" + address + ", birth=" + birth + ", COMPANY="
				+ COMPANY + ", branch=" + branch + ", course=" + Arrays.toString(course) + ", period="
				+ Arrays.toString(period) + ", cnt=" + cnt + "]";
	}
	
}