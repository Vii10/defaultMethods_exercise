package application;

import java.util.Locale;
import java.util.Scanner;

import services.BrazilInterestRate;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Amount: ");
		double amount = sc.nextDouble();
		System.out.print("Months: ");
		int months = sc.nextInt();
		
		BrazilInterestRate br = new BrazilInterestRate(2.0); //Criando objeto com a quantidade juros
		
		System.out.println("Payment after " + months + " months: ");
		System.out.println(String.format("%.2f", br.payment(amount, months))); //Acessando a funcao de calculo da interface e passando os valores
		
		sc.close();
	}

}
