
package bolillero321;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Random;

public class BolilleroAleatorio <T> implements Bolillero<T>{
    
    private final Random aleatorio;
    private final List<T> bolillas;
    
    public BolilleroAleatorio() {
        aleatorio = new Random();
        bolillas  = new ArrayList<>();
    } 
    
    @Override
    public void cargarBolilla(T bolilla) {
        //add(Objects.requireNonNull(bolilla, "Bolilla Nula"));
        Objects.requireNonNull(bolilla, "Bolillas Nula");
        bolillas.add(bolilla);
    }
    
    
    
    
    @Override
    public boolean quedanBolilllas() {
        return !(bolillas.isEmpty());
    }
    
    
    
    @Override
    public void vaciarBolillero() {
        bolillas.clear();
    }
    
    @Override
    public T extrearBolilla() {
          checkVacio();
          esperarUnSegundo();
          return bolillas.remove(indiceAleatorio());
    }
    
    private void checkVacio() {
        if(!quedanBolilllas()) {
            throw new NoSuchElementException("No quedan bolillas");
        }
    }
    @Override
    public T extraerBolillaRepo() {
       checkVacio();
       esperarUnSegundo();
       return bolillas.get(indiceAleatorio());
    }
    private int indiceAleatorio() {
       return aleatorio.nextInt(cantidadBolillas());
    }
    
    @Override
    public int cantidadBolillas() {
        return bolillas.size();
    }    
    
    private void esperarUnSegundo() {
        int segundo = 500;
        try {
            Thread.sleep(segundo);
        }catch(InterruptedException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
