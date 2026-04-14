package day19;

class Bank1 {
	private int money = 10000;
	
	// 입금
	public synchronized void saveMoney(int money) {
		this.money += money;
		System.out.println(Thread.currentThread().getName() + "입금을 완료했습니다. > " + money + "\n현재 잔액: " + this.money);
		
		// 대기 중인 스레드 깨움
		notifyAll();
	}
	
	// 출금 
	public synchronized void minusMoney(int money) {
		// 잔액이 부족하면 기다림
		// while인 이유 => 깨어났을 때 조건을 다시 확인 필요
		while(this.money < money) {
			System.out.println(Thread.currentThread().getName() + "잔액이 부족합니다. (출금 대기)" + "\n현재 잔액: " + this.money);
			
			try {
				wait(); // 대기
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		this.money -= money;
		System.out.println(Thread.currentThread().getName() + "출금이 완료되었습니다. > " + money + "\n현재 잔액: " + this.money);
	}

	
	public int getMoney() {
		return money;
	}
	
}

public class ThreadEx01 {

	public static void main(String[] args) {
		// 은행 클래스에서 출금시 잔액이 부족하면 실패 출력 => 대기(wait)
		// 입금이 발생하면 다시 실행(notify) => thread 깨움
		/*
			wait() => thread를 대기 상태로 보냄
			- 반드시 synchronized 내부에서만 사용가능
			- lock을 반납하고 기다림 
			
			notify()
			- wait 중의 스레드를 하나 깨움
			
			notifyAll()
			- wait 중인 모든 스레드를 깨움
		 */
		
		Bank1 bank = new Bank1();
		
		DepositThread ben = new DepositThread("Ben", bank);
		WithdrawThread may = new WithdrawThread("May", bank);
		
		ben.start();
		may.start();
		
		
		
		
		// MAIN END
	}

}

// 입금 thread
class DepositThread extends Thread{
	private Bank1 bank;
	
	public DepositThread(String name, Bank1 bank) {
		super(name); // threadName으로 설정
		this.bank = bank;
	}

	@Override
	public void run() {
		// 입금 5번 반복
		for(int i = 0; i < 5; i++) {
			
			bank.saveMoney((int)(Math.random()*100)*1000);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	
	
	
}

// 출금 thread
class WithdrawThread extends Thread{
	private Bank1 bank;
	
	public WithdrawThread(String name, Bank1 bank) {
		super(name); // threadName으로 설정
		this.bank = bank;
	}

	@Override
	public void run() {
		// 출금 5번 반복
		for(int i = 0; i < 5; i++) {
			
			bank.minusMoney((int)(Math.random()*100)*1000);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	
	}
}


















