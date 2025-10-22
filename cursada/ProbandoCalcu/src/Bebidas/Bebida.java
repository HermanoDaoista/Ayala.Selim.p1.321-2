/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Bebidas;

/**
 *
 * @author rogel
 */
public enum Bebida 
{
    CAFE("Cafe","Caliente"),
    TE("Te","Caliente"),
    JUGO("Jugo", "Fria"),
    AGUA("Agua", "Fria"),
    GASEOSA("Gaseosa", "Fria");
    
    private String descripcion;
    private String tipo;
    private Bebida(String descripcion, String tipo)
    {
        this.descripcion = descripcion;
        this.tipo = tipo;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getTipo() {
        return this.tipo;
    }
    
    
    
}
