/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import service.Almacenable;
import service.CSVSerializable;


public class Zoologico<T extends CSVSerializable> implements Almacenable<T> {
    
    List<T> items = new ArrayList<>();
    
    public List<T> getItems() {
    return items;
}

    @Override
    public void agregar(T item) {
        if(item == null) {
            throw new NullPointerException();
        }
        items.add(item);
    }
    
    private void validarIndice(int indice) {
        if(indice < 0 || indice > items.size()) {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public T obtener(int indice) {
        validarIndice(indice);
        return items.get(indice);
    }

    @Override
    public void eliminar(int indice) {
        validarIndice(indice);
        items.remove(indice);
    }

    @Override
    public List<T> filtrar(Predicate<T> predicate) {
        List<T> toReturn = new ArrayList<>();
        for(T t : items) {
            if(predicate.test(t)) {
                toReturn.add(t);
            }
        }
        return toReturn;
    }

    @Override
    public void ordenar() {
       ordenar((Comparator<T>) Comparator.naturalOrder());
    }
    
    
    public void ordenar(Comparator<T> comparador) {
       items.sort(comparador);
    }

    @Override
    public void paraCadaElemento(Consumer<T> consumer) {
      for(T item : items) {
          consumer.accept(item);
      }
    }
    
}
