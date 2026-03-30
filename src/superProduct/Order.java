package superProduct;

public class Order extends Product {
	// 주문(Order) class : 상품, 개수, 가격(판매금액), 금액(개수*가격)
	// 멤버변수
	private int count; // 주문수량
	private int total; // 수량 * 가격
	
	public Order() {}
	public Order(String name, int price, int count) {
		super(name, price);
		this.count = count;
		totalCalc();
	}
	
	// total 계산 메서드
	public void totalCalc() {
		this.total = super.getPrice() * this.count;
	}
	
	// 주문 추가 메서드 
	public void insertOrder(String name, int price, int count) {
		super.setName(name);
		super.setPrice(price);
		this.count = count;
		totalCalc();
	}

	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "[" + super.getName() + "  " 
				+ count + "  " 
				+ super.getPrice() + " => " 
				+ total + "]";
	}	

}