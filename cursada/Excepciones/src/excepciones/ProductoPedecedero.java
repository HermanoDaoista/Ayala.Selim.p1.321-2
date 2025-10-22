/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author rogel
 */
public class ProductoPedecedero extends Producto implements Vendible{
    private int stock;
    public ProductoPedecedero(String nombre, int precio, int stock) {
        super(nombre, precio);
        this.stock = stock;
    }

    @Override
    public void vender(int cantidad) throws StockInsuficienteException, PrecioInvalidoException{
        int venta;
          if(cantidad > stock || cantidad < 1) {
              throw new StockInsuficienteException("No hay stock suficiente");
          }
          if(precio < 1){
              throw new PrecioInvalidoException("el precio no debe ser menor a 1");
          }
        venta = cantidad * precio;
        stock -= cantidad;
        System.out.println("Se vendieron " + cantidad + " " + nombre + " por " + venta + " pesos");
        
        
    }
    
    
}
