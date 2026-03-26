package day09;

public class Class03 {

	public static void main(String[] args) {
		
		Car c = new Car(); // 기본 생성자로 생성
		c.setName("카니발");
		c.setYear("2026");
		
		c.power();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();
		c.speedUp();

		Car c2 = new Car("아우디", "2026");

		
	}

}

class Car {
	/* 시동, 속도, 차종, 연식 */

	// 멤버변수 
	private String name;
	private String year;
	private int speed; // 속도
	private boolean power; // 시동
	
	// 생성자
	/* 객체를 생성할 때 (new) 초기값을 지정해주는 역할
	 * 기본 생성자: 컴파일러가 컴파일 시 자동으로 제공
	 * - 기본 생성자를 직접 만들 수 있다.
	 * - 다른 생성자가 존재하면 자동으로 주지 않음.
	 * - 생성자는 여러개 생성 가능(생성자 오버로딩) 
	 * - 생성자 오버로딩 조건: 매개 변수의 개수가 다르거나, 타입이 다르면 OK
	 * - 생성자를 만들 때 꼭 기본 생성자와 같이 생성함.
	 * public 클래스명 (매개변수){
	 * 		멤버 변수 값을 설정 
	 * }
	 * - 생성자는 리턴 타입이 없는 메서드와 같은 형태
	 * - 이름은 반드시 클래스명을 따름
	 */
	
	public Car() {} // 기본 생성자
	public Car(String name, String year) {
		this.name = name;
		this.year = year;
	}
	
	
	// 메서드
	// 1) 시동을 켜고 끄는 메서드
	// 꺼짐 상태 => 켜짐 | 켜짐 상태 => 꺼짐
	public void power() {
	    if(speed == 0) {
	    	this.power = !this.power;
	    } else {
	    	System.out.println("ERROR");
	    }
	}
	
	// 2) 출력 메서드
	// (OFF / ON) / speed
	public void print() {
	    String status = this.power ? "ON" : "OFF";
	    System.out.println("시동: " + status + " | 속도: " + this.speed + "km/h");
	}
	
	// 3) speedUP (+20)
	public void speedUp() {
		if(this.power && this.speed < 200) {			
			this.speed += 20;
			print();
		}
	}
	
	// 4) speedDown (-20)
	public void speedDown() {
		if(this.power && this.speed > 0) {
			this.speed -= 20;
			print();
		}
	}
	
	
	
	// getter | setter
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getYear() {
		return this.year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	public int getSpeed() {
		return this.speed;
	}
	
	
	public boolean isPower() {
		return this.power;
	}
}
