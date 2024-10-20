package ejercicios1;
import java.util.Random;
public class Dado {
	
	public static void main (String[]args) {
		
		//Creamos el random
		Random random = new Random();
		//Creamos el array de ints con el número de tiradas
		int[] tiradas = new int [5];
		//Creamos la variable suma total que nos va a ir diciendo como van las sumas. Empezamos en 0.
		int suma = 0;
		
		/* Aquí viene lo gordo, 
		 * creamos el bucle (método) for, que irá haciendo la operación lógica
		 * que le pongamos durante la condición que le digamos
		 */
		
		for (int i=0; i<5; i++) {
			tiradas [i]= random.nextInt(6)+1;
			suma += tiradas [i];
		
		//Sacamos por pantalla los resultados de los dados
		
		System.out.println("Dado número " + (i + 1) + ": " + tiradas [i]);
		
		}
		//Sacamos por pantalla la suma de los dados
		
		System.out.println("Suma total de los dados: " + suma);
		

		
			
			
			
		}
			
			
	
		
		
		

	}

