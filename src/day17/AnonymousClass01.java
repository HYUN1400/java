package day17;

public class AnonymousClass01 {

	public static void main(String[] args) {
		// 익명클래스(Anonymous class) : 내부 클래스의 일종
		/*
			이름이 없는 클래스
			다시 객체를 생성할 일이 없고 한번 쓰면 버려지는 객체 (일회용)
			
			- 인터페이스를 사용하여 객체를 생성할 경우
			1) 구현 메서드가 적어야함
			2) 인터페이스 구현 외의 다른 구현이 없어야함
			3) 해당 객체를 한번만 사용하는 경우
			
			- 일반적으로 메서드의 매개변수로 객체가 사용되는 케이스에서 주로 사용
		 */
		AnonymousClass01 ac = new AnonymousClass01();
		
//		TV tv = new TV();
//		tv.turnOn();
//		tv.turnOff();
//		ac.tvPower(tv);
		
		System.out.println("•─────────⋅☾  ☽⋅─────────•");
		// 익명 클래스를 사용하는 경우
		ac.tvPower(new Power() {

			@Override
			public void turnOn() {
				System.out.println("TV가 켜집니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("TV가 꺼집니다.");
			}
			
		});
		System.out.println("•─────────⋅☾  ☽⋅─────────•");
		
		
		
		
		
		
		
		
		// MAIN END
	}
	
	public void tvPower(Power p) {
		p.turnOn();
		System.out.println("TV 정상 작동 중. . .");
		p.turnOff();
	}

}

interface Power{
	void turnOn();
	void turnOff();
}

//class TV implements Power{
//
//	@Override
//	public void turnOn() {
//		System.out.println("전원이 켜집니다.");
//	}
//
//	@Override
//	public void turnOff() {
//		System.out.println("전원이 꺼집니다.");
//	}
	
//}









// END