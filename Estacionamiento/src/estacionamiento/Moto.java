
package estacionamiento;


public class Moto extends Vehiculo{
    private boolean bloqueda;
    

    public Moto(String patente, String marca, int modelo) {
        super(patente, marca, modelo);
        
    }
    
    public void bloquear() {
        bloqueda = true;
        
    }

    @Override
    public void acelerar() {
        System.out.println("Moto acelerando");
    }


 @Override
    public void frenar() {
        System.out.println("Moto frenando");
    }  
    
    @Override
    public String toString() {
        return super.toString() +  ((bloqueda)? " Asegurada" : " Desbloqueada");
    }
    
    
    
    
    
}
