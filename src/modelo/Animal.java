package modelo;

public abstract class Animal {
    private boolean estaVivo;
    private String tamanio;

    public Animal() {
    }

    public Animal(boolean estaVivo, String tamanio) {
        this.estaVivo = estaVivo;
        this.tamanio = tamanio;
    }

    public boolean isEstaVivo() {
        return estaVivo;
    }

    public void setEstaVivo(boolean estaVivo) {
        this.estaVivo = estaVivo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "estaVivo=" + estaVivo +
                ", tamanio='" + tamanio + '\'' +
                '}';
    }
}
