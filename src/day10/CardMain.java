package day10;

import java.util.Arrays;

public class CardMain {

	public static void main(String[] args) {
		CardPack pack = new CardPack();
		
		System.out.println("딜러가 카드를 섞고 있습니다 . . . 🎲");
		pack.shuffle();
		System.out.println();
		
		// player - 4명	
		System.out.println("딜러가 카드를 나누고 있습니다.");
		System.out.println("Player 1 ✅");
		Card player1 = pack.pick();
		
		System.out.println("Player 2 ✅");
		Card player2 = pack.pick();
		
		System.out.println("Player 3 ✅");
		Card player3 = pack.pick();
		
		System.out.println("Player 4 ✅");
		Card player4 = pack.pick();
		
		System.out.println();
		
		System.out.println("각 플레이어의 카드를 열어주세요. 🖐️");
		System.out.println();
		
		System.out.print("Player 1 > ");
		player1.print();
		System.out.println();
		
		System.out.print("Player 2 > ");
		player2.print();
		System.out.println();
		
		System.out.print("Player 3 > ");
		player3.print();
		System.out.println();
		
		System.out.print("Player 4 > ");
		player4.print();
		
		pack.init();
		
		
//		System.out.println(trump);
//		trump.setShape("♥");
//		trump.setNumber(1);
//		System.out.println(trump);
//		trump.setShape("♠️");
//		trump.setNumber(8);
//		System.out.println(trump);
//		trump.setShape("^");
//		trump.setNumber(20);
//		System.out.println(trump);

//		String[] shape = { "♥️", "♣️", "♠️", "♦️"};
//		
//		for(int i = 1; i < shape.length; i++) {
//			for(int j = 1; j <= 13; j++) {
//				trump.setShape(shape[i]);
//				trump.setNumber(j);
//				System.out.print(trump + " ");
//			}
//			
//			System.out.println();
//		}
//		
//		
//		for(int i = 1; i <= 4; i++) {
//			switch(i) {
//			case 1: trump.setShape("♥"); break;
//			case 2: trump.setShape("♣️"); break;
//			case 3: trump.setShape("♠️"); break;
//			case 4: trump.setShape("♦️"); break;
//			}
//			for(int j = 1; j <= 13; j++) {
//				trump.setNumber(j);
//				System.out.print(trump + " ");
//			}
//			
//			System.out.println();
//		}

//		pack.shuffle();
//		
//		for(int i = 0; i < pack.getPack().length; i++) {
//			pack.getPack()[i].print();
//		}
//		
//		System.out.println("*카드 뽑기*");
//		
//		System.out.println(pack.pick());
//		System.out.println(pack.pick());

	}

}
