package modelo;

import javax.imageio.stream.ImageOutputStream;

public class Ave extends Animal implements TipoAlimentacion {
    private String tipoPico;
    private String formaAlimentacion;

    public Ave() {
    }

    public Ave(boolean estaVivo, String tamanio, String tipoPico) {
        super(estaVivo, tamanio);
        this.tipoPico = tipoPico;
        formaAlimentacion = formaAlimentacion();
    }

    @Override
    public String formaAlimentacion() {
        String alimentacion = " ";
        if (tipoPico == "pico agudo") {
            alimentacion = "Alimenta cascando nueces";
        } else {
            if (tipoPico == "pico grueso") {
                alimentacion ="carnivo y carroñero";
            }
        }
        return alimentacion;
    }
}// fin clase