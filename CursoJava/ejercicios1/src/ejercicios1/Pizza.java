package ejercicios1;

	public class  Pizza {
	    // Atributos de instancia (características de cada pizza)
	    String tamaño;
	    String tipo;
	    String estado;

	    // Atributos estáticos (compartidos por todas las pizzas)
	    static int totalPizzasPedidas = 0;
	    static int totalPizzasServidas = 0;

	    // Constructor: se ejecuta al crear una nueva pizza
	    public Pizza(String tamaño, String tipo) {
	        this.tamaño = tamaño;       // Asigna el tamaño de la pizza
	        this.tipo = tipo;           // Asigna el tipo de la pizza
	        this.estado = "pedida";     // Estado inicial: "pedida"
	        Pizza.totalPizzasPedidas++; // Incrementa el contador de pizzas pedidas
	    }

	    // Método para servir la pizza (cambia su estado a "servida")
	    public void servir() {
	        if (this.estado.equals("pedida")) {  // Solo puedes servirla si aún no ha sido servida
	            this.estado = "servida";          // Cambia el estado a "servida"
	            Pizza.totalPizzasServidas++;      // Incrementa el contador de pizzas servidas
	        } else {
	            System.out.println("Esta pizza ya ha sido servida.");
	        }
	    }

	    // Método estático para mostrar cuántas pizzas se han pedido
	    public static void mostrarPizzasPedidas() {
	        System.out.println("Total de pizzas pedidas: " + Pizza.totalPizzasPedidas);
	    }

	    // Método estático para mostrar cuántas pizzas se han servido
	    public static void mostrarPizzasServidas() {
	        System.out.println("Total de pizzas servidas: " + Pizza.totalPizzasServidas);
	    }
	}


