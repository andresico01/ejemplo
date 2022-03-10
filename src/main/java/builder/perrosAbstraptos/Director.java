package builder.perrosAbstraptos;

import builder.vehiculoabstrapto.Vehiculo;

import static builder.perrosAbstraptos.PerroBuilder.perro;

public class Director {

    public static void main(String[] args) {
       showPerroGrande();
       showPerroNormal();
       showPerroPequeno();
    }


    private static void showPerroGrande(){
        Perro perroGrande = perro().PerroGrande().buildCar();
        showPerro("Hola bb", perroGrande);

    }

    private static void showPerroNormal(){
        Perro perroNormal = perro().PerroNormal().buildCar();
        showPerro("Hola bb", perroNormal);

    }

    private static void showPerroPequeno(){
        Perro perroPequeno = perro().PerroPequeno().buildCar();
        showPerro("Hola bb", perroPequeno);

    }

    private static void showPerro(String message, Perro perro) {
        System.out.println("\n" + message + "\n" + perro.toString());
    }
}
