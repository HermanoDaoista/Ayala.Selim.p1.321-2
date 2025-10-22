
package cobete;

import java.time.LocalDate;

public class Cobete {


    public static void main(String[] args) {
        
        EmpresaEspacial spacex = new EmpresaEspacial("Rocket");
        
        Cohete c1 = new Cohete(92176, "pedrin");
        Cohete c2 = new Cohete(23436, "juancin");
        Cohete c3 = new Cohete(74336, "fulanin");
        
        PruebaPropulsion p1 = new PruebaPropulsion(80, 8, LocalDate.EPOCH);
        PruebaSistema p2 = new PruebaSistema(Evaluacion.EXCELENTE, LocalDate.EPOCH);
        
        c1.agregarPrueba(p1);
        c1.agregarPrueba(p2);
        c2.agregarPrueba(p1);
        c2.agregarPrueba(p2);
        c3.agregarPrueba(p1);
        c3.agregarPrueba(p2);
        
        spacex.agregarCohete(c1);
        spacex.agregarCohete(c2);
        spacex.agregarCohete(c3);
        
        System.out.println(spacex.cantListosParaLanzar());
        
        
        
    }
    
}
