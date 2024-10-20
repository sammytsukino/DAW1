package ejercicios1;

import java.util.Scanner;


public class Ejercicio2 {
	
	public static void main (String[]args) {
		
	Scanner scanner = new Scanner (System.in);
		
		System.out.println("Dime tu nombre");
		
		String nombre = scanner.nextLine();
		
		System.out.println("Dime tus apellidos");
		
		String apellidos = scanner.nextLine();
		
		System.out.println("¿Me dices tu dirección?");
		
		String direccion = scanner.nextLine();
		
		System.out.println("¿Me dices tu telefono?");
		
		String telefono = scanner.nextLine();
		
		System.out.println("¿Me dices tu DNI?");
		
		String dni = scanner.nextLine();
		
		System.out.println("Tu nombre es " + nombre + " y tus apellidos son " + apellidos + ". " + "Tu dirección es: " + direccion + " y tu teléfono es "  + telefono + ". " + "Además, tu DNI es: " + dni + ".");
		
		

		
		
		
		
		
	}
	
	

}
