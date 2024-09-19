package EjercicioCuentas;

/**
 *
 * @author Enrique Portillo
 */
public class Cuenta {
    private String nombre;
    private double saldo;

    public Cuenta(String nombre, double saldoInicial) {
        this.nombre = nombre;
        this.saldo = saldoInicial;
    }

    public String Nombre() {
        return nombre;
    }

    public double Saldo() {
        return saldo;
    }

    public void acreditar(double monto) {
        saldo += monto;
        System.out.println("Se acreditaron Q." + monto + " a la cuenta " + nombre);
    }

    public void debitar(double monto) {
        if (monto > saldo) {
            System.out.println("Saldo insuficiente en la cuenta " + nombre);
        } else {
            saldo -= monto;
            System.out.println("Se debitaron Q." + monto + " de la cuenta " + nombre);
        }
    }
}
