package day18;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FileEx01 {

	public static void main(String[] args) {
		// D:\web_260316_lch\memo\scores.txt
		// 파일을 읽어들여 map 저장
		// 명단 출력 / 합계 / 평균
		// 점수가 80점 이상인 학생의 명단 => 인원수 출력
		
		String fileName = "D:\\web_260316_lch\\memo\\scores.txt";
		Map<String, Integer> scores = new HashMap<>();
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			
			while(true) {
				String line = br.readLine(); // 한 라인으로 읽어오기
				
				if(line == null) {
					break;
				}
				
				String arr[] = line.split(" ");				
				scores.put(arr[0], Integer.parseInt(arr[1]));
			}
			
			int sum = 0;
			double avg = 0;
			
			
			System.out.println("•─────────⋅☾ 명단 ☽⋅─────────•");
			for(String key : scores.keySet()) {
				sum += scores.get(key);
				avg = sum / (double)scores.size();
				System.out.println( key + ": " + scores.get(key));
			}
			
			
			System.out.println("•─────────⋅☾ 점수 ☽⋅─────────•");
			System.out.println("점수 합계: " + sum + " | 평균: " + avg);
			
			System.out.println("•─────────⋅☾ 80점 이상 ☽⋅─────────•");
			scores.entrySet().stream().filter(n -> n.getValue() >= 80).forEach(n -> System.out.println(n.getKey() + ": " + n.getValue()));
			
			br.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
			
		} catch (IOException e) {
			
			e.printStackTrace();
			
		}
	
		
		
		
		
		
		
		// MAIN END
		
	}

}
