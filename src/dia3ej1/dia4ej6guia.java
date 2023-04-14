/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dia3ej1;

import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class dia4ej6guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1 , num2 ;
        System.out.println("Ingrese un numero ");
        num1 = leer.nextInt();
        System.out.println("Ingrese un numero ");
        num2 = leer.nextInt();
      
      
        if (num1>25 && num2>25 ){
         System.out.println("ambos numero son mayores a 25 ");   
        }
        else if (num1>25 || num2>25 ){
         System.out.println("algun numero ingresado es mayor a 25 ");   
        }
        if (num1<25 && num2<25 ){
         System.out.println("ningun numero  es mayor a 25 "); 
        }
        
        
        // TODO code application logic here
    }
    
}
