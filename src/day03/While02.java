package day03;

public class While02 {

	public static void main(String[] args) {
		// 1 ~ 10까지의 합계 while 출력
		
		int i = 1;
		int sum = 0;
		
		while(i <= 10) {
			sum += i;
			System.out.print(sum + " ");
			i ++;
		}
		
		System.out.println();
		
		// 1 ~ 10까지의 짝수 합계
		
		i = 1;
		sum = 0;
		
		while(i <= 10) {
			if(i % 2 == 0) {
				sum += i;
				System.out.print(sum + " ");
			}
			i++;
		}
	}

}
