package ejerciciojava;
import java.util.Scanner;

public class Ejercicio13 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numero para la tabla de multiplicar: ");
        int numero = scanner.nextInt();
        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        scanner.close();
    }
}
