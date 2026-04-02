package day14;

public class PasswordException extends IllegalArgumentException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/* 사용자 정의 Exception 을 생성할 때의 조건
	 * IllegalArgumentException : 매개변수가 잘못 사용되었을 때 발생하는 예외
	 * 사용자 지정 exception 정의 시 발생 시키고자 하는 예외를 상속받아 사용함.
	 */
	
	public PasswordException(String message) {
		super(message);
	}
	
}
