
package com.poyectodamas.persistencia;

import com.poyectodamas.persistencia.UsuarioJpaController;
import javax.persistence.NoResultException;
import logica.Usuario;
import javax.persistence.NoResultException;


public class ControladorPersistencia {
    
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    public void crearUsuario (Usuario usuario){
        usuJpa.create(usuario);
    }
    
    public boolean comprobar(String nickname, String password) {
        try {
            // Intenta encontrar al usuario por su nickname
            Usuario usuario = usuJpa.findUsuarioByNickname(nickname);
            
            // Verifica si se encontró un usuario y si la contraseña coincide
            return usuario != null && usuario.getPassword().equals(password);
        } catch (NoResultException e) {
            // Maneja la excepción si no se encuentra ningún usuario con el nickname dado
            return false;
        } catch (Exception e) {
            // Maneja otras excepciones que puedan ocurrir durante la búsqueda del usuario
            e.printStackTrace(); // Imprime el stack trace para propósitos de depuración
            return false; // Indica que la comprobación no fue exitosa debido a un error
        }
    }
    
    public String getHashedPassword(String nickname) {
        try {
            // Intenta encontrar al usuario por su nickname
            Usuario usuario = usuJpa.findUsuarioByNickname(nickname);
            
            // Verifica si se encontró un usuario y devuelve la contraseña encriptada
            if (usuario != null) {
                return usuario.getPassword();
            } else {
                return null;
            }
        } catch (NoResultException e) {
            // Maneja la excepción si no se encuentra ningún usuario con el nickname dado
            return null;
        } catch (Exception e) {
            // Maneja otras excepciones que puedan ocurrir durante la búsqueda del usuario
            e.printStackTrace(); // Imprime el stack trace para propósitos de depuración
            return null; // Indica que ocurrió un error al obtener la contraseña encriptada
        }
    }
    public boolean validarNickname(String nickname){
        try {
            return usuJpa.findUsuarioByNickname(nickname)!=null; 
        }
        catch (NoResultException e) {
            // Maneja la excepción si no se encuentra ningún usuario con el nickname dado
            return false;
        } catch (Exception e) {
            // Maneja otras excepciones que puedan ocurrir durante la búsqueda del usuario
            e.printStackTrace(); // Imprime el stack trace para propósitos de depuración
            return false; // Indica que la comprobación no fue exitosa debido a un error
        }
        
    }
    public boolean validarEmail(String email){
        try {
            return usuJpa.findUsuarioByEmail(email)!= null;  
        }
        catch (NoResultException e) {
            // Maneja la excepción si no se encuentra ningún usuario con el nickname dado
            return false;
        } catch (Exception e) {
            // Maneja otras excepciones que puedan ocurrir durante la búsqueda del usuario
            e.printStackTrace(); // Imprime el stack trace para propósitos de depuración
            return false; // Indica que la comprobación no fue exitosa debido a un error
        }
    }
    
}
