package Java_Basico.Semana1.Ejercicios_01_Dia2;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer num1;
        Integer num2;

        Integer suma;
        Integer resta;
        Integer multiplicar;
        Double dividir;

        System.out.println("Hola, vamos a realizar la suma, resta, multiplicación y división de dos números.\n");

        System.out.println("Introduce el primer número: ");
        num1 = sc.nextInt();

        System.out.println("Introduce el segundo número: ");
        num2 = sc.nextInt();

        System.out.println("\nResultados:");
        System.out.println("-----------");

        suma = num1 + num2;
        System.out.println("Suma: " + suma);

        resta = num1 - num2;
        System.out.println("Resta: " + resta);

        multiplicar = num1 * num2;
        System.out.println("Multiplicación: " + multiplicar);

        // Para comprobar cuál es el número mayor y dividirlo entre el menor
        if (num1 > num2) {

            dividir = (double) num1 / num2;
            System.out.println("División: " + dividir);

        } else if (num2 > num1) {

            dividir = (double) num2 / num1;
            System.out.println("División: " + dividir);

        } else {

            // Por si los dos números son iguales
            dividir = (double) num1 / num2;
            System.out.println("División: " + dividir);
        }

        sc.close();
    }
}
