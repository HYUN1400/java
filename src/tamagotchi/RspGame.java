package tamagotchi;

import java.util.Scanner;

enum RspResult {
	LOSE,
	DRAW,
	WIN
}

public class RspGame extends MiniGame {
	
	public RspGame(Scanner scan) {
		super(scan, 3, 2, 2);
	}

	@Override
	public void start() {
		
		successCount = 0;
		
		for (int i=0; i<this.totalAttempt; i++) {
			
			RspGameSingle thisGame = new RspGameSingle(scan);
			printQuestion(i+1, "	   가위 / 바위 / 보 중 하나를 입력하세요!");
			printResult(thisGame.startGame());
			if (thisGame.getResult() == RspResult.DRAW) i--;
			successCount += (thisGame.getResult() == RspResult.WIN) ? 1 : 0;
			
		}
		
	}

}
