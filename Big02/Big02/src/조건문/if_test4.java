package 조건문;

import java.util.Date;

public class if_test4 {

	public static void main(String[] args) {
		Date mydate = new Date();
		int myhour = mydate.getHours();
	//	int hour = 11;
		if(myhour < 17) {
			System.out.println("멀었구나~~.");
		} else if(myhour > 17){
			System.out.println("다끝나간다~~~");
		}
		
	}
}
