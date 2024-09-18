package EjerciciosdeProgra;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo numero: ");
        int num2 = scanner.nextInt();

        if (num1 > num2) {
            System.out.println("Los numeros de mayor a menor son: " + num1 + " - " + num2);
        } else if (num1 < num2) {
            System.out.println("Los numeros de mayor a menor son: " + num2 + " - " + num1);
        } else {
            System.out.println("Los numeros son iguales: " + num1 + " - " + num2);
        }
        scanner.close();
    }
}
