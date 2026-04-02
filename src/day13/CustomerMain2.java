package day13;

public class CustomerMain2 {

	public static void main(String[] args) {
		// 백화점 고객
				/* - SILVER 고객(적립) / GOLD 고객(할인+적립) / VIP 고객(할인↑+적립)
				 * 
				 * 고객 => Customer(부모)
				 * - 멤버변수: 고객ID, 고객명, 등급, 보너스포인트(적립), 적립비율 
				 * 
				 * 등급
				 * Silver(기본) / Gold / VIP
				 * - Silver : 제품 구입 시 할인 0% / 보너스 포인트 적립 1%
				 * - Gold : 제품 구입 시 할인 5% / 보너스 포인트 적립 3%
				 * - VIP : 제품 구입 시 할인 10% / 보너스 포인트 적립 5%
				 * - VIP 등급은 전담 상담사 멤버변수를 추가(agentName, agentNumber)
				 * 
				 * 1) 보너스 적립 계산 메서드
				 * - 구매 금액의 적립 보너스 계산 => 누적
				 * - 보너스 적립, 할인여부 체크하여 구매 금액 리턴
				 * 
				 * 2) 출력
				 * - OOO 님은 VIP 고객이며, 현재 보너스포인트는 5000점입니다.
				 * - 전담 상담사는 XXX이고, 번호는 1111 입니다. <= VIP만
				 * 
				 */
		
		Customer2[] customer = {
				new Customer2("1111", "홍길동"),
				new GoldCustomer("2222", "최순자"),
				new VIPCustomer("3333", "박순철", "영이", "1001"),
				new Customer2("4444", "최길동"),
				new GoldCustomer("5555", "김길동"),
				new Customer2("6666", "황길동"),
				new Customer2("7777", "김길동"),
				new GoldCustomer("8888", "이순신"),
				new VIPCustomer("9999", "장보고", "영이", "1001"),
				new Customer2("1010", "초선")
		};
		
		System.out.println("■■■■■■■■■■■■■■■ 지불 금액 & 포인트");
		
		int price = 100000;
		
		for(int i = 0; i < customer.length; i++) {
			int salePrice = customer[i].calcPrice(price);
			customer[i].printOf();
			System.out.println("지불 금액은 " + salePrice + "입니다.");
			System.out.println("\n");
		}
		
		System.out.println("■■■■■■■■■■■■■■■ 지불 금액 & 포인트");
		
		price = 150000;
		
		for(int i = 0; i < customer.length; i++) {
			int salePrice = customer[i].calcPrice(price);
			customer[i].printOf();
			System.out.println("지불 금액은 " + salePrice + "입니다.");
			System.out.println("\n");
		}
		
		
		// 다운캐스팅
		// VIP 상담사 영이(1001) => 철이(1003)
		
		for(int i = 0; i < customer.length; i++) {
			if(customer[i] instanceof VIPCustomer) {
				((VIPCustomer)customer[i]).setAgentName("철이");
				((VIPCustomer)customer[i]).setAgentNum("1003");
			}
		}
		
		System.out.println("■■■■■■■■■■■■■■■ 지불 금액 & 포인트");
		
		price = 150000;
		
		for(int i = 0; i < customer.length; i++) {
			if(customer[i] instanceof VIPCustomer) {
				int salePrice = customer[i].calcPrice(price);
				customer[i].printOf();
				System.out.println("지불 금액은 " + salePrice + "입니다.");
				System.out.println("\n");
			}
		}

	}
}
