/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ReservaVuelos;

import java.util.HashSet;
import java.util.Set;


public abstract class Vuelo {
    protected String nombre;
    protected String apellido;
    protected int capacidad;
    protected Set<Integer> asientoReservados;

    public Vuelo(String nombre, String apellido, int capacidad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.capacidad = capacidad;
        this.asientoReservados = new HashSet<>();
    }
    
    
    
    public abstract void reservarAsientos(int numeroAsiento)throws AsientoNoDisponibleException;
    
    public abstract void cancelarReserva(int numeroAsiento);
    
    protected boolean asientoDisponible(int numeroAsiento) {
        return !asientoReservados.contains(numeroAsiento) && numeroAsiento > 0 && numeroAsiento <= this.capacidad;
    }
}
