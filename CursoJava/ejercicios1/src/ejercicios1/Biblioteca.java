package ejercicios1;

class Libro {
    // Atributos
    String isbn;
    String titulo;
    int anio;
    int copias;

    // Constructor
    public Libro(String isbn, String titulo, int anio, int copias) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anio = anio;
        this.copias = copias;
    }
    
    

    // Método para prestar
    public void prestar() {
        copias--;  // Resto una copia, incluso si ya no hay disponibles
        System.out.println("Se ha prestado el libro: " + titulo);
        mostrarEstado();
    }

    // Método para devolver
    public void devolver() {
        copias++;  // Sumo una copia al devolver
        System.out.println("Se ha devuelto el libro: " + titulo);
        mostrarEstado();
    }

    // Método para mostrar el estado del libro
    public void mostrarEstado() {
        System.out.println("Copias disponibles: " + copias);
    }
}

public class Biblioteca {
    public static void main(String[] args) {
        // Creo un libro con 5 copias disponibles
        Libro libro1 = new Libro("9788-491465843", "Uzumaki", 2017, 5);

        // Pruebo un par de métodos
        libro1.prestar(); // Se presta una copia
        libro1.prestar(); // Se presta otra copia
        libro1.devolver(); // Se devuelve una copia
    }
}