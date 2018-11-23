/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author usuario local
 */
public class conexion {
    static Statement stm;
    public static boolean conectar (){
     try {
            String url="jdbc:mysql://localhost/clase2";
            //String url="jdbc:sqlite:bd.db";
            //Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection(url, "root", "");
            System.out.println("Se conecto exitosamente");
             stm=con.createStatement();
            return true;
        } catch (Exception ex) {
            System.out.println("Error. "+ ex.getMessage());
            return false;
        } 
    
    }
}
