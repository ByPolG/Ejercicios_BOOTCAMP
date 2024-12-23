package Java_Basico.Semana2.Ejercicios_05_Dia6.Ej1;

public class Ejercicio1_Ave extends Ejercicio1_Animal{

    private Double envergaduraAlas;
    private String tipoVuelo;
    private String colorPlumaje;
    private String tipoPico;

    public Ejercicio1_Ave(Integer id, String nombre, Integer edad, String tipoPiel, String tipoAlimentacion, Double envergaduraAlas, String tipoVuelo, String colorPlumaje, String tipoPico) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.envergaduraAlas = envergaduraAlas;
        this.tipoVuelo = tipoVuelo;
        this.colorPlumaje = colorPlumaje;
        this.tipoPico = tipoPico;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un ave.");
    }
}
