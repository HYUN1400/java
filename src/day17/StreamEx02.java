package day17;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamEx02 {

	public static void main(String[] args) {
		// 여행 비용 구하기
		/*
			Customer 클래스
			이름, 나이, 비용
			
			여행비용 15세 이상은 100, 15세 미만은 80
			
			Customer List 5명 => 패키지 여행
			1) 비용 계산 => 총 비용 출력
			2) 고객 명단 출력 => 이름 순
			3) 20세 이상인 고객 명단 출력 => 나이 순
			
			예) 
			이름: 신형만	나이: 40	비용: 100
			이름: 봉미선	나이: 38	비용: 100
			이름: 짱구		나이: 7		비용: 80
			이름: 짱아		나이: 3		비용: 80
			이름: 흰둥이	나이: 10	비용: 80
			
			총 여행 경비: OOO 원
			
		 */
		
		List<Customer> list = new ArrayList<>();
		
		list.add(new Customer("강민호", (int)(Math.random()*30)+5));
		list.add(new Customer("구자욱", (int)(Math.random()*30)+5));
		list.add(new Customer("디아즈", (int)(Math.random()*30)+5));
		list.add(new Customer("블레오", (int)(Math.random()*30)+5));
		list.add(new Customer("라온", (int)(Math.random()*30)+5));
		
		
		System.out.println("•─────────⋅☾ 고객 명단 ☽⋅─────────•");
		list.stream().sorted(new Comparator<Customer>() {

			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getName().compareTo(o2.getName());
			}			
		}).forEach(n -> System.out.println(n));
		
		System.out.println();
		
		System.out.println("•─────────⋅☾ 총 비용 ☽⋅─────────•");
		int sum = list.stream()
				.mapToInt(n -> n.getExpense())
				.sum();
		System.out.println("총 여행 경비 : " + sum + "(만) 원");
		
		System.out.println();
		
		System.out.println("•─────────⋅☾ 20세 이상 ☽⋅─────────•");
		list.stream()
			.filter(n -> n.getAge() >= 20)
			.forEach(n -> System.out.println(n));
		
		
	}

}

class Customer{
	private String name;
	private int age;
	private int expense;
	
	
	public Customer() {
		
	}
	
	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
		
		if(this.age >= 15) {
			this.expense = 100;
		} else {
			this.expense = 80;
		}
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
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
	@Override
	public String toString() {
		return "· 이름: " + name + "\t · 나이 : " + age + "\t· 비용 : " + expense;
	}
	
	
}
