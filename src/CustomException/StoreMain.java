package CustomException;

public class StoreMain {

	public static void main(String[] args) {
		Product apple = new Product("사과", 1000, 10);
		
		StoreController sc = new StoreController();
		
		Order order1 = new Order(apple, 20);
		
		sc.sell(order1);
		
		System.out.println("총매출: " + sc.getTotalSales());
		
	}

}
