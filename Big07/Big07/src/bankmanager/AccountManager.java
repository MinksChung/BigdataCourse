package bankmanager;

public class AccountManager {

	public static void main(String[] args) {
		Account a1 = new Account();
		a1.type = "적금";
		a1.holderName = "홍길동";
		a1.amount = 10000;
		Account a2 = new Account();
		a2.type = "예금";
		a2.holderName = "홍길순";
		a2.amount = 20000;
		Account a3 = new Account();
		a3.type = "자유예금";
		a3.holderName = "홍길진";
		a3.amount = 15000;
		
		System.out.println("은행 계좌 관리 프로그램");
		System.out.println("----------------------------------");
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		
		

	}

}
