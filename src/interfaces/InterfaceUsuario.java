/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Usuario;
import java.util.List;

/**
 *
 * @author alum.fial8
 */
public interface InterfaceUsuario {
    public boolean validarUsuario(String user, String pass);
    public boolean registrarUsuario(Usuario u);
    public boolean modificarUsuario(Usuario u);
    public boolean eliminarUsuario(int id);
    public List<Usuario> listarUsuario();
    public Usuario buscarUsuario(String user);
}
