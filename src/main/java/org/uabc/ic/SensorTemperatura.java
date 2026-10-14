package org.uabc.ic;

public class SensorTemperatura extends Sensor {

    private double valorActual;

    public SensorTemperatura(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "°C");
    }

    @Override
    public double leerValor() {
        System.out.println("Leyendo temperatura...");
        valorActual = 20.0 + Math.random() * 15.0;
        return valorActual;
    }

    public double getValorActual() {
        return valorActual;
    }
}

