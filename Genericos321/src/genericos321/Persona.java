/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericos321;

public class Persona implements Abrazable{

    @Override
    public String abrazar() {
        return "Que buen abrazo";
    }
    
    
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    @Override
    public String toString() {
        return "Persona de nombre: " + nombre + " edad: " + edad;
    }
    
    public String saludar() {
        return "Hola me llamo: " + nombre;
    }
    
    
}
