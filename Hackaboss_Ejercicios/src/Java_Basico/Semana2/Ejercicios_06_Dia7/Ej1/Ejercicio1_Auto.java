package Java_Basico.Semana2.Ejercicios_06_Dia7.Ej1;

public class Ejercicio1_Auto extends Ejercicio1_Vehiculo implements Ejercicio1_Electrico{

    private int capacidadBateria; // (mAh)
    private int autonomia; // (horas)

    public Ejercicio1_Auto(Integer id, String placa, String marca, String modelo, Integer anio, Double costo, int capacidadBateria, int autonomia) {
        super(id, placa, marca, modelo, anio, costo);
        this.capacidadBateria = capacidadBateria;
        this.autonomia = autonomia;
    }

    public int getCapacidadBateria() {
        return capacidadBateria;
    }

    public void setCapacidadBateria(int capacidadBateria) {
        this.capacidadBateria = capacidadBateria;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    @Override
    public String toString() {
        return "Auto {" +
                "capacidadBateria=" + capacidadBateria +
                ", autonomia=" + autonomia +
                '}';
    }

    @Override
    public void cargarEnergia() {

        System.out.println("El coche está cargando su batería de " + capacidadBateria + " mAh.");
    }

    @Override
    public Integer calculoAntiguedad() {
        return 2024 - getAnio();
    }
}
