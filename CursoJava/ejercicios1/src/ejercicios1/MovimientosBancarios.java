package ejercicios1;

public class MovimientosBancarios {
	
    public static void main(String[] args) {
    	
        float saldoCuenta = 0;

        Movimiento nomina = new Movimiento(1200, "Nómina", 1, saldoCuenta);
        saldoCuenta += nomina.cantidad; // Saldo + nomina

        Movimiento facturaTelefonia = new Movimiento(-80, "Factura telefonía", 2, saldoCuenta);
        saldoCuenta += facturaTelefonia.cantidad; // Saldo + nomina + factura telefonía

        Movimiento facturaLuz = new Movimiento(-150, "Factura luz", 3, saldoCuenta);
        saldoCuenta += facturaLuz.cantidad; // Actualizamos el saldo final con factura luz

        System.out.println("Saldo final de la cuenta: " + saldoCuenta);
    }
}

