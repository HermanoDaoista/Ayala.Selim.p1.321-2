
package spacex;

import java.time.LocalDate;

public class PruebaPropulsion extends Prueba{
    private int duracion;
    private int puntaje;

    public PruebaPropulsion( LocalDate fecha, Cohete cohete, int duracion, int puntaje) {
        super(fecha, cohete);
        this.duracion = duracion;
        this.puntaje = puntaje;
    }
    
    


    @Override
    public boolean iniciarPrueba() {
            return duracion < 90 && puntaje > 5;
    }
}