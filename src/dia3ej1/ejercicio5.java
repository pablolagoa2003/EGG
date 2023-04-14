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
public class ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        
        int num = leer.nextInt();
        
        int doble = num * 2;
        
        int triple = num * 3;
        
        double raiz = Math.sqrt(num);
        
        System.out.println("El doble es: " + doble + " el triple: " + triple + " y la raiz: " + raiz);
    }
    
}
