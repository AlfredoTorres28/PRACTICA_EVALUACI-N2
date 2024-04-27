    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_operadores_logicos;

/**
 *
 * @author jealt
 */
public class EVA2_11_OPERADORES_LOGICOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean hayDinero, hayBuenClima;
        //PARA HACER LA CARNE ASADA SE NECESITA:
        //HAYA DINERO Y HAYA BUEN CLIMA
        hayDinero = false;
        hayBuenClima = false;
        
        System.out.println("1. NO HAY DINERO Y NO HAY BUEN CLIMA");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("SE ARMÓ LA CARNITA ASADA!!");
        else
            System.out.println("HUEVO CON FRIJOLES");
        
        
        hayDinero = false;
        hayBuenClima = true;
        System.out.println("2. NO HAY DINERO PERO HAY BUEN CLIMA");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("2.¨SE ARMÓ LA CARNITA ASADA!!");
        else
            System.out.println("HUEVO CON FRIJOLES");
        
        hayDinero = true;
        hayBuenClima = false;
        
        System.out.println("3. HAY DINERO PERO NO HAY BUEN CLIMA");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("¨SE ARMÓ LA CARNITA ASADA!!");
        else
            System.out.println("HUEVO CON FRIJOLES");
        
        
        hayDinero = true;
        hayBuenClima = true;
        
        System.out.println("4. HAY DINERO Y HAY BUEN CLIMA");
        if((hayDinero == true) && (hayBuenClima == true))
            System.out.println("SE ARMÓ LA CARNITA ASADA!!");
        else
            System.out.println("HUEVO CON FRIJOLES");
        
                    

    }
    
}
