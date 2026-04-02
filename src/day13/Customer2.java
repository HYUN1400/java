package day13;

public class Customer2 {
	// 멤버변수
	private String customerID;
	private String customerName;
	private String customerGrade;
	private int bonusPoint;
	private double bonusRatio;
	
	//생성자
	
	public Customer2() {
		
	}
	
	public Customer2(String customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.customerGrade = "Silver";
		this.bonusRatio = 0.01;
	}
	
	// method
	// 구매금액 보너스 포인트 누적 => 결제 금액 리턴
	// 매개변수 : 구매금액 => int Price
	// 리턴타입: 결제금액 리턴 (int)
	
	public int calcPrice(int price) {
		int point = (int)(price * bonusRatio);
		this.bonusPoint += point;
				
		return price; // 실버는 할인율이 없음
	}
	
	// 출력
	public void printOf() {
		System.out.println(
				customerName + "님은 " + customerGrade + " 고객이며, 현재 보너스 포인트는 "
				+ bonusPoint + "점입니다."
				);
	}
	
	
	// G | S

	public String getCustomerID() {
		return customerID;
	}

	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	
	@Override
	public String toString() {
		return "Customer2 [customerID=" + customerID + ", customerName=" + customerName + ", customerGrade="
				+ customerGrade + ", bonusPoint=" + bonusPoint + ", bonusRatio=" + bonusRatio + "]";
	}
	
	
	

}
