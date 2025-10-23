/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialrogelioselim;


public class Molusco extends Especie implements Alimentable, Movible {
    private final String tipoDeConcha;

    public Molusco(String tipoDeConcha, String nombre, String tanque, TipoAgua tipoagua) {
        super(nombre, tanque, tipoagua);
        this.tipoDeConcha = tipoDeConcha;
    }
    
   
    @Override
    public void mover() {
        System.out.println("Moviendo Moluscos....");
    }
    
    
     @Override
        public void reproducirse() {
            System.out.println("Molusco ^&%^$%%^###$#....reproduciendose");
        }
    
         @Override
        public void respirar() {
            System.out.println("Molusco respirando...");
        }
    
     
    @Override
    public String toString() {
        return super.toString() + " Tipo de Concha: " + tipoDeConcha;
    }
    
        @Override
      public void alimentar() {
        System.out.println("Soy un molusco siendo alimentado");
    }
}
