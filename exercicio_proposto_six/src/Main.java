import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C =  sc.nextDouble();
		
		System.out.println("Valores informados " + "A: " + A + ", " + "B: " +B + ", " + "C: "+ C);
		
		double pi = 3.14159;
		double areaTrianguloRetangulo = A * C / 2;
		double areaCirculo = pi * Math.pow(C, 2);
		double trapezio = (A + B) / 2*C;
		double areaQuadrado = B*B;
		double areaRetangulo = A * B;
		
		System.out.printf("AREA DO TRIANGULO: %.3f%n", areaTrianguloRetangulo);
		System.out.printf("AREA DO CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPÉZIO: %.3f%n", trapezio);
		System.out.printf("AREA DO QUADRADO: %.3f%n",areaQuadrado);
		System.out.printf("AREA DO RETANGULO: %.3f%n", areaRetangulo);
		
		sc.close();
		
		
		
	}

}
