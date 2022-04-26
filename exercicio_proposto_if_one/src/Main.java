import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
    
		int x;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		if ( x >= 0) {
			System.out.println("POSITIVO");
		} else {
			System.out.println("NEGATIVO");
		}
		
		sc.close();
		
	}
}
