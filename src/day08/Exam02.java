package day08;

import java.util.Arrays;
import java.util.Random;

public class Exam02 {
	
	Random random = new Random();
	
	/*랜덤 번호 생성기*/
	
	public int[] lotto(int num[]) {

		for(int i = 0; i < num.length; i++) {
			num[i] = random.nextInt(44)+1;
			for(int k = 0; k < i; k++) {
				if(num[i] == num[k]) {
					i--;
					break;
				}
			}
		}
		
		return num;
	}

	/*번호 출력*/
	
	public void show(int num[]) {
		System.out.print("| ");
		for(int tmp: num) {
			System.out.print(tmp + " | ");
		}
		System.out.println();
	}
	
	
	/*결과 출력*/
	
	public void checkNum(int[] random, int[] user) {
		
	    int count = 0;
	    int bonus = 0;
	    
	    String result = "일치하는 번호 : ";
	    String bonusResult = "";
	    
	    for(int i = 0; i < user.length; i++) {
	        boolean isMatch = false;
	        
	        for(int k = 0; k < random.length - 1; k++) {	
				if(user[i] == random[k] && !isMatch) {
					result += user[i] + " ";
					count ++;
					isMatch = true;
					break;
				}
			}
			
				if(user[i] == random[random.length - 1]) {
					bonusResult = "보너스 번호 : " + user[i] + " ";
					bonus ++;
				}			
		}
	    
	    System.out.println(result);
	    
	    if(count == 5 && bonus == 1) {
	        System.out.println(bonusResult);
	        System.out.println("2등 당첨! 축하합니다! 🥳");
	    } else {
	        switch(count) {
	            case 6: System.out.println("1등 당첨! 축하합니다! 🥳"); break;
	            case 5: System.out.println("3등 당첨! 축하합니다! 🥳"); break;
	            case 4: System.out.println("4등 당첨! 축하합니다! 🥳"); break;
	            case 3: System.out.println("5등 당첨! 축하합니다! 🥳"); break;
	            default: System.out.println("다음 기회에... 🥲"); break;
	        }
	    }
	}
	
	
	// method 끝

	public static void main(String[] args) {
		
		Exam02 ex02 = new Exam02();
		
		int random[] = new int[7];
		int user[] = new int[6];
		

		random = ex02.lotto(random);
		user = ex02.lotto(user);
		
		ex02.show(random);
		ex02.show(user);
		
		ex02.checkNum(random, user);
		

		// END
	}

}
