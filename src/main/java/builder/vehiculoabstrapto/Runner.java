package builder.vehiculoabstrapto;

import static builder.vehiculoabstrapto.VehiculoBuilder.vehiculo;

public class Runner {
    public static void main(String[] args) {
        showVehiculoCarga();
        showVehiculoCarrera();
        showVehiculoDeportivo();
        showVehiculoNelson();
    }

    private static void showVehiculoNelson(){
        Vehiculo VehiculoNelson = vehiculo().nSillas(5).nPara(1).buildCar();
        showCar("Hola bb", VehiculoNelson);
    }

    private static void showVehiculoCarga(){
        Vehiculo VehiculoCarga = vehiculo().vehiculoDeCarga().buildCar();
        showCar("Hola bb", VehiculoCarga);

    }

    private static void showVehiculoDeportivo(){
        Vehiculo VehiculoCarga = vehiculo().VehiculoDeportivo().buildCar();
        showCar("Hola bb", VehiculoCarga);

    }

    private static void showVehiculoCarrera(){
        Vehiculo VehiculoCarga = vehiculo().vehiculoDeCarrera().buildCar();
        showCar("Hola bb", VehiculoCarga);

    }

    private static void showCar(String message, Vehiculo car) {
        System.out.println("\n" + message + "\n" + car.toString());
    }
}
