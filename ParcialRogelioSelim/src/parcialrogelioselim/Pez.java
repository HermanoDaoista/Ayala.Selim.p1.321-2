/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialrogelioselim;

public class Pez extends Especie implements Alimentable, Movible {
     private final int longMaxima;

    public Pez(int longMaxima, String nombre, String tanque, TipoAgua tipoagua) {
        super(nombre, tanque, tipoagua);
        this.longMaxima = longMaxima;
         }
    
        @Override
    public void mover() {
        System.out.println("Moviendo Peces....");
    }
    

    
         @Override
        public void respirar() {
            System.out.println("Pez respirando...");
        }
        
     @Override
        public void reproducirse() {
            System.out.println("Pez...^&%^$%%^###$#....reproduciendose");
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
