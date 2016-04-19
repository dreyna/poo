/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import dao.UsuarioDao;
import interfaces.InterfaceUsuario;

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
        verificarUser();
    }
    public static void verificarUser(){
      if(iu.validarUsuario("malaspina", "noduermas")){
          System.out.println("Bienvenido");
      }else{
          System.out.println("piñata");
               
      }
    }
}
