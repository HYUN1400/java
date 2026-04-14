package day19;

public class Thread04 {
	
	// 계좌 객체 생성 영역 : 공유 영역으로 생성 => static
	public static Bank myBack = new Bank();
	

	public static void main(String[] args) {
		// critical section (임계영역: 공유영역)
		/* 두 개 이상의 Thread가 동시에 접근할 수 있는 영역
		 	- 동시에 여러개의 thread가 공유영역의 값을 가지려 하면 충돌이 발생할 수 있음.
		 	- 교착상태 (deadlock) 
		 	- 한 시점에 하나의 thread만 사용이 가능: 세마포어(semaphore)
		 	- 세마포어를 얻은 스레드만 접근 가능 => 나머지는 대기 상태
		 	
		 	동기화(순서화) : synchronized
		 	- 동기화가 필요한 메서드 앞에 키워드로 선언
		 */
		
		/* 홍길동 => 입금 / 홍길동 부인 => 출금
		 	Bank 클래스 생성
		 	계좌 1개 생성: 급여통장 => 공유영역 (static)
		 	잔액: 500,000 
		 	
		 	입금: saveMoney (동기화)
		 	출금: minusMoney (동기화)
		 */
		
		System.out.println("BANK START");
		System.out.println("현재 잔액 > " + Thread04.myBack.getMoney());
		
		Ben b = new Ben();
		b.start();
		
		May m = new May();
		m.start();
		
		
		
		
		
		// MAIN END
	}

}

class Bank{
	private int money = 500000;
	
	// 입금 (동기화)
	public synchronized void saveMoney(int money) {
		int m = this.money;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.money += money;
		
	}
	
	// 출금 (동기화)
	public synchronized void minusMoney(int money) {
		int m = this.money;
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		this.money -= money;
	}
	

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}


class Ben extends Thread {

	@Override
	public void run() {
		// 입금
		System.out.println("벤 > 100 달러 입금");
		Thread04.myBack.saveMoney(100000);
		System.out.println("잔액 > " + Thread04.myBack.getMoney());
	}
	
}


class May extends Thread {

	@Override
	public void run() {
		// 출금
		System.out.println("메이 > 50 달러 출금");
		Thread04.myBack.minusMoney(50000);
		System.out.println("잔액 > " + Thread04.myBack.getMoney());
	}
	
}