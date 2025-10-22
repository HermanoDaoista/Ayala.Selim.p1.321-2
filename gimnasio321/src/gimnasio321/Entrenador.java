/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio321;

import java.time.LocalDate;


public abstract class Entrenador {
    private int legajo;
    private String nombre;
    private String apellido;
    private LocalDate fechaIngreso;

    public Entrenador(int legajo, String nombre, String apellido, LocalDate fechaIngreso) {
        this.legajo = legajo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaIngreso = fechaIngreso;
    }
    
    public String nombreCompleto() {
        return nombre + " " + apellido;
    }
    
    public LocalDate getIngreso() {
        return fechaIngreso;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nombreCompleto()).append(" $ ").append(calcularSueldo());
        return sb.toString();
    }
    
    public abstract double calcularSueldo();
    
    public abstract int getCantClientes();
    
    
}
