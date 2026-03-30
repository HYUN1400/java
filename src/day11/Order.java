package day11;

public class Order {
	//멤버변수
	private Product menu;
	private int count;
	
	//생성자
	public Order() {
		
	}
	
	public Order(Product menu, int count) {
		this.menu = menu;
		this.count = count;
	}

	
	//메서드
	public int getTotal() {
		return menu.getPrice() * count;
	}
	
	public void printOrder() {
		System.out.println(menu.getMenu() + "\t" + this.count + "\t" + menu.getPrice() + "\t" + getTotal());
	}
	
	//getter | setter
	
	public Product getMenu() {
		return menu;
	}

	public void setMenu(Product menu) {
		this.menu = menu;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	
}
