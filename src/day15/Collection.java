package day15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection {

	public static void main(String[] args) {
		// Collection Framework : 표준화된 방식의 자료구조 
		/*	List, Set, Map => 인터페이스. 반드시 구현 클래스로 객체를 생성해야 함.
			-배열처럼 데이터를 묶어서 관리할 때 사용
			-배열 대신 사용
			
			List(배열과 동일)
			- 같은 타입의 값을 하나씩 저장
			- index를 가진다 (순서를 보장)
			- 중복 허용 (index가 있어서 가능)
			- 배열 대신 가장 많이 사용되는 구조
			
			Set
			- 같은 타입의 값을 하나씩 저장
			- 순서를 보장하지 않음 (index 없음) 
			- 중복을 허용하지 않음. => 중복값이 들어오면 덮어쓰기
			
			Map
			- 값을 key / value 로 묶어서 저장
			- 순서를 보장하지 않음 (index 없음) 
			- key는 중복 불가능 / value는 중복 가능
			- key가 중복되면 덮어쓰기 (key/value 같이 덮어쓰기)
			- 물건/가격		학생/성적		아이디/비밀번호  => 두 값이 하나로 묶여서 사용될 때 map을 사용
			
			배열은 생성 시 기본자료형, 클래스자료형 배열 생성이 가능
			int arr[], double arr[], String arr[], Product pro[]
			
			Collection에서는 기본자료형은 불가능. 클래스 자료형만 가능
			기본 자료형에 맞는 클래스 자료형 (Wrapper class)을 사용하면 됨.
			
			Wrapper Class (래퍼클래스)
			- 기본타입에 대응되는 클래스 타입
			- 기본타입			클래스타입
				int				Integer
				char			Character
				double			Double
				long			Long
				byte			Byte
				boolean			Boolean
				float			Float
				
			- int, char를 제외한 다른 자료형은 첫글자만 대문자로 변환
			- 기본 타입 => 클래스 타입 (박싱 boxing)
			- 클래스 타입 => 기본 타입 (언박싱 unboxing)
			
			- 래퍼 클래스는 산술연산을 위해 정의된 클래스가 아님.
			- 객체의 값만 참조할 수 있기 때문에 그 안에 저장된 값은 직접 변경 불가능
			- 연산을 해야할 경우 언박싱하여 기본타입으로 변경 후 연산 => 다시 박싱
		 */
		
		/* List<클래스명> 객체명 = new 구현클래스
		 
		   List => ArrayList(조회), LinkedList(추가, 삭제) ...
		   Set => HashSet, TreeSet ...
		   Map => HashMap, TreeMap ...
		   
		   ArrayList : 검색이 빠르다 (배열과 비슷)
		   - 미리 길이를 지정하지 않음.
		   - 추가되면 자동으로 늘어남
		   - 삭제되면 자동으로 줄어듦
		   - 추가, 삭제가 쉬우나 속도가 느림
		   
		   LinkedList : 추가 삭제가 빠름. 검색이 느림
		   
		   TreeSet : 트리구조에 맞게 정렬 알고리즘을 사용
		   
		 */
		
		// List 기준으로 생성
		List<Integer> list = new ArrayList<Integer>();
		
		// ArrayList 기준으로 생성
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		// 클래스명을 생략하고 생성 => Object
		ArrayList list3 = new ArrayList();
		
		// 앞쪽 클래스타입은 반드시 지정, 뒷쪽 클래스타입은 생략 가능
		List<Integer> list4 = new ArrayList<>();
		
		
		// Map
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		
		// Set
		Set<Integer> set = new HashSet<Integer>();
		
		
		
		
		
	}

}
