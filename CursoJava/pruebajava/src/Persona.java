
public class Persona {

    String nombre;
    int edad;
    String DNI;
    String ciudadResidencia;
    String profesion;

    public Persona(String s, int e, String d, String c, String p) {
        nombre = s;
        edad = e;
        DNI = d;
        ciudadResidencia = c;
        profesion = p;

    }

    public void establecerEdad(int n) {
        if (n >= 0) {
            edad = n; 
        }else {
            System.out.println("No se puede modificar la edad, Mari");
        }

    }

    public void mostrarDatos() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("DNI: " + DNI);
        System.out.println("Ciudad: " + ciudadResidencia);
        System.out.println("Profesion: " + profesion);

    }

}
