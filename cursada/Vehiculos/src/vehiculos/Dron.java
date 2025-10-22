/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author rogel
 */
public class Dron extends VehiculoAutonomo{

    public Dron(int id, String marca, String modelo) {
        super(id, marca, modelo);
    }
    
    @Override
    public void moverse(){
        estado=true;
        System.out.println("Volando...");
    }
    
    @Override
    public void detenerse(){
        estado = false;
        System.out.println("Quieto...");
    }
    
    public String reportarEstado(){
        return "El dron se encuentra" + (estado ? "por los aires" : "detenido");
    }
}
