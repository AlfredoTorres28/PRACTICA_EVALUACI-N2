/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_15_comparar_texto;

import java.util.Scanner;

/**
 *
 * @author jealt
 */
public class EVA2_15_COMPARAR_TEXTO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //COMPARAR TEXTO EN JAVA
        String día;
        int otroDia;
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce el día (lunes, martes, etc");
        día = captura.nextLine();
        
        if(día.equals("domingo"))
            System.out.println("1");
        else if(día.equals("lunes"))
            System.out.println("2");
        else if(día.equals("martes"))
            System.out.println("3");
        else if(día.equals("miercoles"))
            System.out.println("4");
        else if(día.equals("jueves"))
            System.out.println("5");
        else if(día.equals("viernes"))
            System.out.println("6");
        else if(día.equals("sabado"))
            System.out.println("7");
        
           
        
    }
    
}
