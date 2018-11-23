
package clase2;

import bd.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        if(Conexion.conectar()){
            System.out.println("Se conecto");
            ResultSet rs = Conexion.consultar("select * from producto where codigo='111'");
            
            if(rs != null){
                try {
                    if(rs.next()){
                        do{
                    System.out.println(rs.getString(1) + " "+rs.getString(2));
                        }while(rs.next());
                    }
                    else{
                        System.out.println("No hay registro");
                    }
                            } catch (SQLException ex) {
                    System.out.println("ERROR! "+ex.getMessage());
                }
            }
        }
    }
    
}
