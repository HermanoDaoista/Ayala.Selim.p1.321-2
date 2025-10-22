
/*WerePitfall*/


package Entidades;

public class Alumno 
{
private String nombre;
private String apellido;
private int edad;

    public Alumno(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }


    public int getEdad() 
    {
        return this.edad;
    }

    public String getNombreCompleto()
    {
        return this.nombre + " - " + this.apellido;
    } 
            

}
