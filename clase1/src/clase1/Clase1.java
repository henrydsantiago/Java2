package clase1;

import java.util.Scanner;

public class Clase1 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in=new Scanner(System.in);
        try{
            System.out.println("Sueldo:");
            String s=in.next();
            float f=Float.parseFloat(s);
            System.out.println("Introduzca la nota:");
            int nota=in.nextInt();
            System.out.println("Introduzca la edad:");
            int edad=in.nextInt();
            int prom = nota/edad;
        }catch(java.util.InputMismatchException e)
        {
            System.out.println("Error. Dato invalido");
        }catch(ArithmeticException x){
            System.out.println("Error. Division entre 0");
        }catch(NumberFormatException y){
            System.out.println("Error de formato");
        }
        
    }
    
}
