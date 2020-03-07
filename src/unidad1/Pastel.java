
package pastel;


public class Pastel {

    public String tipodepastel;
    public int leche;
    public int huevo;
    public char levadura;
    public int gradosdehorno;
    
public Pastel(String tipodepastel, int leche)
{
    this.tipodepastel= tipodepastel;
    this.leche= leche;
}
public Pastel(String tipodepastel)
{
    this.tipodepastel= tipodepastel;
    this.leche= 3;
}
public String getTipodePastel()
{
    return tipodepastel;
}
public int getLeche()
{
    return leche;
}
public void cambiar(String tipodepastel)
    {
        this.tipodepastel = tipodepastel;
    }

    public void cambiar(int leche)
    {
        this.leche = leche;
    }

    public void cambiar(String tipodepastel, int leche )
    {
        this.tipodepastel = tipodepastel;
        this.leche = leche;
    }
    
  
    }
    

