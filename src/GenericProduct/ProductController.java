package GenericProduct;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
	// 메뉴 저장할 멤버 변수 list
	private List<Product<String, Integer>> menu = new ArrayList<>();
	
	// 주문 저장할 멤버변수 list
	private List<Order<String, Integer>> order = new ArrayList<>();
	
	public void addMenu() {
		// 기본 메뉴 추가
		menu.add(new Product<String, Integer>("라면", 5000));
		menu.add(new Product<String, Integer>("김밥", 4000));
		menu.add(new Product<String, Integer>("떡볶이", 5000));
		menu.add(new Product<String, Integer>("음료수", 2000));
		
	}

	public void insertMenu(Scanner scan) {
		// 사용자 메뉴 추가
		System.out.println("메뉴 > ");
		String menu = scan.next();
		System.out.println("가격 > ");
		int price = scan.nextInt();
		
		Product<String, Integer> p = new Product<String, Integer>(menu, price);
		this.menu.add(p);
		System.out.println("■■■■■■■■■■■■■■■■■ 메뉴 추가 완료");
	}
	
	public void print() {
		// 전체 메뉴 출력
		int cnt = 0;
		System.out.println("■■■■■■■■■■■■■■■■■ 전체 메뉴 출력");
		
		for(Product p: menu) {
			cnt++;
			System.out.println(cnt + ". " + p);
		}
	}
	

	public void orderPick(Scanner scan) {
		// 주문
		// 메뉴와 수량을 입력받아 menuList에서 메뉴의 가격을 찾아오기
		// order 메뉴 / 가격 / 수량 / total 값을 저장
		
		print();
		
		System.out.println();
		System.out.println("■■■■■■■■■■■■■■■■■ 주문 메뉴 선택");
		int menuNum = scan.nextInt();
		
		System.out.println("■■■■■■■■■■■■■■■■■ 수량 선택");
		int count = scan.nextInt();
		
		Product p = this.menu.get(menuNum - 1);
		Order<String, Integer> o = new Order<String, Integer>(p, count);
		this.order.add(o);
		
		System.out.println("주문 완료 🖐️");
		
	}
	
	
	public void orderPrint() {
		// 주문내역 출력
		int cnt = 0;
		int sum = 0;
		
		System.out.println("■■■■■■■■■■■■■■■■■ 주문 내역");
		for(Order o : order) {
			cnt++;
			System.out.println(cnt + ". " + o);
			sum += o.getTotal();
		}
	}
	

}
