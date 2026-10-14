package org.uabc.ic;

public class SensorAceleracion extends Sensor {

    // Tres atributos adicionales
    private double valorEjeX;
    private double valorEjeY;
    private double valorEjeZ;

    public SensorAceleracion(String modelo, String fabricante, double consumoEnergia) {
        super(modelo, fabricante, consumoEnergia, "m/s^2");
    }

    @Override
    public double leerValor() {
        valorEjeX = -10.0 + Math.random() * 20.0;
        valorEjeY = -10.0 + Math.random() * 20.0;
        valorEjeZ = -10.0 + Math.random() * 20.0;

        // String.format("%.2f", n) muestra solo 2 decimales
        System.out.println("Leyendo aceleración -> X: " + String.format("%.2f", valorEjeX)
                + " | Y: " + String.format("%.2f", valorEjeY)
                + " | Z: " + String.format("%.2f", valorEjeZ)
        );

        return Math.sqrt(valorEjeX * valorEjeX
                + valorEjeY * valorEjeY
                + valorEjeZ * valorEjeZ);
    }

    public double getValorEjeX() {
        return valorEjeX;
    }
    public double getValorEjeY() {
        return valorEjeY;
    }
    public double getValorEjeZ() {
        return valorEjeZ;
    }
}
