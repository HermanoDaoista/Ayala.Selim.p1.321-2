
package interfaces321;

public class Interfaces321 {


    public static void main(String[] args) {
        
        Mosquito mos = new Mosquito("zancudo", 3, 'f');
        Avion a = new Avion("cesna", "ASE321", 100, 0);
        Superman s = new Superman("superman", "selim", "susaku");
        mos.picar();
        mos.zumbar();
        mos.volar();
        s.volar();
        s.pasarDesapercibido();
        a.volar();
        System.out.println(a.getPasajeros());
        a.realizarMantenimiento();
        
    }
    
    public static void hacerVolar(Object x) {
        
        
    }
    
    
    
}
