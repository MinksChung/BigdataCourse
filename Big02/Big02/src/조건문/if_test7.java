package 조건문;

import java.util.Scanner;

public class if_test7 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("안정성점수는?");
	double stable = sc.nextInt(); 
	System.out.print("속도점수는?");
	double speed = sc.nextInt();
	System.out.print("연비점수는?"); 
	double litperhour = sc.nextInt();
	
		stable = stable*0.3; 
		speed = speed*0.5; 
		litperhour = litperhour*0.2;
		double total = stable + speed + litperhour;
		int inttotal = (int)total;
		String totallvl;
		
		if (total >=90) {
			totallvl = "최우수";
		} else if (total >=80) {
			totallvl = "우수";
		} else if (total >=70) {
			totallvl = "보통";
		} else {
			totallvl = "미달";
		}
		System.out.println("안정성(30%) 점수는: " + stable);
		System.out.println("속도점수는(50%) 점수는: " + speed);
		System.out.println("연비점수는(20%) 점수는: " + litperhour);
		System.out.println("-------------------------------------------------------------");
		System.out.println("총 점수는 " + inttotal +"점 이며, 등급은 " + totallvl + "입니다.");
	}
}




