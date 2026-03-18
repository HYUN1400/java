package day02;

public class Switch01 {

	public static void main(String[] args) {
		// switch
		/* switch(변수 / 식){
		 * 	  case 값1:  실행문;  break;
		 * 	  case 값2:  실행문;  break;
		 * 	  case 값3:  실행문;  break;
		 * 	  ...
		 * 	  default: 실행문;
		 * }
		 * 
		 * break; 구문을 강제로 빠져나갈때 사용 (조건문을 동반)
		 * */
		
		int number = 5;
		
		// switch 이용하여 짝수 / 홀수 구분
		// number % 2
		
		switch(number % 2) {
		case 0:
			System.out.println("짝수");
			break;
		case 1:
			System.out.println("홀수");
			break;
			default:
				System.out.println("잘못된 값입니다.");
		}
		
		// num 값은 1, 2, 3 이라고 가정하고, 
		// num 값이 1이면 1칸전진, 2면 2칸전진, 3이면 3칸전진
		// num의 값이 1, 2, 3 아닌 나머지는 다시입력하세요.
		
		int num = 2;
		switch(num) {
		case 1: System.out.println("1칸전진"); break;
		case 2: System.out.println("2칸전진"); break;
		case 3: System.out.println("3칸전진"); break;
		default: System.out.println("다시 입력하세요.");
		}
		System.out.println("-------------");
		
		switch(num) {
		case 1: System.out.println(num+"칸전진"); break;
		case 2: System.out.println(num+"칸전진"); break;
		case 3: System.out.println(num+"칸전진"); break;
		default:
			System.out.println("다시입력하세요.");
		}
		
		System.out.println("-----------");
		
		switch(num) {
		case 1: case 2: case 3:
			System.out.println(num+"칸전진"); 
			break;
		
		default: System.out.println("다시 입력하세요.");
		}
		
		// 3,4,5 = 봄 / 6,7,8 = 여름 / 9,10,11 = 가을 / 12,1,2 = 겨울
		// 잘못된 월입니다.
		int month = 13;
		
		switch(month) {
		case 3: case 4: case 5:
			System.out.println("봄"); break;
		case 6: case 7: case 8:
			System.out.println("여름"); break;
		case 9: case 10: case 11:
			System.out.println("가을"); break;
		case 12: case 1: case 2:
			System.out.println("겨울"); break;
			default: System.out.println("잘못된 월입니다.");
		}
		
		
	}

}