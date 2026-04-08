package day18;

import java.io.File;

public class File05 {

	public static void main(String[] args) {
		// File 객체: 드라이브부터 + 경로 + 파일면 + 확장자 => 내용
		// D:\\web_260316_lch\\memo\\scores.txt
		// 파일 구분자 => 운영체제마다 다름 (윈도우, 맥, linux, unix)
		// / \ => File.separator:
		
		// File 객체를 생성할 때
		File file = new File("D:\\web_260316_lch");
		file = new File(file, "memo");
		file = new File(file, "scores.txt");
		System.out.println(file.toString());
		System.out.println(file.separator);
		String driver = "D";
		String folder = "memo";
		String file01 = driver + file.separator + folder;
		System.out.println(file01);
		
		System.out.println(file.getParent()); // 상위 경로만
		System.out.println(file.getPath()); // 전체 경로
		System.out.println(file.getName()); // 파일 이름만
	}

}
