package Java_Basico.Semana2.Ejercicios_05_Dia6.Ej2;

public class Ejercicio2_Zapato extends Ejercicio2_Vestimenta{

    private String material;
    private String tipoCierre;

    public Ejercicio2_Zapato() {

    }

    public Ejercicio2_Zapato(String codigo, String nombre, Double precio, String marca, String talla, String color, String material, String tipoCierre) {
        super(codigo, nombre, precio, marca, talla, color);
        this.material = material;
        this.tipoCierre = tipoCierre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getTipoCierre() {
        return tipoCierre;
    }

    public void setTipoCierre(String tipoCierre) {
        this.tipoCierre = tipoCierre;
    }

    @Override
    public String toString() {
        return "Zapato{" +
                "material='" + material + '\'' +
                ", tipoCierre='" + tipoCierre + '\'' +
                '}';
    }

    @Override
    public void mostrarMensaje(){

        System.out.println("Estos zapatos son de marca: " + this.getMarca());
    }
}
