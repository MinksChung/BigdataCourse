package 인터페이스;

public class CookTest {

	public static void main(String[] args) {
		
		ICook iCook = new ChineseCook();
		
		CookManager cm = new CookManager(iCook);

		cm.orderRice();
		cm.orderSoup();
		cm.setCook(iCook);
		iCook.makeRice();
		iCook.makeSoup();
		iCook.makeSalad();
		iCook.makeSoup();
		
		System.out.println("============================");
		
		ICook iCook2 = new KoreanCook();
		
		CookManager cm2 = new CookManager(iCook2);

		cm2.orderRice();
		cm2.orderSoup();
		cm.setCook(iCook2);
		iCook2.makeRice();
		iCook2.makeSoup();
		iCook2.makeSalad();
		iCook2.makeSoup();
		
	}

}
