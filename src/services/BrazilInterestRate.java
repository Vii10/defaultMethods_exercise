package services;

public class BrazilInterestRate implements InterestService{
	
	private double InterestRate; //Valor de juros
	
	public BrazilInterestRate(double interestRate) {
		super();
		InterestRate = interestRate;
	}

	@Override
	public double getInterestRate() { //Envia o valor do InterestRate para a Interface calcular os juros
		return InterestRate;
	}
}
