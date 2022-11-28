package modelo;

import java.util.ArrayList;

public class Observador extends Usuario {
    private static String tipo = "Observador";
    private String nombre;
    private String permisos;
    private ObjParaObservacion accesorio;
    private ArrayList<ObjParaObservacion> accesorios = new ArrayList<>();

    public Observador() {
    }

    public Observador(String email, String contrasenia, String nombre, ObjParaObservacion accesorio) {
        super(email, contrasenia);
        this.nombre = nombre;
        permisos= definirPermisos();
        accesorios.add(accesorio);

    }

    @Override
    public String definirPermisos() {
        if (tipo=="Observador"){
        }
        return "Solo permiso para registrar avistamientos";
    }

    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        Observador.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }

    public ArrayList<ObjParaObservacion> getAccesorios() {
        return accesorios;
    }

    public void setAccesorios(ArrayList<ObjParaObservacion> accesorios) {
        this.accesorios = accesorios;
    }

    @Override
    public String toString() {
        return super.toString() +nombre + '\'' +permisos + '\'' +accesorios +
                '}';
    }
}
