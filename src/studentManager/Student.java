package studentManager;

import java.util.Arrays;

// 학생정보 클래스 => 학생 1명

public class Student {
	// 멤버 변수
	private String stdnumber;
	private String name;
	private String age;
	private String phone;
	private String address;
	private Subject[] subject = new Subject[5]; 
	private int subCount = 0;
	
	// 메서드

	public void addSubject(Subject subject) {
	    if(subCount >= this.subject.length) {
	    	System.out.println("수강 가능한 학점이 없습니다. 수강 정정을 시도해주세요. 🥲");
	    } else {
	    	this.subject[subCount] = subject;
	        subCount++;
	        System.out.println("■■■■ ○ 수강신청이 완료되었습니다. ○ ■■■■");
	    }
	}
	
	public void removeSubject(int index) {
        if(index < 0 || index >= subCount) {
            System.out.println("잘못된 과목 선택입니다.");
            return;
        }

        for(int i = index; i < subCount - 1; i++) {
            subject[i] = subject[i + 1];
        }
        subject[subCount - 1] = null; 
        subCount--;
    }

	
	// 생성자
	public Student(String stdnumber, String name, String age, String phone, String address) {
		this.stdnumber = stdnumber;
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.address = address;
	}
	
	
	// getter | setter 

	public String getStdnumber() {
		return stdnumber;
	}

	public void setStdnumber(String stdnumber) {
		this.stdnumber = stdnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
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

	public Subject[] getSubject() {
		return subject;
	}

	public void setSubject(Subject[] subject) {
		this.subject = subject;
	}

	public int getSubCount() {
		return subCount;
	}

	public void setSubCount(int subCount) {
		this.subCount = subCount;
	}

	
	
	@Override
	public String toString() {
		return "학번: " + stdnumber + " | 이름: " + name + " | 나이: " + age + " | 전화번호: " + phone + " | 주소: "
				+ address ;
	}	
	
	
	
	
}
