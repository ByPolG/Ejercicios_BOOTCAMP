package Java_Basico.Semana2.Ejercicios_05_Dia6.Ej1;

public class Ejercicio1_Mamifero extends Ejercicio1_Animal {

    private Integer numeroPatas;
    private String tipoReproduccion;
    private String colorPelaje;
    private String habitat;

    public Ejercicio1_Mamifero(Integer id, String nombre, Integer edad, String tipoPiel, String tipoAlimentacion, Integer numeroPatas, String tipoReproduccion, String colorPelaje, String habitat) {
        super(id, nombre, edad, tipoPiel, tipoAlimentacion);
        this.numeroPatas = numeroPatas;
        this.tipoReproduccion = tipoReproduccion;
        this.colorPelaje = colorPelaje;
        this.habitat = habitat;
    }

    @Override
    public void saludar() {
        System.out.println("Hola, soy un mamífero.");
    }
}

