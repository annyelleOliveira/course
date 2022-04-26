import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n;

		System.out.println("Digite um número:");
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		
		if (n % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}
		
		sc.close();

	}

}
