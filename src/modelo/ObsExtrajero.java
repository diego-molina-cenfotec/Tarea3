package modelo;

import java.util.ArrayList;

public class ObsExtrajero extends Observador {
    private String paisResidencia;

    public ObsExtrajero() {
    }

    public ObsExtrajero(String email, String contrasenia, String nombre, ObjParaObservacion accesorio, String paisResidencia) {
        super(email, contrasenia, nombre, accesorio);
        this.paisResidencia = paisResidencia;
    }

    public String getPaisResidencia() {
        return paisResidencia;
    }

    public void setPaisResidencia(String paisResidencia) {
        this.paisResidencia = paisResidencia;
    }

    @Override
    public String toString() {
        return "Observador Extranjero" +'\'' +super.toString() +paisResidencia + '\'' +
                '}';
    }
}
