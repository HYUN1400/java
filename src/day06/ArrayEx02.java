package day06;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 그림파일만 출력 => jpg, png
		
		
		String[] files = {
				"이것이자바다.java", "java의정석.java", "array.txt",
				"arrays.java", "String.txt", "StringMethod.jpg",
				"ArrayMethod.png", "method.jpg", "javaMethod.png"
		};
		
		boolean check = false;
		
		int i = 0;
		
		
		for(i = 0; i < files.length; i++) {
			
			String fileSuffix = files[i].substring(files[i].lastIndexOf(".") + 1);
			
			if(fileSuffix.equals("jpg") || fileSuffix.equals("png")) {
				System.out.println(files[i]);
				check = true;
			}
		}
		
		if(!check) {
			System.out.println("일치하는 항목이 없습니다.");
		}
		
		
		
		
		
		// END
	}

}
