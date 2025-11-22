
package ordenamiento321;




public class Empleado implements Comparable<Empleado>{
    
    private final int legajo;
    private final String nombre;
    private final char genero;
    private final Date fechaIngreso;
    private final int edad;
    private final Sector sector;
    private final double sueldo;

    public Empleado(int legajo, String nombre, char genero, Date fechaIngreso, int edad, Sector sector, double sueldo) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.genero = genero;
        this.fechaIngreso = fechaIngreso;
        this.edad = edad;
        this.sector = sector;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public char getGenero() {
        return genero;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public int getEdad() {
        return edad;
    }

    public Sector getSector() {
        return sector;
    }

    public double getSueldo() {
        return sueldo;
    }
   
    
    

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", legajo=" + legajo + ", sector=" + sector + ", genero=" + genero + ", sueldo=" + sueldo + "F.I " +fechaIngreso+ '}';
    }

    @Override
    public int compareTo(Empleado e) {
        return Integer.compare(legajo, e.legajo);

    }
    
    
    
    
    
    
}
