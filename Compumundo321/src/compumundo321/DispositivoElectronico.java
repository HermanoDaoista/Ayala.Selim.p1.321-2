
package compumundo321;

import java.util.ArrayList;


public class DispositivoElectronico {
    private final String id;
    private final double precio;
    private TIpoDispositivo tipo;

    public DispositivoElectronico(String id, double precio, TIpoDispositivo tipo) {
        this.id = id;
        this.precio = precio;
        this.tipo = tipo;
    }
    
    public boolean esTipo(TIpoDispositivo tipo) {
        return this.tipo == tipo;
    }
    
     public boolean tieneId(String id) {
        return this.id.equals(id);
    }
     
     public TIpoDispositivo getTipo() {
         return tipo;
     }

    @Override
    public String toString() {
        return "DispositivoElectronico{" + "id=" + id + ", precio=" + precio + ", tipo=" + tipo + '}';
    }
    
    private String toTablerow() {
        return " | %-8s  | %-14s |%7.2f |\n".formatted(id, tipo, precio);
    }
    
    private static String getHeaderRow() {
        return " |     id    |      tipo      |  precio | \n";
    }
    
    
   public static String toTable(ArrayList<DispositivoElectronico> lista) {
        StringBuilder sb = new StringBuilder();
        String header = getHeaderRow();
        String separador = Utils.sepHorizontal(header.length() -1 );
        sb.append(separador);
        sb.append(header);
        sb.append(separador);
            for(DispositivoElectronico d : lista) {
                sb.append(d.toTablerow());
        }
        sb.append(separador);
        return sb.toString();
   }
   
   
            
        
        
    
    
    
    
}
