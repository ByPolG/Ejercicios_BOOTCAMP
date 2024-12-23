package Java_Basico.Semana1.Ejercicios_01_Dia2;

public class Ejercicio2 {

    public static void main(String[]args){

        // No es posible asignar texto o números que no sean enteros.
        int numInt = 5;

        // No es posible asignar texto o números que no sean con decimales.
        double numDouble = 5.5;

        // Solo se le puede asignar 'true' o 'false'.
        boolean valorBoolean = true;

        // Se puede asignar cualquier valor, pero debe estar entre comillas, además se mostrará como texto.
        String texto = "Esto es un texto de prueba";

        // Si no se cumplen esas condiciones, dará error al ejecutar.
        System.out.println("Valor INT -> " + numInt);
        System.out.println("Valor DOUBLE -> " + numDouble);
        System.out.println("Valor BOOLEAN -> " + valorBoolean);
        System.out.println("Valor STRING -> " + texto);

        // Integer numeroInt = 55;
        // Double doubleDecimales = 55.5;
        // Boolean verdaderoBoo = true;

    }
}
