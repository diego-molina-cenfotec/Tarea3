package modelo;

import java.time.LocalDate;

public class Avistamiento {
    private LocalDate fechaAvistamiento;
    private Usuario observador;
    private Animal animal;
    private Direccion ubicación;

    public Avistamiento(LocalDate fechaAvistamiento, Usuario observador, Animal animal, Direccion ubicación) {
        this.fechaAvistamiento = fechaAvistamiento;
        this.observador = observador;
        this.animal = animal;
        this.ubicación = ubicación;
    }

    public LocalDate getFechaAvistamiento() {
        return fechaAvistamiento;
    }

    public void setFechaAvistamiento(LocalDate fechaAvistamiento) {
        this.fechaAvistamiento = fechaAvistamiento;
    }

    public Usuario getObservador() {
        return observador;
    }

    public void setObservador(Usuario observador) {
        this.observador = observador;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Direccion getUbicación() {
        return ubicación;
    }

    public void setUbicación(Direccion ubicación) {
        this.ubicación = ubicación;
    }

    @Override
    public String toString() {
        return "Avistamiento{" +
                "fechaAvistamiento=" + fechaAvistamiento +
                ", observador=" + observador +
                ", animal=" + animal +
                ", ubicación=" + ubicación +
                '}';
    }
}
