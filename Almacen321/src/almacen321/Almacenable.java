
package almacen321;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public interface Almacenable<T> extends Iterable<T>{
    
    void agregar(T item);
    
    boolean eliminar(T item);
    
    boolean contiene(T item);
    
    T obtener(int indice);
    
    int tamanio();
    
    void limpiar();
    
    default boolean estaVacio() {
        return tamanio() ==0;
    }
    
    //aplicacio de accion a elementos
    
    List<T> filtrar(Predicate<? super T> criterio);
    
    void paraCadaElemento(Consumer<? super T> accion);
    
     List<T> transformar(Function<? super T, ? extends T> transformacion);

    
    
    
    /*static void mostrarContenido(Almacenable <T> A) {
        if(estaVacio()) {
            System.out.println("No hay elementos");
        }else{
            System.out.println("Contenido del almacen");
            for(T item : this) {
                System.out.println(item);
            }
        }
                
    }*/
}
