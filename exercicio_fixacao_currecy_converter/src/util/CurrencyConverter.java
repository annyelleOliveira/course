package util;

public class CurrencyConverter {
	
	public static double IOF = 0.06;
	
	public static double valueDolar(double price, double dolar) {
		return price * dolar;
	}
	
	public static double valueIof(double price, double dolar) {
		return price * dolar * IOF;
	}
	
	public static double valuePay (double price, double dolar) {
		return valueDolar(price, dolar) + valueIof(price, dolar);
	}

}
