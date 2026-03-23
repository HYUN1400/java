package day06;

import java.util.Scanner;

public class ArrayEx01 {

	public static void main(String[] args) {
		// 파일명을 저장하고 있는 배열
		// 검색어를 입력하면 해당 검색어를 포함하고 있는 파일을 출력
		// 검색 결과X => "일치하는 항목이 없습니다." 출력
		// 대소문자 구분 없이 출력
		
		Scanner scan = new Scanner(System.in);
		
		String[] files = {
				"이것이자바다.java", "java의정석.java", "array.txt",
				"arrays.java", "String.txt", "StringMethod.jpg",
				"ArrayMethod.png", "method.jpeg", "javaMethod.png"
		};
		
		
		// 1. 검색어 입력받기
		
		System.out.println("검색어를 입력해주세요. 🔎 >");
		String search = scan.next().toLowerCase();

		int count = 0;

		
		
		for(int i = 0; i < files.length; i++) {
			if(files[i].toLowerCase().contains(search)) {
					System.out.println(files[i]);
					count ++;
			}
		}
		
		if(count == 0) {
			System.out.println("일치하는 항목이 없습니다.");
		}
		
		
		
		scan.close();
				
			
		
		// END
	}

}
