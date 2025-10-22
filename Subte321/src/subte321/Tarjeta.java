
package subte321;


public abstract class Tarjeta {
    
    private final CentralSubte central;


public Tarjeta(CentralSubte central) {
    this.central = central;
}

protected CentralSubte getCentral() {
    return this.central; 
}

public abstract boolean puedoViajar();

public abstract  void descontarViaje();

public abstract String mensajeError();



public void viajar() {
    if(!puedoViajar()) {
        throw new NoPuedoViajarException(mensajeError());
    }
    descontarViaje();
    System.out.println("Viajando....");
}


        
        
        
 }