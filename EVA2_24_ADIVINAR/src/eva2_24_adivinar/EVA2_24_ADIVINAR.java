/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_24_adivinar;

import java.util.Scanner;

/**
 *
 * @author jealt
 */
public class EVA2_24_ADIVINAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num = 5;
        int valor = 0;
        Scanner captura = new Scanner(System.in);
        while(num != valor){
            System.out.println("Cual es el numero? (entre 1 y 10):");
            valor = captura.nextInt();
        }
        System.out.println("ADIVINASTE!!!");
    }
    
}
