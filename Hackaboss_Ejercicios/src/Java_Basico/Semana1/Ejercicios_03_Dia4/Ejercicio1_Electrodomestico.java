package Java_Basico.Semana1.Ejercicios_03_Dia4;

public class Ejercicio1_Electrodomestico {

    int cod;
    String marca;
    String modelo;
    double consumo;
    String color;

    public Ejercicio1_Electrodomestico() {

    }

    public Ejercicio1_Electrodomestico(int cod, String marca, String modelo, double consumo, String color) {
        this.cod = cod;
        this.marca = marca;
        this.modelo = modelo;
        this.consumo = consumo;
        this.color = color;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ejercicio1_Electrodomestico{" +
                "cod=" + cod +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", consumo=" + consumo +
                ", color='" + color + '\'' +
                '}';
    }
}
