package 조건문;

import java.util.Scanner;

public class if_test6 {

	public static void main(String[] args) {
	 Scanner sc = new Scanner(System.in);
	 System.out.print("당신의 수학점수는 몇점?");
	 int myscore = sc.nextInt();
	 char mylvl;
	 if(myscore >=90) {
		 mylvl = 'A';
	 }else if(myscore >=80) {
		 mylvl = 'B';
	 }else if(myscore >=70) {
		 mylvl = 'C';
	 }else if(myscore >=60) {
		 mylvl = 'D';
	 }else {
		 mylvl = 'F';
	 }
	 System.out.println("당신의 학점은:" + mylvl);
	}
}




