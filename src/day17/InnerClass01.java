package day17;

public class InnerClass01 {

	public static void main(String[] args) {
		// innerClass : 내부 클래스
		
		/*	클래스 내부에 선언한 클래스
		 	- 외부클래스가 사용하기 위해 직접 선언하는 경우가 많으며, 다른 클래스에서 해당 클래스를 사용하지 않을 때 (전용 클래스)
		 	- 중첩 클래스 라고도 함.
		 	
		 	내부적으로 사용할 용도이기 때문에 클래스를 private으로 선언하는 것을 권장
		 	내부 클래스는 외부 클래스가 생성 된 후 생성
		 	private이 아닌 내부 클래스는 외부에서 접근이 가능.
		 	
		 	
		 */
		
		Test outClass = new Test();
		outClass.usingClass();
		
		
		System.out.println();
		outClass.getInClass().innerTest();
		
		System.out.println();
		// innerClass에 직접 접근
		Test.TestInner inClass = outClass.new TestInner();
		inClass.innerTest();
		
		
		
		
		
		
		// MAIN END
		
	}

}

class Test{
	private int num = 10;
	private static int sNum = 20;
	private TestInner inClass;
	
	public Test() { // test 클래스의 생성자
		// 내부 클래스의 객체를 생성
		inClass = new TestInner();
	}
	
	class TestInner{
		// 내부 클래스
		int innerNum = 100;
//		static int ineerSNum = 200; => static 생성 불가
		
		void innerTest() {
			System.out.println("testClass num : " + num);
			System.out.println("testClass sNum : " + sNum);
			System.out.println("innerTest innerNum : " + innerNum );
			
//		void test2() {
//			구조 상 메서드 안의 메서드는 불가	
//		}
			
		}
	}
	
	public void usingClass() {
		inClass.innerTest();
	}
	
	

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public static int getsNum() {
		return sNum;
	}

	public static void setsNum(int sNum) {
		Test.sNum = sNum;
	}

	public TestInner getInClass() {
		return inClass;
	}

	public void setInClass(TestInner inClass) {
		this.inClass = inClass;
	}

}
	













