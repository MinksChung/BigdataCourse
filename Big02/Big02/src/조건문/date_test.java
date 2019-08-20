package 조건문;

import java.util.Date;
import java.util.PrimitiveIterator.OfDouble;

import javax.swing.JOptionPane;

public class date_test {

	public static void main(String[] args) {
		Date mytime = new Date();
		int mynum = mytime.getHours();
		 if(mynum < 11) {
			 System.out.println("굿모닝");
		 } else if(mynum < 16) {
			 System.out.println("굿애프터눈");
		 } else if(mynum < 20) {
			 System.out.println("굿이브닝");
		 } else {
			 System.out.println("굿나잇");
		 }
		 
		 String food = "자장";
		 if(food.equals("자장")) {
			 System.out.println("중국집으로가요");
		 } else if(food.equals("라면")) {
			 System.out.println("분식집으로가요");
		 } else if (food.equals("스시")) {
			 System.out.println("일식집으로가요");
		 } else {
			 System.out.println("집에서먹어요");
		 }
	}
	
}
