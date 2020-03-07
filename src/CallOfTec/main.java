package CallOfTec;

public class main {
    public static void main(String args[]){
        /*
        Se declara un objeto de tipo 'Zombie' con nombre de variable 'zombieUno'
        Se contruyo el objeto pasandole como parametro al contructor el nombre del zombie y su raza'new Zombie("A53Z1n0","Arxoo")'
        */
        Zombie zombieUno=new Zombie("A53Z1n0","Arxoo");
        zombieUno.correr();//La habilidad de correr fue herdada de la clase Padre 'Personaje'
        zombieUno.morder();//La habilidad de morder es nativa de la clase Zombie
        
        Heroe wh=new Heroe("WalterWhite","humano","hacer memes");
        wh.correr();//La habilidad de correr fue herdada de la clase Padre 'Personaje'
        wh.diparar();//La habilidad de disparar es nativa de la clase Heroe
       
    }
    
}
