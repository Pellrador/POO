package CallOfTec;

import javax.swing.JOptionPane;

public class Zombie extends Personaje {
    //Atributos nativos de clase Zombie
    private double danio;
    
    
    //Contructor de clase Zombie
    Zombie(String nombre,String raza){
        super(nombre,raza);//Invoca al contructor de la clase padre(Personaje)        
        this.danio=Math.random()*20 + 1;//Asigna un nivel de daño de forma aleatoria entre  1 y 20 puntos de daño
    }
    /*
        Funcion de acceso publico 'public'
        Esta funcion retorna un valor 'double' que es equivalente al daño que ocasionado su mordida
        El nombre de esta funcion es 'morder'
        Esta funcion no recibe parametros '()'    
    */
    public double morder(){        
        JOptionPane.showMessageDialog(null, "¡Cuidado el zombie "+this.nombre+" te ataca!");
        return this.danio;
    }
    
    
}
