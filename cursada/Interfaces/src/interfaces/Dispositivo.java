/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author rogel
 */
public abstract class Dispositivo {
    private String marca;
    private boolean encendido;

    public Dispositivo(String marca, boolean encendido) {
        this.marca = marca;
        this.encendido = encendido;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }
    
    public void mostrarEstado(){
        System.out.println("El dispositivo esta " + (encendido ? "encendido" : "apagado"));
    }
}
