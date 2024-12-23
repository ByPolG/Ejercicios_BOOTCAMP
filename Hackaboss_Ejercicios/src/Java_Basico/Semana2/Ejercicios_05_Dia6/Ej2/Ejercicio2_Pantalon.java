package Java_Basico.Semana2.Ejercicios_05_Dia6.Ej2;

public class Ejercicio2_Pantalon extends Ejercicio2_Vestimenta{

    private String estilo;
    private String tejido;

    public Ejercicio2_Pantalon() {

    }

    public Ejercicio2_Pantalon(String codigo, String nombre, Double precio, String marca, String talla, String color, String estilo, String tejido) {
        super(codigo, nombre, precio, marca, talla, color);
        this.estilo = estilo;
        this.tejido = tejido;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public String getTejido() {
        return tejido;
    }

    public void setTejido(String tejido) {
        this.tejido = tejido;
    }

    @Override
    public String toString() {
        return "Pantalon{" +
                "estilo='" + estilo + '\'' +
                ", tejido='" + tejido + '\'' +
                '}';
    }

    @Override
    public void mostrarMensaje(){

        System.out.println("Estos pantalones son de marca: " + this.getEstilo());
    }

}
