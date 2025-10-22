
package cobete;

import java.time.LocalDate;


public abstract class Prueba implements Aprobable {
    private LocalDate fecha;

    public Prueba(LocalDate fecha) {
        this.fecha = fecha;
    }
    
    
}
