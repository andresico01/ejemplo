package builder.perrosAbstraptos;

import builder.BuildCar;

abstract class AbstractPerro implements BuildCar<Perro> {

    abstract AbstractPerro PerroGrande();
    abstract AbstractPerro PerroNormal();
    abstract AbstractPerro PerroPequeno();

}
