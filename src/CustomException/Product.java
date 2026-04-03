package CustomException;

public class Product {
	// 이름, 가격, 재고
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
	
	
	public void decreaseStock(int count) {
		if(count > stock) {
			throw new OutOfStockException("재고가 부족합니다.");
		}
		
		stock -= count;
		
		System.out.println();
		
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
