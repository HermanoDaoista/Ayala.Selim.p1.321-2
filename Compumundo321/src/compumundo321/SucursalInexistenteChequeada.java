/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package compumundo321;


public class SucursalInexistenteChequeada extends Exception{
     
    private static final String MESSAGE = "Sucursal inexistente";
    public SucursalInexistenteChequeada() {
        this(MESSAGE);
    }
    

 public  SucursalInexistenteChequeada(String mensaje) {
        super(mensaje);
        
        
    }

}
