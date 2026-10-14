package org.uabc.ic;

public class SensorPresion extends Sensor {

    private double valorActual;

    public SensorPresion(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "hPa");
    }

    @Override
    public double leerValor() {
        System.out.println("Leyendo presión atmosférica...");

        valorActual = 900.0 + Math.random() * 200.0;

        return valorActual;
    }

    public double getValorActual() {
        return valorActual;
    }
}
