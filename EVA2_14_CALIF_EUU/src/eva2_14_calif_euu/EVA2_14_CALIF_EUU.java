/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_calif_euu;

import java.util.Scanner;

/**
 *
 * @author jealt
 */
public class EVA2_14_CALIF_EUU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Calificación;
        Scanner captura = new Scanner(System.in);
        System.out.println("Introduce tu calificación (0 - 100): ");
        Calificación = captura.nextInt();
        
        if(Calificación >= 90 && Calificación <= 100)//Si hay mas de una instruccion puede llevar []
            System.out.println("A");
        else
            if(Calificación >= 80 && Calificación <= 89)
                System.out.println("Lunes");
        else
            if(Calificación == 3)
                System.out.println("Martes");
        else
            if(Calificación == 4)
                System.out.println("Miercoles");
        else
            if(Calificación == 5)
                System.out.println("Jueves");
        else
            if(Calificación == 6)
                System.out.println("Viernes");
        else
            if(Calificación == 7)
                System.out.println("Sabado");
        else
                System.out.println("El numero no es un dia valido");
    }
    
}
