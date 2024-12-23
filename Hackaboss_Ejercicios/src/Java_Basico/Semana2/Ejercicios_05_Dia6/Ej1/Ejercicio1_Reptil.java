package Java_Basico.Semana2.Ejercicios_05_Dia6.Ej1;

public class Ejercicio1_Reptil extends Ejercicio1_Animal {

    private Double longitud;
    private String tipoEscamas;
    private String tipoVeneno;
    private String habitat;

    public Ejercicio1_Reptil(Integer id, String nombre, Integer edad, String tipoPiel, String tipoAlimentacion, Double longitud, String tipoEscamas, String tipoVeneno, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.longitud = longitud;
        this.tipoEscamas = tipoEscamas;
        this.tipoVeneno = tipoVeneno;
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un reptil.");
    }
}
