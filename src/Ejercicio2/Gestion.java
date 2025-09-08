import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Programa principal para gestionar calificaciones
 */
public class Gestion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("=== GESTOR DE CALIFICACIONES ===");
        System.out.println("Rango válido: 0 a 10");
        System.out.println();

        while (true) {

            try {

                System.out.print("Ingrese el nombre del estudiante (o 'salir' para terminar): ");
                String nombre = scanner.nextLine();

                if (nombre.equalsIgnoreCase("salir")) {
                    break;
                }

                System.out.print("Ingrese la calificación (0-10): ");
                double calificacion = scanner.nextDouble();
                scanner.nextLine();

                GestorCalificaciones.agregarCalificacion(nombre, calificacion);
                System.out.println();

            }

            catch (InputMismatchException e) {
                System.out.println("❌ Error: Debe ingresar un número válido");
                scanner.nextLine();
                System.out.println();

            }

            catch (CalificacionInvException e) {
                System.out.println("Erorr " + e.getMessage());
                System.out.println();

            }
        }

        System.out.println("¡Gracias por usar el gestor de calificaciones!");
        scanner.close();

    }
}