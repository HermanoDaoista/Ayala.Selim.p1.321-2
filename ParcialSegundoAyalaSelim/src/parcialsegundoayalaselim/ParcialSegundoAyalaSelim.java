/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialsegundoayalaselim;

import config.RutasArchivos;
import java.io.IOException;
import model.ModificacionDeLorean;
import model.TipoModificacion;
import service.InventarioDeModificaciones;
import config.RutasArchivos;

/**
 *
 * @author rogel
 */
public class ParcialSegundoAyalaSelim {

    
    public static void main(String[] args) {
        
        try{
 InventarioDeModificaciones<ModificacionDeLorean> inv = new InventarioDeModificaciones<>();
inv.agregar(new ModificacionDeLorean(1, "Flux Capacitor Mk1", "Doc Brown",
TipoModificacion.TIEMPO));
inv.agregar(new ModificacionDeLorean(2, "Mr. Fusion", "Doc Brown",
TipoModificacion.ENERGIA));
inv.agregar(new ModificacionDeLorean(3, "Hover Conversion", "Los Libios",
TipoModificacion.CONVERSION_HOVER));
inv.agregar(new ModificacionDeLorean(4, "Temporal Circuit V3", "ClaraClayton", TipoModificacion.TIEMPO));
inv.agregar(new ModificacionDeLorean(5, "Shield Upgrade", "Marty McFly",TipoModificacion.SEGURIDAD));
System.out.println("Modificaciones del DeLorean:");
inv.paraCadaElemento(a->System.out.println(a));
System.out.println("\nModificaciones tipo TIEMPO:");
inv.filtrar(a-> a.esTipo(TipoModificacion.TIEMPO)).forEach(a->System.out.println(a));
System.out.println("\nModificaciones que contienen 'hover':");
inv.filtrar(a-> a.getNombre().contains("Hover")).forEach(a->System.out.println(a));
System.out.println("\nModificaciones ordenadas por ID:");
inv.ordenar();
inv.paraCadaElemento(a->System.out.println(a));
System.out.println("\nModificaciones ordenadas por nombre:");
inv.ordenar((a1,a2)->a1.getNombre().compareTo(a2.getNombre()));
inv.guardarEnArchivo(RutasArchivos.getRutaBINString());
InventarioDeModificaciones<ModificacionDeLorean> cargado = new
InventarioDeModificaciones<>();
cargado.cargarDesdeArchivo(RutasArchivos.getRutaBINString());
System.out.println("\nModificaciones cargadas desde archivo binario:");
cargado.paraCadaElemento(a->System.out.println(a));
inv.guardarEnCSV(RutasArchivos.getRutaCSVString());
cargado.cargarDesdeCSV(RutasArchivos.getRutaCSVString(), linea-> ModificacionDeLorean.fromCSV(linea));
System.out.println("\nModificaciones cargadas desde archivo CSV:");
cargado.paraCadaElemento(a->System.out.println(a));
} catch ( NullPointerException | IndexOutOfBoundsException e) {
System.err.println("Error: " + e.getMessage());
    }
   }
}