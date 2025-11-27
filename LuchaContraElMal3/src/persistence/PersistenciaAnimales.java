/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persistence;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import model.Animal;
import model.Zoologico;

/**
 *
 * @author rogel
 */
public class PersistenciaAnimales {
    
    public static void guardarAnimalCSV(List<? extends Animal> lista, String path) {
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(path))) {
            escritor.write(Animal.toHeaderCSV());
            for(Animal e : lista) {
                escritor.write(e.toCSV());
            }
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }   
    }
    
    public static List<Animal> cargarAnimalCSV(String path) {
        List<Animal> toReturn = new ArrayList<>();
        try(BufferedReader lector = new BufferedReader(new FileReader(path))) {
            String linea;
            lector.readLine();
            while((linea = lector.readLine()) != null) {
                toReturn.add(Animal.fromCSV(linea));
            }
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        return toReturn;
    }
    
    public static void serializarAnimal(List<? extends  Animal> lista, String path) {
        try(ObjectOutputStream serializador = new ObjectOutputStream(new FileOutputStream(path))) {
            serializador.writeObject(lista);
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static List<Animal> deserializarAnimal(String path) {
            List<Animal> toReturn = null;
            
            try(ObjectInputStream deser = new ObjectInputStream(new FileInputStream(path))) {
                toReturn = (List<Animal>) deser.readObject();
            }catch(IOException  | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            return toReturn;
                
                
                
                
    }
}
