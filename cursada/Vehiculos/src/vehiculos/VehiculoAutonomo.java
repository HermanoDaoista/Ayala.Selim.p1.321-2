/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

public abstract class  VehiculoAutonomo {
    private int id;
    private String marca;
    private String modelo;
    protected boolean estado;

    public VehiculoAutonomo(int id, String marca, String modelo) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.estado = false;
    }
    
    public abstract void moverse();
    public abstract void detenerse();
    public abstract String reportarEstado();
    
    
}
