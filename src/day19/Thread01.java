package day19;

public class Thread01 {

	public static void main(String[] args) {
		// Thread(쓰레드) : 실제 작업을 수행하는 단위
		/*
			- 프로그램이 실행되면 운영체제로부터 메모리를 항당받아 process의 상태가 됨
			- Thread란 실제 CPU가 작업을 처리하는 단위
			- multiThread(멀티쓰레드) : 여러 개의 thread가 동시에 수행되는 프로그램
			- CPU는 시간을 잘게 쪼개어 thread들을 번갈아 가며 수행함. (시분할 처리)
			- 사용자들은 동시에 처리되는 듯한 효과를 가지게 됨.
			
			- thread 들은 각자 자신만의 작업 공간을 가짐. (context)
			- 여러 thread 들이 같이 공유하는 자원도 있음.
				└ 공유된 자원을 사용하기 위해 경쟁이 발생, 그 구역을 critical section(임계영역) 이라고 함.
				└ critical section 내에서의 충돌(교착 상태: deadlock)이 발생하지 않도록 동기화(순차 처리)를 통해서 오류를 방지.
				
			- thread 상태 변화
				└ 생성(new) -> 준비(Runnable) -> 실행(Running) -> 대기(Waiting / Blocked) -> 준비 -> 실행 (반복) -> 종료(Terminated)		
				
		 */
		
		
		/* Thread 구현 방법 2가지
			1) Thread 클래스를 상속하여 만들기
			2) runnable 인터페이스를 구현하여 만들기
			-> 자바는 다중상속을 허용하지 않음.
			- 만약 클래스가 상속 중이라면 인터페이스 구현을 통해 구성
		 */
		
		
		// 현재 실행 중인 thread 이름
		
		System.out.println("•─────────⋅☾ THREAD START ☽⋅─────────•");
		
		System.out.println(Thread.currentThread().getName());
		
		MyThread th = new MyThread(); // Thread - 0, Thread - 1 . . .
		// start() => run() 호출
		th.start();
		
		MyThread th2 = new MyThread();
		th2.start();
		
		System.out.println("•─────────⋅☾ THREAD END ☽⋅─────────•");
	}

}

class MyThread extends Thread {

	// 상속을 받으면 반드시 run() 매서드를 구현해야 함. 
	@Override
	public void run() {
		// 하고 싶은 일 수행문
		for(int i = 0; i < 2000; i++) {
			System.out.println(i + ". Thread >" + getName());
		}
	}
	
}