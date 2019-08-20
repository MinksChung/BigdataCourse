package 다차원배열;

import java.util.PrimitiveIterator.OfDouble;
import java.util.stream.IntStream;

import javax.naming.directory.SearchControls;

public class 배열1 {

	public static void main(String[] args) {
		int[] seats = new int[10];
		int[][] seat = new int[3][10];
		seat[0][0] = 1;
		seat[0][1] = 1;
		seat[0][2] = 1;
		seat[1][5] = 1;
		seat[1][6] = 1;
		seat[1][7] = 1;
		seat[1][8] = 1;
		System.out.print("    ");
		for (int i = 0; i < seats.length; i++) {

			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("-------------------------------------");

		for (int i = 0; i < seat.length; i++) {
			System.out.print(i + " : ");
			for (int j = 0; j < seat[i].length; j++) {

				System.out.print(seat[i][j] + " ");
			}
			System.out.println();
		}

	}
}
