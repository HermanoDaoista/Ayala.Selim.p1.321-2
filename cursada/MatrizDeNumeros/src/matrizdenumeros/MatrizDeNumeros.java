/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrizdenumeros;

/**
 *
 * @author rogel
 */
public class MatrizDeNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Calculadora calcu = new Calculadora();
        
        //calcu.CargarMatriz();
        calcu.ImprimirMatriz(calcu.CargarMatriz());
    }
    
}
