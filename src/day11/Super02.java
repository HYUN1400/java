package day11;

public class Super02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog("힝거", "포메라니안");
		d.printInfo();
		d.howl();
		
		System.out.println("------------------------*");
		
		Cat c = new Cat("로키", "봄베이");
		c.printInfo();
		c.howl();
		
		System.out.println("------------------------*");
		
		Tiger t = new Tiger("파이", "뱅갈호랑이");
		t.printInfo();
		t.howl();
		
		// MAIN END
	}

}

class Dog extends Animal {
	public Dog(String name, String species) {
		// 부모 생성자를 호출 super()
		super(name, species);
		
//		super.setName(name);
//		super.setSpecies(species);
			
	}

	@Override
	public void howl() {
		// 부모의 출력 메서드 내용
		super.howl();
		System.out.println("bow-wow 🐕");
	}
}

class Cat extends Animal {
	public Cat(String name, String species) {
		super(name, species);
	}
	public void howl() {
		super.howl();
		System.out.println("meow 🐈‍⬛");
	}
}

class Tiger extends Animal {
	public Tiger(String name, String species) {
		super(name, species);
	}
	public void howl() {
		super.howl();
		System.out.println("Grrrr 🐅");
	}
}


class Animal{
	// 부모 클래스
	private String name; // 이름
	private String species; // 종
	
	// 생성자
	public Animal() {}
	public Animal(String name, String species) {
		this.name = name;
		this.species = species;
	}
	
	// 출력 메서드
	public void printInfo() {
		System.out.println("이름: " + name + "(" + species + ")");
	}
	
	// 울음소리 출력 메서드
	public void howl() {
		System.out.println("---*" + name + "의 울음소리*---");
	}
	
	
	// getter | setter
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	
	
	
	//Animal END
}
