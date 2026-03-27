package day10;

public class CardPack {
	
	/*
	 * 52장의 카드를 배열로 저장
	 * ♥️A ~ ♥️K / ♣️A ~ ♣️K / ♠️A ~ ♠️K / ♦️A ~ ♦️K
	 * 
	 * - 멤버변수: 52장의 카드를 담을 수 있는 배열 + 번지
	 * 
	 * - 메서드
	 * 1) 카드를 섞는 기능
	 * 2) 카드를 한장 빼내는 기능 (유저에게 주는 기능)
	 * 3) 카드 초기화 기능 (나눠준 카드 회수)
	 * 
	 * - 생성자
	 * 
	 */
	
	// 매개변수 
	private Card[] pack = new Card[52];
	private int index;
	
	// 생성자
	public CardPack() {
		String[] shape = { "♥️", "♣️", "♠️", "♦️"};
		
		
		for(int i = 0; i < shape.length; i++) {
			for(int j = 1; j <= 13; j++) {
				Card card = new Card();
				card.setShape(shape[i]);
				card.setNumber(j);
				
				pack[index] = card;
				index++;
			}
		}
	}
	
	// 메서드
	
	/* 배열 섞기 */
	public void shuffle() {
		for(int i = 0; i < pack.length; i++) {
			int random = (int)(Math.random()*52);
			Card tmp = pack[i];
			pack[i] = pack[random];
			pack[random] = tmp;
		}
	}
	
	
	/* 한장 뽑기 */
	public Card pick() {
		if(index == 0) {
			return null;
		}
		index --;
		return pack[index];
	}
	
	
	/*초기화*/
	public void init() {
		index = 52;
		shuffle();
	}
	
	
	// getter | setter
	
	public Card[] getPack() {
		return pack;
	}

	public void setPack(Card[] pack) {
		this.pack = pack;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	
	
	
	
}
