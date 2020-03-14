
package unidad3;

public class Ovalo extends figura {
    Ovalo(int x1, int x2, int y1, int y2){
        super(x1,x2,y1,y2);
    }    
    //Método    
     double CalcularArea(){
         return Math.PI * Math.pow(x1 - x2, 2) / 4; 
    }
}
