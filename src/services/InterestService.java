package services;

import java.security.InvalidParameterException;

public interface InterestService {
	
	double getInterestRate(); //Contrato
	
	default double payment(double amount, int months) { //Metodo que utiliza o contrato para calcular os juros
		if(months < 1) {
			throw new InvalidParameterException("Number of months are invalid!");
		}
		return amount * Math.pow(1 + getInterestRate() / 100, months);
	}
	
}
