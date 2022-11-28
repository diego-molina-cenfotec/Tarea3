package modelo;

public class Adm extends Usuario{
    private static String tipo = "Administrador";
    private String departamento;
    private String permisos;

    public Adm() {
    }

    public Adm(String email, String contrasenia, String departamento) {
        super(email, contrasenia);
        this.departamento = departamento;
        this.permisos = permisos;
    }

    @Override
    public String definirPermisos() {
        if (tipo=="Administrador"){
        }
        return "Todos los permisos de Gestor y Adm";
    }

    public static String getTipo() {
        return tipo;
    }

    public static void setTipo(String tipo) {
        Adm.tipo = tipo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPermisos() {
        return permisos;
    }

    public void setPermisos(String permisos) {
        this.permisos = permisos;
    }

    @Override
    public String toString() {
        return super.toString() +departamento + '\'' +permisos + '\'' +
                '}';
    }
}
