package 인터페이스;

public class CookManager {

	public CookManager(ICook iCook) {
		
	}
	
	public void setCook(ICook iCook) {
		System.out.println("조리시작");

	}
	
	public void orderRice() {
		System.out.println("밥주문");
	}
	
	public void orderSoup() {
		System.out.println("국주문");
	}
	
}
