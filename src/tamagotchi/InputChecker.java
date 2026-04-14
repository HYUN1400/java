package tamagotchi;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class InputChecker {

	public static String selectFromOptions (
			Scanner scan,
			String firstMessage,
			String retryMessage,
			String ...options
			) {
		return selectFromOptions (
				scan, 
				firstMessage,
				retryMessage,
				Arrays.asList(options)
				);
	}
	
	private static String selectFromOptions (
			Scanner scan,
			String firstMessage,
			String retryMessage,
			List<String> options
			) {
		System.out.print(firstMessage);
		String input = "";
		while (true) {
			input = scan.nextLine();
			if (options.contains(input)) break;
			System.out.print(retryMessage);
		}
		return input;
		
	}
	
	public static int selectInteger (
			Scanner scan,
			String firstMessage, 
			String retryMessage) {
		
		System.out.print(firstMessage);
		int input = 0;
		while (true) {
			try {
				input = scan.nextInt();
				scan.nextLine();
				break;
			} catch (InputMismatchException e) {
				scan.nextLine();
				System.out.print(retryMessage);
				continue;
			}
		}
		return input;
		
	}
}
