/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;


public class Persona implements Serializable {
    private static final long serialVersionUID = 1L;
    private int dni;
    private String nombre;

    public Persona(int dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }
    
    

    @Override
    public String toString() {
        return "Persona{" + "dni=" + dni + ", nombre=" + nombre + '}';
    }
    
    public String toCSV() {
        return dni + "," + nombre;
    }
}
