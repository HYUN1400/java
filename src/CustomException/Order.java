package CustomException;

public class Order {
	private Product product;
	private int count;
	
	public Order() {
		
	}
	
	public Order(Product product, int count) {
		this.product = product;
		this.count = count;
	}
	
	
	public int getTotalPrice() {
		return product.getPrice() * count;
	}
	
	

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	
	
	@Override
	public String toString() {
		return "Order [product=" + product + ", count=" + count + "]";
	}
	
	
	
}
