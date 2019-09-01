package 인터페이스;

public class KoreanCook implements ICook {

	public KoreanCook() {
	
	}
	
	@Override
	public void makeRice() {
		System.out.println("쌀밥");
		
	}

	@Override
	public void makeSoup() {
		System.out.println("미역국");
		
	}

	@Override
	public void makeSalad() {
		System.out.println("김치");
		
	}

	@Override
	public void makeSource() {
		System.out.println("간장");
		
	}

}
