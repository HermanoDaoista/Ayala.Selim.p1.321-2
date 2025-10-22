/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientastaller;
import java.util.ArrayList;
/**
 *
 * @author rogel
 */
public class Taller 
{
    private ArrayList<Herramienta> coleccionDeHerramienta = new ArrayList<>();
    private int cantidadMaxima = 10;
    
    public boolean agregarHerramienta(Herramienta herramienta)
    {   boolean retorno;
        if(cantidadDeherramienta() < cantidadMaxima)
        {
            coleccionDeHerramienta.add(herramienta);
            retorno = true;
        }else
        {
            System.out.println("No se admiten mas items en Stock");
            retorno = false;
        }return retorno;
        
        
    }
    public int cantidadDeherramienta()
    {
        return coleccionDeHerramienta.size();
    }

   public String mostrarHerramientas()
   {   StringBuilder mostrar = new StringBuilder();
      for (Herramienta herramienta : coleccionDeHerramienta)
       if (herramienta instanceof Taladro)
       {
           Taladro taladro = (Taladro) herramienta;
           mostrar.append(taladro.mostrarTaladro()).append("\n");
       }else if (herramienta instanceof LlaveInglesa)
       {
           LlaveInglesa llave = (LlaveInglesa) herramienta;
           mostrar.append(llave.mostrarLlaveInglesa()).append("\n");
       }
      return mostrar.toString();
      
      
   }
}


