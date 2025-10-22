
package spacex;

import java.util.ArrayList;


public class EmpresaEspacial {
   private ArrayList<Cohete> cohetes = new ArrayList<>();
   
   
   public void agregarCohetes(Cohete c) {
       if(c==null) {
           throw new IllegalArgumentException("Error-Cohete nulo");
       }
       cohetes.add(c);
   }
   
   public int cantListoParaLanzar() {
       int contador = 0;
       for(Cohete c : cohetes) {
           if(c.listoParaLanzar()) {
               contador++;
                }
        }
        return contador;
    }
   
   public ArrayList<Cohete> cantListoParaLanzarImpreso() {
       ArrayList<Cohete> lanzables = new ArrayList<>();
       for(Cohete c : cohetes) {
           if(c.listoParaLanzar()) {
               lanzables.add(c);
                }
        }
        return lanzables;
    }
   
  
   
}