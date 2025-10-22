
package gimnasio321;

import java.util.ArrayList;
import java.util.List;

public class gimnasio {
    private String nombre;
    private ArrayList<Entrenador> entrenadores;

    public gimnasio(String nombre) {
        this.nombre = nombre;
        entrenadores = new ArrayList<>();
    }
    
    public void agregarEntrenador(Entrenador e) {
        if(e==null) {
           throw new IllegalArgumentException("No hay entrenador ");
        }
        entrenadores.add(e);
    }
    
    public void mostrarSueldos() {
            for(Entrenador e : entrenadores) {
                System.out.println(e.toString());
            }
    }
    
    public Entrenador entrenadorConMasClientes() {
        Entrenador maxEntrenador = entrenadores.get(0);
        for(int i = 1; i < entrenadores.size(); i++) {
            Entrenador actual = entrenadores.get(i);
            if(actual.getCantClientes() > maxEntrenador.getCantClientes()) {
                maxEntrenador = actual;
            }
        }
        //System.out.println(maxEntrenador.toString());
        return maxEntrenador;
        
    }
         
         
    
 
     
    
}
