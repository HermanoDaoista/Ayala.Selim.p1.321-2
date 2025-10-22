/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compumundo321;


public class SucursalRepetidoException extends RuntimeException{
     
    private static final String MESSAGE = "Sucursal repetido";
    public SucursalRepetidoException() {
        this(MESSAGE);
    }
    

 public  SucursalRepetidoException(String mensaje) {
        super(mensaje);
        
        
    }
}
