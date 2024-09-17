package ejerciciojava;
import java.util.Scanner;

public class Ejercicio16 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena de texto: ");
        String texto = scanner.nextLine();

        int contadorVocales = 0;
        texto = texto.toLowerCase();
        String vocales = "aeiou";

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);

            if (vocales.indexOf(caracter) != -1) {
                contadorVocales++;
            }
        }
        System.out.println("El numero de vocales es: " + contadorVocales);
        scanner.close();
    }
}
