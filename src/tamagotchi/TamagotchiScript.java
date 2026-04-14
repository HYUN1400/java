package tamagotchi;

import java.util.Scanner;

public class TamagotchiScript {
	Scanner scan = new Scanner(System.in);
	Controller control;
    CharacterMood mood;
    
    public TamagotchiScript(Controller control) {
        this.control = control;
        this.mood = new CharacterMood(control);
    }
	
	public void HelloScript() { // 처음 생성할 때
			
		try {
			System.out.println("                                                              ");
			System.out.println("       |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|       ");
			System.out.println("       |                                              |       ");		
			System.out.println("       |        당신의 자바고치가 오고 있어요!        |       ");		
			System.out.println("       |                                              |       ");
			System.out.println("       |                                              |       ");
			System.out.println("       ￣￣￣￣￣＼|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣        ");
			System.out.println("                   ✦                                          ");
			System.out.println();

			Thread.sleep(500);
			
			printLogo();
			
			System.out.println();
			
    		
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
		
	}
	
	public void byeScript(String charName) { // 종료할때
		
		try {
			printLoadingDots();
			System.out.println("✦ ╮ ");
			System.out.println("  │ ");
			System.out.println("  │ " + charName + "은(는) 영원히 당신을 기다릴 것입니다... 🥺");
			System.out.println("  │ ");
			System.out.println("  ╰─────────────────────────────────────────────── 🐙");
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	private String percentBar(int value, int maxValue, int length) {
		
		if (maxValue == 0) return "█".repeat(length);
		
		double rawBarLength = length * value  / (double) maxValue;
		int opaqueBarLength = (int) rawBarLength;
		double translucentBarValue = rawBarLength - opaqueBarLength;
		String translucentSection = (translucentBarValue == 0) ? "" :
			(translucentBarValue * 2 <= 1) ? "▒" : "▓";
		return "█".repeat(opaqueBarLength) + translucentSection + "░".repeat(length - opaqueBarLength - translucentSection.length());
				     
	}
	
	private void printUpperUI(int day, Character character) {
		
		int stamina = character.getCharacterStamina();
		int exp = character.getCharacterExp();
		int level = character.getCharacterLevel();
		int curLvExp = character.getLvExp(level);
		int nxtLvExp = character.getLvExp(level + 1);
		int clean = character.getCharacterClean();
		
		System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓ ");
		System.out.println(" ┃                                                            ┃ ");
		System.out.println(" ┃ " + day +"일차                                           ⑹ 떠나기  ┃ ");
		System.out.println(" ┃                                                            ┃ ");
		System.out.printf(" ┃ 체력   ⚡︎  %s  (%3d / %3d)  ┃ \n", percentBar(stamina, 80, 34), stamina, 80);
		System.out.printf(" ┃ 경험치 ◆  %s  (%3d / %3d)  ┃ \n", percentBar(exp - curLvExp, nxtLvExp - curLvExp, 34), exp, nxtLvExp);
		System.out.printf(" ┃ 청결도 ○  %s  (%3d / %3d)  ┃ \n", percentBar(clean, 50, 34), clean, 50);
		System.out.println(" ┃                                                            ┃ ");
		System.out.println(" ┃                                                            ┃ ");
	}
	
	private void printLowerUI() {
		System.out.printf(" ┃                                                      ◉  %2d ┃\n", control.getSnackCount());
		System.out.println(" ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫ ");
		System.out.println(" ┃                              ┃                             ┃ ");
		System.out.println(" ┃   ⑴ 밥 먹기 (⚡︎ +15  ◉ -1)   ┃    ⑵ 산책 가기  (⚡︎ -15)    ┃ ");
		System.out.println(" ┃                              ┃                             ┃ ");
		System.out.println(" ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╋━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫ ");
		System.out.println(" ┃                              ┃                             ┃ ");
		System.out.println(" ┃      ⑶ 놀아주기  (⚡︎ -20)    ┃      ⑷ 씻기기   (⚡︎ -5)     ┃ ");
		System.out.println(" ┃                              ┃                             ┃ ");
		System.out.println(" ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫ ");
		System.out.println(" ┃                     ⑸ 잠자기  (⚡︎ MAX)                     ┃ ");
		System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ ");
	}
	
	public void Tamagotchi(int day, Character character) {
		
		int level = character.getCharacterLevel();
		String charName = character.getCharacterName();
		
		printUpperUI(day, character);
		
		System.out.println(" ┃      |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|      ┃ ");
//		System.out.println(" ┃      |                                              |      ┃ ");
		System.out.print("           ");  mood.print(charName);  System.out.println("\t\t      ");   
//		System.out.println(" ┃      |                                              |      ┃ ");
		System.out.println(" ┃      |                                              |      ┃ ");
		System.out.println(" ┃      ￣￣￣￣￣＼|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣       ┃ ");
		System.out.println(" ┃                  ✦                                         ┃  ");
		
		switch(level) {
		case 1 :
			System.out.println(" ┃                              .-.                           ┃ ");
			System.out.println(" ┃                             ( - )                          ┃ ");
			System.out.println(" ┃                              \" \"                           ┃ ");
			break;
			
		case 2 :
			System.out.println(" ┃                          .^._.^.                           ┃ ");
			System.out.println(" ┃                         (   . .  )                         ┃ ");
			System.out.println(" ┃                          |      |                          ┃ ");
			System.out.println(" ┃                           V   V                            ┃ ");
			break;
			
		case 3 :
			System.out.println(" ┃                           .^._.^.                          ┃ ");
			System.out.println(" ┃                           | . . |                          ┃ ");
			System.out.println(" ┃                          (  ---  )                         ┃ ");
			System.out.println(" ┃                          .'     '.                         ┃ ");
			System.out.println(" ┃                          |/     \\|                         ┃ ");
			System.out.println(" ┃                           \\ /-\\ /                          ┃ ");
			System.out.println(" ┃                            V   V                           ┃ ");
			break;
		}
		printLowerUI();
		
		
	}
	
	public void FeedScript(String charName, int level) { // (1) 밥먹기
		
		if (!control.feed()) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return;
		}
		
		try {
			Thread.sleep(2000);
			System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┃      |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|      ┃ ");
			System.out.println(" ┃      |                                              |      ┃ ");
			System.out.println("                      밥 먹는 중 . . . . . .      ");   
			System.out.println(" ┃      |                                              |      ┃ ");
			System.out.println(" ┃      |                                              |      ┃ ");
			System.out.println(" ┃      ￣￣￣￣￣＼|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣       ┃ ");
			System.out.println(" ┃                  ✦                                         ┃  ");
			System.out.println(" ┃                                                            ┃ ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		switch(level) {
		case 1 :
			System.out.println(" ┃                        .-.                                 ┃ ");
			System.out.println(" ┃                       ( □ )                                ┃ ");
			System.out.println(" ┃                        \" \"    🍙                           ┃ ");
			break;
			
		case 2 : 
			System.out.println(" ┃                         .^._.^.                            ┃ ");
			System.out.println(" ┃                        (   _ _  )                          ┃ ");
			System.out.println(" ┃                         |      |  🍙                       ┃ ");
			System.out.println(" ┃                          V   V                             ┃ ");
			break;
		
		case 3 : 
			System.out.println(" ┃                       .^._.^.                              ┃ ");
			System.out.println(" ┃                       | . . |                              ┃ ");
			System.out.println(" ┃                       (  □  )                              ┃ ");
			System.out.println(" ┃                      .'     '.                             ┃ ");
			System.out.println(" ┃                      |/     \\| 🍙                          ┃ ");
			System.out.println(" ┃                       \\ /-\\ /                              ┃ ");
			System.out.println(" ┃                        V   V                               ┃ ");
			break;
		
		}
		
		try {
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ ");
			
			printLoadingDots();
			
			System.out.println("✦ ╮ ");
			System.out.println("  │ ");
			System.out.println("  │ ");
			System.out.println("  │  " + charName + "은(는) 맛있게 밥을 먹었습니다!");
			System.out.println("  │  체력이 15 상승했으며, 10 경험치를 얻었습니다.");
			System.out.println("  │ ");
			System.out.println("  │ ");
			System.out.println("  ╰─────────────────────────────────────────────── 🐙");
			
			Thread.sleep(2000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	public void GameScript(Scanner scan) {
		control.playGame(scan);
	}
	
	public void lowStamina() {
		try {
			Thread.sleep(1000);
			System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓ ");
			System.out.println(" ┃     ⚠️ 체력이 부족해요...     ┃ ");
			System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ ");
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void WalkScript(String charName, int level) { // (2) 산책가기
		
		control.takeWalk();
		
		try {
			Thread.sleep(1000);
			System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓ ");
			System.out.println(" ┃                         산책 가요♪                         ┃ ");
			System.out.println(" ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┃      |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|      ┃ ");
			System.out.println(" ┃      |                                              |      ┃ ");
			System.out.println("                          산책 중 . . . . . .      ");   
			System.out.println(" ┃      |                                              |      ┃ ");
			System.out.println(" ┃      |                                              |      ┃ ");
			System.out.println(" ┃      ￣￣￣￣￣＼|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣       ┃ ");
			System.out.println(" ┃                  ✦                                         ┃  ");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		switch (level) {
		case 1:
			System.out.println(" ┃                        .-.                                 ┃ ");
			System.out.println(" ┃                       ( ᴗ )                                ┃ ");
			System.out.println(" ┃           🌼🌹🌼        \" \"       🌼🌹🌼                  ┃ ");
			break;

		case 2:
			System.out.println(" ┃                       .^._.^.                              ┃ ");
			System.out.println(" ┃                      (   . .  )                            ┃ ");
			System.out.println(" ┃           🌼🌹🌼      |      |       🌼🌹🌼               ┃ ");
			System.out.println(" ┃                         V   V                              ┃ ");
			break;

		case 3:
			System.out.println(" ┃                       .^._.^.                              ┃ ");
			System.out.println(" ┃                       | . . |                              ┃ ");
			System.out.println(" ┃                       (  ◡  )                              ┃ ");
			System.out.println(" ┃                      .'     '.                             ┃ ");
			System.out.println(" ┃                      |/     \\|                             ┃ ");
			System.out.println(" ┃                       \\ /-\\ /                              ┃ ");
			System.out.println(" ┃           🌼🌹🌼       V   V          🌼🌹🌼              ┃ ");
			break;
		}
		
		try {
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ ");
			
			printLoadingDots();
			
			System.out.println("✦ ╮ ");
			System.out.println("  │ ");
			System.out.println("  │ ");
			System.out.println("  │  " + charName + "은(는) 산책을 다녀와 상쾌해졌습니다. ");
			System.out.println("  │  청결도가 8 감소했으며, 15 경험치를 얻었습니다. ");
			System.out.println("  │ ");
			System.out.println("  │ ");
			System.out.println("  ╰─────────────────────────────────────────────── 🐙");
			
			Thread.sleep(2000); 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	public void WashScript(String charName, int level) { // (4) 씻기기
		
		control.wash();
		
		try {
			System.out.println("	    // ");
			System.out.println("	  _____");
			System.out.println("	(_______)");
			System.out.println(" 	| | | |");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("	  | | |");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("	 | | | |");
			System.out.println();
			Thread.sleep(1000);
			System.out.println("	  | | |");
			System.out.println();
			Thread.sleep(1000);
			System.out.println(" 	| | | |");
			System.out.println();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		switch (level) {
		case 1:
			System.out.println("	  .-. ");
			System.out.println("	 ( ^ ) ");
			System.out.println("	  \" \" ");
			break;
		case 2:
			System.out.println("      .^._.^. ");
			System.out.println("     (   _ _  ) ");
			System.out.println("      |   ^  |");
			System.out.println("       V   V ");
			break;
		case 3:
			System.out.println("       .^._.^.   ");
			System.out.println("       | _ _ |   ");
			System.out.println("      (   ^   )   ");
			System.out.println("      .'     '.  ");
			System.out.println("      |/     \\|  ");
			System.out.println("       \\ /-\\ / ");
			System.out.println("        V   V   ");
			break;
		}

		try {
			Thread.sleep(1000);

			System.out.println("✦ ╮ ");
			System.out.println("  │ ");
			System.out.println("  │ ");
			System.out.println("  │  " + charName + "은(는) 보송보송해졌습니다! ✩ ");
			System.out.println("  │  청결도가 20 상승했으며, 5 경험치를 얻었습니다.");
			System.out.println("  │ ");
			System.out.println("  │ ");
			System.out.println("  ╰─────────────────────────────────────────────── 🐙");

			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public void SleepScript(String charName) { // (5) 잠자기
		
		control.sleep();
		
		try {
			Thread.sleep(500); 
			System.out.println("	★");
			Thread.sleep(500);
			System.out.println("    	     ⭐");
			Thread.sleep(500);
			System.out.println("  	⭐");
			Thread.sleep(500);
			System.out.println("    	        🌛       ★");
			Thread.sleep(500);
			System.out.println("        	     ⭐");
			Thread.sleep(500);
			System.out.println("	          ________      ________     ");
			System.out.println(" 	        /\\_____  \\    /\\_____  \\    ");
			System.out.println("	 ____    \\/____//'/'   \\/____//'/'   ");
			System.out.println("	/\\_ ,`\\       //'/'         //'/'     ");
			System.out.println("	\\/_/  /_     //'/'___      //'/'___   ");
			System.out.println(" 	 /\\____\\    /\\_______\\    /\\_______\\");
			System.out.println("  	 \\/____/    \\/_______/    \\/_______/");
			System.out.println("          ⭐");
			Thread.sleep(1000);
			System.out.println("✦ ╮ ");
			System.out.println("  │ ");
			System.out.println("  │ ");
			System.out.println("  │  " + charName + "은(는) 잠에 들었습니다 ... ");
			System.out.println("  │  청결도가 3 감소했으며, 체력을 모두 회복했습니다.");
			System.out.println("  │ ");
			System.out.println("  │ ");
			System.out.println("  ╰─────────────────────────────────────────────── 🐙");
			
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
	public void endingScript(String charName, int level) {
		
		try {
			Thread.sleep(1000);
			System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓ ");
			System.out.println(" ┃      어느새 자바고치를       ┃ ");
			System.out.println(" ┃          만난 지도           ┃ ");
			System.out.println(" ┃         어언 7일 . . .       ┃ ");
			System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ ");
			
			System.out.println();
			
			Thread.sleep(2000);
			System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓ ");
			System.out.println(" ┃         자바고치는           ┃ ");
			System.out.println(" ┃      새로운 세상을 향해      ┃ ");
			System.out.println(" ┃      나아가려 합니다. . .    ┃ ");
			System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ ");
			
			System.out.println();
			
			printLoadingDots();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		switch(level) {
		case 1 : 
			System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┃      |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|      ┃ ");
			System.out.println(" ┃      |  저는 주인님의 사랑이 필요했어요... 하지만   |      ┃ "); 
			System.out.println(" ┃      |  주인님은 많이 바쁘셨는지 저에게 사랑과 관심 |      ┃ ");
			System.out.println(" ┃      |  보다는 그저 물질적으로 풍요롭게만 해주셨    |      ┃ ");
			System.out.println(" ┃      |  어요... 주인님 때문에 저는 많이 외로워      |      ┃ ");
			System.out.println(" ┃      |  했답니다... 다음에 다른 자바고치를 맞게 된  |      ┃ ");
			System.out.println(" ┃      |  다면 저처럼 외롭게 만들지 말아주세요...     |      ┃ ");
			System.out.println(" ┃      |                                              |      ┃ ");
			System.out.println(" ┃      ￣￣￣￣￣＼|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣       ┃ ");
			System.out.println(" ┃                  ✦                                         ┃  ");
			System.out.println(" ┃                        .-.                                 ┃ ");
			System.out.println(" ┃                       ( - )                                ┃ ");
			System.out.println(" ┃                        \" \"  . . .                          ┃ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ ");
			break;
			
		case 2 : 
			System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┃      |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|      ┃ ");
			System.out.println(" ┃      |  주인님은 저와 많은 시간을 보내려고 노력     |      ┃ "); 
			System.out.println(" ┃      |  하셨어요... 좋은 일도 나쁜 일도 주인님과    |      ┃ ");
			System.out.println(" ┃      |  함께 한 순간들은 모두 즐거웠답니다...       |      ┃ ");
			System.out.println(" ┃      |  다음에 주인님을 만나게 될 자바고치는 분명   |      ┃ ");
			System.out.println(" ┃      |  저만큼이나 행복할 거예요...                 |      ┃ ");
			System.out.println(" ┃      |                                              |      ┃ ");
			System.out.println(" ┃      ￣￣￣￣￣＼|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣       ┃ ");
			System.out.println(" ┃                  ✦                                         ┃  ");
			System.out.println(" ┃                         .^._.^.                            ┃ ");
			System.out.println(" ┃                        (   _ _  )                          ┃ ");
			System.out.println(" ┃                         |      |  ♡                        ┃ ");
			System.out.println(" ┃                          V   V                             ┃ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ ");
			break;
		
		case 3 : 
			System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┃      |￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣|      ┃ ");
			System.out.println(" ┃      |  저는 주인님의 사랑을 받으며 누구보다도 건강 |      ┃ "); 
			System.out.println(" ┃      |  하고 행복하게 자랄 수 있었어요. 저는 이제   |      ┃ ");
			System.out.println(" ┃      |  세상으로 나갈 준비가 되었어요. 더 넓은 세상 |      ┃ ");
			System.out.println(" ┃      |  에서 더 많은 것들을 보고 배우게 되겠죠.     |      ┃ ");
			System.out.println(" ┃      |  다음에 다른 자바고치를 키울 때도 저를 키울  |      ┃ ");
			System.out.println(" ┃      |  때처럼 사랑과 정성으로 키워주세요!          |      ┃ ");
			System.out.println(" ┃      |                                              |      ┃ ");
			System.out.println(" ┃      ￣￣￣￣￣＼|￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣￣       ┃ ");
			System.out.println(" ┃                  ✦                                         ┃  ");
			System.out.println(" ┃                       .^._.^.                              ┃ ");
			System.out.println(" ┃                       | ◜︎ ◝︎ |                              ┃ ");
			System.out.println(" ┃                       (  ヮ  )                             ┃ ");
			System.out.println(" ┃                      .'     '.                             ┃ ");
			System.out.println(" ┃                      |/     \\| ♥ ♥                         ┃ ");
			System.out.println(" ┃                       \\ /-\\ /                              ┃ ");
			System.out.println(" ┃                        V   V                               ┃ ");
			System.out.println(" ┃                                                            ┃ ");
			System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ ");
			break;
		}

		printLogo();
		
		System.out.println("✦ ╮ ");
		System.out.println("  │ ");
		System.out.println("  │ ");
		System.out.println("  │  " + charName + "은(는) 넓은 세상으로 독립했습니다. ");
		System.out.println("  │                       ⯎ 최종 성장도: " + level);
		System.out.println("  │ ");
		System.out.println("  │ ");
		System.out.println("  ╰─────────────────────────────────────────────── 🐙");
	}
	
	private void printLoadingDots() throws InterruptedException {
	    for (int i = 0; i < 3; i++) {
	        Thread.sleep(1000);
	        System.out.print("  " + "⯎".repeat(i + 1)); 
	        System.out.println();
	    }
	    System.out.println();
	}
	
	private void printLogo() {
		
		try {
			printLoadingDots();
			Thread.sleep(1000);
			
			System.out.println("	 __                                  ");
			System.out.println("	/\\_\\       __      __  __     __     ");
			System.out.println("	\\/\\ \\    /'__`\\   /\\ \\/\\ \\  /'__`\\   ");
			System.out.println("	 \\ \\ \\  /\\ \\L\\.\\_ \\ \\ \\_/ |/\\ \\L\\.\\_ ");
			System.out.println("	 _\\ \\ \\ \\ \\__/.\\_\\ \\ \\___/ \\ \\__/.\\_\\");
			System.out.println("	/\\ \\_\\ \\ \\/__/\\/_/  \\/__/   \\/__/\\/_/");
			System.out.println("	 \\/___/                              ");
			System.out.println("	                   __               __                ");
			System.out.println("	                  /\\ \\__           /\\ \\         __    ");
			System.out.println("	   __       ___   \\ \\ ,_\\    ___   \\ \\ \\___    /\\_\\   ");
			System.out.println("	 /'_ `\\    / __`\\  \\ \\ \\/   /'___\\  \\ \\  _ `\\  \\/\\ \\  ");
			System.out.println("	/\\ \\L\\ \\  /\\ \\L\\ \\  \\ \\ \\_ /\\ \\__/   \\ \\ \\ \\ \\  \\ \\ \\ ");
			System.out.println("	\\ \\____ \\ \\ \\____/   \\ \\__\\\\ \\____\\   \\ \\_\\ \\_\\  \\ \\_\\");
			System.out.println("	 \\/___L\\ \\ \\/___/     \\/__/ \\/____/    \\/_/\\/_/   \\/_/");
			System.out.println("	   /\\____/                                                    ");
			System.out.println("	   \\_/__/                                             ");
			
			System.out.println();
			
			Thread.sleep(2000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	
}

class CharacterMood {
	
	Controller control;
	
	public CharacterMood(Controller control) {
        this.control = control;
    }
	
    public void print(String name) {
    	int characterClean = control.getCharacter().getCharacterClean();
    	
        int boxWidth = 26; 

        String message = "";
        
        if (characterClean >= 30) {
            int random = (int)(Math.random() * 2) + 1;
            switch(random) {
                case 1: message = "*" + name + "의 기분이 좋아 보입니다. *"; break;
                case 2: message = "*" + name + "은(는) 아주 행복해보입니다! *"; break;
                default: message = "🎶"; break;
            }
        } 
        else if (characterClean >= 10) {
            message = "*" + name + "은(는) 평소 같은 하루를 보냅니다. *";
        } 
        else {
            int random = (int)(Math.random() * 2) + 1;
            switch(random) {
                case 1: message = "*" + name + "의 표정이 우중충해 보입니다... *"; break;
                case 2: message = "*" + name + "의 기분이 안 좋아 보입니다.. *"; break;
                default: message = "🎶"; break;
            }
        }

        System.out.print(message);

        int messageLength = getVisualLength(message);
        for (int i = 0; i < (boxWidth - messageLength); i++) {
            System.out.print(" ");
        }
    }

    private int getVisualLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            if (c >= '\uAC00' && c <= '\uD7A3') length += 2;
            else length += 1; 
        }
        return length;
    }
}
