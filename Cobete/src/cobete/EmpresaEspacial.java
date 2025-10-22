package cobete;

import java.util.ArrayList;
import java.util.List;


public class EmpresaEspacial {
    private String nombre;
    private List<Cohete> listaCohetes;

    public EmpresaEspacial(String nombre) {
        this.nombre = nombre;
        this.listaCohetes = new ArrayList<>();
    }
    
    public int cantListosParaLanzar() {
        int cont = 0;
        for(Cohete ap : listaCohetes) {
            if(ap.aprueba()) {
                cont++;
            }
        }
        return cont;
    }
    
    public void agregarCohete(Cohete cohete) {
        if(cohete == null) {
            throw new IllegalArgumentException();
        }
        listaCohetes.add(cohete);
        
    }
    
    
    
    
}
