package CallOfTec;

import javax.swing.JOptionPane;

public class Heroe extends Personaje {

    //Atributos nativos de la clase Heroe

    String habilidad;

    //Contructor de la clase Heroe
    //Para contruir un Heroe es necesario su nombre, raza y su habilidad
    Heroe(String nombre, String raza, String habilidad) {
        super(nombre, raza);
        this.habilidad = habilidad;
    }

    //Este funcion es de tipo publica y no devuelve ningun valor 'void'

    public void diparar() {
        JOptionPane.showMessageDialog(null, "¡" + this.nombre + " esta disparando!");

    }

}
