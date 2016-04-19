/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import entidades.Usuario;
import interfaces.InterfaceUsuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import util.Conexion;




/**
 *
 * @author alum.fial8
 */
public class UsuarioDao implements InterfaceUsuario{
    private Connection cx;
    private Statement st;
    private ResultSet rs;
    private String sql;
    
    @Override
    public boolean validarUsuario(String user, String pass) {
        sql = "select * from tusuario where user='"+user+"' and clave='"+pass+"'";
        boolean op = false;
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                op = true;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        
        return op;
    }

    @Override
    public boolean registrarUsuario(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean modificarUsuario(Usuario u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean eliminarUsuario(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Usuario> listarUsuario() {
        List<Usuario> list = new ArrayList<>();
        sql = "SELECT *FROM tusuario";
        try {
            cx = Conexion.getConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Usuario u = new Usuario();
                u.setIduser(rs.getInt("idTUsuario"));
                u.setUser(rs.getString("user"));
                u.setClave(rs.getString("clave"));
                u.setIdp(rs.getInt("TPersona_idTPersona"));
                list.add(u);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        return list;
    }

    @Override
    public Usuario buscarUsuario(String user) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
