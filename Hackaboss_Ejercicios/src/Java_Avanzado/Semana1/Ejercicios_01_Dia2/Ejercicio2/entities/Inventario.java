package Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio2.entities;

import Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio2.excepciones.ProductoInvalidoException;

import java.util.ArrayList;
import java.util.List;

public class Inventario {

    private List<Producto> productos;

    public Inventario() {

        this.productos = new ArrayList<>();
    }

    // Para agregar un producto al inventario

    public void agregarProductoAlInventario(String nombre, double precio, int cantidad) {

        try {

            if (nombre == null || nombre.isEmpty()) {

                throw new ProductoInvalidoException("El nombre del producto no puede estar vacío.");
            }

            if (precio <= 0) {

                throw new ProductoInvalidoException("El precio del producto debe ser mayor a 0.");
            }

            if (cantidad <= 0) {

                throw new ProductoInvalidoException("La cantidad del producto debe ser mayor a 0.");
            }

            // Creamos el nuevo producto y lo agregamos al inventario

            Producto producto = new Producto(nombre, precio, cantidad);

            productos.add(producto);

            System.out.println("Producto agregado al inventario: " + nombre);

        } catch (ProductoInvalidoException e) {

            System.err.println("Error al agregar producto al inventario: " + e.getMessage());

        } finally {

            System.out.println("Operación de agregar producto al inventario finalizada.");
        }
    }

    // Para mostrar todos los prodcutos del inventario

    public void mostrarInventario() {

        System.out.println("Inventario de productos:");

        for (Producto producto : productos) {

            System.out.println("Nombre: " + producto.getNombre() + ", Precio: " + producto.getPrecio() + ", Cantidad: " + producto.getCantidadDisponible());
        }
    }
}