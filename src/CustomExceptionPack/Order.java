package CustomExceptionPack;

public class Order {
	private Product product;
	private int purchase;
	
	public Order() {
		
	}
	
	public Order(Product product, int purchase) {
		this.product = product;
		this.purchase = purchase;
	}


	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getPurchase() {
		return purchase;
	}

	public void setPurchase(int purchase) {
		this.purchase = purchase;
	}

	
}
