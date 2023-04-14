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
public class dia4EJ9guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, suma ;
        suma=0;
        n =0 ;     
         Scanner leer = new Scanner(System.in);
         do{
               System.out.println("Ingresa un numero");
       int num= leer.nextInt();
             if (num==0)  {
      break;
      }
      if (num>0){
      suma = suma + num;
             n++;
            }         
             } while (n <20);
         if (n<20){
         System.out.println("ustede ha ingresado el cero");
         System.out.println("el valor de la suma es ;" + suma);
         }
          if (n==20){
         System.out.println("ustede no ha ingresado el cero");
         System.out.println("el valor de la suma es ;" + suma);
         }
         
         
             
         
         
         
         
        
    }
    
}
