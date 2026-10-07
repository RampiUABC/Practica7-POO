package org.uabc.ic;

public class DispositivoElectronico {

    //atributos private
    private String modelo;
    private String fabricante;
    private double consumoEnergia;
    private boolean encendido;

    public DispositivoElectronico(String modelo, String fabricante, double consumoEnergia) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.consumoEnergia = consumoEnergia;
        this.encendido = false;
    }

    public void encender(){
        encendido = true;
        System.out.println("El dispopsitivo " + modelo + "se ha encontrado.");
    }

    public void apagar() {
        encendido = false;
        System.out.println("El dispositivo " + modelo + " se ha apagado.");
    }

    public String obtenerEstado(){
        String estado;
        if(encendido){
            estado = "encendido";
        } else {
            estado = "apagado";
        }
        return "Modelo:" + modelo + "/ Fabricante: " + fabricante + "/ Consumo: " + consumoEnergia + "W / Estado: " + estado;
    }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public double getConsumoEnergia() { return consumoEnergia; }
    public void setConsumoEnergia(double consumoEnergia) { this.consumoEnergia = consumoEnergia; }

    public boolean isEncendido() { return encendido; }
    public void setEncendido(boolean encendido) { this.encendido = encendido; }
}
