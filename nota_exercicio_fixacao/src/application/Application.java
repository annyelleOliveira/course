package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Enter with the name the Aluno: ");
		aluno.name = sc.nextLine();
		
		System.out.println("Enter with the grades of Aluno: ");
		
		aluno.gradeOne = sc.nextDouble();
		aluno.gradeTwo = sc.nextDouble();
		aluno.gradeThree = sc.nextDouble();
		
		System.out.println("Final Grade: " + aluno.someGrade());
		
		if(aluno.someGrade() < 60.00) {
			System.out.println("FAILED");
			System.out.println("MISSING %.2Fn " + aluno.missingGrade() + "POINTS");
		} else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
