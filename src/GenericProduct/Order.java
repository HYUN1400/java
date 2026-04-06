package GenericProduct;

public class Order<K, V extends Number> extends Product<K, V> {
	private int count;
	private int total;

	public Order(K menu, V price, int count) {
		super(menu, price);
		this.count = count;
		totalPrice();
	}
	
	public Order(Product<K,V> p, int count) {
		super(p.getMenu(), p.getPrice());
		this.count = count;
		totalPrice();
	}
	
	// 계산 메서드
	public void totalPrice() {
		this.total = super.getPrice().intValue() * this.count;
	}
	

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "" + super.getMenu() + " - " + count + " | " + total;
	}
	
}
