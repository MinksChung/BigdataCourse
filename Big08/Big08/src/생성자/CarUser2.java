package 생성자;

public class CarUser2 {

	public static void main(String[] args) {
		Car car2 = new Car("빨강",100);
	System.out.println(car2);
	}

	@Override
	public String toString() {
		return "CarUser2 []";
	}
	
}
