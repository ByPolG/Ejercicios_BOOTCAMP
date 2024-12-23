package Java_Basico.Semana2.Ejercicios_05_Dia6.Ej2;

public class Ejercicio2_Sombrero extends Ejercicio2_Vestimenta{

    private String tipo;
    private String tamanio;

    public Ejercicio2_Sombrero() {

    }

    public Ejercicio2_Sombrero(String codigo, String nombre, Double precio, String marca, String talla, String color, String tipo, String tamanio) {
        super(codigo, nombre, precio, marca, talla, color);
        this.tipo = tipo;
        this.tamanio = tamanio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Sombrero{" +
                "tipo='" + tipo + '\'' +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }

    @Override
    public void mostrarMensaje(){

        System.out.println("Este sombrero es de marca: " + this.getTipo());
    }
}
