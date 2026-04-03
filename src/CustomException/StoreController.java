package CustomException;

public class StoreController {
	
	private int totalSales = 0;
	
	public void sell(Order order) {
		Product product = order.getProduct();
		
//		if(order.getCount() > product.getStock()) {
//			throw new OutOfStockException("재고가 부족합니다.");
//		}
		
		try {
			product.decreaseStock(order.getCount());
			
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		totalSales += order.getTotalPrice();
		
	}

	public int getTotalSales() {
		return totalSales;
	}

	
}
