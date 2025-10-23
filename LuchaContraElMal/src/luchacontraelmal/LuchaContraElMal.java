/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luchacontraelmal;

public class LuchaContraElMal {

    
    public static void main(String[] args) {
        Acuario ac = new Acuario("SirenoMan");
        Peces p = new Peces(4, "pacu", "tanque1", TipoAgua.AGUA_DULCE);
        Peces p2 = new Peces(5, "pacu", "tanque1", TipoAgua.AGUA_SALADA);
        Moluscos m = new Moluscos("Acero", "patricio", "tanque2", TipoAgua.AGUA_DULCE);
        Corales c = new Corales(500, "rock", "tanque4", TipoAgua.AGUA_SALADA);
        try{
        ac.agregarEspecie(p);
        ac.agregarEspecie(c);
        ac.agregarEspecie(m);
        ac.agregarEspecie(p2);
        }catch(ErrorNombreRepetido ex) {
            System.out.println(ex.getMessage());
        }
        
        ac.alimentarEspecies();
        ac.mostrarEspecie();
        ac.filtrarPorTipoAgua(TipoAgua.AGUA_SALADA);
        
    }
    
}
