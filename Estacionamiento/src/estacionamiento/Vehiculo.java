/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamiento;

import java.util.Objects;

/**
 *
 * @author rogel
 */
public  abstract class  Vehiculo {
    private String patente;
    private String marca;
    private int modelo;

    public Vehiculo(String patente, String marca, int modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    public String getPatente() {
        return patente;
    }
    
    protected String getMarca() {
        return marca;
    }
    
    public abstract void acelerar();
    public abstract void frenar();
    
        
    
    
        @Override
    public boolean equals(Object o) {
       if(o == null || !(o instanceof Vehiculo v) ) {
           return false;
       }
       return this.patente.equals(v.patente) && marca.equals(v.marca) && this.modelo == (v.modelo);
    }
    
    @Override
    public int hashCode() {
        return Objects.hash(patente, marca, modelo);
    }
    
     public boolean tienePatente(String patente) {
        return this.getPatente().equals(patente);
    
    

    }

    @Override
    public String toString() {
        return nombreClase() +   "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo;
    }
     
    protected String nombreClase() {
        return getClass().getName().split("\\.") [1];
    }
     
     
     
    
    
}
