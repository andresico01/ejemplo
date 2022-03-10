package builder.vehiculoabstrapto;

import builder.BuildCar;

abstract class AbstractVehiculo implements BuildCar<Vehiculo> {

    abstract AbstractVehiculo vehiculoDeCarga();
    abstract AbstractVehiculo vehiculoDeCarrera();
    abstract AbstractVehiculo VehiculoDeportivo();




}
