/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author rogel
 */
public class Auto extends VehiculoAutonomo implements LimpiaParabrisas{

    public Auto(int id, String marca, String modelo) {
        super(id, marca, modelo);
    }
    
    @Override
    public void moverse(){
        estado = true;
        System.out.println("Auto moviendose");
    }
    
    @Override
    public void detenerse(){
        estado = false;
         System.out.println("Auto detenido");

    }
    
    @Override
    public String reportarEstado(){
        return "El coche esta " + (estado ? "en movimiento" : "detenido"); 
    }
    
    @Override
    public void limpiarParabrisas(){
        System.out.println("Limpiando Parabrisas");
    }
}
