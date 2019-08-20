package 조건문;

import java.util.Date;
import java.util.PrimitiveIterator.OfDouble;

public class date {

	public static void main(String[] args) {
		Date mydate = new Date();
		int myhour = mydate.getHours();
		int mymin = mydate.getMinutes();
		int mysec = mydate.getSeconds();
		System.out.println("현재시간은" + myhour + "시" + mymin + "분" + mysec + "초");
		
		int month = mydate.getMonth() + 1;
		int day = mydate.getDay();
			if (day == 0) {
				System.out.println("일요일");
			} else if (day == 1) {
				System.out.println("월요일");
			} else {
				System.out.println("흠흠");
			}
		int year = mydate.getYear() + 1900;
		
		System.out.println("이번달은 "+month+"월 오늘은 "+day+"일 올해는"+year+"년");
		
	}

}
