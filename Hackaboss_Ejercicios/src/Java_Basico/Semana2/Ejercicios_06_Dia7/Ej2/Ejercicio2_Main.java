package Java_Basico.Semana2.Ejercicios_06_Dia7.Ej2;

import java.util.ArrayList;

public class Ejercicio2_Main {

    public static void main(String[] args) {

        Ejercicio2_Producto producto1 = new Ejercicio2_Producto("001", "Teléfono", "Samsung", "Electrónico", 500.0, 700.0, 30);
        Ejercicio2_Producto producto2 = new Ejercicio2_Producto("002", "Laptop", "Dell", "Electrónico", 800.0, 1000.0, 20);
        Ejercicio2_Producto producto3 = new Ejercicio2_Producto("003", "Auriculares", "Sony", "Accesorio", 50.0, 80.0, 50);
        Ejercicio2_Producto producto4 = new Ejercicio2_Producto("004", "Cargador", "Anker", "Accesorio", 20.0, 35.0, 100);
        Ejercicio2_Producto producto5 = new Ejercicio2_Producto("005", "Tablet", "Apple", "Electrónico", 600.0, 800.0, 15);
        Ejercicio2_Producto producto6 = new Ejercicio2_Producto("006", "Monitor", "LG", "Electrónico", 300.0, 400.0, 25);
        Ejercicio2_Producto producto7 = new Ejercicio2_Producto("007", "Teclado", "Logitech", "Accesorio", 30.0, 50.0, 60);
        Ejercicio2_Producto producto8 = new Ejercicio2_Producto("008", "Ratón", "HP", "Accesorio", 20.0, 30.0, 70);
        Ejercicio2_Producto producto9 = new Ejercicio2_Producto("009", "Smartwatch", "Fitbit", "Electrónico", 120.0, 180.0, 40);
        Ejercicio2_Producto producto10 = new Ejercicio2_Producto("010", "Altavoz", "JBL", "Accesorio", 150.0, 200.0, 35);

        // Guardamos los productos creados en un ArrayList

        ArrayList<Ejercicio2_Producto> inventario = new ArrayList<>();

        inventario.add(producto1);
        inventario.add(producto2);
        inventario.add(producto3);
        inventario.add(producto4);
        inventario.add(producto5);
        inventario.add(producto6);
        inventario.add(producto7);
        inventario.add(producto8);
        inventario.add(producto9);
        inventario.add(producto10);

        // Mostramos el producto con el mayor precio de venta

        Double miPrecioVenta = Double.MIN_VALUE;

        Ejercicio2_Producto pMaxPrecioVenta = null;

        for (Ejercicio2_Producto p : inventario) {

            if (p.getPrecioVenta() > miPrecioVenta) {

                miPrecioVenta = p.getPrecioVenta();
                pMaxPrecioVenta = p;

            }
        }

        System.out.println("\nEl producto con el mayor precio de venta es --> " + pMaxPrecioVenta);

        // Mostramos el producto con el menor precio de costo

        Double miPrecioCosto = Double.MAX_VALUE;

        Ejercicio2_Producto pMinPrecioCosto = null;

        for (Ejercicio2_Producto p : inventario) {

            if (p.getPrecioCosto() < miPrecioCosto) {

                miPrecioCosto = p.getPrecioCosto();
                pMinPrecioCosto = p;

            }
        }

        System.out.println("\nEl producto con el menor precio de costo es --> " + pMinPrecioCosto);

        // Borramos el producto de la posición 5

        Ejercicio2_Producto eliminado = inventario.remove(5);

        System.out.println("\nEl producto eliminado en la posición 5 es --> " + eliminado);

        // Mostramos el producto con el mayor stock

        Integer miMaxStock = Integer.MIN_VALUE;  // Usamos el valor mínimo posible de int

        Ejercicio2_Producto pMaxStock = null;

        for (Ejercicio2_Producto p : inventario) {

            if (p.getCantidadStock() > miMaxStock) {

                miMaxStock = p.getCantidadStock();  // Actualizamos la cantidad máxima
                pMaxStock = p;  // Y guardamos el producto correspondiente

            }
        }

        System.out.println("\nEl producto con el mayor stock es --> " + pMaxStock);


        // Descontamos 3 unidades del stock del producto encontrado

        if (pMaxStock != null) {

            int nuevoStock = pMaxStock.getCantidadStock() - 3;  // Descontamos 3 unidades

            pMaxStock.setCantidadStock(nuevoStock);  // Actualizamos el stock del producto

            System.out.println("\nSe han descontado 3 unidades del producto con más stock. Nuevo stock: " + pMaxStock.getCantidadStock());
        }
    }
}
