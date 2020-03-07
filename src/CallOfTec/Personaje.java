package CallOfTec;

public class Personaje {

    public String nombre;
    public String raza;
    private int vida;
    
    Personaje(String nombre, String raza) {
        this.nombre = nombre;
        this.raza = raza;
        this.vida = 100;
    }

    public void saltar() {
        System.out.println("Estoy saltando");
    }

    public void correr() {
        System.out.println("Estoy corriendo");
    }

}
