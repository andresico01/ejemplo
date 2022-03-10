package builder.vehiculoabstrapto;

public class VehiculoBuilder extends AbstractVehiculo{

    private final Vehiculo vehiculo;

    public static VehiculoBuilder vehiculo(){
        return new VehiculoBuilder();
    }

    private VehiculoBuilder() {
        this.vehiculo = new Vehiculo();
    }


    public VehiculoBuilder nSillas(Integer numSi){
        this.vehiculo.setSillas(numSi);
        return this;
    }

    public VehiculoBuilder nPara(Integer numPara){
        this.vehiculo.setParabrisas(numPara);
        return this;
    }

    @Override
    AbstractVehiculo vehiculoDeCarga() {
        this.vehiculo.setCarroseria("Robusta");
        this.vehiculo.setChasis("Rigido");
        this.vehiculo.setLuces("Luces exploradoras");
        this.vehiculo.setMotor("10.0");
        this.vehiculo.setParabrisas(4);
        this.vehiculo.setRuedas(16);
        this.vehiculo.setSillas(2);
        return this;
    }

    @Override
    AbstractVehiculo vehiculoDeCarrera() {
        this.vehiculo.setCarroseria("Ligera");
        this.vehiculo.setChasis("Aereodinamica");
        this.vehiculo.setLuces("Sin luces");
        this.vehiculo.setMotor("4.0");
        this.vehiculo.setParabrisas(1);
        this.vehiculo.setRuedas(4);
        this.vehiculo.setSillas(1);
        return this;
    }

    @Override
    AbstractVehiculo VehiculoDeportivo() {
        this.vehiculo.setCarroseria("Ligera");
        this.vehiculo.setChasis("Aereodinamica");
        this.vehiculo.setLuces("Luces bajss");
        this.vehiculo.setMotor("3.0");
        this.vehiculo.setParabrisas(2);
        this.vehiculo.setRuedas(4);
        this.vehiculo.setSillas(2);
        return this;
    }

    @Override
    public Vehiculo buildCar() {
        return this.vehiculo;
    }


}
