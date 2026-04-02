package day14;

import java.util.Arrays;

public class Exception06 {

	public static void main(String[] args) {
		
		// 메서드를 호출하여 배열을 출력
		// try ~ catch를 실행하여 예외 출력 확인
		
		Exception06 e6 = new Exception06();
		
		try {
			System.out.println(Arrays.toString(e6.random(15, 0, 1)));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■ 예외 처리 이후 출력되는 문구");
		
	}
	
	/* 배열의 길이를 입력 받아 해당 길이를 가지는 배열을 생성
	 * 랜덤 값을 채워 배열을 리턴하는 메서드
	 * 랜덤값 범위 1 ~ 100 값을 입력받아 해당 범위의 랜덤값 발생
	 * (Math.random() * count) + start
	 * 
	 * - size가 0보다 작다면 예외 발생
	 * - count 값이 0보다 작으면 예외발생
	 * 
	 * 매개변수 : size, count, start 
	 * 리턴타입 : 배열
	 */
	
	public int[] random(int size, int count, int start)  throws RuntimeException {
		
		int arr[] = null;
		
		if(size <= 0) {
			throw new RuntimeException("배열의 길이가 잘못되었습니다.");
		}
		
			arr = new int[size];				

		for(int i = 0; i < arr.length; i++) {
			if(count <= 0 ) {
				throw new RuntimeException("랜덤값의 범위를 다시 설정해주세요.");
			}
			arr[i] = (int)(Math.random() * count) + start;
		}			
	
		return arr;
		
	}

}
