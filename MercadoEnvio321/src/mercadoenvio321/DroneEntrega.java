
package mercadoenvio321;


public class DroneEntrega extends DispositivoElectronico implements TransportadorPaquete {
    private double INITIAL_LEVEL = 100.0;
    private double nivelBateria = INITIAL_LEVEL;

    public DroneEntrega(String marca) {
        super(marca);
        
    }
    
  

    @Override
    public void encender() {
        if(nivelBateria > 0) {
        super.encender();
        } 
    }

    @Override
    public void transportarPaquete(String destino) {
        encender();
        System.out.println("Soy un dron transportando un paquete a " + destino);
    }
    
    
    
    
    
    
    
    
    
    
}
