package day06;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {
		// 배열 
		// 숫자 5개의 값을 가지는 배열 생성
		// 1 2 3 4 5 입력 후 출력
		
		int num[] = new int[5];
		
		for(int i = 0; i < num.length; i ++) {
			num[i] = i+1;
		}
		
		System.out.println(Arrays.toString(num));

		for(int tmp: num) {
			System.out.println(tmp);
		}
		
	}

}
