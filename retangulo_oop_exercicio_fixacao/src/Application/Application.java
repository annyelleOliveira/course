package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle r = new Rectangle();
		System.out.println("Enter rectangle width and height: ");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();
		
		System.out.println("AREA: " + String.format( "%.2f",r.area()));
		System.out.println("PERIMETER: " + String.format( "%.2f",r.perimeter()));
		System.out.println("DIAGONAL: " + String.format( "%.2f",r.diagonal()));
		
		sc.close();
	}

}
