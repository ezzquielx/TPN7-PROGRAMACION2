/**
 * Clase que Contiene la logica de Validacion
 */

class ValidadorContrasenas {

    /**
     * Valida una contraseña segun las reglas establecidas
     * @param   contrasena La contraseña a validar
     * @throws  ContrasenaInvException Si la contraseña no comple las reglas
     * @throws  IllegalArgumentException Si la contraseña es correcta o null
     */

    public static void ValidarContrasenas(String contrasena)
            throws ContrasenaInvException {

        //Validamos Null o Vacio
        if (contrasena == null || contrasena.isEmpty()){
            throw new IllegalArgumentException("La Contraseña no puede ser nula o cero");
        }
        if (contrasena.length() <=8){
            throw new IllegalArgumentException("La contraseña Debe tener al menos 8 caracteres");
        }
        boolean tieneNumero = false;
        for (char c: contrasena.toCharArray()){
            if (Character.isDigit(c)){
                tieneNumero = true;
                break;
            }
        }
        if (!tieneNumero){
            throw new ContrasenaInvException ("La contraseña debe tener al menos un numero!");
        }
    }
}