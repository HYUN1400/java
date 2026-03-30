package day11;

public class Method08 {
	public int sum(int ...num) {
		int result = 0;
		for(int tmp: num) {
			result += tmp;
		}
		return result;
	}
	
	public static void main(String[] args) {
		// 가변인자 메서드
		/* - 매개변수의 개수가 고정되어 있지 않을 경우 */
		
		Method08 m8 = new Method08();
		
		System.out.println(m8.sum(7, 21, 8, 9, 44, 56));
		
		
	}

}
