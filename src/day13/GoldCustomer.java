package day13;

public class GoldCustomer extends Customer2 {
	// 상속받은 Customer2 클래스에 없는 멤버변수만 선언
	// gold / vip => 할인
	private double saleRatio;
	
	
	public GoldCustomer() {
		
	}
	
	public GoldCustomer(String CustomerID, String CustomerName) {
		super(CustomerID, CustomerName);
		super.setCustomerGrade("GOLD");
		super.setBonusRatio(0.03);
		this.saleRatio = 0.05;
	}

	@Override
	public int calcPrice(int price) {
		super.calcPrice(price);
		int resultPrice = price - (int)(price * this.saleRatio);
		
		return resultPrice;
	}

	@Override
	public void printOf() {
		super.printOf();
	}

	
}
