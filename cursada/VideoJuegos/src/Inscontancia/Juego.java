
package Inscontancia;
import java.util.ArrayList;
public class Juego 
{
private String titulo;
private double pesoGB;
protected ArrayList<TipoConsola> consolasCompatibles = new ArrayList<>();//iniciar en constructor

    public Juego(String titulo, double pesoGB, ArrayList<TipoConsola> consolasCompatibles)
    {
        this.titulo = titulo;
        this.pesoGB = pesoGB;
        this.consolasCompatibles = consolasCompatibles;
    }

    

    public String getTitulo() 
    {
        return this.titulo;
    }

    public double getPesoGB() 
    {
        return this.pesoGB;
    }

    public ArrayList<TipoConsola> getConsolasCompatibles()
    {
        return this.consolasCompatibles;
    }
     public String mostraJuego()
     {
         return "Titulo: " + this.titulo + "Tamanio: " + this.pesoGB + "Compatible con: " + this.consolasCompatibles;
     }
     public boolean esCompatible(TipoConsola tipoconsola)
     {
         for (TipoConsola consola: consolasCompatibles )
         {
             if (consola.equals(tipoconsola))
                 return true;
         }
         return false;
         
     }

    
}
