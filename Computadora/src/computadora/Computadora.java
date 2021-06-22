/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package computadora;

import ico.fes.complementos.CPU;
import ico.fes.complementos.Monitor;
import ico.fes.complementos.Mouse;
import ico.fes.complementos.Teclado;

/**
 *
 * @author melbe
 */
public class Computadora {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CPU c1 = new CPU("Intel", "Core i7", 3.6f);
        Monitor m1 = new Monitor("Acer", "KG241Q", 24);
        Mouse mo1 = new Mouse("Acer", "Nitro 4000", "Alambrico");
        Teclado t1= new Teclado("Coarsair", "K55", 110, 6);
        
        System.out.println( "CPU:   " + c1.getMarca() + "   " + c1.getModelo() +
                "   " + c1.getVelocidadProcesador()+" GHz");
        System.out.println( "Monitor:   " + m1.getMarca() + "   " + 
                m1.getModelo() + "   " + m1.getPulgadas()+"´´" );
        System.out.println( "Mouse:   " + mo1.getMarca() + "   " + 
                mo1.getModelo() + "   " + mo1.getTipo() );
        System.out.println( "Teclado:   " + t1.getMarca() + "   " + 
                t1.getModelo() + "   " + t1.getNumeroDeTeclas() + " teclas   " +
                t1.getMultimedia() + " multimedia\n"  );
         // Se puede usar cuando no se edita el toString
       
        System.out.println( c1 );
        System.out.println( m1 );
        System.out.println( mo1 );
        System.out.println( t1 );
        //Editando toString
    }
    
}
