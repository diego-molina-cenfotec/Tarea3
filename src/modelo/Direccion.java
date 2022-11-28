package modelo;

public class Direccion {
    private String provincia;
    private String canton;
    private String distrito;
    private String otraSenia;

    public Direccion() {
    }

    public Direccion(String provincia, String canton, String distrito, String otraSenia) {
        this.provincia = provincia;
        this.canton = canton;
        this.distrito = distrito;
        this.otraSenia = otraSenia;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getCanton() {
        return canton;
    }

    public void setCanton(String canton) {
        this.canton = canton;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getOtraSenia() {
        return otraSenia;
    }

    public void setOtraSenia(String otraSenia) {
        this.otraSenia = otraSenia;
    }

    @Override
    public String toString() {
        return "Direccion{" +
                "provincia='" + provincia + '\'' +
                ", canton='" + canton + '\'' +
                ", distrito='" + distrito + '\'' +
                ", otraSenia='" + otraSenia + '\'' +
                '}';
    }
}
