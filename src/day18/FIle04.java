package day18;

import java.io.FileWriter;
import java.io.IOException;

public class FIle04 {

	public static void main(String[] args) throws IOException {
		// 경로를 지정하지 않으면 상대경로에 생성 (내 프로젝트 내부)
		// 경로 지정 => D:\web_260316_lch\memo
		
		String fileName = "D:\\web_260316_lch\\memo\\test.txt";
		// 파일 이름 => 드라이브로부터의 경로 + 파일 이름 + 확장자
		
		FileWriter fw = new FileWriter(fileName);
		
		for(int i = 1; i <= 10; i++) {
			String data = i + ". test! \n"; 
			fw.write(data);
		}
		
		
		fw.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// MAIN END
	}

}
