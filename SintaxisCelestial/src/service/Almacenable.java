/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author rogel
 */
public interface Almacenable<T extends CSVSerializable> {
        void agregar(T item);
    
    T obtener(int indice);
    
    void eliminar(int indice);
    
    List<T> filtrar(Predicate<T> predicate);
    
    void ordenar();
    
    void paraCadaElemento(Consumer<T> consumer);
}
