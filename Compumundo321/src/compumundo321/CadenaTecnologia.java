/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compumundo321;

import java.util.ArrayList;


public class CadenaTecnologia {
    
    private final ArrayList<Sucursal> sucursales = new ArrayList<>();
    
    public void agregarSucursal(Sucursal sucursal) {
        if(sucursal == null || sucursales.contains(sucursal)) {
            throw new SucursalRepetidoException("Error sucursal repetido");
        }
        sucursales.add(sucursal); 
    }
    
    public ArrayList<DispositivoElectronico> getDispositivos() {
        ArrayList<DispositivoElectronico> listaSucursales = new ArrayList<>();
        for(Sucursal s : sucursales) {
            listaSucursales.addAll(s.getDispositivos());
            }
            return listaSucursales;
        }
    
     public ArrayList<DispositivoElectronico> getDispositivos(TIpoDispositivo tipobuscado) {
        ArrayList<DispositivoElectronico> listaSucursales = new ArrayList<>();
        for(Sucursal s : sucursales) {
            listaSucursales.addAll(s.getDispositivos(tipobuscado) );
            }
            return listaSucursales;
        }
    
    
    public String getTablaDispositivos() {
         return DispositivoElectronico.toTable(getDispositivos());
        
        
    }
    private Sucursal buscarSucursal(String nombre) {
         for(Sucursal s : sucursales) {
             if(s.tieneNombre(nombre)) {
                 return s;
         }
    }
     return null;
}  
        
            
    public DispositivoElectronico borrarDispositivo(String nombreSucursal, String idDispositivo) throws SucursalInexistenteChequeada{
        Sucursal s = buscarSucursal(nombreSucursal);
        if(s == null) {
            throw new SucursalInexistenteChequeada("Sucursal inexistente");
        }
        return s.borrarDispositivoIt(idDispositivo);
    }
    
    public double[ ] porcDispositivoPorTipo(String nombreSucursal)throws SucursalInexistenteChequeada{
         Sucursal s = buscarSucursal(nombreSucursal);
        if(s == null) {
            throw new SucursalInexistenteChequeada("Sucursal inexistente");
        }
        return s.porcDispositivoPorTipo();
    }
        
    
    
    
}
