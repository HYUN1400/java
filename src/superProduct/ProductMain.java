package superProduct;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		Product[] menu = {
				new Product("라면", 1500),
				new Product("김밥", 3000),
				new Product("사이다", 500),
				new Product("떡볶이", 3500)
		};
		
		Order[] order = new Order[5];
		int cnt=0;

		char ok = 'y';
		while(ok != 'n') {
			System.out.println("주문하시겠습니까? (y/n)");
			ok = scan.next().charAt(0);
			
			if(ok == 'n') {
				System.out.println("주문을 종료합니다.");
				break;
			}
			if(ok == 'y') {

				for(int i=0; i<menu.length; i++) {
					System.out.println((i+1)+"."+menu[i]);
				}
				
				System.out.println("메뉴를 선택해주세요>");

				int menuNo = scan.nextInt();
				
				System.out.println("수량>");

				int count = scan.nextInt();
				
				String menuName = menu[menuNo-1].getName();
				int price = menu[menuNo-1].getPrice();
				
				Order o = new Order(menuName, price, count);
				
				if(order.length == cnt) {
					Order[] tmp = new Order[order.length+3];
					System.arraycopy(order, 0, tmp, 0, order.length);
					order = tmp;
				}
				order[cnt] = o;
				cnt++;
				
				
			}else {
				System.out.println("y/n 을 선택해주세요.");
			}
			
		}
		System.out.println("--주문 내역 출력--");
		int sum = 0; // 총 지불금액
		for(int i=0; i<cnt; i++) {
			System.out.println(order[i]);
			sum += order[i].getTotal();
		}
		if(cnt == 0) {
			System.out.println("주문내역이 없습니다.");			
		}
		
		System.out.println("-----------------");
		System.out.println("총 지불금액 : "+sum);
		
				
		scan.close();

	}

}
