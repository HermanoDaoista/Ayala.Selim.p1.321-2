
package almacen321;

public interface GestionAlmacenables {
      
static <T> void mostrarContenido(Almacenable <T> a) {
    if(a.estaVacio()) {
                System.out.println("No hay elementos");
            }else{
                System.out.println("Contenido del almacen");
                for(T item : a) {
                    System.out.println(item);
                }
            }

    }
    
}
