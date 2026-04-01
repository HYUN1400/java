package day13;

public class Customer {
	// 멤버변수	
	private String memberId;
	private String memberName;
	private String memberLevel;
	private int bonusPoint;
	private int RewardRate;
	
	// 생성자
	public Customer(){ }
	public Customer(
			String memberId, 
			String memberName,
			int bonusPoint
			) {
		this.memberId = memberId;
		this.memberName = memberName;
		setMemberLevel("SILVER");
		this.bonusPoint = bonusPoint;
		setRewardRate(1);
	}
	
	// 메서드
	public int calcPrice(int price) {
	    this.bonusPoint += price * (RewardRate / 100.0); 
	    return price;
	}
	
	public void printOf() {
		System.out.println(
				memberName + "님은 " + memberLevel + " 고객이며, 현재 보너스 포인트는 "
				+ bonusPoint + "점 입니다."
				);
	}
	
	// G | S
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getMemberLevel() {
		return memberLevel;
	}
	public void setMemberLevel(String memberLevel) {
		this.memberLevel = memberLevel;
	}
	public int getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public int getRewardRate() {
		return RewardRate;
	}
	public void setRewardRate(int rewardRate) {
		RewardRate = rewardRate;
	}

}

class Gold extends Customer {
	// 생성자
	public Gold() { }
	public Gold(
			String memberId, 
			String memberName,
			int bonusPoint
			) {
		super(memberId, memberName,bonusPoint);
		super.setMemberLevel("GOLD");
		super.setRewardRate(3);
	}
	
	// 메서드
	@Override
	public int calcPrice(int price) {
	    super.calcPrice(price); 
	    return price - (int)(price * 0.05);
	}
}

class VIP extends Customer {
	// 멤버변수
	private String agentName;
	private String agentNumber;
	
	// 생성자 
	public VIP() { }
	public VIP(
			String memberId, 
			String memberName,
			int bonusPoint,
			String agentName,
			String agentNumber
			) {
		super(memberId, memberName, bonusPoint);
		super.setMemberLevel("VIP");
		super.setRewardRate(5);
		this.agentName = agentName;
		this.agentNumber = agentNumber;
		}
	
	// 메서드
	
	@Override
	public int calcPrice(int price) {
		super.calcPrice(price); 
	    return price - (int)(price * 0.1);
	}
	@Override
	public void printOf() {
		super.printOf();
		System.out.println(
				"전담 상담사는 " + agentName
				+ "이며, 상담사 번호는 " + agentNumber + "입니다."
				);
	}
	

	
}












// 
