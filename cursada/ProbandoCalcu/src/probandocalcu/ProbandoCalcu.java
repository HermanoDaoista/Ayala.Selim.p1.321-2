/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package probandocalcu;

import ContadorString.contador;
import Entidades.Calculadora;
import stringbuilder.Haciendo;

/**
 *
 * @author rogel
 */
public class ProbandoCalcu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //contador Contador = new contador();
       
        //System.out.println(Contador.contarCaracteres("pedrito"));
        //System.out.println(Contador.cantidadDePalabras("el viento sopla como vos"));
        //Contador.minusmayus("FEliPEpigna");
        //Contador.buscarJava("el valle de sombra", "di");
        //Haciendo hacer = new Haciendo();
        
        //System.out.println(hacer.encadenado());
        Libro libro = new Libro("pedro", "ahora", Genero.INFANTIL);
        Libro libro1 = new Libro("pedro", "ahora", Genero.POESIA);

        
        libro.esGenero("pepe");
        libro1.esGenero("poesia");
        
    }
    
}
