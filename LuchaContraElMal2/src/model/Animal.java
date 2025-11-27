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
public class Animal implements Comparable<Animal>, Serializable, CSVSerializable{
    private int id;
    private String nombre;
    private String especie;
    private TipoAilmentacion tipo;

    public Animal(int id, String nombre, String especie, TipoAilmentacion tipo) {
        this.id = id;
        this.nombre = nombre;
        this.especie = especie;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }
    
    public boolean esTipo(TipoAilmentacion tipo) {
        boolean toReturn = true;
        if(this.tipo != tipo){
            toReturn = false;
        }
        return toReturn;
    }
    
    
    @Override
    public int compareTo(Animal a) {
        return Integer.compare(id, a.id);
    }

    @Override
    public String toString() {
        return "Animal{" + "id=" + id + ", nombre=" + nombre + ", especie=" + especie + ", tipo=" + tipo + '}';
    }
    
    @Override
    public String toCSV() {
        return id +"," + nombre + "," + especie + "," + tipo.toString();
    }
    
    
}
