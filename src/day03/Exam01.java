package day03;

import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		// up / down game
		// 1 ~ 50까지의 랜덤수 하나를 컴퓨터가 생성 => user 모름
		// 유저가 숫자를 맞추는 게임
		// for / while
		
		// ex) 컴퓨터가 랜덤수를 생성했습니다! -> 23
		// 입력 > 10
		// UP ↑
		// 입력 > 20
		// UP ↑
		// 입력 > 30
		// DOWN ↓
		// 입력 > 23
		// 정답! 🥳
		
		Scanner scan = new Scanner(System.in);
		
		int input = 0;
		int count = 0;
		int random = (int)(Math.random()*50)+1;
		
		System.out.println("컴퓨터가 랜덤수를 생성했습니다!");
		System.out.println("숫자를 입력해주세요.👍");
		
		
		while(true) {	
			
			input = scan.nextInt();	
			count ++;
			
			if(count == 5 && input != random) {
				System.out.println("기회를 모두 소모하셨습니다.🥲 정답은 → " + random);
				break;
			}
			
			
			if(input > random) {
				System.out.println("DOWN ↓");
			} else if(input < random) {
				System.out.println("UP ↑");
			} else if(input == random) {
				System.out.println("정답! 🥳");
				break;
			}
					
		}
		
		
		scan.close();
			
	}

}
