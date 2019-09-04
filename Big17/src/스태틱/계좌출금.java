package 스태틱;

public class 계좌출금 {

	public static void main(String[] args) {
		
		계좌 account1 = new 계좌();
		account1.출금하다("20190829", 1000);
		System.out.println(account1);
		System.out.println("남아 있는 돈 : "+계좌.money);
		System.out.println(계좌.count);
		
		계좌 account2 = new 계좌();
		account2.출금하다("20190829", 1000);
		System.out.println(account2);
		
	}

}
