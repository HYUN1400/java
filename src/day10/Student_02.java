package day10;

public class Student_02 {
	private String name;
	private String phone;
	private String address;
	private String birth;
	private String[] course;
	private String[] period;
	private int cnt = 0;
	
	//한번 지정하면 변하지 않을 정보 = 상수 = final
	//final => 모두 대문자
	
	private final String COMPANY = "KOREAIT";
	private String branch;
	
	// 생성자
	public Student_02() {}
	
	public Student_02(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	
	// 메서드
	public void printInfo() {
		System.out.println("--* 학생 정보 *--");
		System.out.println(name + "(" + birth + ")" + phone);
	}
	
	public void printCompany() {
		System.out.println("--* 학원 정보 *--");
		System.out.println(COMPANY + "(" + branch + ")");
	}
	
	public void printCourse() {
		System.out.println("--* 수강 과목 *--");
		if(cnt == 0) {
			System.out.println("수강 과목이 없습니다.");
			return;
		}
		for(int i = 0; i < cnt; i++) {
			System.out.println(course[i] + "[" + period[i] + "]");
		}
	}
	
	
	public void insertCourse(String course, String period) {
		if(cnt == course.length()) {
			String courseTemp[] = new String[this.course.length + 3];
			String periodTemp[] = new String[this.period.length + 3];
			
			System.arraycopy(course, 0, courseTemp, 0, this.course.length);
			System.arraycopy(period, 0, periodTemp, 0, this.period.length);
			
			this.course = courseTemp;
			this.period = periodTemp;
		}
		this.course[cnt] = course;
		this.period[cnt] = period;
		cnt++;
	}
	
	
	// Getter Setter
	
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

	// 데이터 확인용
	@Override
	public String toString() {
		return "Student_02 [name=" + name + ", phone=" + phone + ", address=" + address + ", birth=" + birth
				+ ", COMPANY=" + COMPANY + ", branch=" + branch + "]";
	}
	
	
	
}
