package day18;

enum Category{
	// 상품 카테고리
	FOOD(0.1), // 10%
	CLOTHS(0.08), // 8%
	ELECTRONICS(0.15); // 15%

	private final double vatRate;
	
	Category(double vatRate) {
		this.vatRate = vatRate;
	}
	
	public double getVateRate() {
		return vatRate;
	}
	
}

// 상품 클래스 : name, Category, price(원가) + 부가세 = 가격책정

class Product{
	private String name;
	private Category category;
	private int price;
	
	
	public Product(String name, Category category, int price) {
		this.name = name;
		this.category = category;
		this.price = price;
	}

	
	// 부가세 포함 가격 계산
	public int getPriceWithVAT() {
		double vat = price * category.getVateRate();
		return (int)(price + vat);
	}
	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", category=" + category + ", price=" + price + "]";
	}
	
	
	
}


public class Enum02 {

	public static void main(String[] args) {
		
		// 물건 객체 정의
		
		Product p1 = new Product("Macbook Pro", Category.ELECTRONICS, 2000000);		
		System.out.println("총 지불 금액 : " + p1.getPriceWithVAT());
		
		Product p2 = new Product("JARA jacket", Category.CLOTHS, 100000);
		System.out.println("총 지불 금액 : " + p2.getPriceWithVAT());
		
		Product p3 = new Product("Apple", Category.FOOD, 4500);
		System.out.println("총 지불 금액 : " + p3.getPriceWithVAT());
		
		
	}

}

















