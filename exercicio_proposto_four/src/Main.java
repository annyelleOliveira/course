import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Informar número do funcionário: ");
		int numeroFuncionario = sc.nextInt();
		System.out.println("Informar horas trabalhadas: ");
		int horasTrabalhadas = sc.nextInt();
		System.out.println("Informar valor da hora trabalhada: ");
		double valorHora = sc.nextDouble();
		
		double salario  = horasTrabalhadas * valorHora;
		
		System.out.println("NUMBER: " + numeroFuncionario);
		System.out.printf("SALARY: %.2f%n U$", salario);
		sc.close();
		
		
	}

}
