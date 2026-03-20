package day05;

import java.util.Arrays;

public class String02 {

	public static void main(String[] args) {
		// String method
		
		String str = "SPIDER-MAN : Brand New Day";
		String str2 = "Spider-man, Deadpool, Daredevil";
		System.out.println(str);
		
		// toLowerCase() / toUpperCase() : 소문자 변환 / 대문자 변환
		System.out.println("---*to~Case*---");
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		
		// isEmpty() : 값이 비었는지 확인 => boolean => 공백 인지함
		// isBlank() : 값이 비었는지 확인 => boolean => 공백 인지하지 않음
		System.out.println("---*isEmpty*---");
		System.out.println("".isEmpty());
		System.out.println(str.isBlank());
		
		
		// trim() : 불필요한 공백 제거
		System.out.println("---*trim*---");
		System.out.println("     abc     ");
		System.out.println("     abc     ".trim());
		
		
		// replace() : 글자 치환(변환)
		System.out.println("---*replace*---");
		// 2026-03-20 => 2026/03/20
		System.out.println(str2.replace(", ", " & "));
		
		
		// split : 특정 기준 값으로 나누기 => 배열로 리턴
		System.out.println("---*split*---");	
		String strArr[] = str2.split(", ");
		System.out.println(Arrays.toString(strArr));
		
		System.out.println("---*split 향샹 for*---");
		for(String tmp : strArr) {
			System.out.println(tmp);
		}
		
		System.out.println("---*split 일반 for*---");
		for(int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		
		// Integer.parsInt() : 문자를 숫자로
		System.out.println("---*Integer*---");
		String num = "123";
		int num2 = Integer.parseInt(num);
		System.out.println(num2);
		
		
		// String.ValueOf() : 숫자를 문자로
		System.out.println("---*ValueOf*---");
		String num3 = String.valueOf(num2);
		System.out.println(num3);
		
		
		// instanceof : 같은 클래스가 맞는지 확인하는 연산자 (클래스만 가능)
		System.out.println("---*instanceof*---");
		System.out.println(num3 instanceof String);
		
		
		
		
		
		
		
		// END FRAGMENT
	}

}
