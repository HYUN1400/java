package CustomExceptionPack;

public class Product {
	private String name;
	private int price;
	private int stock;
	
	
	
	
	public Product() {
		
	}
	
	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	
	public void calc(Order order) {
	    int purchase = order.getPurchase();

	    if (purchase > stock) {
	        throw new OutOfStockException("재고가 부족합니다.");
	    }

	    int stocks = stock -= purchase;
	    int priceResult = price * purchase; 
	    
	    System.out.println(order.getProduct().getName() + "를/을 " + purchase + "개 구매했습니다. 총 가격은 " + priceResult + "원(₩)이며, 남은 수량은 " + stocks + "개 입니다.");
	}
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
}
