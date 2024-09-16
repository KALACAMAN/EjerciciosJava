
package ejerciciojava;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Por favor, ingrese su edad: ");
        int edad = scanner.nextInt();
        

        if (edad > 18) {
            System.out.println("Mayor de edad");
        } else {
            System.out.println("No es mayor de edad");
        }
        
        scanner.close();
    }
    
    
}
