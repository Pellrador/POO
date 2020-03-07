
package pastel;


public class pruebaPastel {
public static void main(String[] args)
    {
        Pastel pastel1 = new Pastel("3leches", 15);
        Pastel pastel2 = new Pastel("Moka",20 );
        Pastel pastel3 = new Pastel("Vainilla");

        System.out.println(pastel1.getTipodePastel() + " tiene " + pastel1.getLeche() + " ml.");
        System.out.println(pastel2.getTipodePastel() + " tiene " + pastel2.getLeche() + " ml.");
        System.out.println(pastel3.getTipodePastel() + " tiene " + pastel3.getLeche() + " ml.");

        pastel1.cambiar("Vainilla");
        pastel2.cambiar(12);
        pastel3.cambiar("3leches", 8);

        System.out.println("\nDespués de los cambios:");

        System.out.println(pastel1.getTipodePastel() + " tiene " + pastel1.getLeche() + " ml.");
        System.out.println(pastel2.getTipodePastel() + " tiene " + pastel2.getLeche() + " ml.");
        System.out.println(pastel3.getTipodePastel() + " tiene " + pastel3.getLeche() + " ml.");
    }
  
    }
    

