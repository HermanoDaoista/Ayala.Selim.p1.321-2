/*WerePitfall*/
package Entidades;


public class Cursos
{
    private String nombreCurso;
    private int cantidadHoras;
    private Alumno alumno;

    public Cursos(String nombreCurso, int cantidadHoras) 
    {
        this.nombreCurso = nombreCurso;
        this.cantidadHoras = cantidadHoras;
        this.alumno = null;
    }
    
  

    public void setAlumno(Alumno alumno) 
    {
        if (this.validadEdad(alumno.getEdad()))
        {
            this.alumno = alumno;
        }else
        {
            System.out.println("No se pudo ingresar al alumno es menor de 18 anios");
        }
    }   
        
    private boolean validadEdad(int edad) 
        {
            return edad >= 18;
        }
        
    public String mostrarInf0()
    {   String mensaje =  this.nombreCurso + "\n" + this.cantidadHoras + "\n" ;
        if(this.alumno  != null)
        {
            mensaje += this.alumno.getNombreCompleto() + "\n" + this.alumno.getEdad();
        }
        
        return mensaje;
        
    }    
    
    
    
    
}
