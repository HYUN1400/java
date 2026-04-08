package CoffeeShop;

public enum Option {
	SHOT(500),
	WHIPEED_CREAM(700),
	SYRUP(0),
	NON_OPTION(0);
	
	private final int optionCharge;
	
	Option(int optionCharge){
		this.optionCharge = optionCharge;
	}
	
	public int getOptionCharge() {
		return optionCharge;
	}
}
