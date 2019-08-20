package 조건문;

import java.util.Date;
import java.util.Scanner;
import java.util.PrimitiveIterator.OfDouble;
import javax.swing.JOptionPane;

public class food_test2 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("뭐먹을거야??");
		 String food = sc.next();
		 System.out.print("몇개먹을거야??");
		 int qtyfood = sc.nextInt();
		 System.out.println("얼마짜리 먹을거야?");
		 int prcfood = sc.nextInt();
		 if(food.equals("자장")) {
			 int totalamount = qtyfood*prcfood;
			 if(totalamount>=6000) {
				 totalamount = totalamount-500;
			 }
			 System.out.println("중국집에서" + totalamount + "내고 먹어요");
		 } else if(food.equals("라면")) {
			 System.out.println("분식집으로가요");
		 } else if (food.equals("스시")) {
			 System.out.println("일식집으로가요");
		 } else {
			 System.out.println("집에서먹어요");
		 }
	}
	
}
