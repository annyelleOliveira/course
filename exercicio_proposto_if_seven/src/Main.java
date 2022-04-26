import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double x, y;

		System.out.println("Digite as coordenadas:");

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		x = sc.nextDouble();
		y = sc.nextDouble();
		
		if (x == 0.0 && y == 00) {
			System.out.println("ORIGEM");
		} else if ( x == 0.0) { 
			System.out.println("EIXO Y");
		} else if ( y == 0.0) { 
			System.out.println("EIXO X"); 
		} else if ( x > 0.0 && y > 0.0) { 
			System.out.println("Q1");
		} else if (  x <  0.0 && y > 0.0) { 
			System.out.println("Q2");
		} else if (  x <  0.0 && y < 0.0) { 
			System.out.println("Q3");
		} else {
			System.out.println("Q4");
		}
		sc.close();
	}

}
