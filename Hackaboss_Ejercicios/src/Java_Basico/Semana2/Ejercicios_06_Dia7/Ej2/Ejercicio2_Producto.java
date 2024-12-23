package Java_Basico.Semana2.Ejercicios_06_Dia7.Ej2;

public class Ejercicio2_Producto {
    private String codigo;
    private String nombre;
    private String marca;
    private String tipo;
    private Double precioCosto;
    private Double precioVenta;
    private Integer cantidadStock;

    public Ejercicio2_Producto(String codigo, String nombre, String marca, String tipo, Double precioCosto, Double precioVenta, Integer cantidadStock) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.precioCosto = precioCosto;
        this.precioVenta = precioVenta;
        this.cantidadStock = cantidadStock;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public Double getPrecioCosto() {
        return precioCosto;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public Integer getCantidadStock() {
        return cantidadStock;
    }

    public void setCantidadStock(Integer cantidadStock) {

        this.cantidadStock = cantidadStock;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", tipo='" + tipo + '\'' +
                ", precioCosto=" + precioCosto +
                ", precioVenta=" + precioVenta +
                ", cantidadStock=" + cantidadStock +
                '}';
    }
}
