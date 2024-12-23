package Java_Basico.Semana2.Ejercicios_05_Dia6.Ej2;

public abstract class Ejercicio2_Vestimenta {

    private String codigo;
    private String nombre;
    private Double precio;
    private String marca;
    private String talla;
    private String color;

    public Ejercicio2_Vestimenta() {

    }

    public Ejercicio2_Vestimenta(String codigo, String nombre, Double precio, String marca, String talla, String color) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.marca = marca;
        this.talla = talla;
        this.color = color;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Vestimenta{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", marca='" + marca + '\'' +
                ", talla='" + talla + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void mostrarMensaje();
}
