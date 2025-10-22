
package spacex;

import java.time.LocalDate;


public class PruebaSistema extends Prueba {

    private Evaluacion e;

    public PruebaSistema(Evaluacion e, Cohete cohete) {
        super(LocalDate.now(), cohete);
        this.e = e;
    }
    
    
    
    
    
    @Override
    public boolean iniciarPrueba() {
       return e != Evaluacion.DEFICIENTE;
    }
   
}
