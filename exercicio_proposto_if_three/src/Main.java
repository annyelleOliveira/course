import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int a, b;
		
		System.out.println("Digite n�mero A e B:");
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = sc.nextInt();
		
		if (a % b == 0|| b % a == 0 ) {
			System.out.println("S�O MULTIPLOS");
		} else {
			System.out.println("N�O S�O MULTIPLOS");
		}
		sc.close();
	}

}
