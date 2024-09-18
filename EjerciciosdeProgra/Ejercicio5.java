package EjerciciosdeProgra;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el día: ");
        int dia = scanner.nextInt();

        System.out.print("Ingrese el mes: ");
        int mes = scanner.nextInt();

        System.out.print("Ingrese el año: ");
        int ano = scanner.nextInt();

        boolean fechaValida = false;
        if (ano > 0) {

            if (mes == 2) { // Febrero
                if (dia >= 1 && dia <= 28) {
                    fechaValida = true;
                }
            // Meses con 30 días
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) { 
                if (dia >= 1 && dia <= 30) {
                    fechaValida = true;
                }
            // Meses con 31 días
            } else if (mes >= 1 && mes <= 12) { 
                if (dia >= 1 && dia <= 31) {
                    fechaValida = true;
                }
            }
        }
        if (fechaValida) {
            System.out.println("fecha correcta");
        } else {
            System.out.println(" fecha incorrecta");
        }
        scanner.close();
    }
}


