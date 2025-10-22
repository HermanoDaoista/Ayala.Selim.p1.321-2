/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionamiento;


public class Estacionamiento {

    public static void main(String[] args) {
        
        
  
        Estacionamiena csbs = new Estacionamiena("Rogelio");
        
        System.out.println(csbs.cantidadVehiculos());
        cargarEstacionamiento(csbs);
        
      
        
        
        for(Vehiculo v : csbs.getVehiculos()) {
            if(v instanceof VehiculoCarga c ) {
                c.cargar(1000);
           
            }
        }
        
        
        
        
}

public static void cargarEstacionamiento(Estacionamiena e) {
 
        Auto a1 = new Auto("YUT133", "honda", 2023);
        Auto a2 = new Auto("NHF876", "pepsi", 2021);
        Auto a3 = new Auto("PJH123", "silver", 2024);
        Auto a4 = new Auto("PJH875", "royal", 2043);
        Auto a5 = new Auto("ABS993", "lexus", 2019);
        
        Moto m1 = new Moto("JHG273", "Zanella", 2017);
        Moto m2 = new Moto("IJH009", "Suzuki", 2010);
        Moto m3 = new Moto("KOI233", "kawaza", 2029);
        
        Camion c1 = new Camion("VCF675", "Scania", 2910, 2000);
        
        
      
                
        
        
        e.agregarVehiculo(new Tren("KLH675", "Pollo", 1876, 10_000, Combustible.DIESEL));
        e.agregarVehiculo(a1);
        e.agregarVehiculo(a2);
        e.agregarVehiculo(a3);
        e.agregarVehiculo(a4);
        e.agregarVehiculo(a5);
        e.agregarVehiculo(m1);
        e.agregarVehiculo(m2);
        e.agregarVehiculo(m3);
        e.agregarVehiculo(c1);



}
        
        
    
}
