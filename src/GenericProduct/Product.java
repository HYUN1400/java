package GenericProduct;

public class Product<K, V extends Number> {
	private K menu;
	private V price;
	
	public Product() {
		
	}
	
	public Product(K menu, V price) {
		this.menu = menu;
		this.price = price;
	}
	
	
	
	
	// G | S
	
	public K getMenu() {
		return menu;
	}
	public void setMenu(K menu) {
		this.menu = menu;
	}
	public V getPrice() {
		return price;
	}
	public void setPrice(V price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return menu + ": " + price ;
	}
	
	
}
