/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package luchacontraelmal;

public class Moluscos extends Especie implements Alimentable{
    private String tipoDeConcha;

    public Moluscos(String tipoDeConcha, String nombre, String tanque, TipoAgua tipoagua) {
        super(nombre, tanque, tipoagua);
        this.tipoDeConcha = tipoDeConcha;
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
