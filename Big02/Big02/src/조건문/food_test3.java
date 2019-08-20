package 조건문;

import java.util.Date;
import java.util.PrimitiveIterator.OfDouble;

import javax.swing.JOptionPane;

public class food_test3 {

	public static void main(String[] args) {
		
		 String food = JOptionPane.showInputDialog("뭐먹을꺼야?");
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
