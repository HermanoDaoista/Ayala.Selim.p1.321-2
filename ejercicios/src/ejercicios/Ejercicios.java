/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author rogel
 */
public class Ejercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        auto a1 = new auto("ABC123", "FIAT", "Rojo", 2024);
        auto a2 = new auto("FDR786", "Piugi", "VERDE", 2938);
        Motor m = new Motor(2332, "super", 3434);
        
        System.out.println(a1);
    }
    
}
