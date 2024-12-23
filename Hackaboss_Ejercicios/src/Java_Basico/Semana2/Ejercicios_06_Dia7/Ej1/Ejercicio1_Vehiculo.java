package Java_Basico.Semana2.Ejercicios_06_Dia7.Ej1;

public abstract class Ejercicio1_Vehiculo {

    private Integer id;
    private String placa;
    private String marca;
    private String modelo;
    private Integer anio;
    private Double costo;

    public Ejercicio1_Vehiculo() {

    }

    public Ejercicio1_Vehiculo(Integer id, String placa, String marca, String modelo, Integer anio, Double costo) {
        this.id = id;
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.costo = costo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Double getCosto() {
        return costo;
    }

    public void setCosto(Double costo) {
        this.costo = costo;
    }

    @Override
    public String toString() {
        return "Vehiculo {" +
                "id=" + id +
                ", placa='" + placa + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", anio=" + anio +
                ", costo=" + costo +
                '}';
    }

    // Para calcular antiguedad (abstracto)

    public abstract Integer calculoAntiguedad();
}
