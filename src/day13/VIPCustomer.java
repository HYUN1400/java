package day13;

public class VIPCustomer extends Customer2 {
	private double saleRatio;
	private String agentName;
	private String agentNum;
	
	public VIPCustomer() {
		
	}
	
	public VIPCustomer(String CustomerID, String CustomerName, String agentName, String agentNum) {
		super(CustomerID, CustomerName);
		super.setCustomerGrade("VIP");
		super.setBonusRatio(0.05);
		this.saleRatio = 0.1;
		this.agentName = agentName;
		this.agentNum = agentNum;
	}

	@Override
	public int calcPrice(int price) {
		super.calcPrice(price);
		
		int resultPrice = price - (int)(price * saleRatio);
		
		return resultPrice;
	}

	@Override
	public void printOf() {
		super.printOf();
		System.out.println("전담 상담사는 " + agentName + "이며, 연결 번호는 " + agentNum + "입니다.");
	}

	public String getAgentName() {
		return agentName;
	}

	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}

	public String getAgentNum() {
		return agentNum;
	}

	public void setAgentNum(String agentNum) {
		this.agentNum = agentNum;
	}	
	
	
	
	
}
