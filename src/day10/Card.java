package day10;

public class Card {
	/*
	 * 숫자: 1~13 => 1(A), 11(J), 12(Q), 13(K)
	 * 모양: ♥️, ♣️, ♠️, ♦️
	 * ex) ♥A, ♥5, ♣3
	 * 해당 범위에서 벗어나는 숫자는 => 1(A) 
	 * 해당 범위에서 벗어나는 모양은 => ♥️ => ex) ^20 => ♥️A
	 */
	
	/*
	 * 멤버변수: 숫자(number), 모양(shape)
	 * - toString()
	 * - 생성자 => 기본 생성자만 => ♥️A
	 * - print (조건을 달아서 A J Q K 출력)
	 */
	
	
	// 멤버 변수
	private int number;
	private String shape;
	
	// 생성자
	public Card() {
		shape = "♥️";
		number = 1;
	}

	// 메서드
	
	public String toString() {
			switch(this.number) {
			 case 1: return this.shape + "A";
		     case 11: return this.shape + "J";
		     case 12: return this.shape + "Q";
		     case 13: return this.shape + "K";
		     default: return this.shape + this.number;
			}
		}
	
	public void print() {
		System.out.print(shape);
		switch(this.number) {
		case 1: System.out.print("A"); break;
		case 11: System.out.print("J"); break;
		case 12: System.out.print("Q"); break;
		case 13: System.out.print("K"); break;
		default:
			System.out.print(this.number);
		}
		System.out.println();
	}
	
	// getter | setter
	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		if(number < 1 || number > 13) {
			this.number = 1;
		} else {
			this.number = number;
		}
	}

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		if(shape.equals("♥️") || shape.equals("♣️") || shape.equals("♠️") || shape.equals("♦️")) {
			this.shape = shape;
		} else {
			this.shape = "♥️";
		}
	}
	
	
	
}
