/**
 * Clase simple para manejar reservas de cine
 */

public class AdministradorCine {
    private boolean[] asientos;
    private int capacidad;
    private int ocupados;

    public AdministradorCine(int capacidad) {
        this.capacidad = capacidad;
        this.asientos = new boolean[capacidad];
        this.ocupados = 0;
    }

    /**
     * Reserva un asiento
     * @param numeroAsiento Número del asiento (1 a capacidad)
     * @throws ReservaException Si hay algún problema
     */
    public void reservarAsiento(int numeroAsiento) throws ReservaException {

        if (numeroAsiento < 1 || numeroAsiento > capacidad) {
            throw new ReservaException(
                    "Asiento inválido: " + numeroAsiento +
                            ". Debe ser entre 1 y " + capacidad);
        }

        if (asientos[numeroAsiento - 1]) {
            throw new ReservaException(
                    "El asiento " + numeroAsiento + " ya está ocupado");
        }

        if (ocupados >= capacidad) {
            throw new ReservaException(
                    "La sala está llena. Capacidad: " + capacidad);
        }

        asientos[numeroAsiento - 1] = true;
        ocupados++;

        System.out.println("Asiento " + numeroAsiento + " reservado exitosamente");
    }

    /**
     * Muestra el estado simple de la sala
     */

    public void mostrarEstado() {

        System.out.println("\nEstado de la sala:");
        System.out.println("Ocupados: " + ocupados + "/" + capacidad);

        System.out.print("Asientos: ");
        for (int i = 0; i < capacidad; i++) {
            if (asientos[i]) {
                System.out.print("[X] ");  // Ocupado
            } else {
                System.out.print("[" + (i+1) + "] ");  // Libre
            }
        }
        System.out.println("\n");
    }
}