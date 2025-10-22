/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vehiculos;

import java.util.ArrayList;

/**
 *
 * @author rogel
 */
public class Vehiculos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a1 = new Auto(23, "PREUGOT", "R12");
        Camion c1 = new Camion(123,"Scania", "1114");
        Dron d1 = new Dron(67, "Insecto", "Raptor");
        
        //a1.moverse();
        //c1.moverse();
        //System.out.println(a1.reportarEstado());
        //.out.println(c1.reportarEstado());
        
        CentralComando comando = new CentralComando(new ArrayList<>());
        comando.agregarVehiculo(c1);
        comando.agregarVehiculo(a1);
        comando.agregarVehiculo(d1);
        
        comando.autobotAvancen();
        System.out.println(a1.reportarEstado());
        System.out.println(c1.reportarEstado());
        System.out.println(d1.reportarEstado());
        comando.decepticonRetirense();
        System.out.println(a1.reportarEstado());
        System.out.println(c1.reportarEstado());
        System.out.println(d1.reportarEstado());
        
        a1.limpiarParabrisas();

        
    }
    
}
