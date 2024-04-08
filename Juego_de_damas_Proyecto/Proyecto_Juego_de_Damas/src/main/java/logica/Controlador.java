
package logica;

import com.poyectodamas.persistencia.ControladorPersistencia;


public class Controlador {
    ControladorPersistencia control = new ControladorPersistencia();
    
    public void crearUsuario (Usuario usuario){
        control.crearUsuario(usuario);
    }
    
    public boolean comprobarUsuario(String nickname, String password){
        return control.comprobar(nickname, password);
    }
    
    
}
