package tamagotchi;

import java.util.Random;
import java.util.Scanner;

public class RspGameSingle {
	
	private String[] choices = { "가위", "바위", "보" };
	private String com;

	private Random random = new Random();
	private Scanner scan;
	private RspResult result;

	public RspGameSingle(Scanner scan) {
		this.scan = scan;
	}

	public String startGame() {
		com = choices[random.nextInt(3)];
		String user = InputChecker.selectFromOptions(scan, 
				"여기에 입력해주세요. ✦ ", 
				"잘못된 입력입니다. 다시 입력해주세요. ✦ ", 
				"가위", "바위", "보");
		if (user.equals(com)) {
			result = RspResult.DRAW;
			return String.format("비겼습니다. 게임을 다시 진행합니다. (라이벌: %s | 자바고치: %s)", com, user);
		}
		if ((user.equals("가위") && com.equals("보")) || (user.equals("바위") && com.equals("가위"))
				|| (user.equals("보") && com.equals("바위"))) {
			result = RspResult.WIN;
			return String.format("이겼습니다!! (라이벌: %s | 자바고치: %s)", com, user);

		} else {
			result = RspResult.LOSE;
			return String.format("졌습니다.. (라이벌: %s | 자바고치: %s)", com, user);
		}

	}
	
	public RspResult getResult() {
		return result;
	}
}