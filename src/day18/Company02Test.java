package day18;

import day18.Enum01.Company;

public class Company02Test {

	public static void main(String[] args) {
		System.out.println(Company02.KT); // 열거값
		System.out.println(Company02.KT.getValue()); // value 값
		
		System.out.println("•─────────⋅☾ for ☽⋅─────────•");	
		
		// values() :열거 값들. [] 배열로 리턴
		for(Company02 tmp : Company02.values()) {
			System.out.println(tmp);
			System.out.println(tmp.ordinal()); // 순번
		}
		
		System.out.println(Company02.LG.ordinal()); // 배열로 리턴하지 않아도 순번을 갖고 있다
		
		
		
	}

}
