package day14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exception05 {

	public static void main(String[] args) throws IOException {
		// IO Exception 발생 예제
		
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		String name = "";
		
		name = br.readLine();
		System.out.println(name);
		
	}

}
