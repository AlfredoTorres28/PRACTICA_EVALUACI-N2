/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_20_for_3;

import java.util.Scanner;

/**
 *
 * @author jealt
 */
public class EVA2_20_FOR_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cant;
        Scanner captura = new Scanner(System.in);
        System.out.println("¿Cuál es el número a calcular la sumatoria?");
        cant = captura.nextInt();
        
        int sumatoria = 0;
        for(int i = 1; i <= cant; i++)
            sumatoria = sumatoria + i;
        System.out.println("El valor de la sumatoria de " +" - " + sumatoria);
        
        int rep;
        System.out.println("¿Cuál es el número de filas a imprimir?");
        cant = captura.nextInt();
        for(int i = 1; i <= cant; i++)
            for(int j = 1; j < i; i++);
            System.out.print("*");
        
    }
    
}
