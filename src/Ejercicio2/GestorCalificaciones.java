/**
 * Clase que gestiona y valida calificaciones de estudiantes
 */

public class GestorCalificaciones {

    /**
     * Valida una calificación según las reglas establecidas
     * @param calificacion La calificación a validar (0-10)
     * @throws CalificacionInvalidaException Si la calificación está fuera del rango
     */
    public static void validarCalificacion(double calificacion)
            throws CalificacionInvException {

        // Validar rango: debe estar entre 0 y 10
        if (calificacion < 0 || calificacion > 10) {
            throw new CalificacionInvException(
                    "La calificación debe estar entre 0 y 10. Valor ingresado: " + calificacion);
        }

        System.out.println("Calificación válida: " + calificacion);
    }

    /**
     * Agrega una calificación al sistema después de validarla
     * @param nombreEstudiante Nombre del estudiante
     * @param calificacion Calificación a agregar
     * @throws CalificacionInvalidaException Si la calificación es inválida
     */

    public static void agregarCalificacion(String nombreEstudiante, double calificacion)

            throws CalificacionInvException {

        validarCalificacion(calificacion);

        System.out.println("Calificación registrada para " + nombreEstudiante + ": " + calificacion);
    }
}