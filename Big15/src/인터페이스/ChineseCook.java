package 인터페이스;

public class ChineseCook implements ICook {

	public ChineseCook() {
	
	}
	
	@Override
	public void makeRice() {
		System.out.println("볶음밥");
		
	}

	@Override
	public void makeSoup() {
		System.out.println("게살수프");
		
	}

	@Override
	public void makeSalad() {
		System.out.println("청경채");
		
	}

	@Override
	public void makeSource() {
		System.out.println("짜장");
		
	}

}
