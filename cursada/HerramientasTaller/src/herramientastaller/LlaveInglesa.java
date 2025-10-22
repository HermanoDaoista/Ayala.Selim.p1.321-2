/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herramientastaller;

/**
 *
 * @author rogel
 */
public class LlaveInglesa extends Herramienta
{
    private TipoMaterial material;
    private boolean regulable;

    public LlaveInglesa(TipoMaterial material, boolean regulable, String marca, int peso) {
        super(marca, peso);
        this.material = material;
        this.regulable = regulable;
    }
    
    public String mostrarLlaveInglesa()
    {
        return "LLAVE INGLESA " + super.MostrarHerramienta() + " Material " + material + " Regulable: " +( regulable ? "SI" : "NO");
    }
}
