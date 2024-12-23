/*
Una recital permite únicamente el ingreso de mayores de 18 años.
Para ello necesita un programa que, a partir de que un usuario ingrese su edad,
determine mediante un mensaje en pantalla si la persona puede o no ingresar al evento. El programa debe mostrar (según cada caso) un mensaje informando la situación.
*/

package Java_Basico.Semana1.Ejercicios_02_Dia3;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        int edad;

        System.out.println("Hola, ingresa tu edad (entre 1 y 100): ");

        do{
            edad = sc.nextInt();

            if (edad >= 18 && edad <= 100){

                System.out.println("Enhorabuena, puedes entrar sin restricciones.");

            }else if (edad >= 16 && edad < 18){

                System.out.println("Enhorabuena, puedes entrar acompañado por un adulto.");

            }else if (edad < 1 || edad > 100){

                System.out.println("Este numero no es válido. Por favor, vuelve a introducir tu edad.");

            } else {

                System.out.println("Lo sentimos, no puedes ingresar aquí.");
            }

        }while (edad < 1 || edad > 100);

        sc.close();
    }
}
