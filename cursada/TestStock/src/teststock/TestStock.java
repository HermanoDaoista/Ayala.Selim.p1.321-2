/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teststock;

import Entidades.Producto;
import Entidades.Venta;

/**
 *
 * @author rogel
 */
public class TestStock {

    
    public static void main(String[] args) 
    {
        Producto producto = new Producto("Marolio", 50, 10);
        Venta venta = new Venta(producto, 10);
        System.out.println(producto.mostrar());
        
        if (venta.realizarVenta())
        {
            System.out.println(venta.mostrarDetalles());
        }
    }
    
}
