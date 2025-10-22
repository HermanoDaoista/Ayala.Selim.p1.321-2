
package gymbro;

import java.time.LocalDate;
import java.time.Period;

public class EntrenadorEquipo extends Entrenador{
    private double sueldoFijo;
    public static final double CANT_1 = 0.04;
    public static final double CANT_2 = 0.12;
    public static final int ANT_1 = 3;
    public static final int ANT_2 = 6;

    public EntrenadorEquipo( int legajo, String nombre, String apellido, LocalDate anioIngreso, double sueldoFijo) {
        super(legajo, nombre, apellido, anioIngreso);
        this.sueldoFijo = sueldoFijo;
    }
    
    public int getAntiguedad() {
        return Period.between(getAnioIngreso(), LocalDate.now()).getYears();
    }
    
    private double calcularPorcentajeAumento() {
        double pocentaje = 0;
        int antiguedad = getAntiguedad();
        if(antiguedad >= ANT_2) {
            pocentaje = CANT_2;
        }else if(antiguedad >= ANT_1) {
            pocentaje = CANT_1;
        }
        return pocentaje;
    }
    
    private double getSueldoConAumento(double pocentaje) {
        return sueldoFijo * (1 + pocentaje);
    }
    
   @Override
    public double calcularSueldo() {
        return getSueldoConAumento(calcularPorcentajeAumento());
        
    }
    
    
    
    
}
