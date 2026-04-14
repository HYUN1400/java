package tamagotchi;

import java.util.Scanner;

public class TamagotchiMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);		
		Controller control = new Controller();	
		TamagotchiScript ts = new TamagotchiScript(control); 
		
		control.newGame(scan);
		String charName = control.getCharacter().getCharacterName();
		
		ts.HelloScript();

		int day = 0;

		while (true) {
			
			day = control.getDay();

			Character character = control.getCharacter();
			int level = character.getCharacterLevel();

			if (day == 7) {
				ts.endingScript(charName, character.getCharacterLevel());
				break;
			}

			ts.Tamagotchi(day, character);

			int select = Integer.parseInt(InputChecker.selectFromOptions(scan, 
					"원하는 행동에 해당하는 숫자를 입력해주세요. ✦  ",
					"존재하지 않는 메뉴입니다. 다시 입력해주세요. ✦ ", 
					"1", "2", "3", "4", "5", "6"));

			if (select == 6) {
				ts.byeScript(charName);
				break;
			}

			int stamina = character.getCharacterStamina();
				
			switch(select) {
			case 1: ts.FeedScript(charName, level); break;
			case 2:
				if (stamina >= 15) ts.WalkScript(charName, level);
				else ts.lowStamina();
				break;
			case 3:
				if (stamina >= 20) ts.GameScript(scan);
				else ts.lowStamina();
				break;
			case 4: 
				if (stamina >= 5) ts.WashScript(charName, level);
				else ts.lowStamina();
				break;
			case 5: 
			default: ts.SleepScript(charName); break;
			}

		}
	}

}
