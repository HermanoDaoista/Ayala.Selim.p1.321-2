/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

public class Venta {
    private Producto producto;
    private int cantidadVendida;

    public Venta(Producto producto, int cantidadVendida) {
        this.producto = producto;
        this.cantidadVendida = cantidadVendida;
    }
    
    public double getPrecioTotal()
    {
        return this.cantidadVendida * producto.getPrecio();
    }
    public boolean realizarVenta() 
    {   boolean retorno = false;
        if(this.cantidadVendida <= producto.getStock())
        {
            producto.reducirStock(cantidadVendida);
            retorno = true;
            System.out.println("Se vendio");
        }else 
        {
            System.out.println("No hay stock disponible");
        }
        return retorno;
    }
    public String mostrarDetalles() 
    {
        return "Producto: " + this.producto.getNombre() + " Cantidad: "+ this.cantidadVendida + " Precio: " + this.getPrecioTotal();
    }
}
