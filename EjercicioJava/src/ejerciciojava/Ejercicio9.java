package ejerciciojava;

import java.util.Scanner;

public class Ejercicio9 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer numero: ");
        double numero3 = scanner.nextDouble();

        double mayor;
        
        if (numero1 >= numero2 && numero1 >= numero3) {
            mayor = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            mayor = numero2;
        } else {
            mayor = numero3;
        }
        System.out.println("El numero mayor es: " + mayor);
        scanner.close();
    }    
}
