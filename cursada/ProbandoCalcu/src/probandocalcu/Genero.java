/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package probandocalcu;

/**
 *
 * @author rogel
 */
public enum Genero 
{   
    NO_FICCION("No ficcion"),
    POESIA("Poesia"),
    ENSAYO("Ensayo"),
    INFANTIL("Infantil");
    
    private String descripcion;
    
    private Genero(String descripcion)
    {
         this.descripcion = descripcion;
    }
    
    public String getDescripcion()
    {
        return this.descripcion;
    }
}
