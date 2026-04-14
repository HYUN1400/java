package day19;

public class Thread02 {

	public static void main(String[] args) {
		// Runnable 로 구현하는 방법
		
		System.out.println("•─────────⋅☾ MAIN THREAD START ☽⋅─────────•");
		System.out.println(Thread.currentThread().getName());
		System.out.println("•─────────⋅☾ MAIN THREAD END ☽⋅─────────•");
		
		// interface로 구현한 thread 객체는 Thread의 객체가 없기 때문에 실행 X
		// Thread 객체를 생성해 넣어줘야 함.
		
		Mythread02 th2 = new Mythread02();
		Thread t = new Thread(th2);
		t.start();
		
		
		//join() => thread가 실행을 마칠 때까지 다른 스레드를 대기상태로 만듦.
		// sleep() => 일정시간 동안 스레드를 중지하라고 대기 상태로 만듦.
		try {
			t.join();
			Thread.sleep(3000); // 단위는 밀리세컨드 ms
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		Thread t2 = new Thread(new Mythread02());
		t2.start();
		
		try {
			t2.join();
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}

}

class Mythread02 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i = 0; i< 2000; i++) {
			System.out.println(i +". Thread > " + Thread.currentThread().getName());
		}
		
	}
	
}
