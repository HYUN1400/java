package day08;

import java.util.Arrays;

public class Exam02_1 {

	/*
	 * 1) 배열을 매개변수로 받아 랜덤수로 채워주는 메서드
	 * 매개변수: 배열 => int[] arr
	 * 리턴타입: void => 배열 채워주기만
	 */
	
	public void randomArray(int[] arr) {
		// 랜덤값을 넣을 때 중복을 제거하고 채우기
		int cnt = 0;
		while(cnt < arr.length) {
			int random = (int)(Math.random()*45)+1;
			if(!isContains(arr, random)) {
				arr[cnt] = random;
				cnt++;
			}
		}
	}
	
	
	/*
	 * 1-1) 중복 확인 메서드
	 * 매개변수: 배열, 값 => int[] arr, int random
	 * 리턴타입: boolean => 중복 있음 true / 중복 없음 false
	 */
	
	public boolean isContains(int[] arr, int random) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == random) {
				return true;
			}
		}
		return false;
	}
	
	
	/*
	 * 2) 배열 출력 메서드
	 * 매개변수: 배열 => int[] arr
	 * 리턴타입: void => 출력
	 * 1 2 3 4 5 6 => user
	 * 1 2 3 4 5 6 [7] => Lotto
	 */
	
	public void printArray(int[] arr) {
		for(int i = 0; i < 6; i++) {
			System.out.print(arr[i] + " ");
		}
		if(arr.length == 7) {
			System.out.println("[" + arr[arr.length-1] + "]");
		}
		System.out.println();
	}
		
	
	/*
	 * 3) 당첨확인 메서드
	 * 매개변수: 배열 2개 => int[] user, int[] lotto
	 * 리턴타입: int => 등수 리턴
	 */
	
	public int lottoRank(int[] user, int[] lotto) {
		// user | lotto  위치가 바뀌어서 들어올 시 Exception
		if(user.length >= lotto.length) {
			System.out.println("숫자가 잘못 들어왔습니다. 😑");
			return -999;
		}
		
		int count = 0; // 일치 개수
		
		for(int i = 0; i < user.length; i++) {
			if(isContains(user, lotto[i])) {
				count++;
			}
		}
		
		System.out.println("일치 번호 개수 👉 " + count);
		
		int bonus = lotto[lotto.length-1];
		
		switch(count) {
		case 6: return 1;
		case 5: return isContains(user, bonus) ? 2 : 3;
		case 4: return 4;
		case 3: return 5;
		default: return -1;
		}
		
		// 순위
		
	}
	
	
	
	
	
	// METHOD END
	
	public static void main(String[] args) {
		
		Exam02_1 ex2 = new Exam02_1();
		
		int[] user = new int[6];
		int[] lotto = new int[7];
		
		ex2.randomArray(user);
		ex2.randomArray(lotto);
		ex2.printArray(user);
		ex2.printArray(lotto);
		
		int ranking = ex2.lottoRank(user, lotto);
		if(ranking == -999) {
			System.out.println("숫자가 잘못 들어왔습니다. 😑");
		} else if(ranking == -1) {
			System.out.println("다음 기회에. . . 🥲");
		} else {			
			System.out.println(ranking + "등 당첨! 축하합니다! 🥳");
		}	
		
		
		
		// END
	}

}
