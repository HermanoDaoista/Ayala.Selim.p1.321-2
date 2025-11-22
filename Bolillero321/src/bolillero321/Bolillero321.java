/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bolillero321;

import java.util.Random;

public class Bolillero321 {

  
    public static void main(String[] args) {

        
        
        //Integer[] numeros = new Integer [] {23,45,21,78,76};
        Bolillero<FormulaUno> bingo = new BolilleroSecuencial<>();
        FormulaUno [] pilotos = new FormulaUno [] {
            new FormulaUno("Colapinto", Escuderia.ALPINE),
            new FormulaUno("Raul", Escuderia.ASTON_MARTIN),
            new FormulaUno("Carlitos", Escuderia.FERRARI),
            new FormulaUno("Gabriel", Escuderia.MERCEDES),
            new FormulaUno("Mario", Escuderia.RED_BULL)
        };
        
        Bolillero.cargarBolillero(bingo, pilotos);
        System.out.println("Inicia Sorteo");
        while(bingo.quedanBolilllas()) {
            System.out.println(bingo.extrearBolilla());
        }
        System.out.println("Fin Sorteo");
        
        
        
    }
    
 
    
    
}
