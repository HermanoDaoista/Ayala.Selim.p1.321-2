/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ReservaVuelos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rogel
 */
public class Reservas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Vuelo> vuelos = new ArrayList<>();
        
        VueloInternaional vi = new VueloInternaional("were", "pitfall", 6);
        VueloNacional vn = new VueloNacional("zas", "pepe", 7);
        
        vuelos.add(vn);
        vuelos.add(vi);

        
        for(Vuelo v : vuelos){
        
            try{
                v.reservarAsientos(3);
                v.cancelarReserva(3);
                v.reservarAsientos(4);
                v.reservarAsientos(3);

            } catch (AsientoNoDisponibleException ex){
                System.out.println("Error " + ex.getMessage());
            }
        
        }
        
    }
    
}
