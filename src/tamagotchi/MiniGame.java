package tamagotchi;

import java.util.Scanner;

public abstract class MiniGame {

	Scanner scan;

	int totalAttempt;
	int successThreshold;
	int successCount;

	int rewardSnackCount;

	public MiniGame(Scanner scan, int totalAttempt, int successThreshold, int rewardSnackCount) {
		this.scan = scan;
		this.totalAttempt = totalAttempt;
		this.successThreshold = successThreshold;
		this.rewardSnackCount = rewardSnackCount;
	}

	public abstract void start();

	public int getRewardSnack() {
		return (successCount >= successThreshold) ? rewardSnackCount : 0;
	}

	public boolean failed() {
		return this.successCount == 0;
	}

	public void printQuestion(int attempt, String message) {
		
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		
		System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓ ");
		System.out.printf(" ┃                   미니게임을 해요 ♪  (%d/%d)                 ┃\n", attempt, totalAttempt);
		System.out.println(" ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫ ");
		System.out.println(" ┃                                                            ┃ ");
		System.out.println(" ┃      |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|      ┃ ");
		System.out.println(" ┃      |                                              |      ┃ ");
		System.out.println(message);
		System.out.println(" ┃      |                                              |      ┃ ");
		System.out.println(" ┃      |                                              |      ┃ ");
		System.out.println(" ┃      ￣￣￣￣￣＼|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣       ┃ ");
		System.out.println(" ┃                              .-.                           ┃ ");
		System.out.println(" ┃                             ( - )                          ┃ ");
		System.out.println(" ┃                              \" \"                           ┃ ");
		System.out.println(" ┃                                                            ┃ ");
		System.out.println(" ┃                                                            ┃ ");
		System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ ");
		
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void printResult(String message) {
		try {
//			Thread.sleep(1000);
			
			System.out.println("✦ ╮ ");
			System.out.print("  │ 	");
			System.out.println(message);
			System.out.println("  ╰─────────────────────────────────────────────── 🐙");
			
			
			System.out.println();
			
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public int getSuccessThreshold() {
		return successThreshold;
	}

	public int getSuccessCount() {
		return successCount;
	}

	public int getTotalAttempt() {
		return totalAttempt;
	}
	
}
