package Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio1.entities;

import Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio1.excepciones.ReservaInvalidaException;

public class Reserva {

    private String nombre;
    private String destino;
    private String fechaViaje;
    private Integer numAsientos;

    public Reserva() {

    }

    public Reserva(String nombre, String destino, String fechaViaje, Integer numAsientos) {
        this.nombre = nombre;
        this.destino = destino;
        this.fechaViaje = fechaViaje;
        this.numAsientos = numAsientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public Integer getNumAsientos() {
        return numAsientos;
    }

    public void setNumAsientos(Integer numAsientos) {
        this.numAsientos = numAsientos;
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "nombre='" + nombre + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaViaje='" + fechaViaje + '\'' +
                ", numAsientos=" + numAsientos +
                '}';
    }

    // Metodo para realizar la reserva

    public void realizarReserva(Vuelo vuelo) {

        try {

            if (nombre == null || nombre.isEmpty() || destino == null || destino.isEmpty() || fechaViaje == null || fechaViaje.isEmpty()) {

                throw new ReservaInvalidaException("Faltan datos para realizar la reserva.");
            }

            if (!destino.equals(vuelo.getDestino())) {

                throw new ReservaInvalidaException("El destino de la reserva no coincide con el vuelo.");
            }

            vuelo.reservarAsientos(numAsientos);

        } catch (ReservaInvalidaException e) {

            System.err.println("Error: " + e.getMessage());

        } finally {

            System.out.println("Reserva finalizada con éxito.");
        }
    }
}