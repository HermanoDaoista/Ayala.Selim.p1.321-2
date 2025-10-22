/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package excepciones;

/**
 *
 * @author rogel
 */
public interface Vendible {
    
    public void vender(int cantidad) throws StockInsuficienteException, PrecioInvalidoException;
}
