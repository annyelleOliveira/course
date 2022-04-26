import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int diaSemana;
		String dia;

		System.out.println("Digitar dia: ");
		Scanner sc = new Scanner(System.in);
		diaSemana = sc.nextInt();
		
		switch (diaSemana) {
		case 1:
			dia = "Domingo";
			break;
		case 2:
			dia = "Segunda";
			break;
		case 3:
			dia = "Terça";
			break;
		case 4:
			dia = "Quarta";
			break;
		case 5:
			dia = "Quinta";
			break;
		case 6:
			dia = "Sexta";
			break;
		case 7:
			dia = "Sabado";
			break;
		default:
			dia = "Valor inválido";
			break;
		}
		
		System.out.println("Dia da semana: " + dia);
		
		sc.close();
	}

}
