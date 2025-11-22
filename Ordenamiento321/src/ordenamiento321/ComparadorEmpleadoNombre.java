
package ordenamiento321;

import java.util.Comparator;


public class ComparadorEmpleadoNombre implements Comparator<Empleado>{

    @Override
    public int compare(Empleado o1, Empleado o2) {
       return o1.getNombre().compareTo(o2.getNombre());
    }
    
    
    
}
