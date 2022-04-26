import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	
		int inicio, fim;
		
		System.out.println("Digite a hora inicial do jogo e a final");
		Scanner sc = new Scanner(System.in);
		
		inicio = sc.nextInt();
		fim = sc.nextInt();
		
		int duracao;
		
		if (inicio < fim) {
			duracao = fim - inicio;
		} else {
			duracao = 24 - inicio + fim;
		}
		
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		sc.close();
	}

}
