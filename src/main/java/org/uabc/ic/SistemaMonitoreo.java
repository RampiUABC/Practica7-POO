package org.uabc.ic;

import java.util.ArrayList;

public class SistemaMonitoreo {

    public static void main(String[] args) {

        ArrayList<Sensor> listaSensores = new ArrayList<>();

        listaSensores.add(new SensorTemperatura("DTH11", "Aosong", 0.5));
        listaSensores.add(new SensorTemperatura("LM35", "Texas Instruments", 0.3));
        listaSensores.add(new SensorPresion("BMP280", "Bosch", 0.7));
        listaSensores.add(new SensorPresion("MPX4115", "NXP", 0.9));
        listaSensores.add(new SensorAceleracion("MPU6050", "InvenSense", 1.2));
        listaSensores.add(new SensorAceleracion("ADXL345", "Analog Devices", 0.8));

        for (Sensor s : listaSensores) {
            System.out.println("==============================================");

            s.encender();    // viene de DispositivoElectronico
            s.calibrar();    // viene de Sensor

            double lectura = s.leerValor();

            // Se despliega el resultado con su unidad
            System.out.println("Resultado: " + String.format("%.2f", lectura)
                    + " " + s.getUnidadMedida());

            System.out.println(s.obtenerEstado());
        }
    }
}
