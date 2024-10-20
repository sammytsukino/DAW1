package ejercicios1;


public class Main {
    public static void main(String[] args) {
        // Crear algunas pizzas
        Pizza p1 = new Pizza("mediana", "barbacoa");
        Pizza p2 = new Pizza("familiar", "cuatro quesos");
        Pizza p3 = new Pizza("mediana", "carbonara");

        // Servir algunas pizzas
        p1.servir(); // Servimos la pizza p1
        p3.servir(); // Servimos la pizza p3

        // Mostrar el total de pizzas pedidas y servidas
        Pizza.mostrarPizzasPedidas();  // Debería mostrar 3 pizzas pedidas
        Pizza.mostrarPizzasServidas(); // Debería mostrar 2 pizzas servidas

        // Intentamos servir una pizza ya servida
        p1.servir();  // Debería decir que ya ha sido servida
    }
}
