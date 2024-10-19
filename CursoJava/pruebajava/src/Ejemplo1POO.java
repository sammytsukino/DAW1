
public class Ejemplo1POO {

    public static void main(String[] args) {
        Persona p1 = new Persona("Pepe", 48, "49129335R", "Sevilla", "Publicista");
        Persona p2 = new Persona("Maria", 25, "28668779Z", "Madrid", "Cantaor");


        Cuenta c1 = new Cuenta (1, p1);
        Cuenta c2 = new Cuenta (2, p2);

        c1.ingresarDinero(100);
        c2.ingresarDinero(200);


        c1.mostrarDatosCuenta();
        c2.mostrarDatosCuenta();


    }

}
