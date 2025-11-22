
package ordenamiento321;

import java.util.Comparator;


public class ComparadorGeneroSueldo  implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
       int cmp = Character.compare(o1.getGenero(), o2.getGenero());
       if(cmp == 0) {
           cmp = Double.compare(o1.getSueldo(), o2.getSueldo());
       }
       return cmp;
    }
}