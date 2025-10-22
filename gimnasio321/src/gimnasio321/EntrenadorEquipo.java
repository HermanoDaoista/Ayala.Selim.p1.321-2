
package gimnasio321;

import java.time.LocalDate;
import java.time.Period;

public class EntrenadorEquipo extends Entrenador{
    private static final double PORC_1 = 0.04;
    private static final double PORC_2 = 0.12;
    private static final int ANT_1 = 3;
    private static final int ANT_2 = 6;
    private double sueldofijo;

    public EntrenadorEquipo(double sueldofijo, int legajp, String nombre, String apellido, LocalDate fechaIngreso) {
        super(legajp, nombre, apellido, fechaIngreso);
        this.sueldofijo = sueldofijo;
    }
    
    private int calcularAntiguedad() {
        Period p = Period.between(getIngreso(), LocalDate.now());
        return p.getDays();
    }
    
    @Override
    public double calcularSueldo() {
        double porcentaje = 0;
        int ant = calcularAntiguedad();
        if(ant > ANT_2) {
            porcentaje = PORC_2;
        }else if(ant > ANT_1) {
            porcentaje = ANT_1;
        }
        return sueldofijo + (sueldofijo * porcentaje);
      }
    
    
    @Override
   public int getCantClientes() {
       int clientes = 0;
       return clientes;
   }
    
    
            
}
