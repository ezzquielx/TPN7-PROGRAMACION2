/**
 * Excepcion Personalizada para Validacion de Contraseñas
 */

class ContrasenaInvException extends Exception {
    public ContrasenaInvException(String mensaje){
        super(mensaje);
    }
}