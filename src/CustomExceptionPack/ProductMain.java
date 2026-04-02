package CustomExceptionPack;

public class ProductMain {

	public static void main(String[] args) {
		/*
		 	Product - 판매물품 클래스
			이름, 가격, 재고
			- 메서드로 throw new 발생 => 주문량에 따라 재고가 부족하면 예외 발생 => 재고부족 안내
			주문량 => 매개변수
			
			
			Order - 구매 클래스
			이름, 수량
			
			사용자지정 Exception 클래스 생성
			OutOfStockException
		 */
		
		
		Product[] products = {
				new Product("사과", 1000, 10),
				new Product("오렌지", 1500, 10),
				new Product("샤인머스켓", 2200, 10),
				new Product("방울토마토", 800, 10),
				new Product("씨없는 청포도", 900, 10),
				new Product("귤", 2000, 10),
				new Product("딸기", 1100, 10),
				new Product("바나나", 1500, 10),
				new Product("수박", 43000, 10),
				new Product("복숭아", 17000, 10)
		};
		
	
		try {			
			int randomProduct = (int)(Math.random()*products.length);
			int randomPurchase = (int)(Math.random()*15+1);
			
			Order order = new Order(products[randomProduct], randomPurchase);
			
			products[randomProduct].calc(order);

			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
