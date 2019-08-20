package 다차원배열;

import javax.naming.directory.SearchControls;

public class 배열2 {

	public static void main(String[] args) {
		int[][] seat = new int[3][];
		int[] n1= new int[10];
		int[] n2= new int[5];
		int[] n3= new int[3];
		
		seat[0]=n1;
		seat[1]=n2;
		seat[2]=n3;
		for (int i = 0; i<seat.length; i++) {
			System.out.print(i+" : ");
			for (int j = 0; j<seat[i].length; j++) {
				System.out.print(seat[i][j]+ " " );
				}
		}

	}

}
