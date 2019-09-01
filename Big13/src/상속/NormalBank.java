package 상속;

public class NormalBank extends Bank{

	@Override
	public double getInterestRate() {
		interest = 5.0;
		return interest;
	}
	
}
