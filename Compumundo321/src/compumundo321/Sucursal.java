
package compumundo321;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

public class Sucursal {
    private String nombre;
    private ArrayList<DispositivoElectronico> dispositivos;

    public Sucursal(String nombre) {
        this.nombre = nombre;
        dispositivos = new ArrayList<>();
    }
    
    public boolean tieneNombre(String nombre) {
        return this.nombre.equals(nombre);
    }
    
    public void agregarDispositivo(DispositivoElectronico dispositivo) {
        if(dispositivo == null) {
            throw new IllegalArgumentException("Dispositivo invalido");
        }
        dispositivos.add(dispositivo);
    }
    
    public ArrayList<DispositivoElectronico> getDispositivos() {
        return new ArrayList<>(dispositivos);
    }
    
     public ArrayList<DispositivoElectronico> getDispositivos(TIpoDispositivo tipo) {
         ArrayList<DispositivoElectronico> toReturn = new ArrayList<>();
         for(DispositivoElectronico d : dispositivos) {
             if(d.esTipo(tipo)) {
                 toReturn.add(d);
             }
          }
          return toReturn;
    }
         
    
        @Override
    public boolean equals(Object o) {
       if(o == null || !(o instanceof Sucursal s) ) {
           return false;
       }
       return nombre.equals(s.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }
    
    public DispositivoElectronico borrarDispositivo(String idDispositivo) {
        int i = 0;
        DispositivoElectronico toReturn = null;
        boolean borrado = false;
        while(i < dispositivos.size() && !borrado ) {
            if((toReturn = dispositivos.get(i++)).tieneId(idDispositivo)) {
               borrado = dispositivos.remove(toReturn);
            }
        }
        return borrado ? toReturn : null;
    }
    
    public DispositivoElectronico borrarDispositivoIt(String idDispositivo) {
        Iterator<DispositivoElectronico> it = dispositivos.iterator();
        DispositivoElectronico toReturn = null;
        boolean borrado = false;
        while(it.hasNext() && !borrado) {
            toReturn = it.next();
            if(toReturn.tieneId(idDispositivo)) {
                it.remove();
                borrado = true;
            }
            
        }
        return borrado ? toReturn : null;
    }
    
    public double[ ] porcDispositivoPorTipo() {
         TIpoDispositivo[ ] tipos = TIpoDispositivo.values();
        double[] porcentajes = new double[tipos.length];
        int[ ] contadores = new int [tipos.length];
        
        for(DispositivoElectronico d : dispositivos) {
            contadores[d.getTipo().ordinal()]++;
        }
        for(int i = 0; i < tipos.length; i++) {
            porcentajes[i] = calcularPorcentaje(contadores[i]);
        }
        
        return porcentajes;
    }
    
    private double calcularPorcentaje(int cantidad) {
        return (double) cantidad * 100 / dispositivos.size() ;
    }
        
     
  /* public DispositivoElectronico borrarDispositivoIt(String idDispositivo) {
        Iterator<DispositivoElectronico> it = dispositivos.iterator();
        DispositivoElectronico toReturn = null;
        while(it.hasNext()) {
            DispositivoElectronico actual = it.next();
            if(actual.tieneId(idDispositivo)) {
                toReturn = actual;
                it.remove();
                
            }
        }   return toReturn;
   }*/
    
  /*public DispositivoElectronico borrarDispositivoIt(String idDispositivo) {
      for(DispositivoElectronico d : dispositivos) {
          if(d.tieneId(idDispositivo)) {
              dispositivos.remove(d);
              return d;
          }
      }
      return null;
  }  */
    
            
            



}

/*DispositivoElectronico toReturn = null;
        for(DispositivoElectronico d : dispositivos) {
            if(d.tieneId(idDispositivo)) {
                toReturn = d;
                dispositivos.remove(d);
                break;
            }
        }
        return toReturn;*/
    
    
    
    
    

