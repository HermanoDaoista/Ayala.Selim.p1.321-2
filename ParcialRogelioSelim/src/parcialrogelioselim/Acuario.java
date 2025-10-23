
package parcialrogelioselim;

import java.util.ArrayList;
import java.util.List;

public class Acuario {
  private String nombre;
  private final List<Especie> listaEspecies;

    public Acuario(String nombre) {
        this.nombre = nombre;
        listaEspecies = new ArrayList<>();
    }
    
    private void verificarRepetida(Especie especie) {
        if(listaEspecies.contains(especie)) {
            throw new ErrorEspecieRepetidaException();
        }
    }
    
    public void agregarEspecie(Especie especie) {
        if(especie == null) {
            throw new IllegalArgumentException();
        }
        verificarRepetida(especie);
        listaEspecies.add(especie);
    }
    
    public void mostrarEspecie() {
        for(Especie e : listaEspecies) {
            System.out.println(e.toString());
        }
    }
    
    
    
    public void realizarFuncionesBiologicas() {
        for(Especie e : listaEspecies) {
            if(e instanceof  Alimentable a) {
            a.alimentar();
            }
            e.respirar();
        }
                
    }        
        
        
     
    
    public void filtrarPorTipoAgua(TipoAgua tipo) {
        for(Especie e : listaEspecies) {
            if(e.getTipo() == tipo) {
                 System.out.println(e.toString());
            }
        }
    }
    
    public void moverEspecies() {
        for(Especie e : listaEspecies) {
            if(e instanceof Movible m) {
                m.mover();
            }else{
                System.out.println("Esta especie que no puede ser reubicada por ser sesil");
            }
        }
    }
    
}
