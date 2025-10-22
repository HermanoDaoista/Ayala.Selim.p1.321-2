/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

/**
 *
 * @author rogel
 */
public class  ProductoNoPedecedero  extends Producto implements Vendible{

    public ProductoNoPedecedero(String nombre, int precio) {
        super(nombre, precio);
    }
    
    @Override
    public void vender(int cantidad) {
        
    }
    
    
 }

