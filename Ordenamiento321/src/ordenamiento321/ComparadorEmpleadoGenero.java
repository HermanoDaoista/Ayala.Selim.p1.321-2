/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ordenamiento321;

import java.util.Comparator;

/**
 *
 * @author rogel
 */
public class ComparadorEmpleadoGenero implements Comparator<Empleado> {

    @Override
    public int compare(Empleado o1, Empleado o2) {
       return Character.compare(o1.getGenero(), o2.getGenero());
    }
    
}
