package Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio1.entities;

import Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio1.excepciones.ReservaInvalidaException;

public class Vuelo {

    private String destino;
    private String fechaViaje;
    private Integer asientosDisponibles;

    public Vuelo() {

    }

    public Vuelo(String destino, String fechaViaje, Integer asientosDisponibles) {
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.asientosDisponibles = asientosDisponibles;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaViaje() {
        return fechaViaje;
    }

    public void setFechaViaje(String fechaViaje) {
        this.fechaViaje = fechaViaje;
    }

    public Integer getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public void setAsientosDisponibles(Integer asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "destino='" + destino + '\'' +
                ", fechaViaje='" + fechaViaje + '\'' +
                ", asientosDisponibles=" + asientosDisponibles +
                '}';
    }

    // Metodo que actualiza la disponibilidad de los asientos

    public void reservarAsientos(int numAsientos) {

        try {

            if (numAsientos <= 0) {

                throw new ReservaInvalidaException("El número de asientos debe ser mayor a 0.");
            }

            if (numAsientos > asientosDisponibles) {

                throw new ReservaInvalidaException("No hay suficientes asientos disponibles.");
            }

            asientosDisponibles -= numAsientos;

            System.out.println("Se han reservado " + numAsientos + " asientos.");

        } catch (ReservaInvalidaException e) {

            System.err.println("Error: " + e.getMessage());
        } finally {

            System.out.println("Reserva finalizada con éxito.");
        }
    }

}
