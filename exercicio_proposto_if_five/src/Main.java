import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		int codigo;
		int quantidade;
		
		System.out.println("Informe o código e a quantidade do seu pedido:");
		Scanner sc = new Scanner(System.in);
		
		codigo = sc.nextInt();
		quantidade = sc.nextInt();
		
		double total;
		 
		if (codigo == 1) {
			total = quantidade * 4.0;
		} else if (codigo == 2) {
			total = quantidade * 4.50;
		} else if (codigo == 3) {
			total = quantidade * 5.0;
		} else if (codigo == 4) {
			total = quantidade * 2.0;
		} else {
			total = quantidade * 1.50;
		
		}
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
		sc.close();
	}

}
