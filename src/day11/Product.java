package day11;

public class Product {
	//멤버변수
	private String menu;
	private int price;
	
	//생성자
	public Product() {
		
	}
	
	public Product(String menu, int price) {
		this.menu = menu;
		this.price = price;
	}

	
	//메서드
	public void printMenu() {
		System.out.println(this.menu + "\t" + this.price);
	}
	
	//getter | setter
	
	public String getMenu() {
		return menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [menu=" + menu + ", price=" + price + "]";
	}
	
	
}
