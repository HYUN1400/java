package studentManager03;

import java.util.Objects;

public class Subject02 {
	private String subjectCode;
	private String subjectName;
	private String subjectTime;
	private String subjectProfessor;
	private String subjectRoom;
	
	
	// constructor
	
	public Subject02() { }
	
	// equals를 하기 위한 생성자
	public Subject02(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public Subject02(String subjectCode, String subjectName, String subjectTime, String subjectProfessor,
			String subjectRoom) {
		super();
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.subjectTime = subjectTime;
		this.subjectProfessor = subjectProfessor;
		this.subjectRoom = subjectRoom;
	}
	
	public Subject02(String subjectCode, String subjectName) {
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.subjectTime = "3";
		this.subjectProfessor = "A교수";
		this.subjectRoom = "A강의장";
	}
	
	
	// method
	
	public void printSubject() {
		System.out.println(subjectName + "(" + subjectCode + ")");
	}
	
	
	
	
	// getter | setter

	public String getSubjectCode() {
		return subjectCode;
	}

	public void setSubjectCode(String subjectCode) {
		this.subjectCode = subjectCode;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public String getSubjectTime() {
		return subjectTime;
	}

	public void setSubjectTime(String subjectTime) {
		this.subjectTime = subjectTime;
	}

	public String getSubjectProfessor() {
		return subjectProfessor;
	}

	public void setSubjectProfessor(String subjectProfessor) {
		this.subjectProfessor = subjectProfessor;
	}

	public String getSubjectRoom() {
		return subjectRoom;
	}

	public void setSubjectRoom(String subjectRoom) {
		this.subjectRoom = subjectRoom;
	}

	
	@Override
	public String toString() {
		return "Subject02 [subjectCode=" + subjectCode + ", subjectName=" + subjectName + ", subjectTime=" + subjectTime
				+ ", subjectProfessor=" + subjectProfessor + ", subjectRoom=" + subjectRoom + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(subjectCode);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Subject02 other = (Subject02) obj;
		return Objects.equals(subjectCode, other.subjectCode);
	}
	

}


















