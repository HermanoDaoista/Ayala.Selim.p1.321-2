/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialrogelioselim;

/**
 *
 * @author rogel
 */
public class ParcialRogelioSelim {

    
    public static void main(String[] args) {
        Acuario ac = new Acuario("SirenoMan");
        cargarAcuario(ac);
        
        
        ac.realizarFuncionesBiologicas();
        System.out.println(Utils.obtenerSepHorizontal(40));
        ac.filtrarPorTipoAgua(TipoAgua.AGUA_SALADA);
        System.out.println(Utils.obtenerSepHorizontal(40));
        ac.mostrarEspecie();
        System.out.println(Utils.obtenerSepHorizontal(40));
        ac.moverEspecies();
        System.out.println(Utils.obtenerSepHorizontal(40));
        
        
    }
    
    public static void cargarAcuario(Acuario ac) {
        Pez p1 = new Pez(30, "Pez Payaso", "Tanque Norte", TipoAgua.AGUA_DULCE);
        //Pez p2 = new Pez(40, "Pez Payaso", "Tanque Norte", TipoAgua.AGUA_DULCE);
        Pez p3 = new Pez(50, "Tararira", "Tanque Este", TipoAgua.AGUA_SALADA);
        Molusco m1 = new Molusco("Espiralada", "Almeja", "Tanque Sur", TipoAgua.AGUA_DULCE);
        Molusco m2 = new Molusco("Bivalba", "Krill", "Tanque Norte", TipoAgua.AGUA_DULCE);
        Molusco m3 = new Molusco("Espiralada", "Abalon", "Tanque Sur", TipoAgua.AGUA_SALADA);
        Coral c1 = new Coral(100, "Acropora", "Tanque Oeste", TipoAgua.AGUA_SALADA);
        Coral c2 = new Coral(130, "Corallium", "Tanque Oeste", TipoAgua.AGUA_SALADA);
        Coral c3 = new Coral(140, "Fungia", "Tanque Oeste", TipoAgua.AGUA_SALADA);
        try{
        ac.agregarEspecie(p1);
        //ac.agregarEspecie(p2);
        ac.agregarEspecie(p3);
        ac.agregarEspecie(m1);
        ac.agregarEspecie(m2);
        ac.agregarEspecie(m3);
        ac.agregarEspecie(c1);
        ac.agregarEspecie(c2);
        ac.agregarEspecie(c3);
        }catch(ErrorEspecieRepetidaException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
    
}
