
package smartwacht321;

import java.time.LocalDate;

public class Tarea {
    private String nombre;
    private boolean completada;
    private LocalDate fechaVencimiento;
    private int duracion;
    private Prioridad prioridad;

    public Tarea(String nombre, boolean completada, LocalDate fechaVencimiento, int duracion, Prioridad prioridad) {
        this.nombre = nombre;
        this.completada = completada;
        this.fechaVencimiento = fechaVencimiento;
        this.duracion = duracion;
        this.prioridad = prioridad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }
    
    

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public Prioridad getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(Prioridad prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tarea{" + "nombre=" + nombre + ", completada=" + completada + ", fechaVenc=" + fechaVencimiento + ", duracion=" + duracion + ", pri=" + prioridad + '}';
    }
    
    
    
    
}
