package Bank;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		// 메뉴 출력
		
		Scanner scan = new Scanner(System.in);
		BankController bc = new BankController();
		
		bc.testBank();		
		bc.testCustomer();
		bc.setMyAccount(scan); // 계좌 등록
		
		
		while(true) {		
			
			System.out.println("•──────────────⋅☾ BANK ☽⋅──────────────•");	
			System.out.println("원하는 작업을 선택해주세요.");
			System.out.println("1) 내 계좌로 입금 | 2) 내 계좌에서 출금 \n3) 타 계좌로 송금 | 4) 계좌 확인 \n5) 종료 ");
			
			int select = scan.nextInt();
			
			if(select == 5) 
				{ System.out.println("은행 업무를 종료합니다."); 
				break; }
			
			try {
				
				switch(select) {
				case 1: bc.deposit(scan); break;
				case 2: bc.withdraw(scan); break;
				case 3: bc.transfer(scan); break;
				case 4: bc.printAllAccount(); break;
				default: System.out.println("잘못된 메뉴입니다."); break;
				}
				
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
	
		scan.close();
	}

}
