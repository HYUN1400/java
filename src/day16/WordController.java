package day16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class WordController {
	
	Scanner scan = new Scanner(System.in);
	Map<String, List<String>> words = new HashMap<>();
	
	public void testWord() {
		List<String> meaning1 = new ArrayList<>();
		meaning1.add("은하");
		words.put("galaxy", meaning1);

		List<String> meaning2 = new ArrayList<>();
		meaning2.add("성운");
		words.put("nebula", meaning2);
		
		List<String> meaning3 = new ArrayList<>();
		meaning3.add("성간");
		words.put("interstellar", meaning3);

	}
	
	public void insertMeanings(List<String> meanings, String word) {
		
		while(true) {	
			
			String meaning = scan.next();					
			meanings.add(meaning);					
			words.put(word, meanings);
			
			System.out.println("■■■■■■■■■ 다른 뜻이 더 있나요? 👉");
			System.out.println("1) 다음 뜻 입력 | 0) 입력 종료");
			
			int select = scan.nextInt();
			
			if(select == 0) {
				System.out.println("■■■■■■■■■ 등록을 완료했습니다!");
				break;
			}
			
			System.out.println("■■■■■■■■■ 다른 뜻을 입력해주세요.");

		}
		
	}
	
	public void insertWord() {
		int select = 1;
		
		while(true) {			
			try {
				List<String> meanings = new ArrayList<>();
				
				System.out.println("■■■■■■■■■ 단어를 입력해주세요 👉");
				String word = scan.next();
				
				System.out.println("■■■■■■■■■ 뜻을 입력해주세요 👉");
				
				insertMeanings(meanings, word);
				
				System.out.println("1) 다른 단어 등록 | 0) 등록 종료");
				select = scan.nextInt();
				
			} catch (Exception e) {
				System.out.println("입력값이 잘못되었습니다.");
				scan.nextLine();
			}
			
			if(select == 0) {
				System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ 등록을 종료합니다.");
				break;
			}
		}
	}
	
	
	public void searchWord() {
		System.out.println("■■■■■■■■■ 검색할 단어를 입력해주세요 👉");
		String word = scan.next();
		
		if(!words.containsKey(word)) {
			System.out.println("아직 등록되지 않은 단어입니다! 🔎");
			return;
		}
		
		System.out.println(word + " | " + words.get(word));	
	}
	
	
	public void modifyWord() {
		System.out.println("■■■■■■■■■ 수정할 단어를 골라 (영어로)입력해주세요 👉");
		allWords();
		
		String selectWord = scan.next();		
		words.remove(selectWord);
		
		System.out.println("■■■■■■■■■ 정확한 단어와 뜻을 다시 등록해주세요 👉");
		
		try {
			List<String> meanings = new ArrayList<>();
			
			System.out.println("■■■■■■■■■ 정확한 단어를 입력해주세요 👉");
			String word = scan.next();
			
			System.out.println("■■■■■■■■■ 정확한 뜻을 입력해주세요 👉");
			
			insertMeanings(meanings, word);
			
			words.put(word, meanings);				
		} catch (Exception e) {
			System.out.println("입력값이 잘못되었습니다.");
			scan.nextLine();
		}
		
	}
	
	
	public void allWords() {
		System.out.println("――――――――――――――――――――――――――――――――――――――――");
		
		for(String key : words.keySet()) {
			System.out.println("|\t" + key + " - " + words.get(key) + "\t\t\t|");
		}
		
		System.out.println("――――――――――――――――――――――――――――――――――――――――");
	}
	
	
	public void removeWord() {
		System.out.println("■■■■■■■■■ 삭제할 단어를 골라 (영어로)입력해주세요 👉");
		allWords();
		
		String selectWord = scan.next();		
		words.remove(selectWord);
		
		System.out.println("■■■■■■■■■ 삭제가 완료되었습니다.");
	}

	
	
	
	// CONTROLLER END
}
