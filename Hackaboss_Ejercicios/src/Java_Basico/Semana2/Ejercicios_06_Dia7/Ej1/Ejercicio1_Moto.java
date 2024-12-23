package Java_Basico.Semana2.Ejercicios_06_Dia7.Ej1;

public class Ejercicio1_Moto extends Ejercicio1_Vehiculo implements Ejercicio1_Combustion{

    private Integer cilindrada; // (cc)
    private String tipoMotor;

    public Ejercicio1_Moto(Integer id, String placa, String marca, String modelo, Integer anio, Double costo, String tipoMotor, Integer cilindrada) {
        super(id, placa, marca, modelo, anio, costo);
        this.cilindrada = cilindrada;
        this.tipoMotor = tipoMotor;
    }

    public Integer getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(Integer cilindrada) {
        this.cilindrada = cilindrada;
    }

    public String getTipoMotor() {
        return tipoMotor;
    }

    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    @Override
    public String toString() {
        return "Moto {" +
                "cilindrada=" + cilindrada +
                ", tipoMotor='" + tipoMotor + '\'' +
                '}';
    }

    @Override
    public Integer calculoAntiguedad() {
        return 2024 - getAnio();
    }


    @Override
    public void recargarCombustible() {

        System.out.println("La moto está recargando combustible para su motor " + tipoMotor + ".");
    }
}
