package ec.edu.ec.modelo;

import java.io.Serializable;

public class Usuario implements Serializable {
    
    private static final long serialVersionUID = -1L;

    private String nombreUsuario;
    private String cotrasena;

    public Usuario(String nombreUsuario, String cotrasena) {
        this.nombreUsuario = nombreUsuario;
        this.cotrasena = cotrasena;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getCotrasena() {
        return cotrasena;
    }

    public void setCotrasena(String cotrasena) {
        this.cotrasena = cotrasena;
    }

}
