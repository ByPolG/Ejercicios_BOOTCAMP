package Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio2;

import Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio2.entities.Inventario;

public class Ejercicio2_Main {

    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        inventario.agregarProductoAlInventario("Camiseta", 15.50, 100);
        inventario.agregarProductoAlInventario("Pantalón", -20.0, 50); // El precio es negativo
        inventario.agregarProductoAlInventario("Zapatos", 50.0, 0);  // La cantidad es incorrecta
        inventario.agregarProductoAlInventario("Sombrero", 12.0, 30);

        inventario.mostrarInventario();
    }
}
