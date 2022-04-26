import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a, b, c, d;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor de A: ");
		a = sc.nextInt();
		System.out.println("Informe o valor de B: ");
		b = sc.nextInt();
		System.out.println("Informe o valor de C: ");
		c = sc.nextInt();
		System.out.println("Informe o valor de D: ");
		d = sc.nextInt();
	
		
		
		int diferenca = (a *b) - (c * d);
		System.out.println("A diferença é de: " + diferenca);
		
		sc.close();
	}

}
