package day11;

import java.util.Arrays;
import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// 키오스크
		/*
		 * 상품(Product) class : 상품, 가격(판매금액)
		 * 주문(Order) class : 상품, 개수, 가격(판매금액), 총 금액
		 * 
		 * 주문 출력 (하나의 주문에 대한 출력)
		 * 총 지불 금액
		 * 
		 */
		
		/*
		 * 1) 전체 메뉴 보여주기
		 * 2) 주문 > 상품, 수량
		 * 3) 반복 주문 가능 => 종료 키워드를 생성 
		 * 4) 주문이 완료되었습니다 => 전체 주문 내역 / 총 지불 금액
		 * 
		 * ex)
		 * 김밥 2 3000 6000원
		 * 라면 2 1500 3000원
		 * 사이다 2 500 1000원
		 * --------------------
		 * 총 지불금액   10000
		 */
		
		Scanner scan = new Scanner(System.in);
		
		Order[] orders = new Order[3];
		int orderCount = 0;
		
		Product[] product = {
				new Product("라면", 1500),
				new Product("김밥", 3000),
				new Product("사이다", 500),
				new Product("떡볶이", 3500)
		};
		
		System.out.println("-------* MENU *-------");
		
		int index = 0;
		for(int i = 0; i < product.length; i++) {
			index ++;
			System.out.print(index + "\t");
			product[i].printMenu();
		}		
		System.out.println("0" + "\t" + "확인");
		
		
		int select;
		
		do {
		    System.out.println("메뉴를 선택해주세요. 👉");
		    select = scan.nextInt();
		    
		    if(select == 0) {
		        break;
		    }

		    if(select < 1 || select > product.length) {
		        System.out.println("잘못된 메뉴입니다.");
		        continue;
		    }

		    System.out.println("주문 수량을 입력해주세요. 👉");
		    int count = scan.nextInt();

		    Order order = new Order(product[select-1], count);
		    orders[orderCount++] = order;
		    
		    if(orderCount == orders.length) {
		    	Order newOrder[] = new Order[orders.length + 3];
		    	System.arraycopy(orders, 0, newOrder, 0, orderCount);
		    	orders = newOrder;
		    }

		} while(true);


		System.out.println("-------* 주문 내역 *-------");

		int total = 0;

		for(int i = 0; i < orderCount; i++) {
		    orders[i].printOrder();
		    total += orders[i].getTotal();
		}

		System.out.println("*-------------------------*");
		System.out.println("총 지불금액 : " + total);
		
		scan.close();
		
		// MAIN END
	}

}
