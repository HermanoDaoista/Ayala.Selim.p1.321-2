
package estacionamiento;


public class Auto extends Vehiculo {
    
    private boolean tieneGPS;
    
    public Auto(String patente, String marca, int modelo){
        super(patente, marca, modelo);
        
        
    }
    
    public void calcularRuta(String destino){
        if(tieneGPS) {
            System.out.println("Calculando ruta hacia " + destino);
        }
        else {
            System.out.println("Usa waze te compraste el auto barato");
        }
    }

    @Override
    public String toString() {
          return super.toString() + " tieneGPS= " + tieneGPS + '}';
        
    }

    @Override
    public void acelerar() {
        System.out.println("Auto acelerando");
    }
    
    @Override
    public void frenar() {
        System.out.println("Auto frenando");
    }
    
    

    
    
    
   
}




    
    
    
       
       
