package 조건문;

import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하세요??");
		String data1 = sc.next();
		char data2 = data1.charAt(0);
		
		if (data2=='a') {
			System.out.println("최우수입니다.");
		} else if (data2=='b') {
			System.out.println("우수입니다.");
		} else if (data2=='c') {
			System.out.println("보통입니다.");
		} else {
			System.out.println("통과하지못했습니다.");
		}
	}

}
