package EjercicioCuentas;
import java.util.Scanner;

/**
 *
 * @author Enrique Portillo
 */
public class Consulta {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cuenta cuenta1 = new Cuenta("Cuenta No 1", 100);
        Cuenta cuenta2 = new Cuenta("Cuenta No 2", 150);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Acreditar a Cuenta No 1");
            System.out.println("2. Acreditar a Cuenta No 2");
            System.out.println("3. Debitar de Cuenta No 1");
            System.out.println("4. Debitar de Cuenta No 2");
            System.out.println("5. Consultar saldo de Cuenta No 1");
            System.out.println("6. Consultar saldo de Cuenta No 2");
            System.out.println("7. Salir");

            System.out.print("Seleccione una opcion: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese monto a acreditar a la cuenta No 1: ");
                    double montoA = scanner.nextDouble();
                    cuenta1.acreditar(montoA);
                    break;
                case 2:
                    System.out.print("Ingrese monto a acreditar a la cuenta No 2: ");
                    double montoB = scanner.nextDouble();
                    cuenta2.acreditar(montoB);
                    break;
                case 3:
                    System.out.print("Ingrese monto a debitar de la cuenta No 1 : ");
                    double debitoA = scanner.nextDouble();
                    cuenta1.debitar(debitoA);
                    break;
                case 4:
                    System.out.print("Ingrese monto a debitar de la cuenta No 2: ");
                    double debitoB = scanner.nextDouble();
                    cuenta2.debitar(debitoB);
                    break;
                case 5:
                    System.out.println("Saldo de la Cuenta No 1: Q." + cuenta1.Saldo());
                    break;
                case 6:
                    System.out.println("Saldo de la Cuenta No 2: Q." + cuenta2.Saldo());
                    break;
                case 7:
                    System.out.println("Saliendo de la consulta.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
    
}
