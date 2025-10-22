
package cobete;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cohete implements Aprobable {
    private static final int INITIAL_ID = 30_000;
    private static final int nextID = INITIAL_ID;
    private int nro_id;
    private String nombre;
    private List<Aprobable> aprobable;

    public Cohete(int nro_id, String nombre) {
        this.nro_id = nro_id;
        this.nombre = nombre;
        this.aprobable = new ArrayList<>();
    }
    
    public void agregarPrueba(Aprobable prueba) {
        if(prueba == null) {
            throw new IllegalArgumentException();
        }
        aprobable.add(prueba);
    }
    
    
    @Override
    public boolean aprueba() {
        Iterator<Aprobable> it = aprobable.iterator();
        boolean aprobado = true;
        while(it.hasNext() && aprobado) {
            aprobado = it.next().aprueba();
        }
        return aprobado;
    }
    
    /*@Override
    public boolean aprueba() {
        for(Aprobable ap : aprobable) {
            if(!ap.aprueba()) {
                return false;
            }
        }
        return true;
    }*/
    
    
    
    
}
