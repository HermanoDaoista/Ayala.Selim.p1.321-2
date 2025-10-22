/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces321;

/**
 *
 * @author rogel
 */
public class Mosquito implements Volador{
    private String especie;
    private int diasVividos;
    private char genero;
    private boolean tengoDengue;
    
    public Mosquito(String especie, int diasVividos, char genero) {
        this.especie = especie;
        this.diasVividos = diasVividos;
        this.genero = genero;
    }
    
    @Override
    public void volar() {
        System.out.println("soy un mosquito vuelo....");
    }
    
    public void picar() {
        if(tengoDengue) {
            System.out.println("Estas infectado");
        }
        System.out.println("Te pico...");
    }
    
    
    public void zumbar() {
        System.out.println("bbzzzzzzz.....");
    }
    
    public boolean conDengue() {
        return tengoDengue;
    }
}
