/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author usuario local
 */
public class conexion {
    static Statement stm;
    static Connection con;
    
    public static ResultSet consultar(String sql){
    try{
        if (conectar())
            return stm.executeQuery(sql);
        else
            return null;
    } catch (SQLException ex){
        System.out.println("Error: "+sql+" -> "+ex.getMessage());
        return null;
    }
    }
    
    public static boolean ejecutar(String sql)
    {
        if (conectar())
            try{
                stm.execute(sql);
                return true;
            } catch (SQLException ex){
                System.out.println("Error "+ ex.getMessage());
                return false;
            }
        return false;
    }
    
    public static boolean conectar (){
        if(con!=null) return true;
        else
            try {
                   String url="jdbc:mysql://localhost/clase2";
                   //String url="jdbc:sqlite:bd.db";
                   Class.forName("com.mysql.jdbc.Driver").newInstance();
                   con=DriverManager.getConnection(url, "root", "");
                   System.out.println("Se conecto exitosamente");
                    stm=con.createStatement();
                   return true;
               } catch (Exception ex) {
                   System.out.println("Error. "+ ex.getMessage());
                   return false;
               } 
    
    }

}