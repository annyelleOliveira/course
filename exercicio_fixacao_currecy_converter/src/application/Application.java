package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Whats the dollar price? ");
		double price = sc.nextDouble();
		System.out.println("How many dollars will be bought?  ");
		double dolar = sc.nextDouble();
		
		
		System.out.printf("Amount to be paid in reais: %.2f%n", CurrencyConverter.valuePay(price, dolar));
		
		sc.close();

	}

}
