package Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio3;

public class Ejercicio3_Main {

    public static void main(String[] args) {

        Ejercicio3_Vector vector = new Ejercicio3_Vector(5); // Vector de tamaño 5

        // Almacenamos algunos datos en el vector

        vector.almacenarDatos(0, "Producto 1");
        vector.almacenarDatos(2, "Producto 2");
        vector.almacenarDatos(4, "Producto 3");

        // Intentamos almacenar un dato en una posición fuera de rango

        vector.almacenarDatos(5, "Producto 4");  // El índice está fuera de rango

        // Accedemos a los datos almacenados

        System.out.println("Dato en el índice 2: " + vector.accederDatos(2));  // Aquí el índice es válido
        System.out.println("Dato en el índice 5: " + vector.accederDatos(5));  // Aquí no, esta fuera de rango
        System.out.println("Dato en el índice 6: " + vector.accederDatos(6));  // Aquí no, esta fuera de rango

        // Mostramos todos los datos almacenados en el vector

        vector.mostrarDatos();
    }
}
