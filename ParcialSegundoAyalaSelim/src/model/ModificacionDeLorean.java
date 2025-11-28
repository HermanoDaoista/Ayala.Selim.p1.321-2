
package model;

import java.io.Serializable;
import service.CSVSerializable;

public class ModificacionDeLorean implements Comparable<ModificacionDeLorean>, CSVSerializable, Serializable{
    private int id;
    private String nombre;
    private String responsable;
    private TipoModificacion tipo;

    public ModificacionDeLorean(int id, String nombre, String responsable, TipoModificacion tipo) {
        this.id = id;
        this.nombre = nombre;
        this.responsable = responsable;
        this.tipo = tipo;
    }
    
    public boolean esTipo(TipoModificacion tipo) {
        return this.tipo == tipo;
    }

    public String getNombre() {
        return nombre;
    }
    
    
    
    @Override
    public int compareTo(ModificacionDeLorean m) {
        return Integer.compare(id, m.id);
    }
    
    public static ModificacionDeLorean fromCSV(String ModiString) {
         if(ModiString.endsWith("\n")) {
            ModiString = ModiString.substring(0, ModiString.length() -1);
        }
        
        String[] valores = ModiString.split(",");
        
        if(valores.length == 4) {
            return new ModificacionDeLorean(Integer.parseInt(valores[0]), valores[1], valores[2], TipoModificacion.valueOf(valores[3]));
        }
        return null;
    }
    
    
    @Override
    public String toCSV() {
        return id + "," + nombre + "," + responsable + "," + tipo + "\n"; 
    }

    @Override
    public String toString() {
        return "ModificacionesDeLorean{" + "id=" + id + ", nombre=" + nombre + ", responsable=" + responsable + ", tipo=" + tipo + '}';
    }
    
    
    
}
