package day14;

public class Exception01 {

	public static void main(String[] args) {
		// Exception : 예외
		
		 /* 오류의 종류
		 * - 논리적 오류: 실행은 되지만 의도와는 다르게 작동하는 오류
		 * - 컴파일 오류: 컴파일 시 발생하는 오류 (문법 구문 오류 : syntax error)
		 * - 런타임 오류: 실행 시 잘못된 결과를 얻거나, 오류가 나는 케이스
		 * 
		 * 자바는 크게 세가지로 예외처리를 함.
		 * Error / Exception (Checked Exception / UnChecked Exception)
		 * - Error: 개발자가 복구할 수 없는 심각한 오류 (코드의 문제가 아닌 외부적 요인)
		 * 
		 * - Exception: 개발자의 코드에 의해 실수가 발생되는 경우
		 * 	└ Checked Exception: 컴파일 시점에서 예외처리가 일어나는 예외
		 * 		=> IOException / SQLException / FileNotFoundException ...
		 * 
		 * 	└ UnChecked Exception: 문법적 오류는 없으나(컴파일 오류 X) 실행 시 발생되는 예외
		 * 		=> 주로 개발자의 코드 실수로 인해 발생되는 케이스
		 * 
		 * 실행 시(UnChecked) 발생할 수 있는 오류들 => RunTimeException 
		 * - 문제가 발생할 때를 대비하여 이에 대응하는 코드를 미리 작성함 => 예외 처리
		 * - 예외 처리를 통해 비정상 종료를 막을 수 있음.
		 * - 예외가 발생되면 예외 발생 시점부터 코드는 중지 => 예외문구 출력
		 * - 예외 처리 구문 이후는 정상처리 됨.
		 * 
		 * try ~ catch
		 * 
		 * try ~ catch ~ finally 
		 * 
		 * try: 예외가 발생할 가능성이 있는 구문을 작성
		 * catch: try 구문에서 발생한 예외를 처리
		 * finally: try 구문 외 반드시 실행 되어야 하는 문구를 작성(생략 가능)
		 * 
		 */
		
		int a = 10;
		int b = 0;
		
	
		try {		
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ TRY 안쪽영역");
			
			System.out.println(a+b);
			System.out.println(a-b);
			System.out.println(a*b);
			
			System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ TRY 예외발생");
			System.out.println(a/b);		
			System.out.println(a%b);
		} catch (Exception e) {
			e.printStackTrace(); // 출력 구문 포함
			System.out.println(e.getMessage());
			System.out.println("0으로 나눌 수 없습니다.");
		}
		
		System.out.println("■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■■ TRY 바깥영역");
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		
		
		
		// MAIN END
	}

}
