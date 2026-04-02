package day14;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Date01 {

	public static void main(String[] args) {
		// 날짜 시간 클래스
		/*
		 * Date 클래스 => Deprecated (비권장) 
		 * Calendar 클래스
		 * LocalDate 클래스
		 * 
		 */
		
		Date date = new Date(); // 오늘 날짜를 리턴 => 요일 월 날짜 시간 KST 연도
		System.out.println(date);
		System.out.println(date.getDate());
		
		Calendar c = Calendar.getInstance();
		System.out.println(c.get(Calendar.YEAR));
		// 1~12월 0부터 시작	0~11 리턴
		System.out.println(c.get(Calendar.MONTH) + 1);
		System.out.println(c.get(Calendar.DATE));
		System.out.println(c.get(Calendar.HOUR));
		System.out.println(c.get(Calendar.MINUTE));
		
		// static method now()
		LocalDateTime localdate = LocalDateTime.now(); // 오늘 날짜 리턴
		System.out.println(localdate);
		System.out.println(localdate.getYear());
		System.out.println(localdate.getMonth());
		System.out.println(localdate.getDayOfMonth());
		
		
		LocalDateTime birth = LocalDateTime.of(2001, 7, 24, 16, 44); // 날짜 생성
		
		System.out.println(birth);
		
		// yyyy MM dd hh:mm:ss
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy / MM / dd hh시 mm분 ss초");
		System.out.println(df.format(birth));
		
		
		
		
		
		
		
		
		
		
		// MAIN END
	}

}
