package 변수;

import java.lang.reflect.Array;
import java.util.Arrays;

public class 배열복사 {

	public static void main(String[] args) {
		int[] n1 = { 1, 2, 3, 4, 5 };
		//int[] n2 = n1;
		int[] n2 = n1.clone();
		n1[0] = 9;
		System.out.println(n1);
		System.out.println(n2);
		for (int i : n1) {
			System.out.print(i + " ");
		}
		System.out.println("\n-----------------");
		for (int i : n2) {
			System.out.print(i + " ");
		}

	}
}
