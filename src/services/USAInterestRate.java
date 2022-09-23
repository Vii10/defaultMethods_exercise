package services;

public class USAInterestRate implements InterestService{
	
	private double InterestRate;
	
	public USAInterestRate(double interestRate) {
		super();
		InterestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return InterestRate;
	}
	
	
}
