package 상속;

public class CoffeeShop extends Shop {

	String company="스타박스";
	
	public CoffeeShop() {
	}

	public CoffeeShop(String name, int price, String company) {
		super(name, price);
		this.company = company;
	}
	
}
