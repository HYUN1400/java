package Bank;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankController {
	
	private List<String> bankList = new ArrayList<>();
	private List<Customer> customerList = new ArrayList<>();
	private Customer myAccount;
	
	public void testBank() {
		bankList.add("신한은행");
		bankList.add("하나은행");
	}
	
	public void testCustomer() {
		customerList.add(new Customer(bankList.get(0), "고객A", "0001", 100000));
		customerList.add(new Customer(bankList.get(0), "고객B", "0002", 100000));
		customerList.add(new Customer(bankList.get(1), "고객C", "0003", 100000));
		customerList.add(new Customer(bankList.get(1), "고객D", "0004", 100000));
	}
	
	public void setMyAccount(Scanner scan) {
		
		System.out.println("□ 내 계좌를 설정해주세요.");
		System.out.println("■ 은행을 선택하세요. \n 1) 신한은행 | 2) 하나은행");
		int selectBank = scan.nextInt();
		
		System.out.println("■ 예금주명을 입력하세요.");
		String myName = scan.next();
		
		System.out.println("■ 계좌번호를 입력하세요.");
		String myAcc = scan.next();
		
		for(Customer c: customerList) {
			if(c.getCustomerName().equals(myName) && c.getAccount().equals(myAcc)) {
				System.out.println("이미 등록된 계좌입니다.");
				return;
			}
		}
		
		this.myAccount = new Customer(bankList.get(selectBank-1),myName, myAcc, 0);
		customerList.add(myAccount);
		
		System.out.println("계좌 등록이 완료되었습니다.");
		
	}


	public void deposit(Scanner scan) throws IOException {		
		// 입금
		System.out.println("•──────────────⋅☾ 입금하기 ☽⋅──────────────•");		
		System.out.println("▷ 계좌 잔고: " + myAccount.getBalance());
		
		System.out.println("입금할 금액을 입력해주세요.");
		int deposit = scan.nextInt();

		int balance = myAccount.getBalance() + deposit;
		
		myAccount.setBalance(balance);
		
		System.out.println("■ 입금이 완료되었습니다. \n ▷ 계좌 잔고: " + balance);
		
		printFile("← 입금", myAccount.getCustomerName(), deposit, balance);
		
		
	}

	public void withdraw(Scanner scan) throws IOException {
		// 출금
		System.out.println("•──────────────⋅☾ 출금하기 ☽⋅──────────────•");
		System.out.println("▷ 계좌 잔고: " + myAccount.getBalance());
		
		System.out.println("출금할 금액을 입력해주세요.");
		int withdraw = scan.nextInt();
		
		if(myAccount.getBalance() < withdraw) {
			System.out.println("잔고가 부족합니다. 다시 확인해주세요.");
			return;
		}
		
		int balance = myAccount.getBalance() - withdraw;
		
		myAccount.setBalance(balance);
		
		System.out.println("■ 출금이 완료되었습니다. \n ▷ 계좌 잔고: " + balance);
		
		printFile("→ 출금", myAccount.getCustomerName(), withdraw, balance);
		
	}

	public void transfer(Scanner scan) {
		// 송금
		
		String selectBank = null;
		Customer selectCM = null;
		
		System.out.println("•──────────────⋅☾ 송금하기 ☽⋅──────────────•");
		System.out.println("상대 은행을 선택 해주세요.");
		printBank();
		
		try {
			selectBank = bankList.get(scan.nextInt() -1);			
		} catch (Exception e) {
			System.out.println("은행을 찾을 수 없습니다.");
			scan.nextLine(); // 버퍼 비우기
		}
		
		System.out.println("상대 계좌를 입력해주세요.");
		
		try {
			String transferAcc = scan.next();

			for(Customer c : customerList) {
			    if(c.getBankName().equals(selectBank) && c.getAccount().equals(transferAcc)) {
			        selectCM = c;
			        break;
			    }
			}

			if(selectCM == null) {
			    System.out.println("계좌를 찾을 수 없습니다.");
			    return;
			}
			
			System.out.println("송금할 금액을 입력해주세요.");
			int transfer = scan.nextInt();
			
			if(myAccount.getBalance() < transfer) {
				System.out.println("잔고가 부족합니다. 다시 확인해주세요.");
				return;
			}
			
			int balanceCM = selectCM.getBalance() + transfer;
			selectCM.setBalance(balanceCM);
			
			int balance = myAccount.getBalance() - transfer;
			myAccount.setBalance(balance);
			
			System.out.println("송금이 완료되었습니다. 👌");
			System.out.println("▷ 계좌 잔고: " + myAccount.getBalance());
			
			printFile("송금 → ", selectCM.getCustomerName(), transfer, balance);
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("송금에 실패했습니다. 나중에 다시 시도해주세요.");
		}
		
		
		
		
	}

	public void printAccount() {
		System.out.println("•──────────────⋅☾ 내 계좌 ☽⋅──────────────•");
		System.out.println(myAccount);
	}
	
	public void printBank() {
		int count = 0;
		
		for(String b : bankList) {
			count ++;
			System.out.println(count + ") " + b);
		}
	}
	
	public void printAllAccount() {
		System.out.println("•──────────────⋅☾ 전체 계좌 ☽⋅──────────────•");
		for(Customer c : customerList) {
			System.out.println(c);
		}
	}
	
	public void printFile(String type, String name, int amount, int balance) throws IOException {
		LocalDateTime localdate = LocalDateTime.now();
		String now = localdate.getYear() + " / " + localdate.getMonth() + " / " + localdate.getDayOfMonth();
		
		String dataName = "D:\\web_260316_lch\\memo\\" + myAccount.getCustomerName() + "_" + myAccount.getBankName() + ".txt";
		
		FileWriter fw = new FileWriter(dataName, true);
		
		String data = now + " - " + type + "(" + name +")" + " : " + amount + "원" + "| 계좌 잔고: " + balance; 
		
		fw.write(data + "\n");
		
		fw.close();
	}

}
