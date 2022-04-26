package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int N = sc.nextInt();
		
		for(int i=0; i<N; i++) {
			System.out.println();
			System.out.println("Employee #" + (i + 1) + " :");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			System.out.println("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();
			
			Employee emp = new Employee(id, name, salary);
			list.add(emp);

		}
		
		System.out.println();
		System.out.print("Enter the employee id that will have salary increase: ");
		int idSalary = sc.nextInt();
//		Integer pos= position(list, idSalary);
		
		Employee emp = list.stream().filter(x -> x.getId() == idSalary).findFirst().orElse(null);
		
//		if(pos == -1) {
		if(emp == null) {
			System.out.println("This id does not exist!");
		} else {
			System.out.println("Enter the percentage: ");
			double percent = sc.nextDouble();
//			list.get(pos).increaseSalary(percent);
			emp.increaseSalary(percent);
		}
		
		System.out.println();
		System.out.println("List of employees:");
		
		for(Employee emps : list) {
			System.out.println(emps);
		}
		sc.close();
		
	}
	
	
	//Encontrar o id	
	public static int position(List<Employee> list, int id) {
		for (int i=0; i < list.size(); i++) {
			if(list.get(i).getId() == id) {
				return i;
			}
		}
		
		return -1;
	}
}
