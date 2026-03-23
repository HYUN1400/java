package day05;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// 가위 바위 보
		/*
		 * 컴퓨터(랜덤) vs 나(입력)
		 * 
		 * 가위 = 1, 바위 = 2, 보 = 3
		 * 
		 * 컴퓨터는 랜덤으로 1 2 3 중 선택
		 * 유저도 input 1 2 3 중 선택
		 * 
		 * LOSE 1 < 2 WIN
		 * LOSE 2 < 3 WIN
		 * LOSE 3 < 1 WIN
		 * 
		 */
		
//		Scanner scan = new Scanner(System.in);
//		
//		
//		int count = 0;
//		
//		do {
//			
//			System.out.println("선택하세요!");
//			System.out.println("1 > 가위 ✌️ | 2 > 바위 ✊ | 3 > 보 ✋");
//			
//			int random = (int)(Math.random()*3)+1; // 컴퓨터 랜덤 수
//			int select = scan.nextInt();
//			
//			if(select != 1 && select !=2 && select !=3) {
//				System.out.println("가위, 바위, 보 중에 골라주세요! 😑");
//				continue;
//			}
//			
//			switch(random) {
//			case 1: System.out.println("컴퓨터는 가위를 냈습니다.");
//					if(select == 1) {
//						System.out.println("비겼습니다. ✌️");
//						continue;
//					} else if (select == 2) {
//						System.out.println("이겼습니다! 🥳");
//						count ++;
//					} else if (select == 3) {
//						System.out.println("졌습니다... 🥲");
//						count ++;
//					}
//					break;
//			case 2: System.out.println("컴퓨터는 바위를 냈습니다.");
//					if(select == 1) {
//						System.out.println("졌습니다... 🥲");
//						count ++;
//					} else if (select == 2) {
//						System.out.println("비겼습니다. ✊");
//						continue;
//					} else if (select == 3) {
//						System.out.println("이겼습니다! 🥳");
//						count ++;
//					}
//					break;
//			case 3: System.out.println("컴퓨터는 보를 냈습니다.");
//					if(select == 1) {
//						System.out.println("이겼습니다! 🥳");
//						count ++;
//					} else if (select == 2) {
//						System.out.println("졌습니다... 🥲");
//						count ++;
//					} else if (select == 3) {
//						System.out.println("비겼습니다. ✋");
//						continue;
//					}
//					break;
//			}
//			
//		}while(count < 1);
		
//		Scanner scan = new Scanner(System.in);
//
//		while(true) {
//		    System.out.println("선택하세요!");
//		    System.out.println("1 > 가위 ✌️ | 2 > 바위 ✊ | 3 > 보 ✋");
//
//		    int random = (int)(Math.random() * 3) + 1;
//		    int select = scan.nextInt();
//
//		    if(select < 1 || select > 3) {
//		        System.out.println("가위, 바위, 보 중에 골라주세요! 😑");
//		        continue;
//		    }
//		    
//		    if(random == 1) {
//		    	System.out.println("컴퓨터는 가위를 냈습니다.");
//		    } else if(random == 2 ) {
//		    	System.out.println("컴퓨터는 바위를 냈습니다.");
//		    } else if(random == 3 ) {
//		    	System.out.println("컴퓨터는 보를 냈습니다.");
//		    }
//
//
//		    int result = (select - random + 3) % 3;
//
//		    if(result == 0) {
//		        System.out.println("비겼습니다!");
//		    } else if(result == 1) {
//		        System.out.println("이겼습니다! 🥳");
//		        break;
//		    } else {
//		        System.out.println("졌습니다... 🥲");
//		        break;
//		    }
//		}
//
//		scan.close();
		
		
		String[] choice = {"가위", "바위", "보"};
		Scanner scan = new Scanner(System.in);
		int select;
		
		while(true) {
						
			System.out.println("선택하세요!");
			System.out.println("0 > 가위 ✌️ | 1 > 바위 ✊ | 2 > 보 ✋ | 3 > EXIT");
			
			select = scan.nextInt();
			int comNum = (int)(Math.random()*3);
			
			if (select == 3) {
				System.out.println("게임을 종료합니다.");
				break;
			}
			
			int result = (select - comNum + 3) % 3;
			
			if(result == 0) {
				System.out.println("컴퓨터는 " + choice[comNum] + "를 냈습니다.");
				System.out.println("비겼습니다!");
			} else if(result == 1) {
				System.out.println("컴퓨터는 " + choice[comNum] + "를 냈습니다.");
				System.out.println("이겼습니다! 🥳");
			} else {
				System.out.println("컴퓨터는 " + choice[comNum] + "를 냈습니다.");
				System.out.println("졌습니다... 🥲");
			}
									
		} 
		
		scan.close();
		
		// END
	}

}
