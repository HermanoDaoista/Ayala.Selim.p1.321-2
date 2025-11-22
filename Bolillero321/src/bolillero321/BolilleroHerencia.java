
package bolillero321;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;


public class BolilleroHerencia extends ArrayList<Integer> {
    private Random aleatorio = new Random();
    
    public void cargarBolilla(Integer bolilla) {
        //add(Objects.requireNonNull(bolilla, "Bolilla Nula"));
        Objects.requireNonNull(bolilla, "Bolillas Nula");
        this.add(bolilla);
    }
    
    public void cargarBolillas (Integer[] bolillas) {
         Objects.requireNonNull(bolillas, "Bolillas Nula");
         vaciarBolillero();
         for(Integer bolilla : bolillas) {
             cargarBolilla(bolilla);
         }
    }
    
    public boolean quedanBolilllas() {
        return !isEmpty();
    }
    
    
    
    public void vaciarBolillero() {
        clear();
    }
    
    public Integer extrearBolilla() {
          
          return remove(indiceAleatorio());
    }
    public Integer extraerBolillaRepo() {
       
       return get(indiceAleatorio());
    }
    private int indiceAleatorio() {
       return aleatorio.nextInt(cantidadBolillas());
    }
    
    public int cantidadBolillas() {
        return size();
    }
    
}
