package Java_Basico.Semana2.Ejercicios_06_Dia7.Ej1;

import java.util.ArrayList;

public class Ejercicio1_Main {

    public static void main(String[]args){

        ArrayList<Ejercicio1_Vehiculo> vehiculos = new ArrayList<>();

        vehiculos.add(new Ejercicio1_Auto(1, "ABC123", "Tesla", "Modelo S", 2020, 7500.50, 100000, 10));
        vehiculos.add(new Ejercicio1_Camioneta(2, "XYZ456", "Toyota", "Hilux", 2018, 3500.50, 80.5, 12.7));
        vehiculos.add(new Ejercicio1_Moto(3, "MNO789", "Honda", "CBR500R", 2021, 700.50, "500", 4));

        // Mostramos la informacion de cada vehiculo

        for (Ejercicio1_Vehiculo v : vehiculos) {

            System.out.println(v);

            System.out.println("Antigüedad: " + v.calculoAntiguedad() + " años");

            if (v instanceof Ejercicio1_Electrico) {

                ((Ejercicio1_Electrico) v).cargarEnergia();

            } else if (v instanceof Ejercicio1_Combustion) {

                ((Ejercicio1_Combustion) v).recargarCombustible();
            }

            System.out.println();
        }
    }
}
