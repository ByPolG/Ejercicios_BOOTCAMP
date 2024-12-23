package Java_Basico.Semana2.Ejercicios_05_Dia6.Ej2;

public class Ejercicio2_Main {

    public static void main(String[] args) {

        Ejercicio2_Vestimenta[] lasVestimentas = new Ejercicio2_Vestimenta[9];

        lasVestimentas[0] = new Ejercicio2_Zapato("001", "Deportivos", 69.99, "Adidas", "42", "Blancos", "Sintéticos", "Cordones");
        lasVestimentas[1] = new Ejercicio2_Zapato("002", "Casuales", 49.99, "Vans", "43", "Marrones", "Cuero", "Calzado Simple");
        lasVestimentas[2] = new Ejercicio2_Zapato("003", "Botas Invierno", 59.99, "Genéricas", "40", "Azules", "Sintéticas", "Calzado Simple");

        lasVestimentas[3] = new Ejercicio2_Pantalon("004", "Leevis", 39.99, "Leevis", "42", "Vaqueros Azules", "Recto", "Tela");
        lasVestimentas[4] = new Ejercicio2_Pantalon("005", "Genéricos", 39.99, "Pull and Bear", "42", "Vaqueros Verdes", "Recto", "Tela");
        lasVestimentas[5] = new Ejercicio2_Pantalon("006", "Zara", 49.99, "Zara", "42", "Vaqueros Blancos", "Recto", "Tela");

        lasVestimentas[6] = new Ejercicio2_Camiseta("007", "Camiseta Clásica", 19.99, "Nike", "42", "Blanco", "Corta", "Redondo");
        lasVestimentas[7] = new Ejercicio2_Camiseta("008", "Camisa Polo", 29.99, "Lacoste", "40", "Azul", "Larga", "Polo");

        lasVestimentas[8] = new Ejercicio2_Sombrero("009", "Gorra de Béisbol", 24.99, "New Era", "58", "Gris", "Deportivo", "56");

        // Recorremos el array y ejecutamos el metodo mostrarMensaje() para cada objeto

        for (Ejercicio2_Vestimenta vestimenta : lasVestimentas) {

            vestimenta.mostrarMensaje();
        }
    }

}
