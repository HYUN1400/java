package day16;

import java.util.ArrayList;
import java.util.List;

public class Generics01 {

	public static void main(String[] args) {
		// 제네릭(Generics): 데이터 타입을 나중에 확정하는 기법
		/* 클래스나 메서드를 생성할 때 어떤 객체가 들어올지 확신이 없을 때
		   어떤 객체가 들어와도 처리하고 싶다면 => Generic 타입 구현
		   => 나중에 객체가 생성되어 들어올 때 타입을 확정하여 구현
		   
		   객체의 타입을 컴파일 할 때 체크가 가능하며 타입의 안정성을 해치지 않는 선에서 적당히 형변환이 가능.
		   
		   T : type, E : elements, K : key, V : value
		   
		   제네릭에서는 형변환이 존재하지 않음.
		   들어오는 타입에 대한 제한 키워드.
		   <?> : 제한 없음 (모든 타입 가능)
		   <? extends U> : U와 그 자식들만 가능
		   <? super U> : U와 그 조상들만 가능
		   
		 */
		
		Test t = new Test(); // 타입을 정해주지 않으면 object 취급
		t.setItem("generics Test");
		System.out.println(t.getItem());
		
		Test<String> t1 = new Test();
		t1.setItem("hello!");
		
		System.out.println(t1.getItem());
		
		Test<Integer> t2 = new Test();
		t2.setItem(123);
		System.out.println(t2.getItem() + 123);
		
	}

}

class Test<T>{
	
	private T item;


	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	
}

