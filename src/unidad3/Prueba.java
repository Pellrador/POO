/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;

import javax.swing.JOptionPane;

/**
 *
 * @author Trinidad
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //recta
        recta linea = new recta(2, 3, 4, 5);
        System.out.println(linea.CalcularDistancia());
        JOptionPane.showMessageDialog(null, linea.CalcularDistancia());
        //ovalo
        Ovalo objetoOvalo=new Ovalo(2, 3, 4, 5);
        JOptionPane.showMessageDialog(null,objetoOvalo.CalcularArea());
        
        
    }
    
}
