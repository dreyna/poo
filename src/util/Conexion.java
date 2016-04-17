/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author alum.fial8
 */
public class Conexion {
    private static final String url="jdbc:mysql://localhost:3306/bdprueba";
    private static final String user="root";
    private static final String pass="root";
    private static final String driver="com.mysql.jdbc.Driver";
    private static Connection conex;
    
    public static Connection getConexion(){
        
        try {
            if(conex==null){
            Class.forName(driver);
            conex = DriverManager.getConnection(url, user, pass);
            }
        } catch (ClassNotFoundException | SQLException e) {
        
        }
    return conex;
    }
    
}
