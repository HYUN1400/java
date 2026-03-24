package day07;

public class MultiArray01 {

	public static void main(String[] args) {
		// 다차원 배열
		/*
		 * 배열타입[] 배열명 - 1차원 {1, 2, 3};
		 * 배열타입[행][열] 배열명 - 2차원 {
		 *  {1, 2, 3}
		 *  {1, 2, 3}
		 * };
		 * 배열타입[면][행][열] 배열명 - 3차원 {{{1, 2, 3}, {1, 2, 3}}, {{1, 2, 3}, {1, 2, 3}}};
		 * 
		 * int[][] arr = new int[2][3]; // 2행 3열
		 * 
		 * 배열의 길이
		 * 1차원 = arr.length => for문 1개
		 * 2차원 = arr[i].length => for문 2개
		 * 3차원 = arr[i][j].length => for문 3개
		 * 
		 * 
		 */
		
		int[][] arr = {
				{1,2,3},
				{4,5,6}
		};
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[0][2]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		System.out.println(arr[1][2]);
		
		System.out.println("---");
		
		int count = 10;
		
		for(int i= 0; i<arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = count;
				count++;
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		// END
	}

}
