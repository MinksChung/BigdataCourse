package 상속;

public class BankUser {

	public static void main(String[] args) {
		
		BadBank bad = new BadBank();
		System.out.println(bad.getInterestRate());
		
		NormalBank normal = new NormalBank(); 
		System.out.println(normal.getInterestRate());
		
		GoodBank good = new GoodBank();
		System.out.println(good.getInterestRate());
		
	}

}
