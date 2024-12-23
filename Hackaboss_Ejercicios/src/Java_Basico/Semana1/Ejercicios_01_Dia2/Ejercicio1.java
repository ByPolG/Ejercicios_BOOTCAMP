package Java_Basico.Semana1.Ejercicios_01_Dia2;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        String nombre;

        System.out.println("Hola, introduce tu nombre: ");
        nombre = sc.nextLine();

        System.out.println("Hola " + nombre + ", bienvenido al sistema.");

        sc.close();
    }
}
