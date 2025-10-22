/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;


public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombre() {
        return this.nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public int getStock() {
        return this.stock;
    }
    
    public void reducirStock(int cantidad) 
    {
        if(this.tieneStockDisponible(cantidad))
        {
            this.stock -=cantidad;
        }else
        {
            System.out.println("No hay Stock, capo");
        }
    }
    
    public String mostrar() 
    {
        return "Producto " + this.nombre +"\n" + "Precio " + this.precio +"\n"+ "Stock " + this.stock;
    }
    private boolean tieneStockDisponible(int cantidad) 
    {
        return this.stock >= cantidad;
    }
}
