/**
 * Excepción para errores en las reservas de cine
 */
public class ReservaException extends Exception {
    public ReservaException(String mensaje) {
        super(mensaje);
    }
}