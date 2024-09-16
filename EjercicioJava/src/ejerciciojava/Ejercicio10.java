package ejerciciojava;
import java.util.Scanner;

public class Ejercicio10 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        double numero3 = scanner.nextDouble();
        double mediano;

        if ((numero1 > numero2 && numero1 < numero3) || (numero1 < numero2 && numero1 > numero3)) {
            mediano = numero1;
        } else if ((numero2 > numero1 && numero2 < numero3) || (numero2 < numero1 && numero2 > numero3)) {
            mediano = numero2;
        } else {
            mediano = numero3;
        }
        System.out.println("El numero mediano es: " + mediano);
        scanner.close();
    }    
}
