package 조건문;

import java.util.Date;

public class test2 {

	public static void main(String[] args) {
		Date year = new Date();
		int year1 = year.getYear();
		int year2 = year1+1900;
		int year3 = 2222 - year2;
		System.out.println("2222년까지 " + year3 + "년 남았다.");
	}

}
