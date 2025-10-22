
package spacex;

import java.time.LocalDate;


public abstract class Prueba {
    private LocalDate fecha;
    private Cohete cohete;

    public Prueba(LocalDate fecha, Cohete cohete) {
        this.fecha = fecha;
        this.cohete = cohete;
    }
    
    public abstract boolean iniciarPrueba();
    
    
    
}
