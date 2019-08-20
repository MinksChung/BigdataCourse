package 조건문;

public class ssss {

	public static void main(String[] args) {
		char c1 = 'A';
		char c2 = 'z';
		System.out.println(c1 < c2);
		int me=1;
		int com =0;  //0,가위, 1 바위 2 보
		
		if (me == com) {
			System.out.println("=");
		} else if (me == (com + 1) % 3) {
			System.out.println("me win");
		} else {
			System.out.println("com win, me loss");
		}
	}

}
