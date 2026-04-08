package CoffeeShop;

public enum Size {
	SMALL(0),
	MEDIUM(500),
	LARGE(1000);
	
	private final int extraCharge;

	Size(int extraCharge) {
		this.extraCharge = extraCharge;
	}
	
	public int getExtraCharge() {
		return extraCharge;
	}
	
}
