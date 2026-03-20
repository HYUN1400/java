package day05;

public class StringEx01 {

	public static void main(String[] args) {
		// 주민등록번호를 참고하여 생년월일과 나이, 성별을 출력
		String regNum = "990101-1234567"; // 1900년대 => 1(남자) 2(여자)
//		String regNum = "000101-4234567"; // 2000년대 => 3(남자) 4(여자)
		int today = 2026;
		int age;
		
		/*
		 * 출력결과
		 * 생년월일 : 990101
		 * 성별: 남
		 * 나이: 27
		 * 
		 */
		
		String birth = regNum.substring(0, regNum.indexOf("-")); 
		String birthYear = regNum.substring(0, 2);
		char gender = regNum.charAt(7);
		
		System.out.println("생년월일 👉 " + birth);
		
		/*
		 * String.valueOf(regNum.charAt(7)) == "1"
		 */
		
		if(gender == '1' || gender == '3') {
			System.out.println("성별 👉 남");
		} else if(gender == '2' || gender == '4') {
			System.out.println("성별 👉 여");
		}
		
		if(gender == '1' || gender == '2') {
//			age = "19".concat(birthYear);
			age = Integer.parseInt("19" + birthYear);
			System.out.println("나이 👉 " + (today - age));
		} else if(gender =='3' || gender =='4') {
//			age = "20".concat(birthYear);
			age = Integer.parseInt("20" + birthYear);
			System.out.println("나이 👉 " + (today - age));
		}
		
		
		
	}

}
