package modelo;

public abstract class Usuario {
    private String email;
    private String contrasenia;

    public Usuario() {
    }

    public Usuario(String email, String contrasenia) {
        this.email = email;
        this.contrasenia = contrasenia;
    }

    public abstract String definirPermisos();

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    @Override
    public String toString() {
        return email + '\'' + contrasenia + '\'' +
                '}';
    }
}
