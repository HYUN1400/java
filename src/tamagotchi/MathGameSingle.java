package tamagotchi;

import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class MathGameSingle {
	
	private int num1;
	private int num2;
	private int out;
	private String operator;
	private String[] operlist = {"+", "-", "*", "/"};
	
	private int mode;
	private String answer;
	private boolean success;
	
	private Random random = new Random();
	private Scanner scan;
	
	public MathGameSingle(Scanner scan) {
		this.scan = scan;
	}
	
	public void generateEquation() {
		num1 = (int)(random.nextInt(10))+1;
		num2 = (int)(random.nextInt(10))+1;
		operator = operlist[(int)(random.nextInt(4))];
		switch (operator) {
		case "+": out = num1 + num2; break;
		case "-": out = num1 - num2; break;
		case "*": out = num1 * num2; break;
		case "/": num1 = num1 * num2; out = num1 / num2; break;
		}
	}
	
	public String generateQuestion() {
		String question;
		mode = random.nextInt(4);
		switch (mode) {
		case 0:
			answer = Integer.toString(num1);
			question = String.format("		( ) %s %d = %d\n		빈칸에 들어갈 숫자는 무엇일까요??", operator, num2, out);
			break;
		case 1:
			answer = Integer.toString(num2);
			question = String.format("		%d %s ( ) = %d\n		빈칸에 들어갈 숫자는 무엇일까요??", num1, operator, out);
			break;
		case 2:
			answer = Integer.toString(out);
			question = String.format("		%d %s %d = ( )\n		빈칸에 들어갈 숫자는 무엇일까요??", num1, operator, num2);
			break;
		default:
			answer = operator;
			question = String.format("		%d ( ) %d = %d\n		빈칸에 들어갈 연산자는 무엇일까요??", num1, num2, out);
		}
		return question;
	}
	
	public String getCorrectText() {
		return "	정답이에요!";
	}
	
	public String getWrongText() {
		return String.format("	정답이 아니에요.... 정답: %s", answer);
	}
	
	public String startGame() {
		generateEquation();
		return generateQuestion();
	}
	
	public String checkAnswer() {
		String userAnswer;
		if (mode == 3) {
			userAnswer = InputChecker.selectFromOptions(
					scan, 
					"여기에 연산자를 입력해주세요. ✦ ", 
					"잘못된 입력입니다. 다시 입력해주세요. ✦ ", 
					operlist
					);
		} else {
			userAnswer = Integer.toString(InputChecker.selectInteger(
					scan, 
					"여기에 숫자를 입력해주세요. ✦ ", 
					"잘못된 입력입니다. 다시 입력해주세요. ✦ "
					));
		}
		if(userAnswer.equals(answer)) {
			success = true;
			return getCorrectText();
		} else if (mode == 3) {		// 연산자를 구해야하는 경우 중 두 개 이상의 답이 있는 경우
			if (
					(num1 == 2 && num2 == 2 && out == 4 && Set.of("+", "*").contains(userAnswer)) ||
					(num1 == 4 && num2 == 2 && out == 2 && Set.of("-", "/").contains(userAnswer)) ||
					(num2 == 1 && out == num1 && Set.of("*", "/").contains(userAnswer))
					) {
				success = true;
				return getCorrectText();
			}
		} 
		return getWrongText();
	}

	public boolean isSuccess() {
		return success;
	}
	
}