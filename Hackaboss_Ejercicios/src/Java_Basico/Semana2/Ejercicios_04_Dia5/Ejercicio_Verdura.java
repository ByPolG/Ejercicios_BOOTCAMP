package Java_Basico.Semana2.Ejercicios_04_Dia5;

public class Ejercicio_Verdura {

    Integer id;
    String nombre;
    String color;
    Integer calorias;
    Boolean debeCocinarse;

    public Ejercicio_Verdura() {

    }

    public Ejercicio_Verdura(Integer id, String nombre, String color, Integer calorias, Boolean debeCocinarse) {
        this.id = id;
        this.nombre = nombre;
        this.color = color;
        this.calorias = calorias;
        this.debeCocinarse = debeCocinarse;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getCalorias() {
        return calorias;
    }

    public void setCalorias(Integer calorias) {
        this.calorias = calorias;
    }

    public Boolean getDebeCocinarse() {
        return debeCocinarse;
    }

    public void setDebeCocinarse(Boolean debeCocinarse) {
        this.debeCocinarse = debeCocinarse;
    }
}
