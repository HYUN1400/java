package day06;

import java.util.Arrays;
import java.util.Scanner;

public class Exam01 {

	public static void main(String[] args) {
		/*
		 * 야구게임
		 * 컴퓨터가 랜덤으로 3자리의 숫자를 생성 (0~9) => 중복 불가능
		 * 배열에 저장
		 * 
		 * 유저가 3자리 숫자를 맞추는 게임
		 * 자리가 일치하면 STRIKE
		 * 자리는 불일치하지만 숫자가 다른 위치에 있다면 BALL 
		 * 자리 X 숫자 X => OUT
		 * 
		 * ex) com: 1 2 3
		 * user: 1 5 9
		 * 1 STRIKE
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		int num[] = new int[3];
		
		for(int i = 0; i < num.length; i++) {
			int random = (int)(Math.random()*10);
			num[i] = random;
			for(int k = 0; k < i; k++) {
				if(num[i] == num[k]) {
					i--;
					break;
				}
			}
		}
	
		
		while(true) {
			
			System.out.println("숫자 세 자리를 입력해주세요(0~9)! 👉");
			int select[] = new int[3];
			
			for(int i = 0; i < select.length; i++) {
				
				select[i] = scan.nextInt();
				
			}
		
			
			
			System.out.println(Arrays.toString(select));
			
			
			int count = 0;
			int ball = 0;
			
			for(int i = 0; i < num.length; i++) {
				for(int k = 0; k < select.length; k++) {
					if(num[i] == select[k]) {
						if( i == k ) {
							count ++;
						} else {
							ball ++;
						}
					} 
				}
			}
			
			
			if(count == 3) {
				System.out.println("타자 룩킹삼진! 정답을 맞췄습니다. 🥳");
				break;
			} else {
				if(count != 3) {
					System.out.println(count + " 스트라이크! ⚾");
				} 

				if (ball != 0){
					System.out.println(ball + "볼! ⚾");
				}
			}
						
			
			// WHILE END
		}
		
		
		
		
		
		// END
	}
}
