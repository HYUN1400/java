package day09;

import java.util.Arrays;

public class ClassEx01 {

	public static void main(String[] args) {
		
		TV tv = new TV("SAMSUNG");
		
		tv.print();	// 초기값
		
		tv.power(); // 전원 ON
		tv.chUP();
		tv.favCh();
		tv.chUP();
		tv.favCh();
		tv.chUP();
		tv.favCh();
		tv.chUP();
		tv.favCh();
		tv.chUP();
		tv.favCh();
		tv.chUP();
		tv.chUP();
		tv.chUP();
		tv.chSelect(10);
		tv.favCh();
		tv.printFavCh();
		
		
		
		
		// MAIN END
	}

}

// ClassEx01 END

class TV {
		
	// 멤버변수
	/* brand, power, vol, ch */
	private String brand;
	private boolean power;
	private int vol;
	private int ch = 1;
	private int[] favCh = new int[5];
	private int index = 0;
	
	// 생성자
	public TV() {
		ch = 3;
		vol = 3;
	}
	
	public TV(String brand) {
		this();
		this.brand = brand;
	}
	
	// 메서드
	/* power on / off */
	public void power() {		
		this.power = !this.power;
		if(this.power) {
			System.out.println("TV를 켭니다.");
		} else {
			System.out.println("TV를 끕니다.");
		}
		print();
	}
	
	/* chUP(1~10 순환구조) */
	public void chUP() {
		if(this.power) {
			ch ++;		
			if(ch > 10) {
				ch = 1;
			}
		} 			
		print();
	}
	
	
	/* chDown */
	public void chDown() {
		if(this.power) {
			ch -= 1;
			if(ch < 1) {
				ch = 10;
			}
		} 
		
		
		print();
		
	}
	
	/*채널 셀렉트*/
	
	public void chSelect(int ch) {
		if(this.power && ch < 1 || ch > 10) {
			System.out.println("없는 채널입니다.");	
		} else if(this.power) {
			this.ch = ch;
			print();
		} 		
		
	}
	
	/*
	 * 선호 채널 등록
	 * - 5개까지 등록 가능
	 * 
	 * 1) 선호 채널 등록 메서드 
	 * 2) 선호채널 리스트 출력 메서드
	 * 
	 */
	
	/*선호 채널 등록*/
//	public void favCh() {
//		int ch = this.ch;
//		for(int i = 0; i < favCh.length ; i++) {
//			if(favCh[i] == 0) {	
//				favCh[i] = ch;
//				break;
//			}
//		}
//		
//		for(int i = 0; i < favCh.length - 1; i ++) {
//			favCh[i] = favCh[i+1];
//		}
//		
//		favCh[favCh.length - 1] = ch;
//	}
	
	
	public void favCh() {
		// index에 현재 채널을 등록
		if(this.power) {
			if(favCh.length == index) {
				index = 0;
			}
			
			favCh[index] = ch;
			index++;
			System.out.println("즐겨찾기에 등록했습니다.");
		}
	}
	
	
	/*선호 채널 출력*/
	public void printFavCh() {
		System.out.print("즐겨찾기 된 채널 ✨ ");
		for(int tmp: favCh) {
			if(tmp != 0) {			
				System.out.print(tmp + "번 ");
			}
		}
	}
	
	
	/* VolUp(0~20) */
	public void volUp() {
		if(this.power && vol < 20) {
			vol += 1;
			print();
		} 
	}
	
	
	/* VolDown(0~20) */
	public void volDown() {
		if(this.power && vol > 0) {
			vol -= 1;
			print();
		} 
	}
	
	/* 출력 */
	public void print() {
		String status = this.power ? "TV ON" : "TV OFF";
		System.out.println(brand + " " + status + " | " + "현재 볼륨 🔉 " + this.vol + " | " + "현재 채널 📺 " + this.ch);
	}
	
	
	// getter | setter
	
	public int getVol() {
		return vol;
	}

	public void setVol(int vol) {
		this.vol = vol;
	}

	public int getCh() {
		return ch;
	}

	public void setCh(int ch) {
		this.ch = ch;
	}
	
	public int[] getFavCh() {
		return favCh;
	}
	
	public void setFavCh(int[] ch) {
		favCh = ch;
	}

	public boolean isPower() {
		return power;
	}
}
