package WordPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class WordController {
	private List<Word> wordBook = new ArrayList<>();
//	private Map<String, List<String>> w = new HashMap<>(); // 클래스 없이 map으로 생성할 경우 
	
	public void addWord() {
		// 기본 단어 추가
		// 단어 : String / 뜻 : List
		
		List<String> tmp = new ArrayList<>();
		String word1 = "right";
		tmp.add("오른쪽");
		tmp.add("정확한");
		tmp.add("권리");		
		wordBook.add(new Word(word1, tmp));
		
		List<String> tmp2 = new ArrayList<>();
		String word2 = "astro";
		tmp2.add("별");
		tmp2.add("우주의");
		tmp2.add("천체의");		
		wordBook.add(new Word(word2, tmp2));
		
		List<String> tmp3 = new ArrayList<>(Arrays.asList("개척하다", "식민"));
		String word3 = "colonize";
		wordBook.add(new Word(word3, tmp3));
	}
	
	
	public void insertWord(Scanner scan) {
		List<String> tmp = new ArrayList<>();
		System.out.println("■■■■■■■■■■■ 단어를 입력해주세요. >>> ");
		String word = scan.next();
		
		String end = "n";
		while(!end.toLowerCase().equals("y")) {
			System.out.println("■■■■■■■■■■■ 뜻을 입력해주세요. >>>");
			scan.nextLine(); // 버퍼 비우기
			tmp.add(scan.nextLine());
			
			System.out.println("■■■■■■■■■■■ 등록을 종료하시겠습니까? (y)");
			end = scan.next();		
			
		}
		
		wordBook.add(new Word(word, tmp));
		
	}


	public void searchWord(Scanner scan) {
		// 단어 검색
		System.out.println("■■■■■■■■■■■ 검색할 단어를 입력하세요. ");
		String word = scan.next();
		
		int index = wordBook.indexOf(new Word(word));
		
		if(index == -1) {
			System.out.println("검색 결과가 없습니다.");
			return;
		}
		
		System.out.println(wordBook.get(index));
	}


	public void modifyWord(Scanner scan) {
		// 단어 수정
		System.out.println("■■■■■■■■■■■ 수정할 단어를 입력하세요.");
		allWords();
		String word = scan.next();
		
		int index = wordBook.indexOf(new Word(word));
		if(index == -1) {
			System.out.println("등록되지 않는 단어입니다.");
			return;
		}
		
		List<String> mean = wordBook.get(index).getMean();
		int cnt = 0;
		for(String m: mean) {
			cnt++;
			System.out.println(cnt + ". " + m);
		}
		System.out.println("■■■■■■■■■■■ 수정할 뜻의 번호를 선택해주세요.");
		int i = scan.nextInt();
		System.out.println("■■■■■■■■■■■ 변경할 뜻을 입력해주세요.");
		scan.nextLine();
		String modifyMean = scan.nextLine();
		
		mean.set(i-1, modifyMean);
		wordBook.set(index, new Word(word, mean));
		
		System.out.println("수정이 완료되었습니다.");
		
	}


	public void allWords() {
		// 전체 단어 출력
		System.out.println("•─────────⋅☾ 단어장 ☽⋅─────────•");
		
		Collections.sort(wordBook); // class에서 구현한 Comparable이 작동하여 정렬
		
		for(Word w : wordBook) {
			System.out.println(w);
		}

		
	}


	public void removeWord(Scanner scan) {
		// 단어 삭제
		System.out.println("■■■■■■■■■■■ 삭제할 단어를 입력하세요.");
		allWords();
		String word = scan.next();
		
		if(wordBook.remove(new Word(word))) {
			System.out.println("삭제가 완료되었습니다.");
			return;
		}
		
		System.out.println("삭제에 실패했습니다.");
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//END
	
}
