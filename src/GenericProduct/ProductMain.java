package GenericProduct;

import java.util.Scanner;

public class ProductMain {

	public static void main(String[] args) {
		// Product class => Generic 타입으로 생성
		// main menu
		// 1) 메뉴 추가 2) 메뉴 보기 3) 제품 주문 4) 주문내역 보기 5) 종료
		
		ProductController pc = new ProductController();
		
		Scanner scan = new Scanner(System.in);
		int select = 1;
		
		pc.addMenu();
		
		System.out.println("■■■■■■■■■■ MENU ■■■■■■■■■■");
		System.out.println("1) 메뉴 추가 2) 메뉴 보기 3) 제품 주문 4) 주문내역 보기 5) 종료");
		
		do {
			System.out.println("■■■■■■■■■■ 메뉴를 선택해주세요 >");
			select = scan.nextInt();
			
			switch(select) {
			case 1: pc.insertMenu(scan); break;
			case 2: pc.print(); break;
			case 3: pc.orderPick(scan); break;
			case 4: pc.orderPrint(); break;
			case 5: System.out.println("종료합니다."); break;
			default: System.out.println("잘못된 메뉴입니다."); break;
			}
			
		}while(select != 5);
		
		
		
		scan.close();
	}

}
