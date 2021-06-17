/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composicion;

import ico.fes.objetos.Muro;
import ico.fes.objetos.Puerta;
import java.awt.Color;

/**
 *
 * @author melbe
 */
public class Composicion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Muro m1 = new Muro(2.5f, 4.5f, 3.5f, Color.gray, null, 
                new Puerta("Madera", Color.white, false) );
        
        System.out.println( m1.getAlto()+ " mts. de alto");
        //Material de la puerta
        System.out.println( m1.getPuerta().getMaterial() );
        
    }
    
}
