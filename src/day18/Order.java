package day18;

class Order {
	private int count;
	private CoffeeShop coffeeshop;
	
		
	public Order(CoffeeShop coffeeshop, int count) {
		this.count = count;
		this.coffeeshop = coffeeshop;
	}
	
	public int allPrice() {
		int allPrice = count * coffeeshop.getPrice();
		return allPrice;
	}
	
	
	
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public CoffeeShop getCoffeeshop() {
		return coffeeshop;
	}
	public void setCoffeeshop(CoffeeShop coffeeshop) {
		this.coffeeshop = coffeeshop;
	}
	@Override
	public String toString() {
		return "주문 메뉴: " + coffeeshop + "(" + coffeeshop.getPrice() +")" + " | 주문 수량: " + count;
	}
	
	
	
}
