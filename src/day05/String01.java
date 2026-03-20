package day05;

public class String01 {

	public static void main(String[] args) {
		/* String class : 문자열을 다루기 위한 클래스 => 참조 자료형
		 * class : 여러가지 기능을 가지고 있는 정의서
		 * String str = new String(); => 가능은 하지만 이렇게 정의하지 않음
		 */
		
		String str = "abc c def c";
		System.out.println(str);
		
		
		// length: 문자열의 총 길이 (공백도 1글자로 포함)
		System.out.println("---*length*---");
		System.out.println(str.length());
		
		
		// charAt(index) : index 순서에 있는 문자를 반환 => char
		
		System.out.println("---*charAt*---");
		System.out.println(str.charAt(1));
		
		
		// substring : 필요한 문자만 추출
		// endindex = 마지막 index는 포함하지 않음
		System.out.println("---*substring*---");
		System.out.println(str.substring(4)); // c def c
		
		
		// equals : 두 문자가 같은지 비교 (대소문자 구분)
		// 참조 자료형에서 == 로 비교하면 주소가 같은지 비교
		// 내부값이 같으면 true, 다르면 false 리턴
		System.out.println("---*equals*---");
		System.out.println(str.equals("abc c def c"));
		System.out.println(str.equals("abc"));
		
		
		// indexOf() : 원하는 문자가 몇번재 index에 있는지 찾아줌
		// 한 문자열에 같은 단어가 여러 개라면 처음 일치하는 값만 리턴
		// 찾는 문자열이 없으면 -1 리턴
		// 시작 위치를 지정할 수 있음.
		System.out.println("---*indexOf*---");
		System.out.println(str.indexOf("c"));
		System.out.println(str.indexOf("c", 3));
		
		
		// lastIndexOf : 뒤에서부터 찾기
		System.out.println("---*lastIndexOf*---");
		System.out.println(str.lastIndexOf("c"));
		
		
		// ex) email 에서 id만 추출
		
		System.out.println("---*예제*---");
		String email = "test123@gmail.com";
		System.out.println(email.substring(0, email.indexOf("@")));
		System.out.println(email.substring(email.indexOf("@")+1));
				
		
		// str.compareTo(str2) : str, str2 를 비교하여 기준값이 사전 순으로 앞에 있으면 -, 같으면 0, 뒤에 있으면 + 로 리턴
		// 문자 정렬 시 사용
		
		System.out.println("---*compareTo*---");
		System.out.println("a".compareTo("r"));
		System.out.println("r".compareTo("a"));
				
		
		// contains : 해당 문자를 포함하고 있는지 체크
		System.out.println("---*contains*---");
		System.out.println(str.contains("d"));
		
		
		// concat : 이어붙이기 ( + 연결 연산자와 같은 의미)
		System.out.println("---*concat*---");
		System.out.println("abc".concat("def"));
	
		
		
		// END FRAGMENT
		
	}

}
