/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package spacex;

import java.time.LocalDate;

public class SpaceX {


    public static void main(String[] args) {
        
        EmpresaEspacial es = new EmpresaEspacial();
        
        
        Cohete c1 = new Cohete(91, "WangLin");
        PruebaPropulsion p1 = new PruebaPropulsion(LocalDate.EPOCH, c1,    80, 9);
        PruebaSistema p2 = new PruebaSistema(Evaluacion.ACEPTABLE, c1);
        c1.agregarPrueba(p1);
        c1.agregarPrueba(p2);
        
        Cohete c2 = new Cohete(87, "XuQing");
        PruebaPropulsion z1 = new PruebaPropulsion(LocalDate.EPOCH, c2,    80, 7);
        PruebaSistema z2 = new PruebaSistema(Evaluacion.ACEPTABLE, c2);
        c2.agregarPrueba(z1);
        c2.agregarPrueba(z2);
        
        
        es.agregarCohetes(c1);
        es.agregarCohetes(c2);
        
        for(Cohete x : es.cantListoParaLanzarImpreso()) {
            System.out.println(x.toString());
        }
        
        
        
        
        
    }
    
    
    
    
}
