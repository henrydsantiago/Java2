package bd;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    static Statement stm;
    static Connection con;
    
    public static boolean ejecutar(String sql){
        if(conectar()){
            try{
                stm.execute(sql);
                return true;
            }catch(SQLException ex){
                System.out.println("ERROR "+sql+" -> "+ex.getMessage());
                return false;
            }
        }
        else{
            return false;
        }
    }   

    public static ResultSet consultar(String sql) {
        try {
            if(conectar()){
            return stm.executeQuery(sql);
            }
            else{
                return null;
            }
        } catch (SQLException ex) {
            System.out.println("ERROR! " + sql + "-> " + ex.getMessage());
            return null;
        }
    }

    public static boolean conectar() {
        if (con != null) {
            return true;
        } else {
            try {
                String url = "jdbc:mysql://localhost/clase2";
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection(url, "root", "");
                stm = con.createStatement();
                return true;
            } catch (Exception ex) {
                System.out.println("¡ERROR! " + ex.getMessage());
                return false;
            }
        }
    }
}
