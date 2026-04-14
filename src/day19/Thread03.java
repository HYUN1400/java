package day19;

public class Thread03 {

	public static void main(String[] args) {
		// 1~50까지, 51~100의 합계를 구하는 2개의 thread 생성
		// 2개의 스레드가 실행되고 난 뒤 각각의 합계를 출력
		// Thread - 0 => 1~50까지 출력 후 합계 출력 => 1초 휴식
		// Thread - 1 => 51~100까지 출력 후 합계 출력 => 1초 휴식
		// main thread - 0 + thread - 1 의 합게를 출력
		
		JoinTest jt1 = new JoinTest(1, 50);
		
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		
		try {
			jt1.join();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread - 0 total > " + jt1.getTotal());

		jt2.start();
		
		try {
			jt2.join();
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread - 0 total > " + jt2.getTotal());
		
		
		System.out.println("Last total > " + (jt1.getTotal() + jt2.getTotal()));
		
		System.out.println("•─────────⋅☾ MAIN THREAD END ☽⋅─────────•");
		
		
		// MAIN END
	}

}

class JoinTest extends Thread{
	private int start;
	private int end;
	private int total;
	
	public JoinTest(int start, int end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for(int i = start; i <= end; i++) {
			total += i;
		}
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public int getEnd() {
		return end;
	}

	public void setEnd(int end) {
		this.end = end;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
	
}