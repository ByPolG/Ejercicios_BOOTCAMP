package Java_Basico.Semana1.Ejercicios_02_Dia3;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][] asientos = new String[5][5]; // Creamos la matriz de asientos 5x5 e inicializarla con "O" (vacíos)

        for (int fila = 0; fila < asientos.length; fila++) {

            for (int columna = 0; columna < asientos.length; columna++) {

                asientos[fila][columna] = "O";
            }
        }

        boolean continuar = true; // Control del bucle principal

        while (continuar) {

            // Mostrarmos los asientos (con la información actualizada)

            System.out.println("Asientos disponibles:");
            mostrarAsientos(asientos);

            // El usuario debe introducir la fila y columna que desea ocupar

            System.out.println("Ingresa la fila (1-5) y el asiento (1-5) que deseas reservar:");
            System.out.println("Fila: ");
            int fila = sc.nextInt() - 1; // Debemos restar 1 para ajustar la matriz, sino tendríamos que escribir valores entre 0 y 4.
            System.out.println("Asiento: ");
            int columna = sc.nextInt() - 1;

            // Comprobamos que las coordenadas sean válidas

            if (fila >= 0 && fila < asientos.length && columna >= 0 && columna < asientos.length) {

                if (asientos[fila][columna].equals("O")) { // Comprobamos si el asiento está ocupado

                    asientos[fila][columna] = "X"; // Si está libre, lo marcamos con una X (ocupado)
                    System.out.println("Reserva realizada con éxito.");

                } else {
                    System.out.println("El asiento ya está ocupado. Por favor, elija otro.");
                }
            } else {
                System.out.println("La fila o el asiento ingresado no son válidos. Intente nuevamente.");
            }

            // Nos pregunta si queremos seguir con las reservas

            System.out.print("¿Deseas realizar otra reserva? (S/N): ");

            char respuesta = sc.next().toUpperCase().charAt(0);
            if (respuesta != 'S') {
                continuar = false;
            }
        }

        System.out.println("\nSistema de reservas finalizado. Asientos reservados:");
        mostrarAsientos(asientos);

        sc.close();
    }

    // Método para mostrar el mapa de asientos

    public static void mostrarAsientos(String[][] asientos) {

        for (int fila = 0; fila < asientos.length; fila++) {

            for (int columna = 0; columna < asientos[fila].length; columna++) {

                System.out.print(asientos[fila][columna] + " ");
            }

            System.out.println(""); // En cada fila hacemos un salto de línea
        }
    }
}
