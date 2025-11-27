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
import java.util.function.Predicate;
import model.Animal;
import model.TipoAilmentacion;

/**
 *
 * @author rogel
 * @param <T>
 */
public class Zoologico <T extends Animal>{
    List<T> items = new ArrayList<>();
    
    public void agregar(T a) {
        if(a==null) {
            throw new NullPointerException();
        }
        if(a instanceof CSVSerializable) {
            items.add(a);
        }
    }
    
    public T obtenerAnimal(int indice) {
        validarIndice(indice);
        return items.get(indice);
    }
    
    private void validarIndice(int indice) {
        if(indice < 0 || indice >= items.size()) {
            throw new IndexOutOfBoundsException("indice invalido");
        }
    }
    
    public void eliminarAnimal(int indice) {
        validarIndice(indice);
        items.remove(indice);
    }
    
    public List<T> filtrar(Predicate<? super T> criterio) {
        List<T> copia = new ArrayList<>();
        
        for(T item : items) {
            if(criterio.test(item)) {
                copia.add(item);
            }
        }
        return copia;
    }
    
    public List<T> ordenarAnimales() {
        List<T> copia = new ArrayList<>(items);
        
        copia.sort(null);
        return copia;

    }
    
    public List<T> ordenarAnimales(Comparator<? super T> compa) {
            List<T> copia = new ArrayList<>(items);
            
            copia.sort(compa);
            return copia;
    }
    
    //guarda en binario
    
    public <T> void guardarEnArchivo(String path) {
        try(FileOutputStream archivo = new FileOutputStream(path);
                ObjectOutputStream salida = new ObjectOutputStream(archivo)) {
                salida.writeObject(items);
        }catch(IOException ex) {
            ex.printStackTrace();
        }
                
    }
    
    public List<T> cargarDesdeArchivo(String path) {
            List<T> copia = new ArrayList<>(items);
            try(ObjectInputStream input = new ObjectInputStream(new FileInputStream(path))) {
                copia = (List<T>) input.readObject();
                        
            }catch(IOException | ClassNotFoundException ex) {
                ex.printStackTrace();
            }
            return copia;
            

    }
    
    public void guardarEnCSV(String path) {
        File archivo = new File(path);
        try{
            if(archivo.exists()) {
                System.out.println("El archivo ya existe");
            }
            else{
                archivo.createNewFile();
            }
        }catch(IOException ex) {
            System.out.println("Error al crear archivo");
        }
        
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            bw.write("id,nombre,especie,tipo\n");
                for(T e : items) {
                    if(e instanceof Animal a) {
                        bw.write(a.toCSV() + "\n");
                    }
                }
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void cargarDesdeCSV(String path) {
            //List<Animal> copia = new ArrayList<>();
            
            try(BufferedReader bf = new BufferedReader(new FileReader(path))) {
                String linea;
                bf.readLine();
                
                while((linea = bf.readLine()) != null) {
                    /*if(linea.endsWith("\n")) {
                        linea.substring(linea.length() -1);
                    }*/
                    String[] data = linea.split(",");
                    if(data.length == 4) {
                        int id = Integer.parseInt(data[0]);
                        String nombre = data[1];
                        String especie = data[2];
                        TipoAilmentacion tipo = TipoAilmentacion.valueOf(data[3]);
                       
                        items.add((T)new Animal(id, nombre, especie, tipo));
                    }
                }
                
            }catch(IOException ex) {
                System.out.println(ex.getMessage());
            }
            

    }
    
    public void paraCadaElemento(Consumer<? super T> accion) {
        for(T item : items) {
            accion.accept(item);
        }
    } 
    
    
    
    
}
