package 조건문;

import java.util.Date;

public class test1 {

	public static void main(String[] args) {
		Date week = new Date();
		int date1 = week.getDay();
		String date = "";
		switch (date1) {
		case 1: case 7:
			date = "주말";
			System.out.println(date);
			break;
		case 2: 
			date = "월요일";
			System.out.println(date);
			break;
		case 3: 
			date = "화요일";
			System.out.println(date);
			break;
		case 4: 
			date = "수요일";
			System.out.println(date);
			break;
		case 5: 
			date = "목요일";
			System.out.println(date);
			break;
		case 6:
			date = "금요일";
			System.out.println(date);
			break;
		}
		if (date.equals("화요일")) {
			System.out.println("동네 한바퀴 도는 날");
		}
		
	}

}
