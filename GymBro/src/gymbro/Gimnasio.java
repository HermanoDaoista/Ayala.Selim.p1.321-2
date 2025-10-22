
package gymbro;

import java.util.ArrayList;
import java.util.List;


public class Gimnasio {
    private String nombre;
    private List<Entrenador> entrenadores;

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        entrenadores = new ArrayList<>();
    }
    
    public void agregarEntrenador(Entrenador e) {
        if(e == null) {
            throw new IllegalArgumentException("entrenador nulo");
        }
        entrenadores.add(e);
    }
    
    
    public Entrenador entrenadorConMasClientes() {
       PersonalTrainer max = null;
       
       for(Entrenador e : entrenadores) {
           if(e instanceof PersonalTrainer p) {
               if(max == null || p.getCantClientes() > max.getCantClientes()) {
                   max = p;               }
           }
       }
       return max;
    }            

                
        
    
    
    public void mostrarSueldos() {
        StringBuilder sb = new StringBuilder();
        sb.append(Utils.getHeaderTable());
        sb.append(Utils.obtenerSepHorizontal(40));
        for(Entrenador e : entrenadores) {
            sb.append(e.mostrarSueldo());
        }
        sb.append(Utils.obtenerSepHorizontal(40));
        System.out.println(sb.toString());
        
    }
    
    
    
}
