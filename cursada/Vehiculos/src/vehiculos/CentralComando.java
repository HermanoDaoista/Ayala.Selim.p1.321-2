/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

import java.util.ArrayList;


public class CentralComando {
    private ArrayList<VehiculoAutonomo> listavehiculos;

    public CentralComando(ArrayList<VehiculoAutonomo> listavehiculos) {
        this.listavehiculos = new ArrayList<>(listavehiculos);
    }
    
    public void agregarVehiculo(VehiculoAutonomo vehiculo){
        this.listavehiculos.add(vehiculo);
    }
    
    public void autobotAvancen(){
        for (VehiculoAutonomo listavehiculo : listavehiculos) {
            listavehiculo.moverse();
        }
    }
    
    public void decepticonRetirense(){
        for (VehiculoAutonomo listavehiculo : listavehiculos) {
            listavehiculo.detenerse();
        }
    }
}
