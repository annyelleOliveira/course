import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Entre com tres n�meros: ");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
//		if(a > b && a > c) {
//			System.out.println("Maior = " + a);
//		} else if (b > a && b > c) {
//			System.out.println("Maior = " + b);
//		} else {
//			System.out.println("Maior = " + c);
//		}
		
		int maior = max(a, b,c);
		
		showResult(maior);
		
		sc.close();
	}
	
	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		} else if (y > z ) {
			aux = y;
		} else {
			aux = z;
		}
		return aux;
	}

	public static void showResult(int value) {
		System.out.println("Maior = " + value);
	}
}
