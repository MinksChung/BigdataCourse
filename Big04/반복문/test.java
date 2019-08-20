package 반복문;

public class test {

	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		for (int i = 1; i<=10; i++) {
			a *=i;
		}
		
		for (int i = 1; i<=10; i++) {
				if(i%4==0) {
				b *= i;
			}
		}
		System.out.println(a);
		System.out.println(b);
	}

}
