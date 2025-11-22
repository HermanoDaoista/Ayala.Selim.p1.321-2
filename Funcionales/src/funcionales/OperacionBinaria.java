
package funcionales;

@FunctionalInterface
public interface OperacionBinaria <T> extends OperacionBinariaPro<T, T>{
    
        @Override
        T operar(T o1, T o2);
    
    
}
