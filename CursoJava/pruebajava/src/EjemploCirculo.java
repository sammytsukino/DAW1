
public class EjemploCirculo {

    public static void main(String[] args) {
        
        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo(125);
        
        c1.setRadio(120);
        c1.mostrarDatos();

        c2.mostrarDatos();
    }

}
