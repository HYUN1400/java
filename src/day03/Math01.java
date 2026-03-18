package day03;

import java.util.Random;

public class Math01 {

	public static void main(String[] args) {
		// Math 클래스
		// Math.round(값): 반올림, 소수 자리는 0
		// Math.ceil(값): 올림, 소수 자리수는 0
		// Math.floor(값): 버림, 소수 자리수는 0
		// Math.random(): 0~1 사이의 랜덤한 수를 double 리턴
		
		double num = 3.14159;
		
		int roundNum = (int)Math.round(num); // return long
		System.out.println(roundNum);
		
		int ceilNum = (int)Math.ceil(num); // return double
		System.out.println(ceilNum);
		
		int floorNum = (int)Math.floor(num); // retrun double
		System.out.println(floorNum);
		
		// Math.max(값1, 값2) - 큰 값을 리턴 / Math.min(값1, 값2) - 작은 값을 리턴
		int num1 = 10, num2 = 20;
		System.out.println(Math.max(num1, num2));
		System.out.println(Math.min(num1, num2));
		
		System.out.println("---------->");
		
		// Math.random()
		System.out.println((int)(Math.random()*10));
		System.out.println((int)(Math.random()*10)+1);
		
		// 1~6까지의 난수
		// (int)(Math.random()*count)+start
		System.out.println((int)(Math.random()*6)+1);
		
		// Random 클래스
		
		Random random = new Random();
		System.out.println(random.nextInt(1000000));
		
	}

}
