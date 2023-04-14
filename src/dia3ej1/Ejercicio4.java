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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese los grados centigrados");
        int grados=leer.nextInt();
        
       int F= 32 + (9*grados/5);
       System.out.println("el equivalente a " +grados+ "en faranheit es " +F);
               
               
               
        
    }
    
}
