/**
 * Excepción personalizada para calificaciones inválidas
 */
class CalificacionInvException extends Exception {
    public CalificacionInvException(String mensaje) {
        super(mensaje);
    }
}