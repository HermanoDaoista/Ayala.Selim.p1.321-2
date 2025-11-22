
package bolillero321;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;



public interface Bolillero <T>{
    
    
   
    
    void cargarBolilla(T bolilla);
    
    default public void cargarBolillas (T[] bolillas) {
         Objects.requireNonNull(bolillas, "Bolillas Nula");
         vaciarBolillero();
         for(T bolilla : bolillas) {
             cargarBolilla(bolilla);
         }
    }
    
    boolean quedanBolilllas();
    
    default List<T> extraerVarias(int cant) {
        if(cant < 0 || cant > cantidadBolillas()) {
            throw new IllegalArgumentException("Cantidad Invalida");
        }
        List<T> toReturn = new ArrayList<>();
        for(int i = 0; i < cant; i++) {
            toReturn.add(extrearBolilla());
        }
        return toReturn;
            
        
    }
    
    
    
    void vaciarBolillero();
    
    T extrearBolilla();
    
    
   
    T extraerBolillaRepo(); 
 
    
    int cantidadBolillas(); 
    
    public static <T> void cargarBolillero(Bolillero<T> bolillero, T[] bolillas) {
        //for(int i=0; i < 10; i++){
            bolillero.cargarBolillas(bolillas);
        }
}
