
package spacex;

import java.util.ArrayList;


public class Cohete implements Lanzable {
    private int nro_id;
    private String nombre;
    private ArrayList<Prueba> prueba;

    public Cohete(int nro_id, String nombre) {
        this.nro_id = nro_id;
        this.nombre = nombre;
        this.prueba = new ArrayList<>();
    }
    
    public void agregarPrueba(Prueba p) {
        if(p == null) {
            throw new IllegalArgumentException("Error-Prueba nula");
        }
        prueba.add(p);
    }
    
    @Override
    public boolean listoParaLanzar() {
        for(Prueba p : prueba) {
            if(!p.iniciarPrueba()) {
                return false;
            }
        }
        return true;
    }
    
    @Override
    
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cohete: ").append(nombre).append(" Modelo: ").append(nro_id);
        sb.append("\n");
        return sb.toString();
    }
    
    
    
    
    
}
