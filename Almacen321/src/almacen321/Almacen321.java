/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package almacen321;

import java.util.Comparator;

/**
 *
 * @author rogel
 */
public class Almacen321 {

 public static void main(String[] args) {
        Almacenable<Producto> almacen = new Almacen<>();
almacen.agregar(new Producto(3, "Teclado", 25000, Tipo.ELECTRONICO));
almacen.agregar(new Producto(1, "Leche", 1500, Tipo.ALIMENTO));
almacen.agregar(new Producto(2, "Campera", 42000, Tipo.ROPA));
System.out.println("=== ORDEN NATURAL (por ID) ===");
((Almacen<Producto>) almacen).mostrarContenidoNatural();
// TODO: crear un comparador que ordene los productos por nombre(alfabeticamente)
System.out.println("--------------------------------------------------------------");
((Almacen<Producto>) almacen).forEach(System.out::println);
Comparator<Producto> compPorNombre = (p1, p2) -> p1.getNombre().compareTo(p2.getNombre());
System.out.println("--------------------------------------------------------------");

        
System.out.println("\n=== ORDEN POR NOMBRE ===");
((Almacen<Producto>) almacen).mostrarContenido(compPorNombre);
// TODO: crear un comparador que ordene los productos por precio en orden descendente

Comparator<Producto> compPorPrecioDesc = new Comparator<Producto>() {
            @Override
            public int compare(Producto o1, Producto o2) {
               return Double.compare(o2.getPrecio(), o1.getPrecio());
            }
};
System.out.println("\n=== ORDEN POR PRECIO DESCENDENTE ===");
((Almacen<Producto>) almacen).mostrarContenido(compPorPrecioDesc);
System.out.println("\n=== RECORRIDO CON FOR-EACH (orden natural) ===");
for (Producto p : almacen) {
System.out.println(" * " + p);
}
// ---- PRUEBAS ADICIONALES ----
System.out.println("\nTamano del almacen: " + almacen.tamanio());
System.out.println("Contiene producto con id=2: " +
almacen.contiene(new Producto(2, "Campera", 42000, Tipo.ROPA)));
System.out.println("Obtener producto en posicion 1: " + almacen.obtener(1));
System.out.println("\nEliminando producto con id=1...");
almacen.eliminar(new Producto(1, "Leche", 1500, Tipo.ALIMENTO));
((Almacen<Producto>) almacen).mostrarContenidoNatural();
System.out.println("\nEsta vacio: " + almacen.estaVacio());
almacen.limpiar();
System.out.println("Despues de limpiar:");
GestionAlmacenables.mostrarContenido(almacen);
 }

}
   

