package day18;

enum CoffeeShop{
	클래식밀크티(6400),
	말차라떼(6100),
	자바칩(6500),
	에스프레소(5700),
	망고바나나(6600),
	카라멜(6100),
	자몽허니블랙티(5900),
	유스베리티(4500);
	
	private final int price;
	
	CoffeeShop(int price){
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
	
}