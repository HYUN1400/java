package day14;

public class CustomException01 {

	public static void main(String[] args) {
		// PasswordException Test
		
		PasswordTest pt = new PasswordTest();
		
		String password1 = null;
		String password2 = "abc";
		String password3 = "abcde1";
		String password4 = "abcde123!";
		
		try {
			pt.setPassword(password4);
			System.out.println(pt.getPassword());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("TEST 종료");
		
		
		
	}

}

class PasswordTest	{
	private String password;

	
	
	
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		// exception 처리
		/* - 비밀번호는 null일 수 없음.
		 * - 길이는 5자 이상
		 * - 영문, 숫자, 특수문자를 포함해야 함.
		 * - 정규표현식: regex [a-zA-Z][0-9][!@#$%^&*()][가-희]
		 */
		
		if(password == null) {
			throw new PasswordException("비밀번호는 비어있을 수 없습니다.");
		} 
		
		if(password.length() < 5) {
			throw new PasswordException("비밀번호가 너무 짧습니다. 5자 이상으로 설정해주세요.");
		} 
		
		if(!password.matches("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,20}$")) {
			throw new PasswordException("보안이 낮습니다. 영문, 숫자, 특수문자를 포함해주세요.");
		}
		
		
		this.password = password;
	}
	
	
}
