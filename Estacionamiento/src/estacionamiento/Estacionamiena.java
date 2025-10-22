
package estacionamiento;

import java.util.ArrayList;


public class Estacionamiena {
    private final String nombre;
    private final ArrayList<Vehiculo> vehiculos;
    
    public Estacionamiena(String nombre){
        this.nombre = nombre;
        vehiculos = new ArrayList<>();
    }
    
    public void agregarVehiculo(Vehiculo nuevoVehiculo) {
        checkNull(nuevoVehiculo, null);
        if(vehiculos.contains(nuevoVehiculo)) {
            throw new IllegalArgumentException("vehiculo repetido");
        }
        vehiculos.add(nuevoVehiculo);
       
           }
          
    private void checkNull(Vehiculo v, String mensaje){
         if (v == null )   {
             throw new IllegalArgumentException((mensaje == null) ? "Vehiculo nulo" : mensaje);
        }
    }
    public int cantidadVehiculos()  {
        return  vehiculos.size();
    }    
    
    public boolean estaVacio() {
        return  vehiculos.isEmpty();
    }
    
    public String vehiculosString() {
        StringBuilder sb = new StringBuilder();
        for (Vehiculo v :  vehiculos) {
          sb.append(v).append("\n");
        }
         return sb.toString();
    }
    
    public ArrayList<Vehiculo> getVehiculos() {
        return new ArrayList<>(vehiculos);
    }
    
   private Vehiculo buscarVehiculos(String patente) {
        for(Vehiculo v : vehiculos) {
                if(v.tienePatente(patente)) 
                    return v;
            }
        return null;
        }
            
   public boolean estaObjeto(String patente) {
        return buscarVehiculos(patente) != null;
    }
                
   public Vehiculo sacarVehiculo(String patente) {
       return vehiculos.remove(vehiculos.indexOf(buscarVehiculos(patente)));
       }
        
        
    
    
    public void vaciarEstacionamiento() {
        vehiculos.clear();
    }            

    }
    
            
        
    
    
    

