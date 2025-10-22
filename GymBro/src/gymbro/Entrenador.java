
package gymbro;

import java.time.LocalDate;

public abstract class Entrenador {
    private int legajo;
    private String nombre;
    private String apellido;
    private LocalDate anioIngreso;

    public Entrenador(int legajo, String nombre, String apellido, LocalDate anioIngreso) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }
    
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public LocalDate getAnioIngreso() {
        return anioIngreso;
    }
    
    public String mostrarSueldo() {
        return  "|%-20s|%15s|\n".formatted(nombreCompleto() , calcularSueldo());
    }
    
    public abstract double calcularSueldo();
    
}
