/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchacontraelmal;


public class Corales extends Especie {
    private int profundidadCrecimiento;

    public Corales(int profundidadCrecimiento, String nombre, String tanque, TipoAgua tipoagua) {
        super(nombre, tanque, tipoagua);
        this.profundidadCrecimiento = profundidadCrecimiento;
    }
    
     
    @Override
    public String toString() {
        return super.toString() + " Profundidad de Crecimiento: " + profundidadCrecimiento;
    }
    
    
}
