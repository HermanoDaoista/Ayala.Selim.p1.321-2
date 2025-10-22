/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author rogel
 */
public class auto {
    private String patente;
    private String marca;
    private String color;
    private int modelo;
    private Motor motor;

    public auto(String patente, String marca, String color, int modelo) {
        this.patente = patente;
        this.marca = marca;
        this.color = color;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "auto{" + "patente=" + patente + ", marca=" + marca + ", color=" + color + ", modelo=" + modelo + '}';
    }
    
    
            
}
