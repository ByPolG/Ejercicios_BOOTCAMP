package Java_Basico.Semana1.Ejercicios_03_Dia4;

public class Ejercicio1_Main {

    public static void main(String[] args) {

        // Con parámetros

        Ejercicio1_Electrodomestico electro1 = new Ejercicio1_Electrodomestico(1, "Samsung", "SmartWash", 1.5, "Blanco");
        Ejercicio1_Electrodomestico electro2 = new Ejercicio1_Electrodomestico(2, "LG", "CoolFridge", 0.8, "Gris");
        Ejercicio1_Electrodomestico electro3 = new Ejercicio1_Electrodomestico(3, "Sony", "SoundSystem", 0.5, "Negro");

        // Sin parámetros

        Ejercicio1_Electrodomestico electro4 = new Ejercicio1_Electrodomestico();

        // Mostramos por consola todo

        System.out.println("Electrodoméstico 1:");
        System.out.println("Marca: " + electro1.getMarca());
        System.out.println("Modelo: " + electro1.getModelo());
        System.out.println("Consumo: " + electro1.getConsumo() + " kWh\n");

        System.out.println("Electrodoméstico 2:");
        System.out.println("Marca: " + electro2.getMarca());
        System.out.println("Modelo: " + electro2.getModelo());
        System.out.println("Consumo: " + electro2.getConsumo() + " kWh\n");

        System.out.println("Electrodoméstico 3:");
        System.out.println("Marca: " + electro3.getMarca());
        System.out.println("Modelo: " + electro3.getModelo());
        System.out.println("Consumo: " + electro3.getConsumo() + " kWh\n");

        // Al no tener parámetros, el valor será 'null'

        System.out.println("Electrodoméstico 4 (sin parámetros):");
        System.out.println("Marca: " + electro4.getMarca());
    }
}
