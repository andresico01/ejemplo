package builder.vehiculoabstrapto;

public class Vehiculo {
    private String chasis;
    private String motor;
    private Integer ruedas;
    private Integer parabrisas;
    private String carroseria;
    private String luces;
    private Integer Sillas;

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getChasis() {
        return chasis;
    }

    public String getMotor() {
        return motor;
    }

    public Integer getRuedas() {
        return ruedas;
    }

    public Integer getParabrisas() {
        return parabrisas;
    }

    public String getCarroseria() {
        return carroseria;
    }

    public String getLuces() {
        return luces;
    }

    public Integer getSillas() {
        return Sillas;
    }

    public void setMotor(String motor) {
        this.motor = motor;
    }

    public void setRuedas(Integer ruedas) {
        this.ruedas = ruedas;
    }

    public void setParabrisas(Integer parabrisas) {
        this.parabrisas = parabrisas;
    }

    public void setCarroseria(String carroseria) {
        this.carroseria = carroseria;
    }

    public void setLuces(String luces) {
        this.luces = luces;
    }

    public void setSillas(Integer sillas) {
        Sillas = sillas;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "chasis='" + chasis + '\t' +
                ", motor='" + motor + '\t' +
                ", ruedas=" + ruedas +
                ", parabrisas='" + parabrisas + '\t' +
                ", carroseria='" + carroseria + '\t' +
                ", luces='" + luces + '\t' +
                ", Sillas='" + Sillas + '\t' +
                '}';
    }
}
