package tamagotchi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class NumGame extends MiniGame {

	public NumGame(Scanner scan) {
		super(scan, 3, 2, 1);
	}

	@Override
	public void start() {

		successCount = 0;

		A: for (int i = 0; i < this.totalAttempt; i++) {
			NumGameSingle thisGame = new NumGameSingle(scan);
			printQuestion(i+1, thisGame.startGame());
			while (thisGame.getAttemptCount() < 4) {
				printResult(thisGame.attempt());
				if (thisGame.isSuccess()) {
					successCount += 1;
					continue A;
				}
			}
			int answer = thisGame.getAnswer();
			List<Integer> numWithFinalC = new ArrayList<>(Arrays.asList(2, 4, 5, 9));
			String particle = numWithFinalC.contains(answer) ? "였" : "이었";
			printResult(String.format("횟수를 모두 소진했습니다. 정답은 %d%s습니다.", answer, particle));
		}
	}
}
