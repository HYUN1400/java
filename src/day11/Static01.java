package day11;

public class Static01 {

	public static void main(String[] args) {
		/*
		 * static: 전역변수 / 전역 메서드 (클래스변수 / 클래스메서드)
		 * 모든 객체에 공통으로 사용이 가능.
		 * 프로그램이 실행되면서 바로 메모리에 할당 ~ 프로그램이 종료될 때 소멸
		 * => 객체 생성 없이 클래스가 만들어지면서 생성 됨
		 * => 클래스 만으로 호출 가능
		 * => 클래스명.변수명 / 클래스명.메서드명 => 사용 가능
		 * => 객체 생성 후 사용해도 무관하나 그럴 필요가 없음.
		 * => 클래스의 멤버 변수, 메서드는 하나의 멤버 변수가 모든 객체에 공유되어야 할 때 사용.
		 * 
		 * static이 붙지 않은 메서드/멤버변수는 객체(인스턴스)의 메서드 / 객체의 멤버변수라고 불림.
		 * - 각 객체를 통해 생성되고, 사용된다.
		 * - 객체를 생성하지 않으면 (new) 생성되지 않고, 사용할 수 없다.
		 * - 객체명.변수명 / 객체명.클래스명 => 사용 가능
		 * - 각 객체마다 독립적으로 존재
		 * 
		 *  클래스의 멤버와 객체의 변수는 생성되는 시점이 다르기 때문에 메서드와 멤버변수의 가용한 시점이 다름.
		 *  => 객체의 멤버는 클래스가 생성되고, 객체 생성 후 사용 가능
		 *  => 클래스의 멤버는 클래스가 생성되면 바로 사용 가능
		 *  
		 *  클래스 멤버는 클래스 멤버변수 / 클래스 멤버메서드 둘 다 사용 가능.
		 *  객체 멤버는 클래스 멤버에서 사용이 불가능.
		 *  static이 붙은 메서드에서 일반 메서드를 호출 불가능. (사용하고 싶다면 객체 생성)
		 * 
		 */
		
//		ProductMain.main(args);
		
		TV t = new TV();
		t.printBrand();
		t.printBrand02(); // 가능은 하지만 잘 안씀
		
		TV.printBrand02(); // 일반적으로 사용하는 형태
		
		
	}

}

class TV{
	private boolean power;
	static final String BRAND = "SANSUNG";
	
	public void printBrand() {
		// 객체의 메서드 안 => static(클래스 변수를 호출)
		System.out.println("Brand: " + BRAND); // static
		System.out.println(power); // 일반 멤버변수
	}
	
	public static void printBrand02() {
		TV tv = new TV();
		// static (클래스 메서드 안) => 객체 변수 호출
		System.out.println("Brand: " + BRAND);
		System.out.println(tv.power); // 객체 생성 전에는 불가
	}
}
