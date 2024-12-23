package Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio2.entities;

import Java_Avanzado.Semana1.Ejercicios_01_Dia2.Ejercicio2.excepciones.ProductoInvalidoException;

public class Producto {

    private String nombre;
    private Double precio;
    private Integer cantidadDisponible;

    public Producto() {

    }

    public Producto(String nombre, Double precio, Integer cantidadDisponible) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidadDisponible = cantidadDisponible;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getCantidadDisponible() {
        return cantidadDisponible;
    }

    public void setCantidadDisponible(Integer cantidadDisponible) {
        this.cantidadDisponible = cantidadDisponible;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", cantidadDisponible=" + cantidadDisponible +
                '}';
    }

    // Metodo para agregar un producto al inventario

    public void agregarProducto(Integer cantidad) throws ProductoInvalidoException {

        try {

            if (cantidad <= 0) {

                throw new ProductoInvalidoException("La cantidad del producto debe ser mayor a 0.");
            }

            this.cantidadDisponible += cantidad;

            System.out.println("Se han agregado " + cantidad + " unidades del producto " + this.nombre);

        } catch (ProductoInvalidoException e) {

            System.err.println("Error al agregar el producto: " + e.getMessage());

        } finally {

            System.out.println("Operación finalizada.");
        }
    }

    // Metodo para establecer el precio de un producto

    public void establecerPrecio(double precio) throws ProductoInvalidoException {

        try {

            if (precio < 0) {

                throw new ProductoInvalidoException("El precio no puede ser negativo.");
            }

            this.precio = precio;

            System.out.println("El precio del producto " + this.nombre + " ha sido actualizado a " + precio + "€.");

        } catch (ProductoInvalidoException e) {

            System.err.println("Error al actualizar el precio del producto: " + e.getMessage());

        } finally {

            System.out.println("Operación finalizada.");
        }
    }
}
