package 배열;

public class 차원배열1 {
	int[] num4; // 전역변수, 자동초기화
	// null로 초기화
	
	int num5; // 전역변수, 자동초기화
	// 0으로 초기화
	
	public static void main(String[] args) {
		// 자동초기화 => 0
		int[] num3; // 쓰레기 값
		int[] num = new int[10];
		// num[0] => 0(int, 기본형)
		int num2; // 쓰레기 값
//		System.out.println(num2);
		
		int[][] num5 = new int[3][2];
		// num5는 무슨타입? int[][]
		// num5[0]는 무슨타입? int[]
		// num5[0][0]는 무슨타입? int

		int[][] num6 = {
				{0,0,0},
				{0,0,0}
		};
		
		System.out.println(num6.length); // 행의 개수 = 2
		System.out.println(num6[0].length); // 열의 개수 = 3
		
	}

}
