/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class InventarioDeModificaciones<T extends CSVSerializable> implements Inventariable<T>{
    
    List<T> items = new ArrayList<>();

    @Override
    public void agregar(T item) {
          if(item== null) {
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
    

    @Override
    public void guardarEnArchivo(String path) {
        try(ObjectOutputStream serializador = new ObjectOutputStream(new FileOutputStream(path))) {
            serializador.writeObject(items);
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    @Override
    public void cargarDesdeArchivo(String path) {
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream(path))){
        
           
           items = (List<T>) input.readObject();
            
        } catch (IOException | ClassNotFoundException ex) {
            
            System.out.println(ex.getMessage());
        }
        
       

    }

    @Override
    public void guardarEnCSV(String path) {
         File archivo = new File(path);
        
        try {
            if (archivo.exists()) {
                System.out.println("El archivo ya existe");        
            }
            else{
                archivo.createNewFile();
            }

        } catch (IOException ex) {
            
            System.out.println("Ocurrio un error al crear el archivo");
            
        }
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            
            bw.write("id,nombre,responsable,tipo\n");
            for (T item : items){
                 bw.write(item.toCSV() + "\n");
            }
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    @Override
    public void cargarDesdeCSV(String path, Function<String, T> funcion) {
                items.clear();
        try ( BufferedReader bf = new BufferedReader(new FileReader(path))){
            
            String linea;
            
            bf.readLine();
            
            while((linea = bf.readLine()) != null){
                
                items.add(funcion.apply(linea));
                
                
            }
            
           
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        } 
    }
    
    
    
}
