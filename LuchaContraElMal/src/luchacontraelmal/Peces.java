/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchacontraelmal;


public class Peces extends Especie implements Alimentable {
    private int longMaxima;

    public Peces(int longMaxima, String nombre, String tanque, TipoAgua tipoagua) {
        super(nombre, tanque, tipoagua);
        this.longMaxima = longMaxima;
         }
    
    @Override
      public void alimentar() {
        System.out.println("Soy en pez siendo alimentado");
    }
      
       
    @Override
    public String toString() {
        return super.toString() + " Longitud maxima: " + longMaxima;
    }
    
    
  
    
}
