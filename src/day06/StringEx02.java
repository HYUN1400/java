package day06;

public class StringEx02 {

	public static void main(String[] args) {
		/*
		 * fileName.suffix
		 * 파일명 / 확장자를 분리하여 출력
		 * 확장자가 java 면 "자바파일입니다." / "기타파일입니다."
		 * 
		 */
		
		String file = "자바의 정석.java";
//		String file = "기타 파일.png";
		
//		String fileName = file.substring(0, file.indexOf("."));
//		String suffix = file.substring(file.indexOf(".")+1);
//		
//		System.out.println("파일명: " + fileName + ", 확장자: " + suffix);
		
		String files[] = file.split("\\.");
		String fileName = files[0];
		String suffix = files[1];
		
		System.out.println("파일명: " + fileName + ", 확장자: " + suffix);
		
//		if(suffix.equals("java")) {
//			System.out.println("자바 파일입니다.");
//		} else {
//			System.out.println("기타 파일입니다.");
//		}
		
		System.out.println(suffix.equals("java") ? "자바 파일입니다." : "기타 파일입니다.");
		
	}

}
