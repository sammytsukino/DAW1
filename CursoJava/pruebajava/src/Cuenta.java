public class Cuenta {
    
    int id;
    double saldo;
    Persona propietario;
    String tipo;

    public Cuenta(int numeroCuenta, Persona p) {
        id = numeroCuenta;
        propietario = p;
        saldo = 0;
        tipo = "Corriente";

        }

        public void verSaldo (){
            System.out.println("El número de la cuenta es " + id + ". El saldo de la cuenta es: " + saldo + "€");
        }

        public void ingresarDinero (double n){
            saldo +=n;
        }

        public void retirarDinero (double n){
            if (saldo >=n) saldo -=n;
            else System.out.println("Error: no hay suficiente saldo");

        }

        public void mostrarDatosCuenta(){
            System.out.println("El PROPIETARIO es: ");
            propietario.mostrarDatos();
            verSaldo();

        }
}
