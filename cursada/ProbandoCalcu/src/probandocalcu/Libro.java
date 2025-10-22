/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package probandocalcu;

/**
 *
 * @author rogel
 */
public class Libro 
{
     String titulo;
     String autor;
     Genero genero;

    public Libro(String titulo, String autor, Genero genero) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }
     
     
     public void esGenero(String estilo)
     {
         if(estilo.equalsIgnoreCase(genero.getDescripcion()))
         {
             System.out.println("El genero pertenece a " + genero.getDescripcion());
         }else
         {
             System.out.println("El genero NO pertenece a " + genero.getDescripcion());

         }
     }


}
