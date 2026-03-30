package day11;

public class Class04 {

	public static void main(String[] args) {
		/*
		 * 객체 생성 시 값을 초기화 하는 방법
		 * - 기본값, 명시적 초기값, 초기화 블럭, 생성자
		 * 1) 기본값: 멤버변수를 선언할 때 기본적으로 주는 값 (null, 0, false...)
		 * 2) 명시적 초기값: 기본값을 직접 명시해주는 값 (brand = "SAMSUNG")
		 * 3) 초기화 블럭: {초기값 지정} => 멤버 변수의 초기화
		 * 4) 생성자: 객체를 생성할 때 호출하여 초기값을 지정 => new 객체 생성 시 딱 1번만 호출 
		 * 
		 * 초기값 우선순위
		 * 생성자 > 초기화 블럭 > 명시적 초기값 > 기본값
		 */
		
		Student s = new Student();
		Student s1 = new Student("종로", "홍길동", 25);
		
		System.out.println(s);
		System.out.println(s1);
		
	}

}

class Student {
	private String gigum = "강남"; //명시적 초기값
	private String name; // null
	private int age; //0
	
	{
		//초기화 블럭 영역
		this.name = "undefined";
		this.age = 20;
	}
	
	// 생성자
	public Student() {
		
	}
	
	public Student(String gigum, String name, int age) {
		this.gigum = gigum;
		this.name = name;
		this.age = age;
	}
	
	
	// getter | setter

	public String getGigum() {
		return gigum;
	}

	public void setGigum(String gigum) {
		this.gigum = gigum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [gigum=" + gigum + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
}