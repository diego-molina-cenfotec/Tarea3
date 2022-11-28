package modelo;

import java.util.ArrayList;

public class ObsLocal extends Observador {
    private String Ocupacion;
    private Direccion direccion;

    public ObsLocal() {
    }

    public ObsLocal(String email, String contrasenia, String nombre, ObjParaObservacion accesorio,
                    String ocupacion, Direccion direccion) {
        super(email, contrasenia, nombre, accesorio);
        Ocupacion = ocupacion;
        this.direccion = direccion;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        Ocupacion = ocupacion;
    }

    @Override
    public String toString() {
        return "Observador Local{"+'\'' +super.toString()+
                "Ocupacion='" + Ocupacion + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
