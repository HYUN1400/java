package day13;

public class CustomerMain {

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
		int price[] = {120000, 2548000, 350000, 412000, 760000};
		
		// Main 함수 안에서...
		Customer[] customers = {
		    new Customer("TEST1", "고객A", 520),
		    new Customer("TEST2", "고객B", 0),
		    new Customer("TEST3", "고객C", 0),
		    new Customer("TEST4", "고객D", 0),
		    new Gold("TEST5", "고객E", 1080), 
		    new Gold("TEST6", "고객F", 0), 
		    new Gold("TEST7", "고객G", 0), 
		    new VIP("TEST8", "고객H", 2048, "상담사A", "02)111-1111"),
		    new VIP("TEST9", "고객I", 0, "상담사B", "02)222-2222"),
		    new VIP("TEST10", "고객J", 0, "상담사C", "02)333-3333")
		};
		
		// 테스트용 출력... 나중에 다듬음
		System.out.println(customers[4].calcPrice(price[3]));
		customers[4].printOf();
	}
}

