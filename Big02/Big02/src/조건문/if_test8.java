package 조건문;

import java.util.Random;
import java.util.Scanner;

public class if_test8 {

	public static void main(String[] args) {
		Random rndnum = new Random();
		int target = rndnum.nextInt(100);
		System.out.println("Try!");
		int counting = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			int puutingnum = sc.nextInt();
			if (puutingnum == target) {
				counting++;
				System.out.println("correct!");
				System.out.println(counting);
				break;
			} else if (puutingnum > target) {
				System.out.println("down!");
				counting++;
			} else if (puutingnum < target) {
				System.out.println("up!");
				counting++;
			}
		}
	}
}
