package 붕어빵;

public class 붕어빵만들기 {

	public static void main(String[] args) {
		붕어빵틀 b1 = new 붕어빵틀();
		b1.field = "팥";
		b1.lvl = "바싹";
		
		b1.굽다();
		b1.먹다();
		System.out.println(b1);
		System.out.println(b1);
		
	}

}
