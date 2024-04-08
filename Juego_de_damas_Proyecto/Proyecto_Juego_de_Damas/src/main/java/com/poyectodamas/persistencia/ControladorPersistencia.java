
package com.poyectodamas.persistencia;

import com.poyectodamas.persistencia.UsuarioJpaController;
import logica.Usuario;


public class ControladorPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    public void crearUsuario (Usuario usuario){
        usuJpa.create(usuario);
    }
    
    public boolean comprobar(String nickname, String password){
        Usuario usuario = usuJpa.findUsuarioByNickname(nickname);
        return usuario != null && usuario.getPassword().equals(password);
    }
}
