package EjerciciosdeProgra;

public class Tablas_MultiplicarWhile {
     public static void main(String[] args) {
        int numero = 1;
        while (numero <= 10) {
            System.out.println("Tabla de multiplicar del " + numero + ":");
            int multiplicador = 1;
            while (multiplicador <= 10) {
                System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
                multiplicador++;
            }
            System.out.println();
            numero++;
        }
    }
}
