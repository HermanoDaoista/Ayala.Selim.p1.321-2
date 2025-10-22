
package subte321;


public class CentralSubte {
    private double precioViaje;
    

    public CentralSubte(double precioViaje) {
        this.precioViaje = precioViaje;
    }
    
    public void setPrecioViaje(double nuevoPrecio) {
        if(precioViaje < 0) {
            throw new IllegalArgumentException("Precio invalido");
        }
        this.precioViaje = nuevoPrecio;
    }
    
    public double consultarPrecioViaje() {
        return this.precioViaje;
    }
        
    




}



