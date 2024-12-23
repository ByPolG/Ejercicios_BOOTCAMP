package Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio1.excepciones;

public class ReservaInvalidaException extends Exception {

    public ReservaInvalidaException() {

    }

    public ReservaInvalidaException(String mensaje) {

        super(mensaje);
    }
}
