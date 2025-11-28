/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 *
 * @author rogel
 */
public interface Inventariable<T extends CSVSerializable> {
     void agregar(T item);
    
    T obtener(int indice);
    
    void eliminar(int indice);
    
    List<T> filtrar(Predicate<T> predicate);
    
    void ordenar();
    
    void paraCadaElemento(Consumer<T> consumer);
    
    void guardarEnArchivo(String path);
    
    void cargarDesdeArchivo(String path);
    
    void guardarEnCSV(String path);
    
    void cargarDesdeCSV(String path, Function<String, T> funcion);
}
