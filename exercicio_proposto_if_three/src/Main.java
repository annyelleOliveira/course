import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a, b;
		
		System.out.println("Digite número A e B:");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0|| b % a == 0 ) {
			System.out.println("SÃO MULTIPLOS");
		} else {
			System.out.println("NÃO SÃO MULTIPLOS");
		}
		sc.close();
	}

}
