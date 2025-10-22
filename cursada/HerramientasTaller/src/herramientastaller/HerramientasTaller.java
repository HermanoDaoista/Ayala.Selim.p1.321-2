/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package herramientastaller;

/**
 *
 * @author rogel
 */
public class HerramientasTaller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Taladro t1 = new Taladro(1000, true, "ACME", 3);
        Taladro t2 = new Taladro(4000, false, "Marolio", 6);
        Taladro t3 = new Taladro(15000, true, "OCB", 9);
        Taladro t4 = new Taladro(1800, false, "THC",13);
        Taladro t5 = new Taladro(980, true, "Adidas", 23);
        LlaveInglesa l1 = new LlaveInglesa(TipoMaterial.ACERO, true, "Neko", 2);
        LlaveInglesa l2 = new LlaveInglesa(TipoMaterial.CROMO_VANADIO, true, "Fanacoa", 4);
        LlaveInglesa l3 = new LlaveInglesa(TipoMaterial.ALUMINIO, true, "Gallo", 1);
        LlaveInglesa l4 = new LlaveInglesa(TipoMaterial.TITANIO, true, "Sanata", 4);
        LlaveInglesa l5 = new LlaveInglesa(TipoMaterial.FIBRA_CARBONO, false, "Ferrte", 5);
        LlaveInglesa l6 = new LlaveInglesa(TipoMaterial.FIBRA_CARBONO, false, "Ferrte", 5);
        
        Taller taller = new Taller();
        
        taller.agregarHerramienta(t1);
        taller.agregarHerramienta(t2);
        taller.agregarHerramienta(t3);
        taller.agregarHerramienta(l1);
        taller.agregarHerramienta(l2);
        taller.agregarHerramienta(l3);
        taller.agregarHerramienta(l4);
        taller.agregarHerramienta(l5);
        taller.agregarHerramienta(t4);
        taller.agregarHerramienta(t5);
        //taller.agregarHerramienta(l6);
        System.out.println("Stock actual de herrmaientas: " + taller.cantidadDeherramienta());
        System.out.println(taller.mostrarHerramientas());
    }
    
}
