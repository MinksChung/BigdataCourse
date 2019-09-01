package 상속;

public class TruckCoffeeShop extends CoffeeShop {

	int location;
	String company = "더디아";
	
	
	public TruckCoffeeShop() {
	}

	public TruckCoffeeShop(String name, int price, String company, int location) {
		super(name, price, company);
		this.location = location;
	}

	@Override
	public String toString() {
		return "TruckCoffeeShop [location=" + location + ", company=" + super.company + ", name=" + name + ", price=" + price
				+ "]";
	}
	
}
