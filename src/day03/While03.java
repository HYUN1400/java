package day03;

public class While03 {

	public static void main(String[] args) {
		// 1~50 까지 짝수만 출력
		// 2 4 6 8 10
		// 12 14 16 18 20
		// ...
		
		int i = 1;
		
		while(i<=50) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
				if(i % 10 == 0) {
					System.out.println();
				}
			}
			i ++;
		}
		
		
		for(i=1; i<=50; i++) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
				if(i % 10 == 0) {
					System.out.println();
				}
			}
		}
		
		
		i = 1;
		int count = 0;
		
		while(i<=50) {
			if(i % 2 == 0) {
				System.out.print(i + " ");
				count ++;
				if(count % 5 == 0) {
					System.out.println();
				}
			}
			i++;
		}
		
		
		
		
		
		
		
		
		
		/*End Fragment*/
	}

}
