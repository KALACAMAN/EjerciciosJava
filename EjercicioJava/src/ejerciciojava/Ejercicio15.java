package ejerciciojava;
import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double mayor = Double.NEGATIVE_INFINITY;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el numero " + i + ": ");
            double numero = scanner.nextDouble();
            if (numero > mayor) {
                mayor = numero;
            }
        }
        System.out.println("El numero mayor ingresado es: " + mayor);
        scanner.close();
    }    
}
