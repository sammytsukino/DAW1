
public class Circulo {
    private double radio;
    private String color;
    private int centroX, centroY;

    public Circulo () {
        radio = 50;
        color = "negro";
        centroX = 100;
        centroY= 100;

    }

    public Circulo (double r) {
        setRadio (r);
        color = "blanco";
        centroX = 0;
        centroY= 0;

    }

    public double getRadio (){
        return radio;
    }

    public void setRadio (double nuevoRadio) {
        if (nuevoRadio >= 0) radio = nuevoRadio;


    }

    public void decrece () {
        radio = radio / 1.3;

    }

    public double area () {
        return Math.PI * radio * radio;

    }

    public void mostrarDatos () {
        System.out.println("Círculo de radio " + radio + ", color " + color + " y centro (" + centroX + " , " + centroY + ")" + " , y su area es " + area());

    }

}
