import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

/**
 * Clase Principal que ejecuta el programa
 */

public class ClaseMain{

    public static void main(String[] args) throws ContrasenaInvException {
        Scanner scanner = new Scanner(System.in);

        System.out.println(" Validador de Contraseña ");
        System.out.println("Reglas para la Contraseña;");
        System.out.println(" - Mas de 8 caracteres");
        System.out.println(" - Al menos un numero");
        System.out.println();

        try {
            System.out.print("Ingrese una Contraseña: ");
            String contrasena = scanner.nextLine();

            ValidadorContrasenas.ValidarContrasenas(contrasena);

            System.out.println("¡Contraseña Valida!");

        } catch (IllegalArgumentException e) {
            System.out.println("¡Error de Entrada!" + e.getMessage());

        } finally {
            scanner.close();
        }
    }
}