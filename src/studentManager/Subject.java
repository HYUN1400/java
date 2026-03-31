package studentManager;

// 과목정보 클래스 => 과목 한 개

public class Subject {
	// 멤버 변수
	private String subjectCode;
	private String subjectName;
	private String sessionHour;
	private String professor;
	private String lectureRoom;
	
	// 메서드
	
	
	// 생성자
	public Subject() { }
	
	
	public Subject(String subjectCode, String subjectName, String sessionHour, String professor, String lectureRoom) {
		this.subjectCode = subjectCode;
		this.subjectName = subjectName;
		this.sessionHour = sessionHour;
		this.professor = professor;
		this.lectureRoom = lectureRoom;
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


	public String getSessionHour() {
		return sessionHour;
	}


	public void setSessionHour(String sessionHour) {
		this.sessionHour = sessionHour;
	}


	public String getProfessor() {
		return professor;
	}


	public void setProfessor(String professor) {
		this.professor = professor;
	}


	public String getLectureRoom() {
		return lectureRoom;
	}


	public void setLectureRoom(String lectureRoom) {
		this.lectureRoom = lectureRoom;
	}


	@Override
	public String toString() {
		return "강의 코드: " + subjectCode + " | 강의명: " + subjectName + " | 강의 시수: " + sessionHour
				+ " | 담당 교수: " + professor + "| 강의실: " + lectureRoom ;
	}
		
	

}
