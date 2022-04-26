import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String x;
		System.out.println("Digite: ");
		x = sc.next();
		System.out.println("Voce digitou: " + x);
		int y;
		System.out.println("Digite um numero: ");
		y = sc.nextInt();
		System.out.println("Voce digitou: " + y);
		double w;
		System.out.println("Digite um numero double: ");
		w = sc.nextDouble();
		System.out.println("Voce digitou: " + w);
		char q;
		System.out.println("Digite um numero char: ");
		q = sc.next().charAt(0);
		System.out.println("Voce digitou: " + q);
		sc.close();
	}		
}
