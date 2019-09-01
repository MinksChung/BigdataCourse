package 상속;

public class GoodBank extends Bank{

	@Override
	public double getInterestRate() {
		interest = 3.0;
		return interest;
	}
	
}
