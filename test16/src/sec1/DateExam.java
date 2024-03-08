package sec1;

import java.time.LocalDate;
import java.util.Date;

public class DateExam {

	public static void main(String[] args) {
		Date date1 = new Date();
		
		
		@SuppressWarnings("deprecation")
		Date date2 = new Date(1981,11,25,7,24,37);//월은 0부터 시작, 12월은 11 기입해야 함

		@SuppressWarnings("deprecation")
		Date date3 = new Date("Mon,02 Apr 2001 03:48:27 +0900");//+0900: RFC 822 규격 타임존
		//지역 이름(Global/Local):KST(Korea standard time) ,RFC 822:+0900
		//국가 코드 : KR, 언어코드: KO =>KO_KR
		System.out.println(date1);
		System.out.println(date2);
		System.out.println(date3);
		
		System.out.println("**** LocalDate ****");
		
		LocalDate now1 = LocalDate.now();
		System.out.println(now1); 	//날짜 데이터
		//날짜 데이터 => 문자열 데이터
		String now2 = now1.toString();
		//문자열 데이터 => 날짜 데이터
		LocalDate now3 = LocalDate.parse(now2);
				
		
		
		
		
		
		
		
		
		
	}

}
