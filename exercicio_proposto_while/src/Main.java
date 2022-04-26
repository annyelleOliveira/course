import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int soma = 0;
		int x = sc.nextInt();
		
		while (x != 0) {
			//soma recebe seu proprio valor e os valores de x
			soma += x;
			x= sc.nextInt();
		}
		
		System.out.println("Soma dos valores: " + soma );
		
		sc.close();   
	}

}
