package tamagotchi;

import java.util.Scanner;

import tamagotchi.EngGame.Words;

public class EngGameSingle {

    private Scanner scan;
    private String answer;
    private boolean success;

    public EngGameSingle(Scanner scan) {
        this.scan = scan;
    }

    public String startGame(Words q) {
        answer = q.english;
        return String.format("		%s은(는) 영어로 무엇일까요?", q.meaning);
    }

    public String getCorrectText() {
        return "정답이에요!!!";
    }

    public String getWrongText() {
        return String.format("오답이에요... 정답: %s", answer);
    }

    public String checkAnswer() {
    	System.out.print("여기에 정답을 입력해주세요. ✦ ");
        String userAnswer = scan.nextLine().trim();

        if (userAnswer.equalsIgnoreCase(answer)) {
            success = true;
            return getCorrectText();
        } else {
            return getWrongText();
        }
    }

    public boolean isSuccess() {
        return success;
    }
}