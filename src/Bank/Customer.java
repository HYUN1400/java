package Bank;

public class Customer {
	// 고객 
	// 이름, 은행명, 계좌번호, 잔액
	
	private String customerName;
	private String bankName;
	private String account;
	private int balance;
	
	
	// Constructor
	
	public Customer(String bankName, String customerName, String account, int balance) {
		this.bankName = bankName;
		this.customerName = customerName;
		this.account = account;
		this.balance = balance;
	}
	
	
	// getter | setter

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}


	@Override
	public String toString() {
		return "은행 정보: " + bankName + " | 고객명: " + customerName
				+ "\n계좌번호: " + account
				+ " | 잔액: " + balance + "\n";
	}
	
	
	
	
	
}
