package CoffeeShop;

import java.util.ArrayList;
import java.util.List;

class Order {
	private int count;
	private CoffeeShop coffeeshop;
	private Size size;
	private List<Option> options = new ArrayList<>();
		
	public Order(CoffeeShop coffeeshop, Size size, List<Option> options, int count) {
		this.count = count;
		this.size = size;
		this.options = options;
		this.coffeeshop = coffeeshop;
	}
	
	public Order() {
		// TODO Auto-generated constructor stub
	}

	public int getOptionSum() {
	    int sum = 0;
	    for (Option op : options) {
	        sum += op.getOptionCharge();
	    }
	    return sum;
	}
	
	public int allPrice() {
		
		int allPrice = count * (coffeeshop.getPrice() + size.getExtraCharge()) + getOptionSum();
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
				+ options + " | 사이즈: " + size 
				+ " | 주문 수량: " + count + "\n"
				+ "추가 금액: " + (getOptionSum() + size.getExtraCharge()) + "\n";
	}
	
	
	
}
