package Java_Basico.Semana1.Ejercicios_01_Dia2;

import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        double base;
        double altura;
        double resultado;

        System.out.println("Bienvenido, vas a calcular el área de un triángulo.\n");

        System.out.println("Introduce la base: ");
        base = sc.nextDouble();

        System.out.println("Introduce la altura: ");
        altura = sc.nextDouble();

        resultado = (base * altura) / 2;
        System.out.println("El área del triángulo es -> " + resultado);

        sc.close();

    }
}
