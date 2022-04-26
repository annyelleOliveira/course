import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double largura;
		double comprimento;
		double metroQuadrado;
		double area, preco;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o valor da largura: ");
		largura = sc.nextDouble();
		System.out.println("Informe o comprimento: ");
		comprimento = sc.nextDouble();
		System.out.println("Informe o valor do metro²: ");
		metroQuadrado = sc.nextDouble();
		System.out.printf("Largura do terreno: %.1f%n", largura);
		System.out.printf("Comprimento do terreno: %.1f%n", comprimento);
		System.out.printf("Valor do metro²: %.2f%n", metroQuadrado);
		
		Locale.setDefault(Locale.US);
		area = largura * comprimento;
		System.out.printf("Area: %.2f%n", area);
		preco = area * metroQuadrado;
		System.out.printf("Valor do terreno R$ %.2f%n ", preco);
		
		sc.close();
	}

}
