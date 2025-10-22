/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inscontancia;

import java.util.ArrayList;

/**
 *
 * @author rogel
 */
public class juegoAccion extends Juego 
{

    public juegoAccion(String titulo, double pesoGB) {
        super(titulo, pesoGB, new ArrayList<TipoConsola>());
        this.getConsolasCompatibles().add(TipoConsola.PC);
        this.getConsolasCompatibles().add(TipoConsola.PLAYSTATION);
        
        
        
    }

    
    
}
