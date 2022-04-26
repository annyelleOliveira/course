package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee e = new Employee();
		System.out.println("Enter with the name: ");
		e.name = sc.nextLine();
		System.out.println("Enter with the grossSalary: ");
		e.grossSalary = sc.nextDouble();
		System.out.println("Enter the tax");
		e.tax = sc.nextDouble();
		
		System.out.println("Employee: " + e);
		
		System.out.println("Which percentage to increase salary? ");
		double increase = sc.nextDouble();
		e.increaseSalary(increase);
		
		System.out.println("Update data: " + e);
		sc.close();
	}

}
