/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacen321;

import java.util.List;

/**
 *
 * @author rogel
 */
public class Almacen_Parte_Tres {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
Almacenable<Producto> almacen = new Almacen<>();
almacen.agregar(new Producto(1, "Leche", 1500, Tipo.ALIMENTO));
almacen.agregar(new Producto(2, "Celular", 250000,
Tipo.ELECTRONICO));
almacen.agregar(new Producto(3, "Campera", 42000, Tipo.ROPA));
almacen.agregar(new Producto(4, "Pan", 900, Tipo.ALIMENTO));
almacen.agregar(new Producto(5, "Televisor", 380000,
Tipo.ELECTRONICO));
almacen.agregar(new Producto(6, "Queso", 3200, Tipo.ALIMENTO));
almacen.agregar(new Producto(7, "Zapatillas", 86000, Tipo.ROPA));
almacen.agregar(new Producto(8, "Notebook", 950000,
Tipo.ELECTRONICO));
almacen.agregar(new Producto(9, "Galletitas", 1200, Tipo.ALIMENTO));
almacen.agregar(new Producto(10, "Bufanda", 8000, Tipo.ROPA));
System.out.println("=== Contenido inicial ===");
GestionAlmacenables.mostrarContenido(almacen);
System.out.println("\n=== Filtrar elementos ===");
List<Producto> filtrados = almacen.filtrar(p-> p.getPrecio() > 300000);
for (Producto p : filtrados) {
System.out.println(" - " + p);
}

System.out.println("\n=== Aplicar accion ===");
almacen.paraCadaElemento(p -> {if(p.esTipo(Tipo.ROPA)) {p.aumentarPrecio(5);}});
System.out.println("\n=== Transformar elementos ===");
List<Producto> transformados = almacen.transformar(p->{
    Producto copia = new Producto(
            p.getId(), 
            p.getNombre(),
            p.getPrecio(),
            p.getTipo());
    
if(copia.esTipo(Tipo.ALIMENTO)) {
    copia.aumentarPrecio(10);
}
return copia;
});
for (Producto p : transformados) {
System.out.println(" - " + p);
}
System.out.println("\n=== Contenido original ===");
GestionAlmacenables.mostrarContenido(almacen);
   }
}
