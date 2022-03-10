package builder.perrosAbstraptos;

public class PerroBuilder extends  AbstractPerro{

    private final Perro perro;

    public static PerroBuilder perro(){
        return new PerroBuilder();
    }

    private PerroBuilder(){
        this.perro = new Perro();
    }


    @Override
    public Perro buildCar() {
        return this.perro;
    }

    @Override
    AbstractPerro PerroGrande() {
        this.perro.setCebolla(2);
        this.perro.setChongo(2);
        this.perro.setPan("Pan Grande");
        this.perro.setQueso("Queso Costeño");
        this.perro.setSalchicha("Salchicha Suiza");
        this.perro.setSalsaDePina(2);
        return this;
    }

    @Override
    AbstractPerro PerroNormal() {
        this.perro.setCebolla(1);
        this.perro.setChongo(1);
        this.perro.setPan("Pan Mediano");
        this.perro.setQueso("Queso Normal");
        this.perro.setSalchicha("Salchicha Ranchera");
        this.perro.setSalsaDePina(1);
        return this;
    }

    @Override
    AbstractPerro PerroPequeno() {
        this.perro.setCebolla(0);
        this.perro.setChongo(0);
        this.perro.setPan("Pan Pequeño");
        this.perro.setQueso("Queso Duro");
        this.perro.setSalchicha("Salchicha normal");
        this.perro.setSalsaDePina(0);
        return this;
    }
}
