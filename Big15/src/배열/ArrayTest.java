package 배열;

public class ArrayTest {

	public static void main(String[] args) {
		
		int[][] arr = {
				{11,12,13},
				{14,15,16,17},
				{18,19}
		};
		
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		
		for (int[] is : arr) {
			System.out.println(arr);
		}

	}

}
