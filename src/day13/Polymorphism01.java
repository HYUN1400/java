package day13;

import java.util.Arrays;

public class Polymorphism01 {

	public static void main(String[] args) {
		/* 다형성(Polymorphism) - 다양한 객체로 형변환이 가능
		 * - 하나의 클래스(부모객체)가 여러 자료형(자식객체)으로 구현되어 실행되는 형태에서 사용
		 * - 코드는 같지만 들어오는 객체에 따라 다른 실행결과를 얻어야 할 때 사용 가능
		 * - 다형성을 잘 활용하면 유연하고, 확장성 있는, 유지보수가 편리한 코드를 만들 수 있음.
		 */
		
		// 각각의 객체를 생성해서 각자의 move 메서드를 호출
		
		Lion l = new Lion();
		l.move();
		
		Bears b = new Bears();
		b.move();
		b.walk();
		
		
		Tiger t = new Tiger();
		t.move();
		t.hunt();
		
		Eagle e = new Eagle();
		e.move();
		e.flying();
		
		Human h = new Human();
		h.move();
		h.readBook();
		
		Animal a = new Animal();
		a.move();
		
		// 조상 타입으로 자식 객체를 생성하는 것이 가능
		System.out.println("■■■■■■■■■■■■■■■■■■■■  부모타입으로 자식 객체를 생성");
		// 조상 객체에서 상속받은 자식객체만 사용가능.
		// 조상 타입으로 자식 객체를 생성할 경우 자식의 고유값은 사용이 불가함.
		Animal b1 = new Bears();
		b1.move();
		
		Animal t1 = new Tiger();
		t1.move();
		
		Animal e1 = new Eagle();
		e1.move();
		
		Animal h1 = new Human();
		h1.move();
		
		// Animal 객체의 배열에 자식 객체를 추가할 수 있음
		
		Animal aniList[] = new Animal[5];
		int cnt = 0;
		aniList[cnt] = b1; cnt++;
		aniList[cnt] = t1; cnt++;
		aniList[cnt] = e1; cnt++;
		aniList[cnt] = h1; cnt++;
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■ aniList 배열 출력");
		for(int i = 0; i<cnt; i++) {
			aniList[i].move();
		}
		// 자식 객체가 가지고 있는 고유값을 사용하려면 자신의 객체로 다운캐스팅해야 사용 가능.
		Bears b2 = (Bears)aniList[0]; //다운캐스팅
		b2.walk();
		
		Tiger t2 = (Tiger)aniList[1];
		t2.hunt();
		
		System.out.println(aniList[1] instanceof Tiger);
		
		for(int i = 0; i < cnt; i++) {
			if(aniList[i] instanceof Bears) {
				((Bears)aniList[i]).walk();
			} else if(aniList[i] instanceof Tiger) {
				((Tiger)aniList[i]).hunt();
			} else if(aniList[i] instanceof Eagle) {
				((Eagle)aniList[i]).flying();
			} else {
				((Human)aniList[i]).readBook();
			}
		}
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■ 다형성 메서드 활용");
		Polymorphism01 p1 = new Polymorphism01();
		p1.moveAnimal(t2);
		
		for(int i = 0; i<cnt; i++) {
			p1.moveAnimal(aniList[i]);
		}
		
		
		
		// Animal l1 = new Lion(); // 상속을 받지 않아 불가능
		
		// MAIN END
	}
	
	// 각 객체의 move() 실행해주는 메서드
	public void moveAnimal(Human human) {
		human.move();
	}
	
	public void moveAnimal(Bears bears) {
		bears.move();
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

}

class Lion {
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("삼성 라이온즈");
	}
	
}


class Bears extends Animal {

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("두산 베어스");
	}
	
	public void walk() {
		System.out.println("베어스 파크");
	}
	
}

class Tiger extends Animal {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("기아 타이거즈");
	}
	
	public void hunt() {
		System.out.println("챔피언스 필드");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("한화 이글스");
	}
	
	public void flying() {
		System.out.println("이글스 파크");
	}
	
}

class Human extends Animal {
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("키움 히어로즈");
	}
	
	public void readBook() {
		System.out.println("고척 스카이돔");
	}
	
}



class Animal {
	public void move() {
		System.out.println("2026-04-01 18:30 KBO 리그 2차전");
	}
}













