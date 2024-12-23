package Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio2.excepciones;

public class ProductoInvalidoException extends Exception {

    public ProductoInvalidoException() {

    }

    public ProductoInvalidoException(String mensaje) {

        super(mensaje);
    }
}
