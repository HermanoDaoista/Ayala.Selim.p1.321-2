
package almacen321;

import java.util.ArrayList;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Almacen <T extends Comparable> implements Almacenable<T>, Iterable<T>{
    private final List<T> items = new ArrayList<>();

    @Override
    public List<T> filtrar(Predicate<? super T> criterio) {
        List<T> copia = new ArrayList<>();
        for(T item : items) {
            if(criterio.test(item)) {
                copia.add(item);
            }
        }
        return copia;
        
    }

    @Override
    public void paraCadaElemento(Consumer<? super T> accion) {
        for(T item : items) {
            accion.accept(item);
        }
    }
    
    @Override
    public void limpiar() {
        items.clear();
    }

    @Override
    public void agregar(T item) {
        Objects.requireNonNull(item, "Elemento nulo");
        items.add(item);
    }

    @Override
    public boolean eliminar(T item) {
      return items.remove(item);
    }

    @Override
    public boolean contiene(T item) {
              return items.contains(item);

    }
    
    private void validarIndice(int indice) {
        if(indice < 0 || indice >= tamanio()) {
            throw new IndexOutOfBoundsException("indice fuera de rango");
        }
        
    }
    
    

    @Override
    public T obtener(int indice) {
        validarIndice(indice);
        return items.get(indice);
    }

    @Override
    public int tamanio() {
        return items.size();
    }

   
    //agregado a mano
    /*@Override
    public Iterator<T> iterator() {
      return  new ArrayList<> (items).iterator();
    }*/
    
    //agregado con iterable
    
    @Override
    public Iterator<T> iterator() {
        if(!items.isEmpty() && items.get(0) instanceof Comparable){
            return iteratorNatural();
        }
    return items.iterator();
    }
    
    public Iterator<T> iterator(Comparator<? super T> comparador) {
        List<T> copia = new ArrayList<>(items);
        copia.sort(comparador);
        return copia.iterator();
    }

   private Iterator<T> iteratorNatural() {
        List<T> copia = new ArrayList<>(items);
        copia.sort(null);
        return copia.iterator();
        
    }
    
    public void mostrarContenidoNatural() {
        mostrarContenido(null);
    }
    
    public void mostrarContenido(Comparator<T> comp) {
     Iterator<T> it = iterator(comp);
     while(it.hasNext()) {
         System.out.println(it.next());
     }
        
    }
    
        //Transformacion de la deidad
    
    @Override
    public List<T> transformar(Function<? super T, ? extends T> transformacion) {
        List<T> copia = new ArrayList<>();
        for(T item : items) {
            copia.add(transformacion.apply(item));
        }
        return copia;
        
    }
    
    
    
}
