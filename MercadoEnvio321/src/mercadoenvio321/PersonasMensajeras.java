
package mercadoenvio321;

public class PersonasMensajeras implements TransportadorPaquete {
    private String nombre;

    public PersonasMensajeras(String nombre) {
        this.nombre = nombre;
    }
    
    public void felicitarDelivery() {
    System.out.println("felicitaciones " + nombre + " delivery");
    }
    
    
    @Override
    public void transportarPaquete(String destino) {
        System.out.println("Soy " + nombre + " transportando un paquete a " + destino);
    
    }   
    
    @Override
    public void repostar() {
        felicitarDelivery();
    }
        
        
        
}
