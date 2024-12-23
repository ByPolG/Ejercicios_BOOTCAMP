package Java_Basico.Semana2.Ejercicios_04_Dia5;

public class Verdura_Main {

    public static void main(String[] args) {

        Ejercicio_Verdura[] verduras = new Ejercicio_Verdura[5]; // Vector con cinco posiciones

        verduras[0] = new Ejercicio_Verdura(1, "lechuga", "verde", 2, false);
        verduras[1] = new Ejercicio_Verdura(2, "tomate", "rojo", 4, false);
        verduras[2] = new Ejercicio_Verdura(3, "pepino", "verde", 3, false);
        verduras[3] = new Ejercicio_Verdura(4, "berenjena", "morado", 3, false);
        verduras[4] = new Ejercicio_Verdura(5, "cebolla", "blanco", 6, true);

        // Recorremos el vector y mostramos el nombre de la verdura y sus calorías

        System.out.println("\nLista de verduras:");
        System.out.println("------------------");

        for (Ejercicio_Verdura verdura : verduras) {

            System.out.println("La verdura es " + verdura.getNombre() + ", y tiene " + verdura.getCalorias() + " calorías.");
        }

        // Para cambiar todos los datos de dos verduras

        System.out.println("\nCambio de datos de las verduras:");
        System.out.println("------------------");
        System.out.println("\nAntes:");
        System.out.println("Verdura 1: " + verduras[0].getNombre() + ", " + verduras[0].getColor() + ", " + verduras[0].getCalorias() + ", " + verduras[0].getDebeCocinarse());
        System.out.println("Verdura 2: " + verduras[1].getNombre() + ", " + verduras[1].getColor() + ", " + verduras[1].getCalorias() + ", " + verduras[1].getDebeCocinarse());

        // Efectuamos el cambio

        // Verdura 1

        verduras[0].setNombre("calabacin");
        verduras[0].setColor("verde");
        verduras[0].setCalorias(15);
        verduras[0].setDebeCocinarse(true);

        // Verdura 2

        verduras[1].setNombre("coliflor");
        verduras[1].setColor("blanco");
        verduras[1].setCalorias(10);
        verduras[1].setDebeCocinarse(true);

        System.out.println("\nAhora:");
        System.out.println("Verdura 1: " + verduras[0].getNombre() + ", " + verduras[0].getColor() + ", " + verduras[0].getCalorias() + ", " + verduras[0].getDebeCocinarse());
        System.out.println("Verdura 2: " + verduras[1].getNombre() + ", " + verduras[1].getColor() + ", " + verduras[1].getCalorias() + ", " + verduras[1].getDebeCocinarse());

        // Mostramos la lista actualizada y COMPLETA de las verduras

        System.out.println("\nLista de verduras 2:");
        System.out.println("------------------");

        for (Ejercicio_Verdura verdura : verduras) {

            System.out.println("La verdura es " + verdura.getNombre() + ", es de color " + verdura.getColor() + ", tiene " + verdura.getCalorias() + " calorías y se debe cocinar: " + verdura.getDebeCocinarse() + ".");
        }

        // Para mostrar las verduras que sean de color verde

        System.out.println("\nLista de verduras de color verde:");
        System.out.println("------------------");

        for (Ejercicio_Verdura verdura : verduras) {
            if ("verde".equalsIgnoreCase(verdura.getColor())) { // Con esto comparamos, ignorando mayusculas y minusculas
                System.out.println("La verdura es " + verdura.getNombre() + ", es de color " + verdura.getColor() + ", tiene " + verdura.getCalorias() + " calorías y se debe cocinar: " + verdura.getDebeCocinarse() + ".");
            }
        }

    }
}
