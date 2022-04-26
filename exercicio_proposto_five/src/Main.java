import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int pecaOne, pecaNumberOne, pecaTwo, pecaNumberTwo;
		double valorPecaOne, valorPecaTwo;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		pecaOne = sc.nextInt();
		pecaNumberOne = sc.nextInt();
		valorPecaOne = sc.nextDouble();
		
		pecaTwo = sc.nextInt();
		pecaNumberTwo = sc.nextInt();
		valorPecaTwo = sc.nextDouble();
		
		System.out.println("Dados peça 1: " + pecaOne + ", " + pecaNumberOne + ", " + valorPecaOne);
		System.out.println("Dados peça 2: " + pecaTwo + ", " + pecaNumberTwo + ", " + valorPecaTwo);

		double valor = (pecaNumberOne * valorPecaOne) + (pecaNumberTwo * valorPecaTwo);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valor);
		
		sc.close();
	}

}
