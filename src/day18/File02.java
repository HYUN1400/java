package day18;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class File02 {

	public static void main(String[] args) throws IOException {
		// FileWriter		
		FileWriter fw = new FileWriter("test.txt");
		
		for(int i = 1; i <= 10; i++) {
			String data = i + ". test! \n"; // 쓸 데이터
			fw.write(data);
			fw.write("I/O TEST FILE!!! \n"); // 추가 데이터가 생기면 삭제 => 새로 생성
		}
		
		
		fw.close();
		
		// 추가모드 : 기존 파일에 데이터를 추가로 쓰려고 할 때
		FileWriter fw1 = new FileWriter("test.txt", true);
		
		for(int i = 11; i <= 20; i++) {
			String data = i + ". test! \n"; // 쓸 데이터
			fw1.write(data);
		}
		
		fw1.close();
		
		
		
		// PrintWriter
		PrintWriter pw = new PrintWriter("writer.txt");
		
		for(int i = 1; i <= 10; i++) {
			String data = i + ". printWriter test \n";
			pw.write(data);
		}
		
		
		pw.close();
		
		// printWriter는 추가모드가 없음. (FileWriter 가져오기)
		
		PrintWriter pw1 = new PrintWriter(new FileWriter("writer.txt", true));
		
		for(int i = 11; i<=20; i++) {
			String data = i + ". 추가 data \n";
			pw1.write(data);
		}
		
		
		pw1.close();
		
		
		
		// 바이트 기반 스트림
		FileOutputStream output = new FileOutputStream("out.txt");
		
		for(int i = 1; i <= 10; i++) {
			String data = i + ". 바이트 기반 스트림 TEST \n";
			output.write(data.getBytes());
		}
		
		output.close();
		
	}

}
