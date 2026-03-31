package day12;

public class Abstract01 {

	public static void main(String[] args) {
		
//		Dog d = new Dog("힝거", "보더콜리");
//		d.printInfo();
//		d.howl();
//		d.eating("고기");
		
		Cat c = new Cat("냄비", "치즈고양이");
		c.printInfo();
		c.howl("김냄비펌피럽");
		c.eating("츄르");
		
		// Animal a = new Animal(); => 추상 클래스는 객체 생성 불가능
		
	}

}

class Cat extends Animal{
	private String eat;
	
	public Cat(String name, String category) {
		this.name = name;
		this.category = category;
	}

	@Override
	void howl(String howl) {
		System.out.println("--------" + name + "의 울음소리: " + howl + "-------*");	
	}

	@Override
	void eating(String eat) {
		this.eat = eat;
		System.out.println("--------" + name + "은/는 " + eat +"를 좋아해요.-------*");		
	}
}

//class Dog extends Animal{
//	private String eat;
//	
//	public Dog(String name, String category) {
//		super.name = name;
//		super.category = category;
//	}
//
//	@Override
//	void howl() {
//		System.out.println("--------" + name + "의 울음소리-------*");
//	}
//
//	@Override
//	void eating(String eat) {
//		this.eat = eat;
//		System.out.println("--------" + name + "은 " + eat +"를 좋아해요.-------*");
//	}	
//}


// abstract
abstract class Animal{
	protected String name;
	protected String category;
	
	public void printInfo() {
		System.out.println("이름: " + name + "(" + category + ")");
	}
	
	// 추상 메서드
	abstract void howl(String howl);	
	abstract void eating(String eat);
	
}