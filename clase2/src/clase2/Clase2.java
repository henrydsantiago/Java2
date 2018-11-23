/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

import bd.conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clase2 {

    public static void main(String[] args) {
        if (conexion.conectar()){
            System.out.println("Se conecto");
            ResultSet rs=conexion.consultar("select * from producto where codigo='111'");
            
            if (rs!=null){
                try {
                    if(rs.next()){
                        do{
                            System.out.println(rs.getString(1));
                        }while (rs.next()); 
                    }else
                        System.out.println("No hay registros");
                    } catch (SQLException ex) {
                        System.out.println("Error: " + ex.getMessage());
                    }
            }
        }
        }
    }