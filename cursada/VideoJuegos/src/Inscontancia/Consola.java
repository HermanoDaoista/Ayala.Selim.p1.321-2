
package Inscontancia;

import java.util.ArrayList;

public class Consola 
{
    private String nombre;
    private TipoConsola tipoconsola;
    private double capacidadMaximaGB;
    ArrayList<Juego> juegosInstalados = new ArrayList<>();

    public Consola(String nombre, TipoConsola tipoconsola, double capacidadMaximaGB) {
        this.nombre = nombre;
        this.tipoconsola = tipoconsola;
        this.capacidadMaximaGB = capacidadMaximaGB;
    }
    public boolean agregarJuegos(Juego juego)
    {   boolean retorno = false;
        if(juego.getPesoGB() < capacidadMaximaGB && juego.esCompatible(tipoconsola))
        {
           juegosInstalados.add(juego);
           capacidadMaximaGB -= juego.getPesoGB();
           retorno = true;
           //este metodo lo hice con el proposito de agregar juego solo si hay espacio en la consola y es conpatible,
           //luego resta al capacidadmaxima el tamanio del juego, 
           
        }return retorno;
     }
    public int mostrarJuegos()
    {
        if(juegosInstalados.isEmpty())
        {
            System.out.println("No hay juegos instalados");
        }else
        {
            System.out.println("Juegos instalados en la: " + nombre + ": ");
            for(Juego juego : juegosInstalados)
            {
                System.out.println("- " + juego.getTitulo() + " Requiere " + juego.getPesoGB() + " GB");
            }
        }return juegosInstalados.size();
    }
}
