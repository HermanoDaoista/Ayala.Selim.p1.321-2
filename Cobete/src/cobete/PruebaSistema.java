
package cobete;

import java.time.LocalDate;


public class PruebaSistema extends Prueba {
    private static final Evaluacion NIVEL_APROB = Evaluacion.ACEPTABLE;
    private Evaluacion evaluacion;

    public PruebaSistema(Evaluacion evaluacion, LocalDate fecha) {
        super(fecha);
        this.evaluacion = evaluacion;
    }
    
    @Override
    public boolean aprueba() {
       // return evaluacion.ordinal() >= NIVEL_APROB.ordinal();
       return evaluacion.compareTo(NIVEL_APROB) >=0;
    }
}
