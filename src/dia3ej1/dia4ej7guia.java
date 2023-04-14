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
public class dia4ej7guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int TipoMotor;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese el tipo de motor que desea entre 1 y 4 ");
        
        TipoMotor = leer.nextInt();

    	switch (TipoMotor) {
        	case 1:
           System.out.println("La bomba es una bomba de agua");
           break;

        	case 2:
           System.out.println("La bomba es una bomba de gasolina");
            break;

                case 3 :
                    System.out.println("La bomba es una bomba de hormigón");
                    break;
                case 4 :
                    System.out.println("La bomba es una bomba de pasta alimenticia");
        	default:
           System.out.println("No existe un valor válido para tipo de bomba");

    }
  }  
}
