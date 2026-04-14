package tamagotchi;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Controller {
	
	private int day;
	private int snackCount; 
	private Character character;
	
	public Controller() {
		
	}
	
	public void newGame(Scanner scan) {
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			// TODO: handle exception
		}
		System.out.println("✦ ╮ ");
		System.out.println("  │ ");
		System.out.println("  │ 	함께할 자바고치의 이름을 정해주세요.");
		System.out.println("  │ ");
		System.out.println("  ╰─────────────────────────────────────────────── 🐙");
		System.out.print("여기에 입력해주세요. ✦ ");
		String name = scan.nextLine();
		if (name.isBlank()) name = "자바고치";
		character = new Character(name);
		day = 1;
		
	}
	
	public void saveGame() {
		
		String fileName = "./tamagotchi_data.txt";
		
		try {

			FileWriter fw = new FileWriter(fileName);

			fw.write(String.format("%d\n", day));
			fw.write(String.format("%d\n", snackCount));
			fw.write(String.format("%s\n", character.getCharacterName()));
			fw.write(String.format("%d\n", character.getCharacterStamina()));
			fw.write(String.format("%d\n", character.getCharacterClean()));
			fw.write(String.format("%d\n", character.getCharacterExp()));
			fw.write(String.format("%d\n", character.getCharacterLevel()));

			fw.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void loadGame() {
		
		String fileName = "./tamagotchi_data.txt";
		
		try {
			
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			day = Integer.parseInt(br.readLine());
			snackCount = Integer.parseInt(br.readLine());
			
			String name = br.readLine();
			character = new Character(name);
			character.setCharacterStamina( Integer.parseInt(br.readLine()) );
			character.setCharacterClean( Integer.parseInt(br.readLine()) );
			character.setCharacterExp(Integer.parseInt(br.readLine()));
			character.setCharacterLevel(Integer.parseInt(br.readLine()));

			br.close();
		} catch (FileNotFoundException e) {		// 저장된 데이터가 없는 경우
			e.printStackTrace();
		} catch (NumberFormatException e) {		// 저장된 데이터가 손상된 경우
			e.printStackTrace();
		} catch (IOException e) {				// 저장된 데이터가 손상된 경우
			e.printStackTrace();
		}
		
	}
	
	public boolean feed() {
		
		if (character.getCharacterStamina() == 80) {
			System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓ ");
			System.out.println(" ┃     ⚠️ 배가 너무 불러요!      ┃ ");
			System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ ");
			return false;
		}
		
		if (snackCount == 0) {
			System.out.println(" ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓ ");
			System.out.println(" ┃     ⚠️ 먹이가 부족합니다!     ┃ ");
			System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ ");
			return false;
		} 
		
		snackCount--;
		character.gainExp(10);
		character.gainStamina(15);
		
		return true;
	}
	
	public boolean takeWalk() {
		
		if (!staminaCheck(15)) return false;

		character.loseClean(8);
		character.loseStamina(15);
		character.gainExp(15);
		 
		 return true;
	}
	
	public boolean wash() {
		
		if (!staminaCheck(5)) return false;
		
		character.gainClean(20);
		character.loseStamina(5);
		character.gainExp(5);
		
		return true;
		
	}
	
	public boolean playGame(Scanner scan) {
		
		if (!staminaCheck(20)) return false;
		
		MiniGame game;
		
	        try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		System.out.println("✦ ╮ ");
		System.out.println("  │ ");
		System.out.println("  │        어떤 게임으로 놀아주실 건가요? "); 
		System.out.println("  │ ");
		System.out.println("  ╰─────────────────────────────────────────────── 🐙");
		System.out.println("  ⯎━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┳━━━━━━━━━━━━━━━━━━━━━━━━━━━━⯎ ");
		System.out.println(" ┃                              ┃                             ┃ ");
		System.out.println(" ┃     ⑴ 사칙 연산  (◉ +1)     ┃    ⑵ 영단어 퀴즈  (◉ +1)   ┃ ");
		System.out.println(" ┃                              ┃                             ┃ ");
		System.out.println(" ┣━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━╋━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┫ ");
		System.out.println(" ┃                              ┃                             ┃ ");
		System.out.println(" ┃     ⑶ 업 앤 다운  (◉ +1)    ┃     ⑷ 가위바위보  (◉ +2)   ┃ ");
		System.out.println(" ┃                              ┃                             ┃ ");
		System.out.println(" ┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┻━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛ ");
		
		int mode = Integer.parseInt(InputChecker.selectFromOptions(
				scan, 
				"원하는 게임에 해당하는 숫자를 입력해주세요. ✦ ", 
				"잘못된 입력입니다. 다시 입력해주세요. ✦ ", 
				"1", "2", "3", "4"
				));
		
		switch(mode) {
		case 1:	game = new MathGame(scan); 	break;
		case 2:	game = new EngGame(scan);	break;
		case 3: game = new NumGame(scan);	break;
		case 4: 
		default: game = new RspGame(scan);	break;
		}
		
		game.start();
		
		character.loseStamina(20);
		int expGain = 25;
		
		if (game.failed()) {
			System.out.println("✦ ╮ ");
			System.out.println("  │ ");
			System.out.println("  │  한 번도 성공하지 못했습니다... 😭😭");
			System.out.println("  │  5 경험치를 얻었습니다.");
			System.out.println("  │ ");
			System.out.println("  ╰─────────────────────────────────────────────── 🐙");
			expGain = 5;
		} else {
			
			int totalAttempt = game.getTotalAttempt();
			int successCount = game.getSuccessCount();
			int successThreshold = game.getSuccessThreshold();
			int rewardSnack = game.getRewardSnack();
			
			System.out.println("✦ ╮ ");
			System.out.println("  │ ");
			System.out.printf("  │  총 %d번 중 %d번 성공했습니다", totalAttempt, successCount);
			System.out.println((successThreshold <= successCount) ? "!! 😄" : ". 😔");
			System.out.printf("  │  ");
			if (rewardSnack > 0) {
				snackCount += rewardSnack;
				System.out.printf("간식을 %d개 얻었으며, ", rewardSnack);
			}
			System.out.println("25 경험치를 얻었습니다.");
			System.out.println("  │ ");
			System.out.println("  ╰─────────────────────────────────────────────── 🐙");
		}
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		if (snackCount > 99) snackCount = 99;
		
		return character.gainExp(expGain);
	}
	
	public void sleep() {
		
		playDiary();
		
		character.loseClean(3);
		character.setCharacterStamina(80);
		
		if (character.getCharacterClean() <= 9)
			character.loseExp(5);
		
		day += 1;
	}
	
	private void playDiary() {
		
	}
	
	public boolean staminaCheck(int amount) {
		return character.getCharacterStamina() >= amount;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getSnackCount() {
		return snackCount;
	}

	public void setSnackCount(int snackCount) {
		this.snackCount = snackCount;
	}

	public Character getCharacter() {
		return character;
	}

	public void setCharacter(Character character) {
		this.character = character;
	}
	
	

}
