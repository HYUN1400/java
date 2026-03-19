package day04;

import java.util.Scanner;

public class Break01 {

	public static void main(String[] args) {
		// break; : 반복문을 빠져나오는 키워드
		// 반복문에서 조건문(if)를 동반하여 조건이 맞을 때 반복문을 벗어나게 하는 역할
		/*
		 * for, while, do~while, switch 
		 * 
		 * continue : pass, skip 개념
		 * 
		 */
		
		int i;
		
		// break;
		for(i=1; i<=10; i++) {
			if(i == 5) {
				break; // 조건에 맞다면 반복문 벗어나기
			}
			System.out.println(i);
		}
		
		System.out.println(">>> continue >>>");
		
		// continue 
		for(i=1; i<=10; i++) {
			if(i == 5) {
				continue; // 조건에 맞다면 건너뛰기
			}
			System.out.println(i);
		}
		
		System.out.println(">>>>>>");
		
		for(i=1; i<=10; i++) {
			if(i % 2 == 1) {
				continue;
			}
			System.out.println(i);
		}
		
		Scanner scan = new Scanner(System.in);
		
		
		// for문 무한루프
//		for(;;) {
//			System.out.println("한 글자 입력 >");
//			char ch = scan.next().charAt(0);
//			System.out.println(ch);
//			
//			if(ch == 'y') {
//				break;
//			}
//			
//			return;
//		}
		
		
		// 반복문이 중첩적으로 있을 경우, break는 나를 감싸고 있는 가장 안쪽 for 문만 벗어남
		// 반복문에 이름을 줄 수 있음.
		
		int a=0, j=0, k=0;
		
		a: for(;;) {
			a++;
			for(;;) {
				j++;
				for(;;) {
					k++;
					System.out.println("a:" + a + ", j:" + j + ", k:" + k);
					if(k == 10) {
						break a;
					}
				}
			}
		}
		
		scan.close();
		
	}

}
