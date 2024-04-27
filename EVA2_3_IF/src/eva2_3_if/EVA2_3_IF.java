/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_3_if;

import java.util.Scanner;

/**
 *
 * @author jealt
 */
public class EVA2_3_IF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double calificaciòn;
        Scanner captura = new Scanner (System.in);
        System.out.println("Introduce la calificaciòn");
        calificaciòn = captura.nextDouble();
        if(calificaciòn >= 70){//Esa seccion --> true
            //{}OPCIONALES, solo cuandotenemos mas
            //De una INSTRUCCION
            System.out.println("Aprobaste!!!");
        }else{
            System.out.println("No Acreditaste");
        }
    }
    
}
