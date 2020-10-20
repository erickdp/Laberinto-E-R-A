package ec.edu.ec.control;

import ec.edu.ec.modelo.Usuario;
import ec.edu.ec.vista.mensajes.Registrar;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class UsuarioTrs extends DataBase<Usuario> {
    
    //Registrar r;
    public UsuarioTrs() {
        super("Log-Usuario");
    }

    public String crearUsuario(Usuario registro) throws MyException {
        if (listObjects.contains(registro)) {
            throw new MyException("El usuario ya existe");
        }
        listObjects.add(registro);
        writeFile();

        return "Usuario Agregado Correcatamente "
                + "\n\nDisfruta de una emocionante aventura en nuestro laberinto \n"
                + "                                       @ERA";
        
    }

    @Override
    protected void tDefault() {
        try {
            crearUsuario(new Usuario("admin", "1234"));
        } catch (MyException ex) {
            ex.printStackTrace();
        }
    }
    
    public boolean buscarUsuario(String usuario) {
        for (Usuario u : read()) {
            if(u.getNombreUsuario().equals(usuario)) {
                return true;
            }
        }
        return false;
    }

    public List<Usuario> read() {
        try {
            readFile();
        } catch (IOException | ClassNotFoundException ex) {
            Logger.getLogger(UsuarioTrs.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listObjects;
    }

    public class MyException extends Exception {

        public MyException() {
        }

        public MyException(String message) {
            super(message);
        }

    }

}
