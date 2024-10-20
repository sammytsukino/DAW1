package ejercicios1;

import java.util.Scanner;

public class Ejercicio1 {
	
	public static void main (String[]args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Dime tu nombre");
		
		String nombre = scanner.nextLine();
		
		System.out.println("Dime tus apellidos");
		
		String apellidos = scanner.nextLine();
		
		System.out.println("Tu nombre es " + nombre + " y tus apellidos son " + apellidos + ".");
		
		
	}

}
