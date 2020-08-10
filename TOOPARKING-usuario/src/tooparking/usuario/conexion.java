/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tooparking.usuario;

import java.sql.*;

/**
 *
 * @author Usuario
 */
public class conexion {

 Connection conectar=null;
 
 public Connection conexion2(){
    
    try{
        
        Class.forName("com.mysql.jdbc.Driver");
        
        //conectar=DriverManager.getConnection("jdbc:mysql://10.102.161.83:8080/parqueadero","juan","123");
        conectar=DriverManager.getConnection("jdbc:mysql://localhost/parqueadero","root","");
        
    }catch(Exception e){
        
        System.out.println(e.getMessage());
    }
    
    return conectar;
}
    
}
