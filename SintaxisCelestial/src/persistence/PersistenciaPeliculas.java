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
import model.Pelicula;


public class PersistenciaPeliculas {
     public static void guardarPeliCSV(List<? extends Pelicula> lista, String path) {
        try(BufferedWriter escritor = new BufferedWriter(new FileWriter(path))) {
            escritor.write(Pelicula.toHeaderCSV());
            for(Pelicula e : lista) {
                escritor.write(e.toCSV());
            }
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }   
    }
    
    public static List<Pelicula> cargarPeliCSV(String path) {
        List<Pelicula> toReturn = new ArrayList<>();
        try(BufferedReader lector = new BufferedReader(new FileReader(path))) {
            String linea;
            lector.readLine();
            while((linea = lector.readLine()) != null) {
                toReturn.add(Pelicula.fromCSV(linea));
            }
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        return toReturn;
    }
    
    public static void serializarPeli(List<? extends  Pelicula> lista, String path) {
        try(ObjectOutputStream serializador = new ObjectOutputStream(new FileOutputStream(path))) {
            serializador.writeObject(lista);
        }catch(IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public static List<Pelicula> deserializarPeli(String path) {
            List<Pelicula> toReturn = null;
            
            try(ObjectInputStream deser = new ObjectInputStream(new FileInputStream(path))) {
                toReturn = (List<Pelicula>) deser.readObject();
            }catch(IOException  | ClassNotFoundException ex) {
                System.out.println(ex.getMessage());
            }
            return toReturn;
                
                
                
                
    }
}
