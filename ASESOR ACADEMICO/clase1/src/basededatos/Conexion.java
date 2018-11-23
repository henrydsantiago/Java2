package basededatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {

    public static void main(String[] args) {
        
        try {
            String url="jdbc:mysql://localhost/clase2";
            //String url="jdbc:sqlite:bd.db";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con=DriverManager.getConnection(url,"root","");
            System.out.println("Se conecto exitosamente");
            Statement stm=con.createStatement();
            ResultSet rs=stm.executeQuery("select * from producto");
            while (rs.next()){
                System.out.println(rs.getString("nombre"));
            }
            con.close();
        } catch (Exception ex) {
            System.out.println("Error. "+ ex.getMessage());
        } 
        
    }
    
}
