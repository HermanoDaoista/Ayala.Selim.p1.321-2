/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mercadoenvio321;


public class CamionReparto extends Vehiculo implements TransportadorPaquete {
    private boolean cargado;

    public CamionReparto(String patente) {
        super(patente);
        
    }
    
    
    public void cargarCombustible()  {
    System.out.println("cargando combustible al camion");
    }  
    
    @Override
    public void repostar() {
        cargarCombustible();
    }
    
    public void cargarPaquete() {
        cargado = true;
    }

    @Override
    public void transportarPaquete(String destino) {
        cargarPaquete();
        conducirRapido();
        System.out.println("Soy un camion transportando un paquete a " + destino);
    }
  
  
}
