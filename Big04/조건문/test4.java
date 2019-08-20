package 조건문;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자1>>");
		int num1 = sc.nextInt();
		System.out.print("숫자2>>");
		int num2 = sc.nextInt();
		System.out.print("골라주세요? +, -, *, / ???");
		String method = sc.next();
		if (method.equals("+")) {
			System.out.println(num1 + num2);
		} else if (method.equals("-")) {
			System.out.println(num1 - num2);
		} else if (method.equals("*")) {
			System.out.println(num1 * num2);
		} else if (method.equals("/")) {
			System.out.println(num1 / num2);
		}
	}

}
