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
public class dia4ej8guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nota;
        Scanner leer = new Scanner(System.in);
  	     System.out.println("ingrese una nota");
   	nota = leer.nextInt();
  	 
   	while (nota > 10 || nota < 0) {
             System.out.println("ingrese una nota entre 0 y 10");
   	nota = leer.nextInt();
        }
      	 
    	System.out.println("ingreso una nota correcta");
        
    }
    
}
