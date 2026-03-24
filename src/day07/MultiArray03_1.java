package day07;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray03_1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("인원을 입력해주세요. >");
		
		int tester = scan.nextInt();
		int subject = 3;
		
		String[] name = new String[tester];
		int[][] scores = new int[tester][subject];
		int[] total = new int[tester];
		double[] avg = new double[tester];
		int[] rank = new int[tester];
		
		// 이름 + 점수 입력
		
		for(int i = 0; i < tester; i++) {
			System.out.println((i+1)+"번 째 학생의 이름을 입력해주세요. >");
			name[i] = scan.next();
//			System.out.println(name[i] + "의 성적을 입력해주세요. (국어 | 영어 | 수학) >");
					
			for(int j = 0; j < subject; j++) {
				//scores[i][j] = scan.nextInt(); // 콘솔에서 성적 입력받기
				scores[i][j] = (int)(Math.random()*70+30); 
				total[i] += scores[i][j]; // 합계
			}
			avg[i] = total[i] / (double)subject;
		}
		
		
		for(int i = 0; i < tester; i++) {
			rank[i] = 1;
			for(int j = 0; j < tester; j++) {
				if(avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		
		
		System.out.println("이름\t국어\t영어\t수학\t합계\t평균\t등수");
		for(int i = 0; i < tester; i++) {		
			System.out.print(name[i] + "\t");
			for(int j = 0; j < scores[i].length; j++) {				
				System.out.print(scores[i][j] + "\t");
			}
			System.out.print(total[i] + "\t");
			System.out.printf("%.2f\t", avg[i]);
			System.out.print(rank[i] + "\t");
		}
	
		
		
		
		
		
		
		// END
	}

}
