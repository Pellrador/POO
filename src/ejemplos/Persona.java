package ejemplos;
public class Persona {
    //
    private String Nombre;
    private int Edad;
    private char Sexo;
    private String ColorPiel;
    
    Persona(){    
    }
    
    public void setNombre(String Nombre){
        this.Nombre=Nombre;
    }
    
    public void cualEsTuNombre(){        
        System.out.println("Mi nombre es: "+this.Nombre);
    }
    
    public void caminar(){    
        System.out.println("Estoy caminando");
    }
    private  void hablar(){    
        System.out.println("blah..");
    }
    
    
}
