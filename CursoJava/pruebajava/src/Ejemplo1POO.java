
public class Ejemplo1POO {

    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe", 48, "49129335R", "Sevilla", "Publicista");
        Persona p2 = new Persona("Maria", 25, "28668779Z", "Madrid", "Cantaor");

        p2.edad = -5;
        p1.mostrarDatos();
        p2.mostrarDatos();

    }

}
