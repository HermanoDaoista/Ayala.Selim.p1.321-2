/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package integrador321_1;

public class Cliente {
    private final String dni;
    private final String nombre;
    private final String apellido;
    private final String telefono;
    private final String mail;

    public Cliente(String dni, String nombre, String apellido, String telefono, String mail) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
    }
    
    
  public String nombreCompleto() {
      return nombre + " " + apellido;
  }  
    
}
