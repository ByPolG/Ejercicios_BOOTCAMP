package Java_Basico.Semana1.Ejercicios_03_Dia4;

public class Ejercicio2_Main {

    public static void main(String[] args) {

        Ejercicio2_Persona[] personas = new Ejercicio2_Persona[5]; // Vector con cinco posiciones

        personas[0] = new Ejercicio2_Persona(1, "Ana", 25, "Calle A", "123456789");
        personas[1] = new Ejercicio2_Persona(2, "Luis", 35, "Calle B", "987654321");
        personas[2] = new Ejercicio2_Persona(3, "Carlos", 40, "Calle C", "112233445");
        personas[3] = new Ejercicio2_Persona(4, "Pedro", 28, "Calle D", "998877665");
        personas[4] = new Ejercicio2_Persona(5, "Luisa", 32, "Calle E", "554433221");

        // Recorremos el vector y mostramos el nombre y edad de cada persona

        System.out.println("\nLista de personas:");
        System.out.println("------------------");

        for (Ejercicio2_Persona persona : personas) {

            System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
        }

        // Para cambiar el nombre de dos personas

        System.out.println("\nCambio de nombres:");
        System.out.println("------------------");
        System.out.println("\nAntes:");
        System.out.println("Persona 1: " + personas[1].getNombre());
        System.out.println("Persona 3: " + personas[3].getNombre());

        // Efectuamos el cambio

        personas[1].setNombre("Luis Miguel");
        personas[3].setNombre("Marta Isabel");

        System.out.println("\nAhora:");
        System.out.println("Persona 1: " + personas[1].getNombre());
        System.out.println("Persona 3: " + personas[3].getNombre());

        // Para mostrar todas las personas mayores de 30

        System.out.println("\nPersonas mayores de 30 años:");
        System.out.println("----------------------------");

        for (Ejercicio2_Persona persona : personas) { // Muestra una por una las personas de la lista

            if (persona.getEdad() > 30) {

                System.out.println("Nombre: " + persona.getNombre() + ", Edad: " + persona.getEdad());
            }
        }
    }
}
