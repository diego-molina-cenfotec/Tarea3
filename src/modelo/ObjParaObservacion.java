package modelo;

public class ObjParaObservacion {
    private String tipo;

    public ObjParaObservacion() {
    }

    public ObjParaObservacion(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return tipo + '\'' +
                '}';
    }

}
