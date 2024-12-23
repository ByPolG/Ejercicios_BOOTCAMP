package Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio3;

public class Ejercicio3_Vector {

    private String[] datos; // Vector de tamaño fijo

    // Se inicializa el vector con un tamaño específico

    public Ejercicio3_Vector(Integer tamanio) {

        datos = new String[tamanio];
    }

    // Metodo para almacenar datos en el vector

    public void almacenarDatos(int indice, String dato) {

        try {

            datos[indice] = dato;
            System.out.println("Dato almacenado en el índice " + indice + ": " + dato);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.err.println("Error: El índice " + indice + " está fuera del rango del vector.");
        }
    }

    // Metodo para acceder a los datos del vector

    public String accederDatos(int indice) {
        try {

            return datos[indice];

        } catch (ArrayIndexOutOfBoundsException e) {

           System.err.println("Error: El índice " + indice + " está fuera del rango del vector.");

           return null;  // Devuelve null en caso de error
        }
    }

    // Metodo para mostrar todos los datos almacenados en el vector

    public void mostrarDatos() {

        System.out.println("Contenido del vector:");

        for (int i = 0; i < datos.length; i++) {

            System.out.println("Índice " + i + ": " + datos[i]);
        }
    }
}
