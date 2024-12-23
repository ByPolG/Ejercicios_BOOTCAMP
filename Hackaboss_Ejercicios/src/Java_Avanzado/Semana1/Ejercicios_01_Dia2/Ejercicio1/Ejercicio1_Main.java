package Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio1;

import Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio1.entities.Reserva;
import Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio1.entities.Vuelo;

public class Ejercicio1_Main {

    public static void main(String[] args) {

        Vuelo vuelo = new Vuelo("Barcelona", "2024-12-30", 50);

        Reserva reserva1 = new Reserva("Juan García", "Madrid", "2024-12-30", 5);
        Reserva reserva2 = new Reserva("Javier Rodríguez", "Barcelona", "2024-12-30", 10);
        Reserva reserva3 = new Reserva("Jose Miguel", "Barcelona", "2024-12-30", 60);

        // Realizamos las reservas

        reserva1.realizarReserva(vuelo); // Reserva inválida debido al destino incorrecto
        reserva2.realizarReserva(vuelo);
        reserva3.realizarReserva(vuelo); // Reserva inválida debido a la cantidad de asientos reservados
    }
}
