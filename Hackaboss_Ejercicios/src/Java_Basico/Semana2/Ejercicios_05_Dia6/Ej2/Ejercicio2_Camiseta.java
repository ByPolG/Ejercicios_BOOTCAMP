package Java_Basico.Semana2.Ejercicios_05_Dia6.Ej2;

public class Ejercicio2_Camiseta extends Ejercicio2_Vestimenta{

    private String manga;
    private String cuello;

    public Ejercicio2_Camiseta() {

    }

    public Ejercicio2_Camiseta(String codigo, String nombre, Double precio, String marca, String talla, String color, String manga, String cuello) {
        super(codigo, nombre, precio, marca, talla, color);
        this.manga = manga;
        this.cuello = cuello;
    }

    public String getManga() {
        return manga;
    }

    public void setManga(String manga) {
        this.manga = manga;
    }

    public String getCuello() {
        return cuello;
    }

    public void setCuello(String cuello) {
        this.cuello = cuello;
    }

    @Override
    public String toString() {
        return "Camiseta{" +
                "manga='" + manga + '\'' +
                ", cuello='" + cuello + '\'' +
                '}';
    }

    @Override
    public void mostrarMensaje(){

        System.out.println("Esta camiseta es de marca: " + this.getManga());
    }
}
