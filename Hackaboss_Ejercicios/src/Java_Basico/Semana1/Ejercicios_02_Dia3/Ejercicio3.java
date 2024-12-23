package Java_Basico.Semana1.Ejercicios_02_Dia3;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] temperaturas = new double[7]; // número de temperaturas -> 7
        double suma = 0.0;

        System.out.println("Ingresa las temperaturas máximas de los últimos 7 días: ");


        for (int i = 0; i < temperaturas.length; i++) {

            System.out.print("Día " + (i + 1) + ": ");

            temperaturas[i] = sc.nextDouble();

            suma += temperaturas[i]; // se van sumando las temperaturas de la lista
        }

        double promedio = suma / temperaturas.length; // la variable

        System.out.println("La temperatura máxima promedio de la última semana es de " + promedio + "ºC");

        sc.close();
    }
}


