package tamagotchi;

import java.util.Scanner;

public class NumGameSingle {
	
	private Scanner scan;
	
	public NumGameSingle(Scanner scan) {
		this.scan = scan;
	}
	
	int answer;
	int attemptCount = 0;
	final int ATTEMPT_LIMIT = 4;
	boolean success = false;
	
	public String startGame() {
		answer = (int)(Math.random()*10)+1;
		attemptCount = 0;
		
		return "		1부터 10까지 중 숫자를 맞춰보세요!";
	}
	
	public String attempt() {
		int userNum = InputChecker.selectInteger(
				scan, 
				"여기에 숫자를 입력해주세요. ✦ ", 
				"잘못된 입력입니다. 다시 입력해주세요. ✦ "
				);
		attemptCount++;
		if (answer > userNum) return "더 큰 수예요!!";
		if (answer < userNum) return "더 작은 수예요!!";
		success = true;
		return "정답입니다!!!";
	}

	public int getAttemptCount() {
		return attemptCount;
	}

	public boolean isSuccess() {
		return success;
	}

	public int getAnswer() {
		return answer;
	}
	
}
