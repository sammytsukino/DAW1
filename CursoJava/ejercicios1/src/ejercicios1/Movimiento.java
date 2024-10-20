package ejercicios1;

class Movimiento {
    // Atributos de la clase
    float saldoCuenta = 0;      float cantidad;          
    String concepto;      
    int idMovimiento = 0;   

    // Constructor
    public Movimiento(float cantidad, String concepto, int idMovimiento, float saldoCuenta) {
        this.cantidad = cantidad;
        this.concepto = concepto;
        this.idMovimiento = idMovimiento;
        this.saldoCuenta = saldoCuenta;
    }
}


