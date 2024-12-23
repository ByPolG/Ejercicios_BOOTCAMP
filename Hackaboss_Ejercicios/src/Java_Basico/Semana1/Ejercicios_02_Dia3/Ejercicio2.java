package Java_Basico.Semana1.Ejercicios_02_Dia3;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double precio;
        double total = 0.0; // es necesario inicializarlo por defecto

        System.out.println("Hola, ingresa el precio de los productos. Si desea salir, debe escribir un número igual o menor a 0: ");

        do {
            System.out.println("Por favor, ingresa el precio en el teclado: ");
            precio = sc.nextDouble(); // es importante escribir decimales con comas y no con puntos

            if (precio > 0){
                total += precio;
            }

        } while (precio > 0);

        System.out.println("El total de la compra es de: "+ total + "€");

        sc.close();
    }
}
