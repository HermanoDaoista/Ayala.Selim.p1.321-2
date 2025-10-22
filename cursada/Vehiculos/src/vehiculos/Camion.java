/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author rogel
 */
public class Camion extends VehiculoAutonomo{

    public Camion(int id, String marca, String modelo) {
        super(id, marca, modelo);
    }
     
    @Override
    public void moverse(){
        estado = true;
        System.out.println("Camion en la bajada");
    } 
    
    @Override
    public void detenerse(){
        estado = false;
        System.out.println("Camion parado");
    }
    
    @Override
    public String reportarEstado(){
     return "El camion esta" +(estado ? "en movimiento" : "parado");
    }
    
}
