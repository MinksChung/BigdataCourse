package 상속;

public class BadBank extends Bank{
	
	@Override
	public double getInterestRate() {
		interest = 10.0;
		return interest;
	}
	
}
