package day18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class File03 {

	public static void main(String[] args) {
		// 파일 읽기
		/*
		 * 보조스트림 사용 BufferedReader ( FileReader )
		 * - 라인 단위로 읽기 가능.
		 * - 더이상 읽을 라인이 없다면 (null) 그만 읽기
		 * - 보조스트림은 직접 읽고 쓰는 기능이 없기 때문에 기반 스트림을 매개변수로 포함해야 함.
		 * 
		 */
		
		String fileName = "D:\\web_260316_lch\\memo\\test.txt";
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			while(true) {
				String line = br.readLine(); // 한 라인으로 읽어오기
				
				if(line == null) {
					break;
				}
				
				System.out.println(line);
				
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		} 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// MAIN END
	}

}
