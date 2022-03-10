package builder.perrosAbstraptos;



public class Perro {
    private String Pan;
    private String Salchicha;
    private Integer SalsaDePina;
    private String Queso;
    private Integer Chongo;
    private Integer Cebolla;

    public String getPan() {
        return Pan;
    }

    public void setPan(String pan) {
        Pan = pan;
    }

    public String getSalchicha() {
        return Salchicha;
    }

    public void setSalchicha(String salchicha) {
        Salchicha = salchicha;
    }

    public Integer getSalsaDePina() {
        return SalsaDePina;
    }

    public void setSalsaDePina(Integer salsaDePina) {
        SalsaDePina = salsaDePina;
    }

    public String getQueso() {
        return Queso;
    }

    public void setQueso(String queso) {
        Queso = queso;
    }

    public Integer getChongo() {
        return Chongo;
    }

    public void setChongo(Integer chongo) {
        Chongo = chongo;
    }

    public Integer getCebolla() {
        return Cebolla;
    }

    public void setCebolla(Integer cebolla) {
        Cebolla = cebolla;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "Pan='" + Pan + '\t' +
                ", Salchicha='" + Salchicha + '\t' +
                ", SalsaDePiña=" + SalsaDePina +
                ", Queso='" + Queso + '\t' +
                ", Chongo=" + Chongo +
                ", Cebolla=" + Cebolla +
                '}';
    }
}
