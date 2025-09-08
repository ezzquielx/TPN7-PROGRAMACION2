import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Programa simple de reservas de cine
 */

public class CineSys {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AdministradorCine cine = new AdministradorCine(15);

        System.out.println("RESERVAS DE CINE");
        System.out.println("Sala con 15 asientos (1-15)");

        while (true) {
            try {
                cine.mostrarEstado();

                System.out.print("Ingrese número de asiento (1-15) o 0 para salir: ");
                int asiento = scanner.nextInt();

                if (asiento == 0) {
                    System.out.println("¡Gracias!");
                    break;
                }

                cine.reservarAsiento(asiento);

            } catch (InputMismatchException e) {
                System.out.println("Error: Debe ingresar un número");
                scanner.nextLine();

            } catch (ReservaException e) {
                System.out.println("X " + e.getMessage());
            }
        }

        scanner.close();
    }
}