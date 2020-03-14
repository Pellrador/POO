/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unidad3;
/**
 *
 * @author Trinidad
 */
public class recta extends figura {
    recta(int x1, int x2, int y1, int y2){
        super(x1,x2,y1,y2);
    }    
    //Metodo
    public double CalcularDistancia(){
        return Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
    }
}
