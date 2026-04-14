package tamagotchi;

import java.util.Scanner;

public class MathGame extends MiniGame {
	
	public MathGame(Scanner scan) {
		super(scan, 3, 2, 1);
	}

	@Override
	public void start() {
		
		successCount = 0;
		
		for (int i=0; i<this.totalAttempt; i++) {
			
			MathGameSingle thisGame = new MathGameSingle(scan);
			printQuestion(i+1, thisGame.startGame());
			printResult(thisGame.checkAnswer());
			successCount += thisGame.isSuccess() ? 1 : 0;
			
		}
		
	}

}
