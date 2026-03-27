package day10;

import java.util.Arrays;
import java.util.Scanner;

public class ReportMain {

	public static void main(String[] args) {
		// 객체의 값을 입력 받아 객체 생성 후 배열에 저장
		// 등수 => 출력
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("학생 숫자 입력 > ");
		int num = scan.nextInt();
		
		
		Report[] report = new Report[num];
		
		report[0] = new Report("peter", 89, 90, 95);
		report[1] = new Report("tony", 90, 99, 100);
		report[2] = new Report("steve", 83, 80, 75);
		report[3] = new Report("bucky", 74, 88, 91);

		
		int rank[] = new int[report.length];
		
		for(int i = 0; i < report.length; i++) {
			rank[i] = 1;
			for(int k = 0; k < report.length; k++) {
				if(report[i].getSum() < report[k].getSum()) {
					rank[i] ++;
				}
				report[i].setRank(rank[i]);
			}
		}
		
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등수");
		for(Report r : report) {
			System.out.println(r);
		}
		
		
		scan.close();
		
	}

}
