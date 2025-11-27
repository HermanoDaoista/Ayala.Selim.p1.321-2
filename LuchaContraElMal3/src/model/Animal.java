/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import service.CSVSerializable;

/**
 *
 * @author rogel
 */
public class Animal implements Comparable<Animal>, CSVSerializable, Serializable{
    private int id; 
    private String nombre;
    private String especie;
    private TipoAlimentacion tipo;

    public Animal(int id, String nombre, String especie, TipoAlimentacion tipo) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", tipo=" + tipo + '}';
    }
    
    
    
    public boolean esTipo(TipoAlimentacion tipo) {
        return this.tipo == tipo;
    }
    
    @Override
    public int compareTo(Animal a) {
        return Integer.compare(id, a.id);
    }
    
    @Override
    public String toCSV() {
        return id + "," + nombre + "," + especie + "," + tipo +"\n";
    }
    
    public static String toHeaderCSV() {
        return "id,nombre,especie,tipo\n";
    }
    
    public static Animal fromCSV(String animalCSV) {
        if(animalCSV.endsWith("\n")) {
            animalCSV = animalCSV.substring(0, animalCSV.length() -1);
        }
        
        String[] valores = animalCSV.split(",");
        
        if(valores.length == 4) {
            return new Animal(Integer.parseInt(valores[0]), valores[1], valores[2], TipoAlimentacion.valueOf(valores[3]));
        }
        return null;
    }
        
        
}
