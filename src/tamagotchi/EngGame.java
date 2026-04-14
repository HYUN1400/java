package tamagotchi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EngGame extends MiniGame {
	
	public EngGame(Scanner scan) {
		super(scan, 3, 2, 1);
	}
	
	class Words {
		String english;
		String meaning;
		
		Words(String english, String meaning) {
			this.english = english;
			this.meaning = meaning;
		}
	}
	
	private List<Words> dictionary = new ArrayList<>();
	
	private void initializeDictionary() {
		dictionary.add(new Words("apple", "사과"));
		dictionary.add(new Words("ball", "공"));
		dictionary.add(new Words("cat", "고양이"));
		dictionary.add(new Words("dog", "개"));
		dictionary.add(new Words("egg", "알"));
		dictionary.add(new Words("fish", "물고기"));
		dictionary.add(new Words("girl", "여자아이"));
		dictionary.add(new Words("hat", "모자"));
		dictionary.add(new Words("ice", "얼음"));
		dictionary.add(new Words("juice", "주스"));
		dictionary.add(new Words("kite", "연"));
		dictionary.add(new Words("lion", "사자"));
		dictionary.add(new Words("milk", "우유"));
		dictionary.add(new Words("nose", "코"));
		dictionary.add(new Words("orange", "오렌지"));
		dictionary.add(new Words("pen", "펜"));
		dictionary.add(new Words("queen", "여왕"));
		dictionary.add(new Words("rabbit", "토끼"));
		dictionary.add(new Words("sun", "태양"));
		dictionary.add(new Words("tree", "나무"));
		dictionary.add(new Words("umbrella", "우산"));
		dictionary.add(new Words("vest", "조끼"));
		dictionary.add(new Words("water", "물"));
		dictionary.add(new Words("xylophone", "실로폰"));
		dictionary.add(new Words("yellow", "노란색"));
		dictionary.add(new Words("zebra", "얼룩말"));
    }
	
	@Override
	public void start() {

	    initializeDictionary();
	    Collections.shuffle(dictionary);

	    for (int i = 0; i < this.totalAttempt; i++) {

	        EngGameSingle thisGame = new EngGameSingle(scan);

	        printQuestion(i+1, thisGame.startGame(dictionary.get(i)));
	        printResult(thisGame.checkAnswer());

	        successCount += thisGame.isSuccess() ? 1 : 0;
	    }
	}
		
	

}
