package 반복문;

import java.util.Scanner;

public class fortest1 {

	public static void main(String[] args) {
		/*Scanner sc = new Scanner(System.in);
		System.out.println("처음수를 쳐주세요>>");
		int data1= sc.nextInt();
		System.out.println("마지막수를 쳐주세요>>");
		int data2= sc.nextInt(); */
		
		int sum = 0;
		for (int i = 0; i <= 10; i++) {
			
			if(i%2==1) {
			 continue;
			}
			sum = sum + i;
		}
		   System.out.println(sum);
	}

}
