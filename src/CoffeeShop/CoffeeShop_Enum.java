package CoffeeShop;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop_Enum {

	public static void main(String[] args) {
		// 커피숍 메뉴(가격)을 enum 클래스로 생성
		// 주문 클래스 커피에 대한 메뉴(enum 클래스), 수량, 가격 => 출력
		// 메인에서 커피메뉴 주문 => 출력
		
		List<Order> orderList = new ArrayList<>();
		
		System.out.println("•─────────⋅☾ MENU ☽⋅─────────•");		
		for(CoffeeShop menu: CoffeeShop.values()) {
			System.out.println(menu + "(" + menu.getPrice() + ")");
		}
		
		
		System.out.println();
		System.out.println("•─────────⋅☾ 주문서 ☽⋅─────────•");
		Order o1 = new Order(CoffeeShop.말차라떼, Size.LARGE, Option.SHOT, 2);
		Order o2 = new Order(CoffeeShop.망고바나나, Size.SMALL, Option.NON_OPTION, 1);
		Order o3 = new Order(CoffeeShop.에스프레소, Size.MEDIUM, Option.WHIPEED_CREAM, 4);
		
		orderList.add(o1);
		orderList.add(o2);
		orderList.add(o3);	
		
//		System.out.println(o1);
//		System.out.println(" => 총 지불 금액: " + o1.allPrice());
		
		orderList.stream().forEach(System.out::println);
		
		int sum = orderList.stream().mapToInt(n -> n.allPrice()).sum();
		
		System.out.println("=> 총 지불 금액: " + sum);
		
		
	}

}
