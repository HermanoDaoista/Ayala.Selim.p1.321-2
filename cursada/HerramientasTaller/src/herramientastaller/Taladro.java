/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientastaller;
/**
 *
 * @author rogel
 */
public class Taladro extends Herramienta 
{
    private int rpm;
    private boolean inalambrico;

    public Taladro(int rpm, boolean inalambrico, String marca, int peso) {
        super(marca, peso);
        this.rpm = rpm;
        this.inalambrico = inalambrico;
    }
    
    
    public String mostrarTaladro()
    {
        return "TALADRO " + super.MostrarHerramienta() + " RPM " + rpm + " Inalambrico: " + (inalambrico ? "SI" : "NO"); 
    }
}
