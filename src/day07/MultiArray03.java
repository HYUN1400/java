package day07;

import java.util.Arrays;
import java.util.Scanner;

public class MultiArray03 {

	public static void main(String[] args) {
		// 성적표
		/*
		 * 성적 산출 인원 > 3 (입력)
		 * 이름	국어	영어	수학	합계	평균	등수 \t
		 * hong	89	85	78	00	00	00 
		 * kim	89	85	78	00	00	00 
		 * lee	89	85	78	00	00	00 
		 * 
		 * 이름, 국어, 영어, 수학을 입력받아 합계, 평균, 등수
		 */
		
		Scanner scan = new Scanner(System.in);
		
		int subject = 3;
		
		String[] list = {"이름", "국어", "영어", "수학", "합계", "평균", "등수"};
		String[] name = new String[5];
		
		System.out.println("이름을 입력해주세요. >");
		
		for(int i = 0; i < name.length; i++) {
			name[i] = scan.next();					
		}
		
		int[] kor = new int[name.length];
		int[] eng = new int[name.length];
		int[] math = new int[name.length];
		
		for(int i = 0; i < name.length; i++) {
			kor[i] = (int)(Math.random()*70+30);
			eng[i] = (int)(Math.random()*70+30);
			math[i] = (int)(Math.random()*70+30);
		}
		
		int[] sum = new int[name.length];
		double[] avg = new double[name.length];
		
		for(int i = 0; i < name.length; i++) {
			sum[i] = kor[i] + eng[i] + math[i];
			avg[i] = sum[i] / (double)subject;
		}
		
		
		int[] rank = new int[name.length]; // 뒤의 값이랑 비교해서 1 2 3
		
		for(int i = 0; i < name.length; i++) {
			rank[i] = 1;
			for(int j = 0; j < name.length; j++) {
				if(sum[i] < sum[j]) {
					rank[i] ++;
				}
			}
		}
		
		for(int i = 0; i < list.length; i++) {
			System.out.print(list[i] + "\t");
		}
		
		System.out.println();
		
		for(int i = 0; i < name.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(kor[i] + "\t");
			System.out.print(eng[i] + "\t");
			System.out.print(math[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.printf("%.2f\t", avg[i]);
			System.out.print(rank[i] + "\t");
		}
		
		
		
		scan.close();
		
		
		
		
		
		// END	
	}

}
