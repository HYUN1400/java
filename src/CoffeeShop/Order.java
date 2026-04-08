package CoffeeShop;

class Order {
	private int count;
	private CoffeeShop coffeeshop;
	private Size size;
	private Option option;
	
		
	public Order(CoffeeShop coffeeshop, Size size, Option option, int count) {
		this.count = count;
		this.size = size;
		this.option = option;
		this.coffeeshop = coffeeshop;
	}
	
	public int allPrice() {
		int allPrice = count * (coffeeshop.getPrice() + size.getExtraCharge() + option.getOptionCharge());
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
		return "주문 메뉴: " + coffeeshop + "(" + coffeeshop.getPrice() +")\n" + "☆ 옵션: " 
				+ option + " | 사이즈: " + size 
				+ " | 주문 수량: " + count + "\n"
				+ "추가 금액: " + (option.getOptionCharge() + size.getExtraCharge()) + "\n";
	}
	
	
	
}
