/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio321;

import java.time.LocalDate;

/**
 *
 * @author rogel
 */
public class PersonalTrainer extends Entrenador{
    
    private double sueldoMinimo;
    private int cantClientes;
    private double montocliente;

    public PersonalTrainer(String nombre, String apellido, LocalDate fechaIngreso, double sueldoMinimo, int cantClientes, double montocliente, int legajo) {
        super(legajo, nombre, apellido, fechaIngreso);
        this.sueldoMinimo = sueldoMinimo;
        this.cantClientes = cantClientes;
        this.montocliente = montocliente;
    }
       @Override
    public double calcularSueldo() {
       double sueldo = cantClientes * montocliente;
       return (sueldo > sueldoMinimo) ? sueldo : sueldoMinimo;
    }
    
    @Override
   public int getCantClientes() {
       return cantClientes;
   }
    

        
}
