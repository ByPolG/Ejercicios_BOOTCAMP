package Java_Basico.Semana2.Ejercicios_06_Dia7.Ej1;

public class Ejercicio1_Camioneta extends Ejercicio1_Vehiculo implements Ejercicio1_Combustion{

    private Double capacidadTanque; // (litros)
    private Double consumoCombustible; // (km/l)

    public Ejercicio1_Camioneta(Integer id, String placa, String marca, String modelo, Integer anio, Double costo, Double capacidadTanque, Double consumoCombustible) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadTanque = capacidadTanque;
        this.consumoCombustible = consumoCombustible;
    }

    public Double getCapacidadTanque() {
        return capacidadTanque;
    }

    public void setCapacidadTanque(Double capacidadTanque) {
        this.capacidadTanque = capacidadTanque;
    }

    public Double getConsumoCombustible() {
        return consumoCombustible;
    }

    public void setConsumoCombustible(Double consumoCombustible) {
        this.consumoCombustible = consumoCombustible;
    }

    @Override
    public String toString() {
        return "Camioneta {" +
                "capacidadTanque=" + capacidadTanque +
                ", consumoCombustible=" + consumoCombustible +
                '}';
    }

    @Override
    public Integer calculoAntiguedad() {
        return 2024 - getAnio();
    }

    @Override
    public void recargarCombustible() {

        System.out.println("La camioneta está recargando su tanque de " + capacidadTanque + " litros.");
    }
}
