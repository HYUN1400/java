package day09;

public class Class01 {
	
	/*
	 * 클래스
	 * - 클래스의 구성요소: 멤버변수, 멤버메서드, 생성자
	 * - 멤버변수 생성자 메서드 순서로 구성
	 * 
	 * 클래스 - 객체를 생성하기 위한 설계도
	 * 객체 - 클래스로부터 생성된 제품
	 * 메서드 - 제품의 기능
	 * 멤버변수 - 제품의 속성 (메서드에서 필요한 값들을 저장하는 속성)
	 * 
	 * EXAMPLE)
	 * 프린트 클래스
	 * - 속성(멤버변수): 제조사, 제품명, 종류, 저장 변수들 ...
	 * - 기능(메서드): 인쇄, 복사, 스캔, 팩스 ...
	 * - 
	 * 클래스는 다른 클래스와 겹치지 않게 정의
	 * 
	 * 클래스 선언
	 * 	class 클래스명{
	 * 
	 * 	}
	 * 
	 * => public class => 파일명과 같은 이름의 클래스에게만 부여
	 * 
	 * 객체 선언 > 생성
	 * 클래스타입 객체명; => null
	 * 클래스타입 객체명 = new 클래스명(); => 
	 * 					   new 생성자();
	 * 
	 * 메서드 사용방법(static X 일반 메서드)
	 * - 같은 클래스에서 호출할 경우 => 메서드명();
	 * - 다른 클래스에서 호출할 경우 => 객체를 선언 후 객체명.메서드명();
	 * 
	 * 접근제어자
	 * - public: 모두 사용가능
	 * - protected: 나 + 패키지 + 자식클래스 사용가능 (상속 시 사용)
	 * - (default): 나 + 패키지
	 * - private: 나 
	 * 
	 * - 하나의 파일 안에 하나의 클래스만 있을 수 있는 건 아님.
	 * - 그러나 일반적으로 하나의 파일 안에 하나의 클래스를 사용.
	 * - 클래스에서 public을 붙일 수 있는 건 파일명 == 클래스명일 경우에만 가능.
	 * - 멤버변수, 메서드, 클래스 모두 접근제어자 사용
	 * - 멤버변수는 private, 메서드는 public 선언이 일반적
	 * - 멤버변수가 private라면 다른 클래스에서 접근이 불가능.
	 * - 멤버변수를 다른 클래스에서 접근 가능하도록 메서드를 만들어서 사용
	 *   (getter / setter)
	 * - getter: 가져올 때 (사용할 때)
	 * - setter: 저장할 때 (변경할 때)
	 * 
	 * 
	 */

	public static void main(String[] args) {
		
		Test t = new Test();
//		t.x = 10;
//		t.y = 20;
//		
//		int x = t.x + t.y;
//		System.out.println(x);
		
		// getter | setter 설정 후
		t.setX(10); t.setY(20);
		t.print();
		
		int x = t.getX() + t.getY();
		System.out.println(x);
		
		t.print(100, 200);
		
	}

}

// 다른 클래스 정의
class Test{
	// 멤버 변수는 초기값을 설정하지 않아도 자동으로 설정
	// 정수 => 0 | String => null
	// 생성자가 기본 초기값을 생성
	
	// 멤버 변수는 모든 내 클래스의 멤버 메서드에 공용으로 사용가능.
	// 매개변수로 전달할 필요가 없음
	// 매개변수와 멤버변수를 구분하기 위해서 내 멤버변수에는 this 키워드를 붙임
	private int x;
	private int y;

	// print 메서드
	// (x, y)
	public void print() {
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
	
	// print 메서드 오버로딩
	// x, y의 값을 받아서 그 값으로 출력하는 메서드
	public void print(int x, int y) {
		setX(x);
		setY(y);
		System.out.println("(" + this.x + ", " + this.y + ")");
	}
	
	// (getter | setter)
	// 멤버변수 이름 앞에 get / set 멤버변수의 첫글자 대문자로 변경 (camelCase)
	
	// getter
	public int getX() {
		return this.x;
	}
	public int getY() {
		return this.y;
	}
	
	// setter
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}	
}









