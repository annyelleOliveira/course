import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double valor = 50.0;
		int consumo;
		
		Locale.setDefault(Locale.US);
		
		System.out.println("Informar quantidade de minutos utilizados:");
		Scanner sc = new Scanner(System.in);
		consumo = sc.nextInt();
		
		if (consumo > 100) {
//			valor = valor + (consumo - 100) * 2.0;
			//ATRIBUIÇÃO ACUMULATIVA
			valor += (consumo - 100) * 2.0;
		}
		System.out.printf("Valor a pagar: R$ %.2f%n", valor);
		
		sc.close();
	}
}
