package org.uabc.ic;

public abstract class Sensor extends DispositivoElectronico {
    private String unidadMedida;
    private boolean estaCalibrado;

    public Sensor(String modelo, String fabricante, double consumoEnergia, String unidadMedida) {
        super(modelo, fabricante, consumoEnergia);
        this.unidadMedida = unidadMedida;
        this.estaCalibrado = false;
    }

    public void calibrar() {
        System.out.println("Calibrando el sensor " + getModelo() + "...");
        estaCalibrado = true;
        System.out.println("Sensor " + getModelo() + " calibrado correctamente.");
    }

    // metodo abstracto
    public abstract double leerValor();

    public String getUnidadMedida() {
        return unidadMedida;
    }
    public void setUnidadMedida(String unidadMedida) {
        this.unidadMedida = unidadMedida;
    }

    public boolean isEstaCalibrado() {
        return estaCalibrado;
    }
    public void setEstaCalibrado(boolean estaCalibrado) {
        this.estaCalibrado = estaCalibrado;
    }
}
