package ejercicios1;
import java.util.Random;

public class Dado1 {
    
    public static void main(String[] args) {
        Random random = new Random();  // Para generar números aleatorios
        int[] tiradas = new int[5];    // Array para guardar los resultados de las tiradas
        int suma = 0;                  // Variable para almacenar la suma de las tiradas
        
        // Simulamos las tiradas de los 5 dados
        for (int i = 0; i < 5; i++) {
            tiradas[i] = random.nextInt(6) + 1;  // Genera un número entre 1 y 6 (simulando un dado)
            suma += tiradas[i];  // Añadimos la tirada actual a la suma total
            System.out.println("Dado " + (i + 1) + ": " + tiradas[i]);
        }
        
        // Mostramos la suma de todas las tiradas
        System.out.println("Suma total: " + suma);
    }
}