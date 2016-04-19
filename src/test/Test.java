/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.UsuarioDao;
import entidades.Usuario;
import interfaces.InterfaceUsuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alum.fial8
 */
public class Test {
    static InterfaceUsuario iu = new UsuarioDao();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        listar();
    }
    public static void verificarUser(){
      if(iu.validarUsuario("malaspina", "noduermas")){
          System.out.println("Bienvenido");
      }else{
          System.out.println("piñata");
               
      }
    }
    public static void listar(){
        List<Usuario> lista = new ArrayList<>();
        lista = iu.listarUsuario();
        System.out.println("id \tuser \tclave");
        for(int i=0; i<lista.size();i++){
            System.out.println(lista.get(i).getIduser() +"\t"+lista.get(i).getUser()+"\t"+lista.get(i).getClave());
        }
    
    } 
}
