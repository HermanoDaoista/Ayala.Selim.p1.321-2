
package cobete;

import java.time.LocalDate;


public class PruebaPropulsion extends Prueba {
    private int duracion;
    private int puntaje;
    private static final int NOTA_MIN = 0;
    private static final int  NOTA_MAX = 10;
    private static final int NOTA_APROBACION = 6;
    private static final int  LIMITE_DURACION = 90;
    

    public PruebaPropulsion(int duracion, int puntaje, LocalDate fecha) {
        super(fecha);
        this.duracion = duracion;
        this.puntaje = puntaje;
    }
    
    @Override
    public boolean aprueba() {
        return puntaje >= NOTA_APROBACION && duracion <= LIMITE_DURACION; 
    }
    
    
    
    
    
}
