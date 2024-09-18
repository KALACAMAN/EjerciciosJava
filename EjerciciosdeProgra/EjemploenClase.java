package EjerciciosdeProgra;
import java.util.Scanner;
public class EjemploenClase {
    public static void main(String[] args) {
        Scanner sp = new Scanner(System.in);
        int opcion;
        do {
            // crear un Menu principal
            System.out.println("---------------------------");
            System.out.println("| 1. Iniciar Juego        |");
            System.out.println("| 2. Continuar Juego      |");
            System.out.println("| 3. Partidas             |");
            System.out.println("| 4. Salir                |");
            System.out.println("---------------------------");
            opcion = sp.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Iniciamos el juego");
                    break;
                case 2:
                    System.out.println("Continuar el juego");
                    break;
                case 3:
                    System.out.println("Partidas");
                    break;
                case 4:
                    System.out.println("Finaliza el juego");
                    break;
            }
        } while (opcion != 4);

    }
}
